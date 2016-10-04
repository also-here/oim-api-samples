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

public class TestQueryCSV {
    private RightNowSyncPort CONNECT;
    
    public TestQueryCSV() {
        super();
               
        RightNowSyncService rightNowSyncService = new RightNowSyncService();
        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                              "oracle/wss_username_token_client_policy" });        
        CONNECT = rightNowSyncService.getRightNowSyncPort(securityFeatures);
        
        addUsernameSecurity("apiuser1", "Apiuser1");

    }

    public void excuteQueryCSV() throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault
    {
            //define query            
            //String queryString = "SELECT O.Name, I.ReferenceNumber FROM Organization O INNER JOIN O.Contacts.PrimaryContactIncidents I where O.ID=1";
            String queryString = "Select ROQLInformation.* from SystemInformation";
                    
            //create CSVTableSet
            CSVTableSet csvSet = new CSVTableSet();
            //define holder
            Holder<CSVTableSet> csvTableSetHolder = new Holder();
            
            CONNECT.queryCSV(queryString, 10000, "||", false, true, csvTableSetHolder, null); 

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
            TestQueryCSV queryCSV = new TestQueryCSV();
           
            try {
                queryCSV.excuteQueryCSV();;
            } catch (UnexpectedErrorFault e) {
                e.printStackTrace(System.err);
            } catch (RequestErrorFault e) {
                e.printStackTrace(System.err);
            } catch (ServerErrorFault e) {
                e.printStackTrace(System.err);
            } catch (RemoteException e) {
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
         * disable following for Jdeveloper 11.x
         */
        Binding binding = ((BindingProvider)CONNECT).getBinding();
              List<Handler> handlerList = binding.getHandlerChain();
              handlerList.add(new ServiceCloudMessageHandler());                        
              binding.setHandlerChain(handlerList);
        
                
    }

   
    
}
