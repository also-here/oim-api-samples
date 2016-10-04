package com.oracle.servicecloud.util;

import java.io.IOException;

import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class ServiceCloudMessageHandler implements SOAPHandler<SOAPMessageContext>
{
  public Set<QName> getHeaders()
  {
    return Collections.emptySet();
  }

  public boolean handleMessage(SOAPMessageContext messageContext)
  {
     Boolean outboundProperty = (Boolean)
         messageContext.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

     
     SOAPMessage message = messageContext.getMessage();
//System.out.println("Inside handler ####");
     try {
         //if inbound, do nothing
         if(!outboundProperty.booleanValue()){
             System.out.print("Inbound XML:");
             message.writeTo(System.out);
             System.out.print("\n");
            
         }
         //if outbound, add AppID header and then print message
         else{
             
             SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();             
             SOAPHeader header = envelope.getHeader();
             //System.out.println("header:"+header);
             if(header==null) {
                 header = envelope.addHeader();
             }

             SOAPElement clientInfo =
                     header.addChildElement("ClientInfoHeader", "ns101", "urn:messages.ws.rightnow.com/v1_2");

             SOAPElement appID =
                     clientInfo.addChildElement("AppID", "ns101");
             appID.addTextNode("Sample Client");             
             
             System.out.print("Outbound XML:");
             message.writeTo(System.out);
             System.out.print("\n");
            
         }  
           
         
        } catch (IOException e) {
                     System.out.println(e.getMessage());
                     e.printStackTrace();
        } catch (SOAPException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return true;
  }

  public boolean handleFault(SOAPMessageContext messageContext)
  {
        try {
            System.out.println("Fault receieved:" );
            messageContext.getMessage().writeTo(System.out);
        } catch (SOAPException e) {
        } catch (IOException e) {
        }
        return true;
  }

  public void close(MessageContext messageContext)
  {
  }
}