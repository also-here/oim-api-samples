
package com.rightnow.ws.wsdl.v1_2;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.NamedIDWithParent;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.RNObjectType;
import com.rightnow.ws.messages.v1_2.BatchRequestItem;
import com.rightnow.ws.messages.v1_2.BatchResponseItem;
import com.rightnow.ws.messages.v1_2.CSVTableSet;
import com.rightnow.ws.messages.v1_2.CreateProcessingOptions;
import com.rightnow.ws.messages.v1_2.DestroyProcessingOptions;
import com.rightnow.ws.messages.v1_2.GetProcessingOptions;
import com.rightnow.ws.messages.v1_2.QueryResultData;
import com.rightnow.ws.messages.v1_2.RNObjectsResult;
import com.rightnow.ws.messages.v1_2.UpdateProcessingOptions;
import com.rightnow.ws.metadata.v1_2.MetaDataClass;
import com.rightnow.ws.objects.v1_2.AnalyticsReport;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8-b13937
 * Generated source version: 2.2
 *
 */
@WebService(name = "RightNowSyncPort", targetNamespace = "urn:wsdl.ws.rightnow.com/v1_2")
@XmlSeeAlso({
            com.rightnow.ws.base.v1_2.ObjectFactory.class, com.rightnow.ws.faults.v1_2.ObjectFactory.class,
            com.rightnow.ws.generic.v1_2.ObjectFactory.class, com.rightnow.ws.messages.v1_2.ObjectFactory.class,
            com.rightnow.ws.metadata.v1_2.ObjectFactory.class, com.rightnow.ws.nullfields.v1_2.ObjectFactory.class,
            com.rightnow.ws.objects.v1_2.ObjectFactory.class
    })
public interface RightNowSyncPort {


