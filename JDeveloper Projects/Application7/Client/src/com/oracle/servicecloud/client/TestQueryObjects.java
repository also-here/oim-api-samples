package com.oracle.servicecloud.client;

import com.oracle.servicecloud.util.ServiceCloudMessageHandler;

import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.messages.v1_2.QueryResultData;
import com.rightnow.ws.messages.v1_2.RNObjectsResult;
import com.rightnow.ws.objects.v1_2.Contact;
import com.rightnow.ws.objects.v1_2.Note;
import com.rightnow.ws.objects.v1_2.NoteList;
import com.rightnow.ws.wsdl.v1_2.RequestErrorFault;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncPort;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncService;
import com.rightnow.ws.wsdl.v1_2.ServerErrorFault;
import com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

import java.rmi.RemoteException;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
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

public class TestQueryObjects {
    private RightNowSyncPort CONNECT;
    
    public TestQueryObjects() {
        super();
               
        RightNowSyncService rightNowSyncService = new RightNowSyncService();
        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                              "oracle/wss_username_token_client_policy" });        
        CONNECT = rightNowSyncService.getRightNowSyncPort(securityFeatures);
        
        addUsernameSecurity("apiuser1", "Apiuser1");

    }

    public void excuteQueryObject() throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault
    {
            
            String queryString = "SELECT O.Contacts FROM Organization O WHERE O.ID = 1; SELECT Contact FROM Contact C WHERE C.ID = 1;";
                
            Contact contactTemplate = new Contact();
            contactTemplate.setNotes(new NoteList());
            
            List<RNObject> objectTemplates = new ArrayList<RNObject>();
            objectTemplates.add(contactTemplate);
        
            List<QueryResultData> resultData = CONNECT.queryObjects(queryString, objectTemplates, 1000);            
            
            RNObjectsResult rnObjectsResult = resultData.get(0).getRNObjectsResult();
            List<RNObject> rnObjects = rnObjectsResult.getRNObjects();
            
            for(RNObject obj : rnObjects)
            {
                    Contact contact = (Contact)obj;
                    
                    System.out.println("Contact first name: " + contact.getName().getFirst() + " Last name: " + contact.getName().getLast());
                    
                    NoteList notes = contact.getNotes();
                    if(notes != null)
                    {
                            List<Note> noteList = notes.getNoteList();
                            
                            if(noteList != null)
                            {
                                    for(Note note : noteList)
                                    {
                                            System.out.println("Contact note text: " + note.getText());
                                    }
                            }
                    }
            }
            
    }
    
    public static void main(String[] args)
    {
            TestQueryObjects queryObjects = new TestQueryObjects();
           
            try {
                queryObjects.excuteQueryObject();;
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
