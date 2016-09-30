package passwordextend;

import Thor.API.Exceptions.tcAPIException;
import Thor.API.Exceptions.tcColumnNotFoundException;
import Thor.API.Exceptions.tcInvalidLookupException;

import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import oracle.iam.api.OIMService;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.UserManagerResult;
import oracle.iam.platform.Platform;
import oracle.iam.scheduler.vo.TaskSupport;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;
import java.util.Set;

import javax.security.auth.login.LoginException;

import oracle.core.ojdl.logging.ODLLogger;

import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.UserModifyException;
import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.exception.ValidationFailedException;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;

public class ExtendDateUpdate  {
  //  ODLLogger logger = ODLLogger.getODLLogger("MyTestLogger");
    public ExtendDateUpdate() {
        super();
    }
    static final String LOOKUP_NAME= "Lookup.UserLogin";
    static final String CODE_KEY = "User Login";
   // public void execute(HashMap hashMap) throws UserSearchException {
    public static void main(String[]args) throws tcAPIException,
                                                  tcInvalidLookupException,
                                                  tcAPIException,
                                                  tcColumnNotFoundException,
                                                  UserSearchException,
                                                  ValidationFailedException,
                                                  UserModifyException,
                                                  NoSuchUserException {
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
     //   try{
            UserManager usrmgr = Platform.getService(UserManager.class);
            List usrlist = new ArrayList();
            usrlist = Constant.getLookupDecode(LOOKUP_NAME, CODE_KEY);
            System.out.println("Lookup Name:"+LOOKUP_NAME+"  CodeKey:"+CODE_KEY);
            //usrlist1 = usrlist.iterator()   
            Iterator itr = usrlist.iterator();
            while(itr.hasNext()) {
                     Object usr = itr.next();
                     System.out.print(usr + " ");
                      SearchCriteria criteria = new SearchCriteria("User Login",usr,SearchCriteria.Operator.EQUAL);
                      Set retSet = new HashSet();
                      retSet.add(AttributeName.ACCOUNT_END_DATE.getId());
                      
                      List<User> users = usrmgr.search(criteria,retSet,null);
                      for(User user : users){
                          Date endDate = (Date)user.getAttribute(AttributeName.ACCOUNT_END_DATE.getId());
                          String  usrkey=user.getEntityId();
                         // logger.info("Account end date is:"+endDate);
                          System.out.println("Account end date is:"+endDate);
                          Calendar c = Calendar.getInstance(); 
                          c.setTime(endDate); 
                          c.add(Calendar.DATE, 60);
                          Date  endDate1 = c.getTime();
                         // user.setEndDate(endDate1);
                          User user1=new User(usrkey);
                         user1.setAttribute("End Date", endDate1);
                          usrmgr.modify(user1);
                          //   System.out.println("Account end date is:" +endDate1);
                         // logger.info("Account end date is:"+endDate1);
                         System.out.println("Account end date is:"+endDate1);
                  }
           // System.out.println("Retrieved size value"+usrlist.size());
           // String abc = usrlist.toString();
           // System.out.println("abc value : "+abc);
                        
            }
      //  }catch(Exception e){

        //    e.printStackTrace();
        //o}
    }
  //  public HashMap getAttributes() {
   //     return null;
   // }

  //  public void setAttributes() {
   // }

    
    
}
