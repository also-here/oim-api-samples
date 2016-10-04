import eventhandler.Dbclass;

import java.sql.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class UIDGenDBDemo {

 public static void main(String[] args) {
  try {

   Class.forName("oracle.jdbc.driver.OracleDriver");

  } catch (ClassNotFoundException e) {

   System.out.println("Error in connection...");
   e.printStackTrace();
   return;
  }

  System.out.println("Oracle JDBC Driver Registered!");

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.ps3:1521:oimdb.oracle.ps3", "DEV_OIM","Oracle123");

   ps = connection.prepareStatement(Dbclass.SQL_SELECT_USERLOGIN);
                    String fName = "DUMMY";
                    String lName = "USER";

//--------------------------------------------------------------------------------------------------------------------------------------------------
   ps.setString(1, "DUMMY.USER@DELIVERYCENTRIC.COM");
   rs = ps.executeQuery();
      while(rs.next()){
         int count = rs.getInt(1);
          System.out.println("Count: "+count);
              
               String  generatedEmail=checkEmailId(fName,lName,count);
                      System.out.println("generatedEmail: "+generatedEmail);
               
                     // System.out.println(generatedEmail);
                        //System.exit(0);
                    }
          

  } catch (SQLException e) {

   System.out.println("Connection Failed! Check output console");
   e.printStackTrace();
   return;

  }

  if (connection != null) {
   System.out.println("You made it, take control your database now!");
  } else {
   System.out.println("Failed to make connection!");
  }
 }

 //  private static String emailGenerate(String FN, String LN)  {
       //  return FN+"."+LN+"@DELIVERYCENTRIC.COM";
       
  //  }
    private static String checkEmailId(String FN,String LN, int i){
            String methodName= "generateEmailID";
                  //  logger.entering(CLASS_NAME, methodName);
                    String address = "@DELIVERYCENTRIC.COM";
                    String emailID = "";
            //        String count = "";
                   // int i = 0;
                    String flag = "";
                    
         //   if(counter > 0){
           //           count = Integer.toString(counter);
                      
          //  }   
                  
                    
                if(FN != null && LN != null && !(LN=="") && !(FN=="")){
                    do{
                        
                    
                       
                        if (i==0){
                        emailID = ((FN.concat(".")).concat(LN)).concat(address);
                       System.out.println("Generate Email ID: "+emailID);
                       // System.out.println("Email ID" +emailID);
                        } else {
                            emailID = ((FN.concat(".")).concat(Integer.toString(++i)).concat(".").concat(LN)).concat(address);
                        }
                       // flag=checkEmailID(emailID, oimConnection);
                       // i++;
                    }while (flag.equalsIgnoreCase("Unique"));
                }
                    return emailID;
            
    }
}