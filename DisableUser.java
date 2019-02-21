package com.exmple.iam;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.security.auth.login.LoginException;


import oracle.iam.platform.OIMClient;

import oracle.iam.platform.Platform;
import oracle.iam.platform.authopss.exception.AccessDeniedException;
import oracle.iam.provisioning.api.ProvisioningService;
import oracle.iam.platform.context.ContextManager;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;
import oracle.iam.provisioning.api.ApplicationInstanceService;
import oracle.iam.provisioning.api.EntitlementService;
import oracle.iam.provisioning.api.ProvisioningConstants;
import oracle.iam.provisioning.api.ProvisioningService;
import oracle.iam.provisioning.exception.AccountNotFoundException;
import oracle.iam.provisioning.exception.ApplicationInstanceNotFoundException;
import oracle.iam.provisioning.exception.EntitlementAlreadyProvisionedException;
import oracle.iam.provisioning.exception.EntitlementNotProvisionedException;
import oracle.iam.provisioning.exception.GenericAppInstanceServiceException;
import oracle.iam.provisioning.exception.GenericProvisioningException;
import oracle.iam.provisioning.exception.ImproperAccountStateException;
import oracle.iam.provisioning.exception.UserNotFoundException;
import oracle.iam.provisioning.vo.Account;
import oracle.iam.provisioning.vo.ApplicationInstance;
import oracle.iam.provisioning.vo.Entitlement;
import oracle.iam.provisioning.vo.EntitlementInstance;
import com.thortech.util.logging.Logger;

public class DisableUser {
	
	private static OIMClient Platform;
	ProvisioningService provServOps = (ProvisioningService) Platform.getService(ProvisioningService.class);
	private String strClassName = getClass().getName();
    public static Logger LOGGER = Logger.getLogger("ZNALSI");

    private final String ENTERING = "Entering::";
    private final String EXITING = "Exiting::";

    private static final String FAILURE = "FAILURE";
    private static final String APPINSTNAME="LDAP User";
	
/*    private List<Account> getAccounts(ProvisioningService provServOps, String userKey) {
        String strLogMessage = this.strClassName + "#" + new java.lang.Exception().getStackTrace()[0].getMethodName()+ "()  ";
        LOGGER.info(strLogMessage + "userKey : [" + userKey + "]");
        List<Account> userAccounts = null;
        HashMap<String, Object> acctConfigParams = null;
        SearchCriteria appInstCriteria = null;
        try {
            acctConfigParams = new HashMap<String, Object>();
            appInstCriteria = new SearchCriteria(ProvisioningConstants.AccountSearchAttribute.DISPLAY_NAME.getId(),APPINSTNAME, SearchCriteria.Operator.EQUAL);
            userAccounts = provServOps.getAccountsProvisionedToUser(userKey, appInstCriteria, acctConfigParams, false);
        } catch (Exception ex) {
            LOGGER.error(strLogMessage + "Exception :: Fetching account : [" + "Global AZCorp" + "] for user :["+ userKey + "] :: " + ex.getMessage());
        } finally {
            acctConfigParams = null;
            appInstCriteria = null;
        }
        LOGGER.info(strLogMessage + "userKey : [" + userKey + "] Exit");
        
        return userAccounts;
    }*/
	
    public void disableUsers(String usrKey) throws UserNotFoundException, GenericProvisioningException{
    	List<Account> userAccounts = provServOps.getAccountsProvisionedToUser(usrKey);
    	
    	for(Account acc:userAccounts){
    		long accID=Long.valueOf(acc.getAccountID()).longValue();
    		String appInstName = acc.getAppInstance().getApplicationInstanceName();
    		String accStatus = acc.getAccountStatus();
    		if(accStatus.equalsIgnoreCase("Provisioned")||accStatus.equalsIgnoreCase("Enabled")){
	    		try {
					provServOps.disable(accID);
					accStatus = acc.getAccountStatus();
					LOGGER.info(usrKey +":"+appInstName+"==> "+accStatus);
				} catch (AccessDeniedException | AccountNotFoundException | ImproperAccountStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		
    	}
    	
    }
    
    public void provsionEntitlement() throws ApplicationInstanceNotFoundException, GenericAppInstanceServiceException{
    	ProvisioningService provsrvc = Platform.getService(ProvisioningService.class);
    	ApplicationInstanceService appsvc = Platform.getService(ApplicationInstanceService.class);
    	
    	String appName="";
    	ApplicationInstance applicationInstance = appsvc.findApplicationInstanceByName(appName);
    	
    }
    
	public static void main(String[] args) throws LoginException {
        

        System.setProperty("java.security.auth.login.config","C:\\Users\\praveen\\Desktop\\designconsole\\config\\authwl.conf");
        System.setProperty("OIM.AppServerType", "wls");
        System.setProperty("APPSERVER_TYPE", "wls");

       

        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put("java.naming.provider.url", "t3://identity.oracle.com:14000");
        env.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        Platform = new OIMClient(env);
        Platform.login("chaitanya.kurdukar", "Test@12345".toCharArray());
        // Platform.login("EUSTAGE.ZNAEMPUSERA1", "Oracle123".toCharArray());

        ProvisioningService servc = Platform.getService(ProvisioningService.class);
        
        DisableUser obj = new DisableUser();
        String userKey = "111957";
        long procInstanceKey = 528292;


        
        
}

}
