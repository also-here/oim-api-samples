package oracle.iam.identity.usermgmt.impl.plugins;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Locale;
import java.util.Map;

import oracle.iam.identity.exception.UserNameGenerationException;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.identity.usermgmt.api.UserNameGenerationPolicy;


public class UserIdGenerationDemoOne implements UserNameGenerationPolicy {

    @Override
    public String getDescription(Locale arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getUserNameFromPolicy(Map<String, String> arg0)
            throws UserNameGenerationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isUserNameValid(String arg0, Map<String, String> arg1) {
        // TODO Auto-generated method stub
        return false;
    }
   
    public String createCustomUserGenerationLogic(String firstName, String lastName, int count){
        String userLoginGen = "";
//        put logic here
        firstName = firstName.substring(0, 1);
        userLoginGen = (firstName+lastName+count).toString();
        return userLoginGen;
    }
    
    
    
   
   
    @Override
    public String getUserName(Map<String, Object> reqData)
            throws UserNameGenerationException {
        
        int USERCOUNT = 0;
        String flag = "";
        String uid = "";

        String firstName = reqData.get(UserManagerConstants.AttributeName.FIRSTNAME.getId()).toString();
        String lastName = reqData.get(UserManagerConstants.AttributeName.LASTNAME.getId()).toString();
        
               // logger.info("-------- Oracle JDBC Connection Testing ------");
                
                try {

                        Class.forName("oracle.jdbc.driver.OracleDriver");

                } catch (ClassNotFoundException e) {

                        System.out.println("Where is your Oracle JDBC Driver?");
                        e.printStackTrace();
                        //return;

                }
              //  logger.info("Oracle JDBC Driver Registered!");
                
                

                Connection connection = null;
                Statement ps = null;
                ResultSet rs = null;
                // int USERCOUNT = 0;
                
                

                try {

                        connection = DriverManager.getConnection(
                                        "jdbc:oracle:thin:@idam1.deliverycentric.com:1521:oimdb", "DEV_OIM",
                                        "Oracle123");
                    
                ps = connection.createStatement();
                String initial = (firstName.substring(0, 1)+lastName).toString();
                rs = ps.executeQuery("select count(*)as USERCOUNT from usr where usr_login like '"+ initial +"%' ");
                   while(rs.next()){
                      USERCOUNT = rs.getInt(1);
                     //  System.out.println("Count: "+USERCOUNT);
                      // logger.info("Count: "+USERCOUNT);
                   }
        
        
        if(firstName != null && lastName != null && !(firstName=="") && !(lastName=="")){
            do{
        if (USERCOUNT == 0){
                 uid = createCustomUserGenerationLogic(firstName, lastName,USERCOUNT);
       
    }
        else {
            uid = createCustomUserGenerationLogic(firstName, lastName, USERCOUNT);
        }
            }while(flag.equalsIgnoreCase("Unique"));
        }
                }
                catch (SQLException e) {

                      // System.out.println("Connection Failed! Check output console");
                 //  logger.info("Connection Failed! Check output console");
                       e.printStackTrace();
                }
                
        return uid;
            }

    @Override
    public boolean isGivenUserNameValid(String arg0, Map<String, Object> arg1) {
        // TODO Auto-generated method stub
        return false;
    }

}