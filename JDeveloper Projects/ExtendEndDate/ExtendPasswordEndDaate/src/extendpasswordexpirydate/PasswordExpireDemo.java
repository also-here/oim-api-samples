package extendpasswordexpirydate;

import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Collections;
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
import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;

public  class PasswordExpireDemo extends TaskSupport{
    ODLLogger logger = ODLLogger.getODLLogger("MyTestLogger");
    public PasswordExpireDemo() {
        super();
    }
    public void execute(HashMap hashMap) {
        logger.info("Inside Execute Method");
        try{
            Hashtable env = new Hashtable();  
            OIMClient oimClient = new OIMClient(env);
            UserManager usrmgr = oimClient.getService(UserManager.class);
            
            List usrlist = new ArrayList();
            usrlist = getusersExpireToday(); 
            logger.info("Returned List size is:"+usrlist.size());
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
                          logger.info("Account end date before extend:"+endDate);
                          //System.out.println("Account end date is:"+endDate);
                          Calendar c = Calendar.getInstance(); 
                          c.setTime(endDate); 
                          c.add(Calendar.DATE, 60);
                          Date  endDate1 = c.getTime();
                         // user.setEndDate(endDate1);
                          User user1=new User(usrkey);
                         user1.setAttribute("End Date", endDate1);
                          usrmgr.modify(user1);
                          //   System.out.println("Account end date is:" +endDate1);
                          logger.info("Account end date After Extend:"+endDate1);
                         //System.out.println("Account end date is:"+endDate1);
                  }
           // System.out.println("Retrieved size value"+usrlist.size());
           // String abc = usrlist.toString();
           // System.out.println("abc value : "+abc);
                        
            }
        }catch(Exception e){

            e.printStackTrace();
        }
    }
    public HashMap getAttributes() {
        return null;
    }

    public void setAttributes() {
    }

    private static List getusersExpireToday() {
        List list = new ArrayList();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(  
            "jdbc:oracle:thin:@idam1.deliverycentric.com:1521:oimdb","DEV_OIM","Oracle123"); 
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from LKV where lku_key='1681'");  
            while(rs.next())  {
           // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
           list.add(rs.getString("lkv_decoded"));
            }
            //close the connection object  
            con.close();  
              
            }catch(Exception e){ System.out.println(e);} 
                System.out.println("Size"+ list.size());
                 return list;
    }
}
