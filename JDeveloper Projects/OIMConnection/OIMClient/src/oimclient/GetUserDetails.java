package oimclient;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.security.auth.login.LoginException;

import oracle.iam.platform.OIMClient;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;

public class GetUserDetails {

    public static void main(String[] args) throws Exception {
        
        Hashtable env = new Hashtable();
        env.put("java.naming.provider.url", "t3://idam1.deliverycentric.com:14000");
        env.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        
        System.setProperty("java.security.auth.login.config", "C:\\Users\\Praveen\\designconsole\\config\\authwl.conf");  
        System.setProperty("OIM.AppServerType", "wls");  
        System.setProperty("APPSERVER_TYPE", "wls");
        
        
        OIMClient oimClient = new OIMClient(env);
      
        //---------------------------To Connect to OIM Client-------------------------------------------
        try {                        
              oimClient.login("xelsysadm", "Oracle123".toCharArray());         
              System.out.println("Successfully Connected with OIM ");
            } catch (LoginException e) {
              System.out.println("Login Exception"+ e);
           }

        UserManager usrMgr = oimClient.getService(UserManager.class);
        
//-------------------------------To search User Based on UID----------------
        
        SearchCriteria criteria = new SearchCriteria("User Login","ABHISHEKR01", SearchCriteria.Operator.EQUAL);
        Set retSet = new HashSet();
        
       // retSet.add("First Name");
       
        retSet.add(AttributeName.ACCOUNT_END_DATE.getId());
        
        //retSet.add(AttributeName.FIRSTNAME.getId());

       // retSet.add("Last Name");
       //retSet.add(AttributeName.EMAIL.getId());
    //retSet.add(AttributeName.DISPLAYNAME.getId());

//System.out.println("First Name:"+);

        List<User> users = usrMgr.search(criteria, retSet, null);
        
        for(User user : users) {

            //String fn = (String)user.getAttribute(AttributeName.FIRSTNAME.getId());
            //String ln = (String)user.getAttribute(AttributeName.EMAIL.getId());
            //String ln= AttributeName.LASTNAME.getId();
            //String dn = (String)user.getAttribute("Display Name");
            
            //String endDate = (String)user.getAttribute(AttributeName.ACCOUNT_END_DATE.getId());
            
            System.out.println("Account End Date : "+(String)user.getAttribute(AttributeName.ACCOUNT_END_DATE.getId()));
        }

        System.exit(0);
        
    }
}