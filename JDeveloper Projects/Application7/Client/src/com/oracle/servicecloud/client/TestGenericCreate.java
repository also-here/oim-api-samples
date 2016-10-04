package com.oracle.servicecloud.client;

import com.oracle.servicecloud.util.ConnectHelper;
import com.oracle.servicecloud.util.ServiceCloudMessageHandler;

import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.DataTypeEnum;
import com.rightnow.ws.generic.v1_2.GenericField;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.generic.v1_2.RNObjectType;
import com.rightnow.ws.messages.v1_2.ClientInfoHeader;
import com.rightnow.ws.messages.v1_2.CreateProcessingOptions;
import com.rightnow.ws.messages.v1_2.RNObjectsResult;
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

public class TestGenericCreate {
    
    private RightNowSyncPort connect;
    
    public TestGenericCreate() {
        super();
        RightNowSyncService rightNowSyncService = new RightNowSyncService();
        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                              "oracle/wss_username_token_client_policy" });        
        connect = rightNowSyncService.getRightNowSyncPort(securityFeatures);        
        addUsernameSecurity("apiuser1", "Apiuser1");
    }
    
    public static void main(String[] args){

        TestGenericCreate testCreate = new TestGenericCreate();
        try {
            testCreate.createContact("Larry", "El", "Larry.El@company.com");
        } catch (UnexpectedErrorFault e) {
            e.printStackTrace();
        } catch (RequestErrorFault e) {
            e.printStackTrace();
        } catch (ServerErrorFault e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    
    private void createContact(String firstName, String lastName, String email) throws RemoteException, ServerErrorFault, RequestErrorFault,
                                                                                       UnexpectedErrorFault {
            GenericObject genericContact = populateGenericContactObj(firstName, lastName, email);            
            
            List<RNObject> createObjects = new ArrayList<RNObject>();
            createObjects.add(genericContact);
            
            CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
            createProcessingOptions.setSuppressExternalEvents(false);
            createProcessingOptions.setSuppressRules(false);
    
            ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
            clientInfoHeader.setAppID("Generic Create Sample");
            RNObjectsResult createRes = connect.create(createObjects, createProcessingOptions);
            
            List<RNObject> rnObjects = createRes.getRNObjects();
            
            for(RNObject obj : rnObjects)
            {
                    GenericObject genObj = (GenericObject)obj;
                    System.out.println("Generic Object with id: " + genObj.getID().getId() + " created.");
            }
    }
    
    
    private GenericObject populateGenericContactObj(String first, String last, String email)
    {
            GenericObject genericContact = new GenericObject();
            //Set the object type to contact
            RNObjectType objType = new RNObjectType();
            objType.setTypeName("Contact");
            genericContact.setObjectType(objType);
            
            GenericField addressTypeGenericField =
            ConnectHelper.createGenericField("AddressType", ConnectHelper.createNamedIDDataValue(0), DataTypeEnum.NAMED_ID);
            GenericField addressGenericField =
            ConnectHelper.createGenericField("Address", ConnectHelper.createStringDataValue(email), DataTypeEnum.STRING);          
            
            GenericField actionEnumGenericField =
            ConnectHelper.createGenericField("ActionEnum", ConnectHelper.createStringDataValue("add"), DataTypeEnum.STRING);
            List<GenericField> actionFieldList = new ArrayList<GenericField>();
            actionFieldList.add(actionEnumGenericField);
            
            GenericField actionGenericField =
            ConnectHelper.createGenericField("action",
                                             ConnectHelper.createObjectDataValue("ActionEnum", actionFieldList), DataTypeEnum.OBJECT);

            List<GenericField> emailFieldList = new ArrayList<GenericField>();
            emailFieldList.add(actionGenericField);
            emailFieldList.add(addressGenericField);
            emailFieldList.add(addressTypeGenericField);
            
            GenericObject emailObj = ConnectHelper.createGenericObject("Email", emailFieldList);
            
            List<GenericObject> emailObjList = new ArrayList<GenericObject>();
            emailObjList.add(emailObj);
            
            GenericField emailListGenericField =
            ConnectHelper.createGenericField("EmailList",
                                             ConnectHelper.createObjectListDataValue("Email", emailObjList), DataTypeEnum.OBJECT_LIST);
            
            List<GenericField> emailsFieldList = new ArrayList<GenericField>();
            emailsFieldList.add(emailListGenericField);
            
            GenericField emailsGenericField =
            ConnectHelper.createGenericField("Emails",
                                             ConnectHelper.createObjectDataValue("EmailList", emailsFieldList), DataTypeEnum.OBJECT);
            
            GenericField lastGenericField =
            ConnectHelper.createGenericField("Last", ConnectHelper.createStringDataValue(last), DataTypeEnum.STRING);
            GenericField firstGenericField =
            ConnectHelper.createGenericField("First", ConnectHelper.createStringDataValue(first), DataTypeEnum.STRING);
            List<GenericField> personNameFieldList = new ArrayList<GenericField>();
            personNameFieldList.add(lastGenericField);
            personNameFieldList.add(firstGenericField);
            GenericField nameGenericField =
            ConnectHelper.createGenericField("Name",
                                             ConnectHelper.createObjectDataValue("PersonName", personNameFieldList), DataTypeEnum.OBJECT);
            
            List<GenericField> contactGenericFieldList = new ArrayList<GenericField>();
            contactGenericFieldList.add(emailsGenericField);
            contactGenericFieldList.add(nameGenericField);
            
            genericContact.getGenericFields().addAll(contactGenericFieldList);
            
            return genericContact;
    }
    
    /**
    *Jdeveloper 11.x
    * @param username
    * @param pwd
    */
      private void addUsernameSecurity(String username, String pwd){
         // Add your code to call the desired methods.
         ((BindingProvider)connect).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,username);
         ((BindingProvider)connect).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,pwd);
         
         /**
          * Needed for Jdeveloper 12c when SOAP headers are not generated properly
          */
         Binding binding = ((BindingProvider)connect).getBinding();
               List<Handler> handlerList = binding.getHandlerChain();
               handlerList.add(new ServiceCloudMessageHandler());                        
               binding.setHandlerChain(handlerList);         
     }
    
}
