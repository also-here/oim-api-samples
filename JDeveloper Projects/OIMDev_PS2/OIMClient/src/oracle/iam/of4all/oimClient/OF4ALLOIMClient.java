package oracle.iam.of4all.oimClient;

import java.util.HashMap;
import java.util.Hashtable;

import javax.security.auth.login.LoginException;

import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.platform.OIMClient;

import oracle.iam.identity.exception.NoSuchUserException;
import oracle.iam.identity.exception.UserAlreadyExistsException;
import oracle.iam.identity.exception.UserCreateException;
import oracle.iam.identity.exception.UserDisableException;
import oracle.iam.identity.exception.UserEnableException;
import oracle.iam.identity.exception.UserLockException;
import oracle.iam.identity.exception.UserManagerException;
import oracle.iam.identity.exception.UserUnlockException;
import oracle.iam.identity.exception.ValidationFailedException;
import oracle.iam.identity.rolemgmt.api.RoleManager;
import oracle.iam.identity.rolemgmt.api.RoleManagerConstants;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.identity.rolemgmt.vo.*;


public class OF4ALLOIMClient {
    UserManager userManager;
    RoleManager roleManager;
/* public OF4ALLOIMClient() {
        super();
    }
*/
    public static void main(String[] args) {
        OF4ALLOIMClient oF4ALLOIMClient = new OF4ALLOIMClient();
        oF4ALLOIMClient.OIMConnection();
//      oF4ALLOIMClient.createRole("OIMAPCustomRole");
//        oF4ALLOIMClient.createUser("OIMAPICustomUser");
//        oF4ALLOIMClient.disableUser("OIMAPICUSTOMUSER");
//        oF4ALLOIMClient.resetPassword("OIMAPICUSTOMUSER");
        //oF4ALLOIMClient.deleteRole("201");
        
    }
    public void OIMConnection(){             //Function to Connection to OIM
                
                Hashtable<Object, Object> env = new Hashtable<Object, Object>();
                env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, "weblogic.jndi.WLInitialContextFactory");
                env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, "t3://identity.oracleads.com:14000");        //Update localhost with your OIM machine IP
                 
                System.setProperty("java.security.auth.login.config", "C:\\Users\\Praveen\\Documents\\designconsole\\config\\authwl.conf");   //Update path of authwl.conf file according to your environment
                System.setProperty("OIM.AppServerType", "wls");  
                System.setProperty("APPSERVER_TYPE", "wls");
                oracle.iam.platform.OIMClient oimClient = new oracle.iam.platform.OIMClient(env);
         
                 try {                        
                       oimClient.login("xelsysadm", "Oracle123".toCharArray());         //Update password of Admin with your environment password
                       System.out.print("Successfully Connected with OIM ");
                     } catch (LoginException e) {
                       System.out.print("Login Exception"+ e);
                    }            
                  
                userManager = oimClient.getService(UserManager.class);
                roleManager = oimClient.getService(RoleManager.class);
            }
/*
    public void createUser(String userId) {                                             //Function to create User
            HashMap<String, Object> userAttributeValueMap = new HashMap<String, Object>();
                    userAttributeValueMap.put("act_key", new Long(1));
                    userAttributeValueMap.put("User Login", userId);
                    userAttributeValueMap.put("First Name", "CustomOIMAPIUser");
                    userAttributeValueMap.put("Last Name", "IDM");
                    userAttributeValueMap.put("Email", "abc@of.com");
                    userAttributeValueMap.put("usr_password", "Oracle123");
                    userAttributeValueMap.put("Role", "OTHER");
                    User user = new User("OIMAPICustomUser", userAttributeValueMap);
            try {
                userManager.create(user);
                
                System.out.println("\n User got created....");
            } catch (ValidationFailedException e) {
                e.printStackTrace();
            } catch (UserAlreadyExistsException e) {
                e.printStackTrace();
            } catch (UserCreateException e) {
                e.printStackTrace();
            }
        }  

    public void disableUser(String userId) {                        //Function to disable user
                try {
                    userManager.disable(userId, true);
                    System.out.print("\n Disabled user Successfully");
                } catch (ValidationFailedException e) {
                    e.printStackTrace();
                } catch (UserDisableException e) {
                    e.printStackTrace();
                } catch (NoSuchUserException e) {
                    e.printStackTrace();
                }
            }

    public void createRole(String roleName) {
         System.out.println("RoleManagement :: createRole :: role name is "+roleName);
                      try 
                      {
                        if (roleName!=null)
                        {
                            HashMap<String, Object> mapAttrs = new HashMap<String, Object>();;
                            mapAttrs.put(RoleManagerConstants.ROLE_NAME, roleName);
                            mapAttrs.put(RoleManagerConstants.ROLE_DISPLAY_NAME,roleName);
                            mapAttrs.put(RoleManagerConstants.ROLE_DESCRIPTION, roleName);
                            Role role = new Role(mapAttrs);
                            System.out.println("RoleManagement :: createRole :: role manager is "+roleManager);
                            
                            if (roleManager!=null)
                            {
                                roleManager.create(role);
                            }
                        }
                      }
                      catch (Exception e)
                      {
                            System.out.println("RoleManagement :: createRole :: Exception caught is "+e.getMessage());
                            e.printStackTrace();
                      }
        }
 
    public void resetPassword(String userId){                       //Function to reset user password
     
     
            try {
                userManager.resetPassword(userId, true,true);          //Random Password will be set and will be sent to user mail if notifications are enabled
                System.out.println("Reset Password done...");
            } catch (NoSuchUserException e) {
                e.printStackTrace();
            } catch (UserManagerException e) {
                e.printStackTrace();
            }
        }


        public void deleteRole(String roleKey) {
         System.out.println("RoleManagement :: createRole :: role name is "+roleKey);
                      try 
                      {
                        if (roleKey!=null)
                        {
                           
                            if (roleManager!=null)
                            {
                                roleManager.delete(roleKey);
                            }
                        }
                      }
                      catch (Exception e)
                      {
                            System.out.println("RoleManagement :: createRole :: Exception caught is "+e.getMessage());
                            e.printStackTrace();
                      }
        }
*/
}
