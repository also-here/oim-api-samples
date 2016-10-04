package com.oracle.servicecloud.client;

import com.oracle.servicecloud.util.ConnectHelper;
import com.oracle.servicecloud.util.ServiceCloudMessageHandler;

import com.rightnow.ws.base.v1_2.ActionEnum;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.DataTypeEnum;
import com.rightnow.ws.generic.v1_2.GenericField;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.generic.v1_2.RNObjectType;
import com.rightnow.ws.messages.v1_2.BatchRequestItem;
import com.rightnow.ws.messages.v1_2.BatchResponseItem;
import com.rightnow.ws.objects.v1_2.Contact;
import com.rightnow.ws.objects.v1_2.Email;
import com.rightnow.ws.objects.v1_2.EmailList;
import com.rightnow.ws.objects.v1_2.PersonName;
import com.rightnow.ws.wsdl.v1_2.RequestErrorFault;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncPort;
import com.rightnow.ws.wsdl.v1_2.RightNowSyncService;
import com.rightnow.ws.wsdl.v1_2.ServerErrorFault;
import com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

public class TestCustomObject {

    private RightNowSyncPort CONNECT;


    public TestCustomObject() {
        super();
        RightNowSyncService rightNowSyncService = new RightNowSyncService();
        // Configure security feature
        SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] {
                                                                               "oracle/wss_username_token_client_policy" });
        CONNECT = rightNowSyncService.getRightNowSyncPort(securityFeatures);
        addUsernameSecurity("apiuser1", "Apiuser1");
    }


    public static void main(String[] args) {
        TestCustomObject testApp = new TestCustomObject();
        testApp.synchLoyaltyAccount("Vikram", "Kaledhonkar", 101000, 10999);
    }


    private void synchLoyaltyAccount(String firstName, String lastName, int totalPoints, int pointsYearToDate) {

        //create contact object
        Contact newContact = populateContactObj(firstName, lastName, firstName + "." + lastName + "@company.com");
        //mark as source chain ID
        ConnectHelper.addSourceChainID(newContact, "newContact");
        //create LoyaltyAccount
        GenericObject loyaltyAccountObj =
            populateLoyaltyAccountObj(totalPoints, pointsYearToDate, decideLevel(totalPoints));
        //mark as destination source ID with same variable name
        ConnectHelper.addDestinationChainID_Generic(loyaltyAccountObj, "Contact", "newContact");
        //create batchItem for Creating Contact and LoyaltyAccount
        List<RNObject> objectList = new ArrayList<RNObject>();
        objectList.add(newContact);
        objectList.add(loyaltyAccountObj);
        BatchRequestItem createItem = ConnectHelper.populateBatchRequestItem_Create(objectList);

        //execute batch
        List<BatchRequestItem> createRequestList = new ArrayList<BatchRequestItem>();
        createRequestList.add(createItem);

        List<BatchResponseItem> createResponseList = null;
        try {
            createResponseList = CONNECT.batch(createRequestList);
        } catch (UnexpectedErrorFault e) {
            e.printStackTrace(System.err);
        } catch (ServerErrorFault e) {
            e.printStackTrace(System.err);
        } catch (RequestErrorFault e) {
            e.printStackTrace(System.err);
        }

    }

    /**
     * creates and populates new Contact object
     * @param first
     * @param last
     * @param emailStr
     * @return
     */
    public Contact populateContactObj(String first, String last, String emailStr) {

        Contact newContact = new Contact();

        //Build a PersonName object for the Contact
        PersonName personName = new PersonName();
        personName.setFirst(first);
        personName.setLast(last);

        //Build an E-MailList object
        EmailList emailListObj = new EmailList();

        //Build the Email array, here we populate a single e-mail address
        List<Email> emailList = new ArrayList<Email>();
        Email primaryEmail = new Email();
        primaryEmail.setAction(ActionEnum.ADD);
        primaryEmail.setAddress(emailStr);

        //Set the type of e-mail
        NamedID emailType = new NamedID();
        ID emailTypeID = new ID();
        emailTypeID.setId((long) 0);
        emailType.setID(emailTypeID);

        //Add the address type to the e-mail object
        primaryEmail.setAddressType(emailType);
        emailList.add(primaryEmail);
        emailListObj.getEmailList().addAll(emailList);

        //Add the PersonName and EmailList to the new Contact object
        newContact.setName(personName);
        newContact.setEmails(emailListObj);

        return newContact;
    }


    /**
     *
     * @param totalPoints
     * @return
     */
    private String decideLevel(int totalPoints) {
        if (totalPoints > 10000)
            return "Platinum";
        if (totalPoints > 70000)
            return "Gold";
        if (totalPoints > 50000)
            return "Silver";
        return "Standard";
    }


    /**
     * Populates CO.LoyaltyAccount with totalpoints, yearToDate points and level
     * @param totalPoints
     * @param pointsYearToDate
     * @param level
     * @return
     */
    public GenericObject populateLoyaltyAccountObj(int totalPoints, int pointsYearToDate, String level) {

        /**
             * create a GO representing CO.LoyaltyAccount custom object
             */
        GenericObject genericObj = new GenericObject();
        RNObjectType rnType = new RNObjectType();
        rnType.setNamespace("CO");
        rnType.setTypeName("LoyaltyAccount");
        genericObj.setObjectType(rnType);

        //set TotalPoints field
        GenericField total_Points =
            ConnectHelper.createGenericField("TotalPoints", ConnectHelper.createIntegerDataValue(totalPoints),
                                             DataTypeEnum.INTEGER);
        genericObj.getGenericFields().add(total_Points);

        //set Points_YearToDate
        GenericField points_YearToDate =
            ConnectHelper.createGenericField("Points_YearToDate",
                                             ConnectHelper.createIntegerDataValue(pointsYearToDate),
                                             DataTypeEnum.INTEGER);
        genericObj.getGenericFields().add(points_YearToDate);

        //set Points_YearToDate
        GenericField levelGF =
            ConnectHelper.createGenericField("Level", ConnectHelper.createNamedIDDataValue(level),
                                             DataTypeEnum.NAMED_ID);
        genericObj.getGenericFields().add(levelGF);

        return genericObj;
    }

    /**
     *Jdeveloper 11.x
     * @param username
     * @param pwd
     */
    private void addUsernameSecurity(String username, String pwd) {
        // Add your code to call the desired methods.
        ((BindingProvider) CONNECT).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
        ((BindingProvider) CONNECT).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, pwd);

        /**
          * Needed for Jdeveloper 12c when SOAP headers are not generated properly.
          * Comment the following for Jdeveloper 11.x
          */
        Binding binding = ((BindingProvider) CONNECT).getBinding();
        List<Handler> handlerList = binding.getHandlerChain();
        handlerList.add(new ServiceCloudMessageHandler());
        binding.setHandlerChain(handlerList);
    }

}


