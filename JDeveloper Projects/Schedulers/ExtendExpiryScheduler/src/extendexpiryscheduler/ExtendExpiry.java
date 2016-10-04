package extendexpiryscheduler;

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

public class ExtendExpiry {
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
/*/---------------------------------------------------lookup-----------------------------------------------------------

    /**
     * @return
     * @throws Exception
     
    public Map<String, String> GetOUs()throws Exception {
        props = new HashMap<String, String>();
        try {
            String lookupName = "Lookup.extendexpiry.user";
            tcResultSet resultSet = lookupOps.getLookupValues(lookupName);
            int amRow = resultSet.getRowCount();
            if (amRow == 0) {
                throw new Exception("Lookup Not Found");
            }
    
            for (int i = 0; i < resultSet.getRowCount(); i++) {
                resultSet.goToRow(i);
                String codeKeyfromResultSet = resultSet.getStringValue("Lookup Definition.Lookup Code Information.Code Key");
                String decodeValue = resultSet.getStringValue("Lookup Definition.Lookup Code Information.Decode");
                props.put(codeKeyfromResultSet, decodeValue);
            }
            return props;
        }
        catch (tcAPIException e) {
            throw new Exception(e);
        }
        catch (tcInvalidLookupException e) {
            throw new Exception(e);
        }
        catch (tcColumnNotFoundException e) {
            throw new Exception(e);
        }
    }
   
    public String ProcResultSet(Map map) {
        String resultKey = "";
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            resultKey = pairs.getKey().toString();
            if (resultKey.contains("0159")) {
                return resultKey;
            }
            it.remove();
        }
        resultKey = "Unable to find OU";
        return resultKey;
    }
*/
}
}