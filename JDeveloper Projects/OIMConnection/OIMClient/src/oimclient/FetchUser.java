package oimclient;


import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;
 

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
 
 

public class FetchUser {
    UserManager userManager;
    Hashtable<Object, Object> env = new Hashtable<Object, Object>();

    
    public FetchUser() {
        super();
    }
    //------------------------------------ to Connection to OIM -------------------------------------------------------//
        public void OIMConnection(){             
             
             env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, "weblogic.jndi.WLInitialContextFactory");
             env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, "t3://identity.oracleads.com:14000");
                 
                System.setProperty("java.security.auth.login.config", "C:\\Users\\Praveen\\Documents\\designconsole\\config\\authwl.conf");  
                //System.setProperty("OIM.AppServerType", "wls");  
                System.setProperty("APPSERVER_TYPE", "wls");
                oracle.iam.platform.OIMClient oimClient = new oracle.iam.platform.OIMClient(env);
         /*
                 try {                        
                       oimClient.login("xelsysadm", "Oracle123".toCharArray());         
                       System.out.println("Successfully Connected with OIM ");
                     } catch (LoginException e) {
                       System.out.println("Login Exception"+ e);
                    }            
                */  
                userManager = oimClient.getService(UserManager.class);
         }


//----------------------------Retrieves User Firstname and Last Name based on User Login----------------------------------
public  List getUserDetails(String uid){
    Vector oimUsers = new Vector();
    
    oracle.iam.platform.OIMClient oimClient = new oracle.iam.platform.OIMClient(env);
    
    userManager = oimClient.getService(UserManager.class);
    //UserManager userManager = OIMClient.getService(UserManager.class);
    
    Set<String> returnAttr = new HashSet<String>();
    returnAttr.add(AttributeName.FIRSTNAME.getId());
    
    SearchCriteria criteria;
    criteria = new SearchCriteria(AttributeName.USER_LOGIN.getId(),uid, SearchCriteria.Operator.EQUAL);
    try{
        List<User> users = userManager.search(criteria, returnAttr, null);
        
        //for(int i=1; i<= users.size(); i++){
        for(User user : users) {
        String fn = (String)user.getAttribute(AttributeName.FIRSTNAME.getId());
            System.out.println("First Name: "+fn);
            //oimUsers.add(users.get(i).getFirstName());
        }
    }catch(AccessDeniedException ade){
        
        }catch (UserSearchException use){
            
        }
    return oimUsers;
}


    public static void main(String[] args) {
        FetchUser fetchUser = new FetchUser();
        // ---- to invoke OIM Connection Method--------
      //  fetchUser.OIMConnection();
         
         // - to invoke getUserdetails method-----------

        List oimList = null;
        try{
          oimList=fetchUser.getUserDetails("A113");
            
        }catch(Exception  e){
            e.printStackTrace();
        }

    }     
}
