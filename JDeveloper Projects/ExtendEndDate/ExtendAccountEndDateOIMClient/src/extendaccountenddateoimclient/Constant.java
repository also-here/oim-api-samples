package extendaccountenddateoimclient;


import java.io.FileInputStream;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Constant {
    public Constant() {
        super();
        
    }
  //  static final String LOOKUP_NAME= "Lookup.UserLogin";
   // static final String CODE_KEY = "User Login";
    public static Properties loadPropertiesFile() throws Exception {
            Properties prop = new Properties();
            InputStream in = Constant.class.getResourceAsStream("DbConnection.properties");
            prop.load(in);
            in.close();
            return prop;
            }
    
    public static List getusersExpireToday() throws Exception{
        List list = new ArrayList();
        Properties prop = loadPropertiesFile();
                String driverClass = prop.getProperty("DB_DRIVER");
                String userName = prop.getProperty("DB_USERNAME");
                String password = prop.getProperty("DB_PASSWORD");
                String connectString = prop.getProperty("DB_URL");
        try{
            Class.forName(driverClass);
            Connection con=DriverManager.getConnection(connectString,userName,password); 
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
    
    //------------------------------------------------------------------------------------get Lookup Decode -----------------------------------

  //  public List getLookupDecode(String LOOKUP_NAME, String CODE_KEY){
        
     //   return list;
   // }
}