    /**
     *
     * @param processingOptions
     * @param rnObjects
     * @return
     * returns com.rightnow.ws.messages.v1_2.RNObjectsResult
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "Create", action = "Create")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "Create", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.CreateMsg")
    @ResponseWrapper(localName = "CreateResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.CreateResponseMsg")
    public RNObjectsResult create(@WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                  List<RNObject> rnObjects,
                                  @WebParam(name = "ProcessingOptions",
                                            targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                  CreateProcessingOptions processingOptions) throws RequestErrorFault, ServerErrorFault,
                                                                                    UnexpectedErrorFault;

    /**
     *
     * @param processingOptions
     * @param rnObjects
     * @return
     * returns com.rightnow.ws.messages.v1_2.RNObjectsResult
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "Get", action = "Get")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "Get", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetMsg")
    @ResponseWrapper(localName = "GetResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetResponseMsg")
    public RNObjectsResult get(@WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                               List<RNObject> rnObjects,
                               @WebParam(name = "ProcessingOptions",
                                         targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                               GetProcessingOptions processingOptions) throws RequestErrorFault, ServerErrorFault,
                                                                              UnexpectedErrorFault;

    /**
     *
     * @param processingOptions
     * @param rnObjects
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "Update", action = "Update")
    @RequestWrapper(localName = "Update", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.UpdateMsg")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.UpdateResponseMsg")
    public void update(@WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                       List<RNObject> rnObjects,
                       @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                       UpdateProcessingOptions processingOptions) throws RequestErrorFault, ServerErrorFault,
                                                                         UnexpectedErrorFault;

    /**
     *
     * @param processingOptions
     * @param rnObjects
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "Destroy", action = "Destroy")
    @RequestWrapper(localName = "Destroy", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.DestroyMsg")
    @ResponseWrapper(localName = "DestroyResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.DestroyResponseMsg")
    public void destroy(@WebParam(name = "RNObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                        List<RNObject> rnObjects,
                        @WebParam(name = "ProcessingOptions", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                        DestroyProcessingOptions processingOptions) throws RequestErrorFault, ServerErrorFault,
                                                                           UnexpectedErrorFault;

    /**
     *
     * @param delimiter
     * @param query
     * @param disableMTOM
     * @param pageSize
     * @param returnRawResult
     * @param csvTableSet
     * @param fileData
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "QueryCSV", action = "QueryCSV")
    @RequestWrapper(localName = "QueryCSV", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.QueryMsg")
    @ResponseWrapper(localName = "QueryCSVResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.QueryCSVResponseMsg")
    public void queryCSV(@WebParam(name = "Query", targetNamespace = "urn:messages.ws.rightnow.com/v1_2") String query,
                         @WebParam(name = "PageSize", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                         Integer pageSize,
                         @WebParam(name = "Delimiter", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                         String delimiter,
                         @WebParam(name = "ReturnRawResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                         Boolean returnRawResult,
                         @WebParam(name = "DisableMTOM", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                         Boolean disableMTOM,
                         @WebParam(name = "CSVTableSet", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                                   mode = WebParam.Mode.OUT) Holder<CSVTableSet> csvTableSet,
                         @WebParam(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                                   mode = WebParam.Mode.OUT) Holder<byte[]> fileData) throws RequestErrorFault,
                                                                                             ServerErrorFault,
                                                                                             UnexpectedErrorFault;

    /**
     *
     * @param query
     * @param pageSize
     * @param objectTemplates
     * @return
     * returns java.util.List<com.rightnow.ws.messages.v1_2.QueryResultData>
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "QueryObjects", action = "QueryObjects")
    @WebResult(name = "Result", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "QueryObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.QueryObjectsMsg")
    @ResponseWrapper(localName = "QueryObjectsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.QueryObjectsResponseMsg")
    public List<QueryResultData> queryObjects(@WebParam(name = "Query",
                                                        targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                              String query,
                                              @WebParam(name = "ObjectTemplates",
                                                        targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                              List<RNObject> objectTemplates,
                                              @WebParam(name = "PageSize",
                                                        targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                              Integer pageSize) throws RequestErrorFault, ServerErrorFault,
                                                                       UnexpectedErrorFault;

    /**
     *
     * @param delimiter
     * @param limit
     * @param start
     * @param disableMTOM
     * @param analyticsReport
     * @param returnRawResult
     * @param csvTableSet
     * @param fileData
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "RunAnalyticsReport", action = "RunAnalyticsReport")
    @RequestWrapper(localName = "RunAnalyticsReport", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.RunAnalyticsReportMsg")
    @ResponseWrapper(localName = "RunAnalyticsReportResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.RunAnalyticsReportResponseMsg")
    public void runAnalyticsReport(@WebParam(name = "AnalyticsReport",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   AnalyticsReport analyticsReport,
                                   @WebParam(name = "Limit", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   Integer limit,
                                   @WebParam(name = "Start", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   Integer start,
                                   @WebParam(name = "Delimiter", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   String delimiter,
                                   @WebParam(name = "ReturnRawResult",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   Boolean returnRawResult,
                                   @WebParam(name = "DisableMTOM",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2") Boolean disableMTOM,
                                   @WebParam(name = "CSVTableSet",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                                             mode = WebParam.Mode.OUT) Holder<CSVTableSet> csvTableSet,
                                   @WebParam(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                                             mode = WebParam.Mode.OUT)
                                   Holder<byte[]> fileData) throws RequestErrorFault, ServerErrorFault,
                                                                   UnexpectedErrorFault;

    /**
     *
     * @param campaignID
     * @param contactID
     * @param entryPoint
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "ExecuteMarketingFlow", action = "ExecuteMarketingFlow")
    @RequestWrapper(localName = "ExecuteMarketingFlow", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.ExecuteMarketingFlowMsg")
    @ResponseWrapper(localName = "ExecuteMarketingFlowResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.ExecuteMarketingFlowResponseMsg")
    public void executeMarketingFlow(@WebParam(name = "ContactID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID contactID,
                                     @WebParam(name = "CampaignID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID campaignID,
                                     @WebParam(name = "EntryPoint",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                     String entryPoint) throws RequestErrorFault, ServerErrorFault,
                                                               UnexpectedErrorFault;

    /**
     *
     * @param fileID
     * @param disableMTOM
     * @param rnObject
     * @return
     * returns byte[]
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetFileData", action = "GetFileData")
    @WebResult(name = "FileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetFileData", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetFileDataMsg")
    @ResponseWrapper(localName = "GetFileDataResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetFileDataResponseMsg")
    public byte[] getFileData(@WebParam(name = "RNObject", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                              RNObject rnObject,
                              @WebParam(name = "FileID", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                              ID fileID,
                              @WebParam(name = "DisableMTOM", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                              Boolean disableMTOM) throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault;

    /**
     *
     * @param contactID
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "ResetContactPassword", action = "ResetContactPassword")
    @RequestWrapper(localName = "ResetContactPassword", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.ResetContactPasswordMsg")
    @ResponseWrapper(localName = "ResetContactPasswordResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.ResetContactPasswordResponseMsg")
    public void resetContactPassword(@WebParam(name = "ContactID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                     ID contactID) throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault;

    /**
     *
     * @param chatID
     * @param mailingID
     * @param opportunityID
     * @param contactID
     * @param scheduledTime
     * @param incidentID
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "SendMailingToContact", action = "SendMailingToContact")
    @RequestWrapper(localName = "SendMailingToContact", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.SendMailingToContactMsg")
    @ResponseWrapper(localName = "SendMailingToContactResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.SendMailingToContactResponseMsg")
    public void sendMailingToContact(@WebParam(name = "ContactID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID contactID,
                                     @WebParam(name = "MailingID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID mailingID,
                                     @WebParam(name = "ScheduledTime",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                     XMLGregorianCalendar scheduledTime,
                                     @WebParam(name = "IncidentID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID incidentID,
                                     @WebParam(name = "OpportunityID",
                                               targetNamespace = "urn:messages.ws.rightnow.com/v1_2") ID opportunityID,
                                     @WebParam(name = "ChatID", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                     ID chatID) throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault;

    /**
     *
     * @param sourceRNObjects
     * @param destinationRNObject
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "TransferSubObjects", action = "TransferSubObjects")
    @RequestWrapper(localName = "TransferSubObjects", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.TransferSubObjectsMsg")
    @ResponseWrapper(localName = "TransferSubObjectsResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.TransferSubObjectsResponseMsg")
    public void transferSubObjects(@WebParam(name = "DestinationRNObject",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   RNObject destinationRNObject,
                                   @WebParam(name = "SourceRNObjects",
                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                   List<RNObject> sourceRNObjects) throws RequestErrorFault, ServerErrorFault,
                                                                          UnexpectedErrorFault;

    /**
     *
     * @param batchRequestItem
     * @return
     * returns java.util.List<com.rightnow.ws.messages.v1_2.BatchResponseItem>
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "Batch", action = "Batch")
    @WebResult(name = "BatchResponseItem", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "Batch", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.BatchMsg")
    @ResponseWrapper(localName = "BatchResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.BatchResponseMsg")
    public List<BatchResponseItem> batch(@WebParam(name = "BatchRequestItem",
                                                   targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                         List<BatchRequestItem> batchRequestItem) throws RequestErrorFault,
                                                                                         ServerErrorFault,
                                                                                         UnexpectedErrorFault;

    /**
     *
     * @param rnObjects
     * @return
     * returns com.rightnow.ws.messages.v1_2.RNObjectsResult
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "ConvertGenericToObject", action = "ConvertGenericToObject")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "ConvertGenericToObject", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.ConvertObjectMsg")
    @ResponseWrapper(localName = "ConvertGenericToObjectResponse",
                     targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.ConvertObjectResponseMsg")
    public RNObjectsResult convertGenericToObject(@WebParam(name = "RNObjects",
                                                            targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                                  List<RNObject> rnObjects) throws RequestErrorFault, ServerErrorFault,
                                                                                   UnexpectedErrorFault;

    /**
     *
     * @param rnObjects
     * @return
     * returns com.rightnow.ws.messages.v1_2.RNObjectsResult
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "ConvertObjectToGeneric", action = "ConvertObjectToGeneric")
    @WebResult(name = "RNObjectsResult", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "ConvertObjectToGeneric", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.ConvertObjectMsg")
    @ResponseWrapper(localName = "ConvertObjectToGenericResponse",
                     targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.ConvertObjectResponseMsg")
    public RNObjectsResult convertObjectToGeneric(@WebParam(name = "RNObjects",
                                                            targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                                  List<RNObject> rnObjects) throws RequestErrorFault, ServerErrorFault,
                                                                                   UnexpectedErrorFault;

    /**
     *
     * @return
     * returns java.util.List<com.rightnow.ws.metadata.v1_2.MetaDataClass>
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetMetaData", action = "GetMetaData")
    @WebResult(name = "MetaDataClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetMetaData", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetMetaDataMsg")
    @ResponseWrapper(localName = "GetMetaDataResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetMetaDataResponseMsg")
    public List<MetaDataClass> getMetaData() throws RequestErrorFault, ServerErrorFault, UnexpectedErrorFault;

    /**
     *
     * @param metaDataLink
     * @param className
     * @param qualifiedClassName
     * @return
     * returns java.util.List<com.rightnow.ws.metadata.v1_2.MetaDataClass>
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetMetaDataForClass", action = "GetMetaDataForClass")
    @WebResult(name = "MetaDataClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetMetaDataForClass", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetMetaDataForClassMsg")
    @ResponseWrapper(localName = "GetMetaDataForClassResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetMetaDataForClassResponseMsg")
    public List<MetaDataClass> getMetaDataForClass(@WebParam(name = "ClassName",
                                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                                   List<String> className,
                                                   @WebParam(name = "QualifiedClassName",
                                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                                   List<RNObjectType> qualifiedClassName,
                                                   @WebParam(name = "MetaDataLink",
                                                             targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                                   List<String> metaDataLink) throws RequestErrorFault,
                                                                                     ServerErrorFault,
                                                                                     UnexpectedErrorFault;

    /**
     *
     * @return
     * returns javax.xml.datatype.XMLGregorianCalendar
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetMetaDataLastChangeTime", action = "GetMetaDataLastChangeTime")
    @WebResult(name = "LastChangeDateTime", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetMetaDataLastChangeTime", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetMetaDataLastChangeTimeMsg")
    @ResponseWrapper(localName = "GetMetaDataLastChangeTimeResponse",
                     targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetMetaDataLastChangeTimeResponseMsg")
    public XMLGregorianCalendar getMetaDataLastChangeTime() throws RequestErrorFault, ServerErrorFault,
                                                                   UnexpectedErrorFault;

    /**
     *
     * @param packageName
     * @param fieldName
     * @return
     * returns java.util.List<com.rightnow.ws.base.v1_2.NamedID>
     * @throws UnexpectedErrorFault
     * @throws RequestErrorFault
     * @throws ServerErrorFault
     */
    @WebMethod(operationName = "GetValuesForNamedID", action = "GetValuesForNamedID")
    @WebResult(name = "Entry", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetValuesForNamedID", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetValuesForNamedIDMsg")
    @ResponseWrapper(localName = "GetValuesForNamedIDResponse", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetValuesForNamedIDResponseMsg")
    public List<NamedID> getValuesForNamedID(@WebParam(name = "PackageName",
                                                       targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                             String packageName,
                                             @WebParam(name = "FieldName",
                                                       targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
                                             String fieldName) throws RequestErrorFault, ServerErrorFault,
                                                                      UnexpectedErrorFault;

    /**
     *
     * @param fieldName
     * @return
     * returns java.util.List<com.rightnow.ws.base.v1_2.NamedIDWithParent>
     * @throws UnexpectedErrorFault
     * @throws ServerErrorFault
     * @throws RequestErrorFault
     */
    @WebMethod(operationName = "GetValuesForNamedIDHierarchy", action = "GetValuesForNamedIDHierarchy")
    @WebResult(name = "Entry", targetNamespace = "urn:messages.ws.rightnow.com/v1_2")
    @RequestWrapper(localName = "GetValuesForNamedIDHierarchy", targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                    className = "com.rightnow.ws.messages.v1_2.GetValuesForNamedIDHierarchyMsg")
    @ResponseWrapper(localName = "GetValuesForNamedIDHierarchyResponse",
                     targetNamespace = "urn:messages.ws.rightnow.com/v1_2",
                     className = "com.rightnow.ws.messages.v1_2.GetValuesForNamedIDHierarchyResponseMsg")
    public List<NamedIDWithParent> getValuesForNamedIDHierarchy(@WebParam(name = "FieldName",
                                                                          targetNamespace =
                                                                          "urn:messages.ws.rightnow.com/v1_2")
                                                                String fieldName) throws RequestErrorFault,
                                                                                         ServerErrorFault,
                                                                                         UnexpectedErrorFault;

}
