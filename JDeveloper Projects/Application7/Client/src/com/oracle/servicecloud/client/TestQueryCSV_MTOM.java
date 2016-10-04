package com.oracle.servicecloud.client;

import com.oracle.servicecloud.util.ServiceCloudMessageHandler;

import com.rightnow.ws.messages.v1_2.CSVRow;
import com.rightnow.ws.messages.v1_2.CSVTable;
import com.rightnow.ws.messages.v1_2.CSVTableSet;
import com.rightnow.ws.wsdl.v1_2.RequestErrorFault;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncPort;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncService;
import com.rightnow.ws.wsdl.v1_2.ServerErrorFault;
import com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

import java.rmi.RemoteException;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

////////////////////////////////////////////////////////////////////////////////
//Copyright © 2006-2014, Oracle and/or its affiliates. All rights reserved.
//Sample code provided for training purposes only. This sample code is
//provided "as is" with no warranties of any kind express or implied.
//
//Pre-Conditions: 
//1. You must have II_Connect_Enabled for your RightNow CX May 10 or newer site
//2. You must have a staff account whose profile has the Public SOAP bit enabled
//
////////////////////////////////////////////////////////////////////////////////

public class TestQueryCSV_MTOM {
    private RightNowSyncPort CONNECT;
    
    public TestQueryCSV_MTOM() {
        super();
               
        RightNowSyncService rightNowSyncService = new RightNowSyncService();
        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                              "oracle/wss_username_token_client_policy" });        
        CONNECT = rightNowSyncService.getRightNowSyncPort(securityFeatures);
        
        addUsernameSecurity("apiuser1", "Apiuser1");

    }
    /**
     * Executes a ROQL Query using MTOM with raw response and prints the result
     * @param queryString
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     * @throws UnexpectedErrorFault
     */
    public void executeQueryCSV_MTOM(String queryString) throws RequestErrorFault, ServerErrorFault,
                                                               UnexpectedErrorFault {
        /**
         * With MTOM, pass byte[]
         */
        Holder<byte[]> fileData = new Holder<byte[]>();        
        CONNECT.queryCSV(queryString, 10000, ",", true, true, null, fileData);            
        System.out.println("ResponseData:"+new String(fileData.value));                   
        
    }
    
    /**
     * Executes a ROQL query and prints the response
     * @param queryString
     * @throws RemoteException
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
    public void excuteQueryCSV(String queryString) throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault
    {
           /**
            * Without MTOM
            */
           //create CSVTableSet
           CSVTableSet csvSet = new CSVTableSet();
           //define holder
           Holder<CSVTableSet> csvTableSetHolder = new Holder();
           
           CONNECT.queryCSV(queryString, 10000, ",", false, true, csvTableSetHolder, null); 

           CSVTable describeTable = ((CSVTableSet)csvTableSetHolder.value).getCSVTables().getCSVTable().get(0);
           System.out.println("\n==========================================");
           System.out.println("Table: ");
           System.out.println("Columns: " + describeTable.getColumns());
           CSVRow row = describeTable.getRows();
           List<String> rowData = row.getRow();
           
           for (String data : rowData) {
                   System.out.println("Row    :" + data);
           }
                    
            
    }
    
    //String queryString = "SELECT * FROM Contact where name.last = 'Flintstone'";
    //String queryString = "SELECT Contact.ID, I.ReferenceNumber FROM Contact INNER JOIN CONTACT.PrimaryContactIncidents I WHERE Contact.ID = 1";
        
    public static void main(String[] args)
    {
            TestQueryCSV_MTOM queryCSV = new TestQueryCSV_MTOM();
            //define query            
            String queryString = "SELECT O.Name, O.Contacts.PrimaryContactIncidents.ReferenceNumber, O.Contacts.Login FROM Organization O where O.Contacts.PrimaryContactIncidents.StatusWithType.Status.LookupName = 'Solved'";
    
            try {
                queryCSV.executeQueryCSV_MTOM(queryString);
            } catch (UnexpectedErrorFault e) {
                e.printStackTrace(System.err);
            } catch (RequestErrorFault e) {
                e.printStackTrace(System.err);
            } catch (ServerErrorFault e) {
                e.printStackTrace(System.err);
            } 
    }

   /**
    *Jdeveloper 11.x
    * @param username
    * @param pwd
    */
     private void addUsernameSecurity(String username, String pwd){
        // Add your code to call the desired methods.
        ((BindingProvider)CONNECT).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,username);
        ((BindingProvider)CONNECT).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,pwd);
        
        /**
         * disable following for Jdeveloper 11.x.  Handler code is needed for Jdeveloper 12c where SOAP headers are 
         * not handles by the generated proxies. 
         */
        
        Binding binding = ((BindingProvider)CONNECT).getBinding();
              List<Handler> handlerList = binding.getHandlerChain();
              handlerList.add(new ServiceCloudMessageHandler());                        
              binding.setHandlerChain(handlerList);
        
                
    }

   
    
}
