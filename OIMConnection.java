package com.java;

//Role related API's
import oracle.iam.identity.rolemgmt.api.RoleManager;
import oracle.iam.identity.rolemgmt.vo.Role;
import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.RoleSearchException;
import oracle.iam.identity.exception.SearchKeyNotUniqueException;
import oracle.iam.identity.exception.UserAlreadyExistsException;
import oracle.iam.identity.exception.UserCreateException;
import oracle.iam.identity.exception.UserLookupException;
import oracle.iam.identity.exception.ValidationFailedException;
import oracle.iam.identity.rolemgmt.api.RoleManagerConstants.RoleAttributeName;
import oracle.iam.identity.rolemgmt.api.RoleManagerConstants.RoleCategoryAttributeName;

//User related API's
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;

//Organization Legacy API's
import Thor.API.Operations.tcOrganizationOperationsIntf;
import Thor.API.tcResultSet;
import Thor.API.Exceptions.tcAPIException; 
import Thor.API.Exceptions.tcColumnNotFoundException; 
import Thor.API.Exceptions.tcOrganizationNotFoundException; 
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.authz.exception.AccessDeniedException;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;

import java.util.*;

import javax.naming.NamingException;
import javax.security.auth.login.LoginException;


public class OIMConnection {
	
	static OIMClient oimconn=null;
	static UserManager usrmgr;
	static User userVo= new User(null);
	
	public OIMConnection(String url,String userId,String password) throws LoginException
	{
		System.out.println("Creating the Client");
		String ctxFactory = "weblogic.jndi.WLInitialContextFactory";
        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, ctxFactory);
        env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, url);
        System.setProperty("java.security.auth.login.config","C:\\Users\\praveen\\Desktop\\designconsole\\config\\authwl.conf");
        System.setProperty("APPSERVER_TYPE", "wls");
        oimconn = new OIMClient(env);
        oimconn.login(userId, password.toCharArray());
        System.out.println("Log in successful");
	}
	
/*	public String createUser(String userId,String firstName,String lastName,String org,String empType,String email) throws ValidationFailedException, UserAlreadyExistsException, UserCreateException, AccessDeniedException
	{
		userVo.setEmail(email);
		userVo.setOrganizationKey(org);
		userVo.setLastName(lastName);
		userVo.setFirstName(firstName);
		userVo.setLogin(userId);
		userVo.setEmployeeType(empType);
		usrmgr.create(userVo);
		
		
		return null;
	}
*/	
/*	public void retrieveUserDetailUsingLoginId(String userName) throws NoSuchUserException, UserLookupException, SearchKeyNotUniqueException, AccessDeniedException
	{
		Set<String> retAttr=new HashSet<String>();
		retAttr.add("Email");
		
		userVo=usrmgr.getDetails("User Login", userName, retAttr);
		System.out.println("Display Name::"+userVo.getDisplayName());
		System.out.println("EMAIL id ::"+userVo.getEmail());
		
	}
*/	
	public String getUserDetails(String Userid){
		String userkey=null;
		usrmgr = oimconn.getService(UserManager.class);
		//Set<String> retAttr = new HashSet<String>();
		Set<String> resToFetch = new HashSet<String>();
		resToFetch.add(UserManagerConstants.AttributeName.USER_KEY.getId());
		resToFetch.add(UserManagerConstants.AttributeName.FIRSTNAME.getId());
		try {
			User usr = usrmgr.getDetails(Userid, resToFetch, true);
			userkey=usr.getEntityId();
			String fName=usr.getFirstName();
		} catch (NoSuchUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserLookupException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccessDeniedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userkey;
	}
	
	public static void main(String[] args) throws ValidationFailedException, UserAlreadyExistsException, UserCreateException, AccessDeniedException {
		// TODO Auto-generated method stub
		try {
			OIMConnection obj=new OIMConnection("t3://192.168.56.101:14000","xelsysadm","Oracle123");
			usrmgr=oimconn.getService(UserManager.class);
			//obj.createUser("PRAVEEN1", "Praveen", "Naik", "1", "Full-Time", "praveen@example.com");
			
			oimconn.logout();
			System.out.println("Logged out");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
