package com.java;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.python.modules.newmodule;


import oracle.iam.api.OIMService;
import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.SearchKeyNotUniqueException;
import oracle.iam.identity.exception.UserLookupException;
import oracle.iam.identity.exception.UserManagerException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.authz.exception.AccessDeniedException;
import oracle.iam.provisioning.api.ProvisioningService;
import oracle.iam.provisioning.vo.Account;

//import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return;

public class GetUserDetails {
	public static OIMClient oimClient=null;
	public static UserManager usrmgr = null;
	static User userVO = new User(null);
	
	
	public  GetUserDetails( String host, String userID, String password){
		String ctxFactory = "weblogic.jndi.WLInitialContextFactory";
		
		Hashtable<String, String> env = new Hashtable<String,String>();
		env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, ctxFactory);
		env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, host);
		
		System.setProperty("java.security.auth.login.config", "C:\\Users\\praveen\\Desktop\\designconsole\\config\\authwl.conf");
		System.setProperty("APPSERVER_TYPE", "wls");
		
		oimClient=new OIMClient(env);
		try {
			oimClient.login(userID, password.toCharArray());
			System.out.println("Logged in successfully");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
/*	public void getDetails(String usrID) throws NoSuchUserException, UserManagerException, Exception, AccessDeniedException{
		UserManager usrmgr = this.oimClient.getService(UserManager.class);
		Set<String> retAttr = new HashSet<>();
		
		retAttr.add("Email");
		retAttr.add("User Login");
		retAttr.add("Display Name");
		retAttr.add("First Name");
		retAttr.add("Last Name");
		
		userVO=usrmgr.getDetails("User Login", usrID, retAttr);
		
		System.out.println("Email: "+userVO.getEmail());
		System.out.println("User login: "+userVO.getLogin());
		System.out.println("First name:"+userVO.getFirstName());
		System.out.println("Display Name:"+userVO.getDisplayName());
		System.out.println("Last Name:"+userVO.getLastName());
	}*/
	
	public String getUserKey(String userID) throws NoSuchUserException, UserLookupException, SearchKeyNotUniqueException, AccessDeniedException{
		Set<String> retAttr1 = new HashSet<>();
		userVO=usrmgr.getDetails("User Login", userID, retAttr1);
		
		return userVO.getId();
	}
	
	public void getAccountDetails(String userlogin) throws UserManagerException, UserManagerException, Exception, AccessDeniedException{
		ProvisioningService provsvc=oimClient.getService(ProvisioningService.class);
		usrmgr=oimClient.getService(UserManager.class);
		
		String usrKey = getUserKey(userlogin);
		List<Account> acc = provsvc.getAccountsProvisionedToUser(usrKey);
		
		//iterate account
		for(Account a:acc){
			System.out.println("Account ID:"+a.getAccountID());
			System.out.println("Application Instance Name:"+a.getAppInstance().getApplicationInstanceName());
			System.out.println("Account status:"+a.getAccountStatus());
			//System.out.println("A
			
			/*if(a.getAppInstance().getApplicationInstanceName().equalsIgnoreCase("XYZDatabase") && ((a.getAccountStatus().equalsIgnoreCase("Disabled"))) ) {
				
				Long accountId=Long.valueOf(a.getAccountID()).longValue();
				provsvc.enable(accountId);
				
			}*/
		}
	}
	
	
	
	public static void main(String[] args) throws UserManagerException, Exception {
		// TODO Auto-generated method stub
		String usrID = "PRAVEEN";
		GetUserDetails obj = new GetUserDetails("t3://192.168.56.101:14000","xelsysadm","Oracle123");
		//obj.getDetails(usrID);
		
		obj.getAccountDetails(usrID);
		oimClient.logout();

	}

}
