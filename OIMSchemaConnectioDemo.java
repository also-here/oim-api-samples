package com.java;

import Thor.API.Security.XLClientSecurityAssociation;

import com.thortech.xl.client.dataobj.tcDataBaseClient;
import com.thortech.xl.dataaccess.tcClientDataAccessException;
import com.thortech.xl.dataaccess.tcDataProvider;
import com.thortech.xl.dataaccess.tcDataSet;
import com.thortech.xl.dataaccess.tcDataSetException;
import com.thortech.xl.orb.dataaccess.tcDataAccessException;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.security.auth.login.LoginException;

import oracle.iam.platform.OIMClient;

/**
 * This demonstrates how to connect to the OIM Schema 
 * using the OIMClient. The OIM administrator credential is required.  
 */
public class OIMSchemaConnectioDemo 
{
	
    public static void main(String[] args)  
    {
        tcDataProvider dbProvider = null; //OIM Schema Database Client 
        OIMClient oimClient = null;

        try 
        {
            String ctxFactory = "weblogic.jndi.WLInitialContextFactory"; //WebLogic Context 
            String oimServerURL = "t3://192.168.56.101:14000";//OIM URL
            //String authwlConfigPath = "/home/oracle/oimClient_lib/conf/authwl.conf"; //Path to login configuration
            String username = "xelsysadm"; //OIM Administrator 
            String password = "Oracle123"; //Administrator Password
            Hashtable<String, String> env = new Hashtable<String, String>();
            env.put(OIMClient.JAVA_NAMING_FACTORY_INITIAL, ctxFactory);
            env.put(OIMClient.JAVA_NAMING_PROVIDER_URL, oimServerURL);
            System.setProperty("java.security.auth.login.config","C:\\Users\\praveen\\Desktop\\designconsole\\config\\authwl.conf");
            System.setProperty("APPSERVER_TYPE", "wls");
            oimClient = new OIMClient(env);
            oimClient.login(username, password.toCharArray()); //login to OIM

            //Establish connection to OIM Schema through the OIMClient
            XLClientSecurityAssociation.setClientHandle(oimClient); 
            dbProvider = new tcDataBaseClient();

            String query = "SELECT USR_LOGIN, TRUNC(USR_PWD_EXPIRE_DATE)-TRUNC(SYSDATE) AS DAYS_LEFT, USR_FIRST_NAME, USR_LAST_NAME FROM USR WHERE USR_STATUS='Active' AND TRUNC(USR_PWD_EXPIRE_DATE) IN(TRUNC(SYSDATE+1),TRUNC(SYSDATE+8),TRUNC(SYSDATE+7))"; //Query all OIM users
            tcDataSet usersDataSet = new tcDataSet(); //store result set of query
            usersDataSet.setQuery(dbProvider, query); 
            usersDataSet.executeQuery();

            int numColumns = usersDataSet.getColumnCount();
            int numRecords = usersDataSet.getTotalRowCount();

            //iterate through each record
            for(int i = 0; i < numRecords; i++)
            {
                usersDataSet.goToRow(i);

                //iterate through each column of a record
                for(int j = 0; j < numColumns; j++)
                {
                    String columnName = usersDataSet.getColumnName(j);
                    String value = usersDataSet.getString(j);
                    System.out.println(columnName + " = " + value);
                }

                System.out.println();
            }

        } 

        catch (tcDataSetException ex) 
        { 
            Logger.getLogger(OIMSchemaConnectioDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch (LoginException ex) 
        {
            Logger.getLogger(OIMSchemaConnectioDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        //resources need to be closed
        finally
        {
            if(dbProvider != null)
            {
                try {
                    dbProvider.close();
                } catch (tcDataAccessException ex) {
                    Logger.getLogger(OIMSchemaConnectioDemo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (tcClientDataAccessException ex) {
                    Logger.getLogger(OIMSchemaConnectioDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            XLClientSecurityAssociation.clearThreadLoginSession();   

            if(oimClient != null)
            {
                oimClient.logout();
            }
        }
    }
}