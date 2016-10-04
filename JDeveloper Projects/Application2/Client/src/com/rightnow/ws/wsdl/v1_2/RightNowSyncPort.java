package com.rightnow.ws.wsdl.v1_2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://pts-jantt1-training-191.rightnowdemo.com/cgi-bin/pts-jantt1-training-191.cfg/services/soap?wsdl",
  targetNamespace="urn:wsdl.ws.rightnow.com/v1_2", name="RightNowSyncPort")
@XmlSeeAlso(
  { com.rightnow.ws.messages.v1_2.ObjectFactory.class, com.rightnow.ws.generic.v1_2.ObjectFactory.class, com.rightnow.ws.objects.v1_2.ObjectFactory.class, com.rightnow.ws.nullfields.v1_2.ObjectFactory.class, com.rightnow.ws.metadata.v1_2.ObjectFactory.class, com.rightnow.ws.faults.v1_2.ObjectFactory.class, com.rightnow.ws.base.v1_2.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface RightNowSyncPort
{
  @WebMethod(operationName="Create", action="Create")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="Create", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Create/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Create/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Create/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/CreateResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="CreateResponse")
  public com.rightnow.ws.messages.v1_2.CreateResponseMsg create(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="Create")
    com.rightnow.ws.messages.v1_2.CreateMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="Get", action="Get")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="Get", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Get/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Get/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Get/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetResponse")
  public com.rightnow.ws.messages.v1_2.GetResponseMsg get(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="Get")
    com.rightnow.ws.messages.v1_2.GetMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="Update", action="Update")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="Update", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Update/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Update/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Update/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/UpdateResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="UpdateResponse")
  public com.rightnow.ws.messages.v1_2.UpdateResponseMsg update(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="Update")
    com.rightnow.ws.messages.v1_2.UpdateMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="Destroy", action="Destroy")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="Destroy", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Destroy/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Destroy/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Destroy/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/DestroyResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="DestroyResponse")
  public com.rightnow.ws.messages.v1_2.DestroyResponseMsg destroy(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="Destroy")
    com.rightnow.ws.messages.v1_2.DestroyMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="QueryObjects", action="QueryObjects")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="QueryObjects", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryObjects/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryObjects/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryObjects/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryObjectsResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="QueryObjectsResponse")
  public com.rightnow.ws.messages.v1_2.QueryObjectsResponseMsg queryObjects(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="QueryObjects")
    com.rightnow.ws.messages.v1_2.QueryObjectsMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="QueryCSV", action="QueryCSV")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="QueryCSV", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryCSV/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryCSV/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryCSV/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/QueryCSVResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="QueryCSVResponse")
  public com.rightnow.ws.messages.v1_2.QueryCSVResponseMsg queryCSV(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="QueryCSV")
    com.rightnow.ws.messages.v1_2.QueryMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="RunAnalyticsReport", action="RunAnalyticsReport")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="RunAnalyticsReport", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/RunAnalyticsReport/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/RunAnalyticsReport/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/RunAnalyticsReport/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/RunAnalyticsReportResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="RunAnalyticsReportResponse")
  public com.rightnow.ws.messages.v1_2.RunAnalyticsReportResponseMsg runAnalyticsReport(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="RunAnalyticsReport")
    com.rightnow.ws.messages.v1_2.RunAnalyticsReportMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="ExecuteMarketingFlow", action="ExecuteMarketingFlow")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ExecuteMarketingFlow", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ExecuteMarketingFlow/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ExecuteMarketingFlow/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ExecuteMarketingFlow/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ExecuteMarketingFlowResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="ExecuteMarketingFlowResponse")
  public com.rightnow.ws.messages.v1_2.ExecuteMarketingFlowResponseMsg executeMarketingFlow(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="ExecuteMarketingFlow")
    com.rightnow.ws.messages.v1_2.ExecuteMarketingFlowMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetFileData", action="GetFileData")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetFileData", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetFileData/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetFileData/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetFileData/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetFileDataResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetFileDataResponse")
  public com.rightnow.ws.messages.v1_2.GetFileDataResponseMsg getFileData(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetFileData")
    com.rightnow.ws.messages.v1_2.GetFileDataMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="ResetContactPassword", action="ResetContactPassword")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ResetContactPassword", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ResetContactPassword/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ResetContactPassword/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ResetContactPassword/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ResetContactPasswordResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="ResetContactPasswordResponse")
  public com.rightnow.ws.messages.v1_2.ResetContactPasswordResponseMsg resetContactPassword(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="ResetContactPassword")
    com.rightnow.ws.messages.v1_2.ResetContactPasswordMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="SendMailingToContact", action="SendMailingToContact")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="SendMailingToContact", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/SendMailingToContact/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/SendMailingToContact/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/SendMailingToContact/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/SendMailingToContactResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="SendMailingToContactResponse")
  public com.rightnow.ws.messages.v1_2.SendMailingToContactResponseMsg sendMailingToContact(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="SendMailingToContact")
    com.rightnow.ws.messages.v1_2.SendMailingToContactMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="TransferSubObjects", action="TransferSubObjects")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="TransferSubObjects", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/TransferSubObjects/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/TransferSubObjects/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/TransferSubObjects/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/TransferSubObjectsResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="TransferSubObjectsResponse")
  public com.rightnow.ws.messages.v1_2.TransferSubObjectsResponseMsg transferSubObjects(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="TransferSubObjects")
    com.rightnow.ws.messages.v1_2.TransferSubObjectsMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="Batch", action="Batch")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="Batch", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Batch/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Batch/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/Batch/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/BatchResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="BatchResponse")
  public com.rightnow.ws.messages.v1_2.BatchResponseMsg batch(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="Batch")
    com.rightnow.ws.messages.v1_2.BatchMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetMetaData", action="GetMetaData")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetMetaData", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaData/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaData/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaData/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetMetaDataResponse")
  public com.rightnow.ws.messages.v1_2.GetMetaDataResponseMsg getMetaData(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetMetaData")
    com.rightnow.ws.messages.v1_2.GetMetaDataMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetMetaDataForClass", action="GetMetaDataForClass")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetMetaDataForClass", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataForClass/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataForClass/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataForClass/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataForClassResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetMetaDataForClassResponse")
  public com.rightnow.ws.messages.v1_2.GetMetaDataForClassResponseMsg getMetaDataForClass(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetMetaDataForClass")
    com.rightnow.ws.messages.v1_2.GetMetaDataForClassMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetMetaDataLastChangeTime", action="GetMetaDataLastChangeTime")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetMetaDataLastChangeTime", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataLastChangeTime/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataLastChangeTime/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataLastChangeTime/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetMetaDataLastChangeTimeResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetMetaDataLastChangeTimeResponse")
  public com.rightnow.ws.messages.v1_2.GetMetaDataLastChangeTimeResponseMsg getMetaDataLastChangeTime(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetMetaDataLastChangeTime")
    com.rightnow.ws.messages.v1_2.GetMetaDataLastChangeTimeMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetValuesForNamedID", action="GetValuesForNamedID")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetValuesForNamedID", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedID/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedID/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedID/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedIDResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetValuesForNamedIDResponse")
  public com.rightnow.ws.messages.v1_2.GetValuesForNamedIDResponseMsg getValuesForNamedID(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetValuesForNamedID")
    com.rightnow.ws.messages.v1_2.GetValuesForNamedIDMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="GetValuesForNamedIDHierarchy", action="GetValuesForNamedIDHierarchy")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="GetValuesForNamedIDHierarchy", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedIDHierarchy/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedIDHierarchy/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedIDHierarchy/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/GetValuesForNamedIDHierarchyResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="GetValuesForNamedIDHierarchyResponse")
  public com.rightnow.ws.messages.v1_2.GetValuesForNamedIDHierarchyResponseMsg getValuesForNamedIDHierarchy(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="GetValuesForNamedIDHierarchy")
    com.rightnow.ws.messages.v1_2.GetValuesForNamedIDHierarchyMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="ConvertGenericToObject", action="ConvertGenericToObject")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ConvertGenericToObject", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertGenericToObject/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertGenericToObject/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertGenericToObject/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertGenericToObjectResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="ConvertGenericToObjectResponse")
  public com.rightnow.ws.messages.v1_2.ConvertObjectResponseMsg convertGenericToObject(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="ConvertGenericToObject")
    com.rightnow.ws.messages.v1_2.ConvertObjectMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;

  @WebMethod(operationName="ConvertObjectToGeneric", action="ConvertObjectToGeneric")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="ConvertObjectToGeneric", fault =
      { @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertObjectToGeneric/Fault/ServerErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.ServerErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertObjectToGeneric/Fault/RequestErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.RequestErrorFault.class),
        @FaultAction(value="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertObjectToGeneric/Fault/UnexpectedErrorFault",
          className=com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault.class) },
    output="urn:wsdl.ws.rightnow.com/v1_2/RightNowSyncPort/ConvertObjectToGenericResponse")
  @WebResult(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
    partName="parameters", name="ConvertObjectToGenericResponse")
  public com.rightnow.ws.messages.v1_2.ConvertObjectResponseMsg convertObjectToGeneric(@WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="parameters", name="ConvertObjectToGeneric")
    com.rightnow.ws.messages.v1_2.ConvertObjectMsg parameters,
    @WebParam(targetNamespace="urn:messages.ws.rightnow.com/v1_2",
      partName="request_header", name="ClientInfoHeader", header=true)
    com.rightnow.ws.messages.v1_2.ClientInfoHeader request_header)
    throws com.rightnow.ws.wsdl.v1_2.ServerErrorFault, com.rightnow.ws.wsdl.v1_2.RequestErrorFault, com.rightnow.ws.wsdl.v1_2.UnexpectedErrorFault;
}
