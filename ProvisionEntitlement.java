package com.exmple.iam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.security.auth.login.LoginException;

import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.UserLookupException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.authz.exception.AccessDeniedException;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;
import oracle.iam.provisioning.api.EntitlementService;
import oracle.iam.provisioning.api.ProvisioningService;
import oracle.iam.provisioning.exception.AccountNotFoundException;
import oracle.iam.provisioning.exception.EntitlementAlreadyProvisionedException;
import oracle.iam.provisioning.exception.EntitlementNotFoundException;
import oracle.iam.provisioning.exception.GenericEntitlementServiceException;
import oracle.iam.provisioning.exception.GenericProvisioningException;
import oracle.iam.provisioning.exception.ImproperAccountStateException;
import oracle.iam.provisioning.exception.UserNotFoundException;
import oracle.iam.provisioning.vo.Account;
import oracle.iam.provisioning.vo.Entitlement;
import oracle.iam.provisioning.vo.EntitlementInstance;
import oracle.iam.provisioning.api.ProvisioningConstants;

public class ProvisionEntitlement {


	private static OIMClient oimClient=null;
	private static ProvisioningService provSvc=null;
	private static UserManager usrMgr=null;
	private static User userVo=new User(null);
	private static EntitlementService entSvc=null;

	public void oimConnection(String serverURL,String userId,String password)
	{
		String ctxFactory = "weblogic.jndi.WLInitialContextFactory";
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, ctxFactory);
		env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, serverURL);
		System.setProperty("java.security.auth.login.config", "D:/authwl.conf");
		System.setProperty("APPSERVER_TYPE", "wls");
		oimClient = new OIMClient(env);
		try {
			oimClient.login(userId, password.toCharArray());
			System.out.println("Logged in successfully");

		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void main(String[] args) throws GenericEntitlementServiceException, UserNotFoundException, GenericProvisioningException, NoSuchUserException, UserLookupException, AccessDeniedException, oracle.iam.platform.authopss.exception.AccessDeniedException, AccountNotFoundException, ImproperAccountStateException, EntitlementNotFoundException, EntitlementAlreadyProvisionedException {
		// TODO Auto-generated method stub
		String serverURL = "t3://192.168.56.101:14000";
		String username = "xelsysadm";
		String password = "Oracle123";   
		String userId="TEST23";
		String entDisplayName="Tally Application";
		System.out.println("calling OIMClient connection creation");	
		ProvisionEntitlement obj=new ProvisionEntitlement();
		obj.oimConnection(serverURL, username, password);

		provSvc=oimClient.getService(ProvisioningService.class);
		usrMgr=oimClient.getService(UserManager.class);
		entSvc=oimClient.getService(EntitlementService.class);

		/**
		 * Fetching the usr_key
		 */
		Set<String> retAttr=new HashSet<String>();
		userVo=usrMgr.getDetails(userId, retAttr, true);
		String userKey=userVo.getId();

		SearchCriteria criteria=new SearchCriteria(ProvisioningConstants.EntitlementSearchAttribute.ENTITLEMENT_DISPLAYNAME.getId(), entDisplayName, SearchCriteria.Operator.EQUAL);
		HashMap<String, Object> configParams=new HashMap<String, Object>();
 
		List<Entitlement> entList=entSvc.findEntitlements(criteria, configParams);
		Entitlement ent=entList.get(0);

		String appName=ent.getAppInstance().getApplicationInstanceName();
		
		EntitlementInstance entInst=new EntitlementInstance();
		entInst.setEntitlement(ent);

		/**
		 * Validating whether Application instance is provisioned for the user
		 */
		List<Account> acc=provSvc.getAccountsProvisionedToUser(userKey);

		boolean entAssigned=false;
		for(Account accounts:acc )
		{
			if(accounts.getAppInstance().getApplicationInstanceName().equalsIgnoreCase(appName) && 
					(accounts.getAccountStatus().equalsIgnoreCase("Provisioned") || accounts.getAccountStatus().equalsIgnoreCase("Enabled")))
			{
				System.out.println("The user fullfilled the pre-requisite" );
				entInst.setAccountKey(Long.valueOf(accounts.getAccountID()).longValue());
				/**
				 * Assigning the entitlement Now
				 */
				provSvc.grantEntitlement(entInst);
				entAssigned=true;
				
			}
		}
		
		if(entAssigned==false)
		{
			System.out.println("Unable to assign the ent ::"+entDisplayName+" to the user::"+userId+ " Reason the Application Instance::"+appName +" is not assigned");
		}



	}

}