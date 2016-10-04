package com.rightnow.ws.wsdl.v1_2;

import com.oracle.servicecloud.util.ServiceCloudMessageHandler;

import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.messages.v1_2.GetProcessingOptions;
import com.rightnow.ws.messages.v1_2.RNObjectsResult;
import com.rightnow.ws.objects.v1_2.Contact;
import com.rightnow.ws.objects.v1_2.Note;
import com.rightnow.ws.objects.v1_2.NoteList;

import java.rmi.RemoteException;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

////////////////////////////////////////////////////////////////////////////////
//Copyright © 2006-2012, Oracle and/or its affiliates. All rights reserved.
//Sample code provided for training purposes only. This sample code is
//provided "as is" with no warranties of any kind express or implied.
//
//File: BasicRead.java
//
//Comments: Basic sample that demonstrates reading object data
//
//Notes: 
//1. Notes and Severity may not show up if the Contact and Incident records do not have these fields set.
//
//Pre-Conditions: 
//1. You must have II_Connect_Enabled for your RightNow CX May 10 or newer site
//2. You must have a staff account whose profile has the Public SOAP bit enabled
//
////////////////////////////////////////////////////////////////////////////////
public class TestGetContact
{
      private RightNowSyncPort rightNowSOAPService;
    
	public TestGetContact() 
	{
	    super();
	           
            RightNowSyncService rightNowSyncService = new RightNowSyncService();
           // Configure security feature
           SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                                  "oracle/wss_username_token_client_policy" });        
           rightNowSOAPService = rightNowSyncService.getRightNowSyncPort(securityFeatures);
           
           addUsernameSecurity("apiuser1", "Apiuser1");

	}
        /**
     * Prints the details for a Contact, for a given ContacID as input
     * @param cID
     * @return
     * @throws RemoteException
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     * @throws UnexpectedErrorFault
     */
	public boolean readContact(long cID) throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault
	{
		//Create a Contact object as template for GET	
		Contact contact = new Contact();
		//Create and set the Id property
		ID contactID = new ID();
		contactID.setId(cID);
		//Set the ID on the primary objects
		contact.setID(contactID);
		//For the Contact lets get the sub-objects Notes
		NoteList noteList = new NoteList();
		contact.setNotes(noteList);
		
		//Build the RNObject array
		List<RNObject> objects = new ArrayList<RNObject>();
                objects.add(contact);
		
		//Build and set the processing options
		GetProcessingOptions options = new GetProcessingOptions();
		options.setFetchAllNames(false);
                
                /**
                 * Uncomment for using Jdeveloper 11.x
                 *
                    ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
                    clientInfoHeader.setAppID("Basic Get");
                    RNObjectsResult getResults = rightNowSOAPService.get(objects, options);
                    GetResponseMsg responseMsg = _service.get(msgParameters, clientInfoHeader);
                */
                
                //For Jdeveloper 12.x
                RNObjectsResult getResults = rightNowSOAPService.get(objects, options);
                
                List<RNObject> resObjects = getResults.getRNObjects();
                
                
                //Print the Contact information
                
                contact = (Contact)resObjects.get(0);
                System.out.println("Contact First Name: " + contact.getName().getFirst() + " Last Name: " + contact.getName().getLast());
                
                if(contact.getNotes() != null)
                {
                        for(Note note : contact.getNotes().getNoteList())
                        {
                                System.out.println("Note Text: " + note.getText());
                        }
                }
                
                return true;
	}
	
	public static void main(String[] args)
	{
                TestGetContact getContact = new TestGetContact();
                try {
                    getContact.readContact(1);
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
     *Jdeveloper 12c
     * @param username
     * @param pwd
     */
         private void addUsernameSecurity(String username, String pwd){
            // Add your code to call the desired methods.
            ((BindingProvider)rightNowSOAPService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,username);
            ((BindingProvider)rightNowSOAPService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,pwd);
            
            /**
             * Command code below while using Jdeveloper 11.x as it will create bindings for SOAP headers
             */
            Binding binding = ((BindingProvider)rightNowSOAPService).getBinding();
                  List<Handler> handlerList = binding.getHandlerChain();
                  handlerList.add(new ServiceCloudMessageHandler());                        
                  binding.setHandlerChain(handlerList);            
                    
        }
           
    
}
