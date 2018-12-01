package com.java;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.security.auth.login.LoginException;

import oracle.iam.api.OIMService;
import oracle.iam.exception.OIMServiceException;
//import oracle.iam.catalog.vo.OIMType;
import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.UserLookupException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.authz.exception.AccessDeniedException;
import oracle.iam.platform.utils.vo.OIMType;
//import oracle.iam.provisioning.vo.OperationResult;
import oracle.iam.request.vo.Beneficiary;
import oracle.iam.request.vo.RequestBeneficiaryEntity;
import oracle.iam.request.vo.RequestConstants;
import oracle.iam.request.vo.RequestData;
import oracle.iam.vo.OperationResult;

public class AssignRole {

	public static OIMClient oimClient=null;
	public static AssignRole obj = new AssignRole();
	public static UserManager usrmgr = null;
	
	
	public OIMClient oimconnection( String host, String userID, String password){
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
			return oimClient;
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
		
	}
	
	public String getUserKey(String Userid){
		String userkey=null;
		usrmgr = oimClient.getService(UserManager.class);
		//Set<String> retAttr = new HashSet<String>();
		Set<String> resToFetch = new HashSet<String>();
		resToFetch.add(UserManagerConstants.AttributeName.USER_KEY.getId());
		
		try {
			User usr = usrmgr.getDetails(Userid, resToFetch, true);
			userkey=usr.getEntityId();
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oimClient=obj.oimconnection("t3://192.168.56.101:14000","xelsysadm","Oracle123");
		OIMService oimSvc = oimClient.getService(OIMService.class);
		String roleName = "KeyAccess";
		String roleKey = "7";
		String userID = "PRAVEEN1";
		
		String beneficiaryKey=obj.getUserKey(userID);
		RequestBeneficiaryEntity reqBenEnt = new RequestBeneficiaryEntity();
		Beneficiary ben = new Beneficiary();
		
		//------------setter--------------------------
		reqBenEnt.setRequestEntityType(OIMType.Role);
		//reqBenEnt.setRequestEntityType(OIMType.Entitlement);
		reqBenEnt.setEntitySubType(roleName);
		reqBenEnt.setEntityKey(roleKey);
		reqBenEnt.setOperation(RequestConstants.MODEL_ASSIGN_ROLES_OPERATION);
		
		List<RequestBeneficiaryEntity> entity = new ArrayList<RequestBeneficiaryEntity>();
		entity.add(reqBenEnt);
		
		ben.setBeneficiaryKey(beneficiaryKey);
		ben.setBeneficiaryType(Beneficiary.USER_BENEFICIARY);
		ben.setTargetEntities(entity);
		
		
		List<Beneficiary>beneficiaries = new ArrayList<Beneficiary>();
		beneficiaries.add(ben);
		
		RequestData reqData = new RequestData();
		reqData.setBeneficiaries(beneficiaries);
		reqData.setJustification("From OIMService API");
		
		try {
			OperationResult op = oimSvc.doOperation(reqData, OIMService.Intent.REQUEST);
			System.out.println("REQID:"+op.getRequestID());
		} catch (OIMServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
