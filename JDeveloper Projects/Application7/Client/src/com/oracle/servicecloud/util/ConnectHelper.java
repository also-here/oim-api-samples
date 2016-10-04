package com.oracle.servicecloud.util;

import com.rightnow.ws.base.v1_2.ChainDestinationID;
import com.rightnow.ws.base.v1_2.ChainSourceID;
import com.rightnow.ws.base.v1_2.ID;
import com.rightnow.ws.base.v1_2.NamedID;
import com.rightnow.ws.base.v1_2.RNObject;
import com.rightnow.ws.generic.v1_2.DataTypeEnum;
import com.rightnow.ws.generic.v1_2.DataValue;
import com.rightnow.ws.generic.v1_2.GenericField;
import com.rightnow.ws.generic.v1_2.GenericObject;
import com.rightnow.ws.generic.v1_2.RNObjectType;
import com.rightnow.ws.messages.v1_2.BatchRequestItem;
import com.rightnow.ws.messages.v1_2.CreateMsg;
import com.rightnow.ws.messages.v1_2.CreateProcessingOptions;
import com.rightnow.ws.messages.v1_2.GetMsg;
import com.rightnow.ws.messages.v1_2.GetProcessingOptions;

import java.util.List;

public class ConnectHelper {
    public ConnectHelper() {
        super();
    }
    
    /**
     * helper method
     * @param Name
     * @param itemsChoiceType
     * @param Value
     * @return
     */
    public static GenericField createGenericField(String name, DataValue value,DataTypeEnum type)
    {
        GenericField gf = new GenericField();
        gf.setName(name);
        DataValue dataValue = new DataValue();
        gf.setDataType(type);
        gf.setDataValue(value);                 
        return gf;
    }
    
    /**
     * another helper
     * @param val
     * @return
     */
    public static DataValue createStringDataValue(String val)
    {
            DataValue dv = new DataValue();
            dv.setStringValue(val);
            return dv;
    }
    
    /**
     * another helper
     * @param val
     * @return
     */
    public static DataValue createIntegerDataValue(int val)
    {
            DataValue dv = new DataValue();
            dv.setIntegerValue(new Integer(val));
            return dv;
    }
    
    /**
     * another helper
     * @param val
     * @return
     */
    public static DataValue createNamedIDDataValue(long cNumber)
    {
            DataValue dv = new DataValue();                    
            NamedID cID = new NamedID();
            ID id = new ID();
            id.setId(cNumber);
            cID.setID(id);                
            dv.setNamedIDValue(cID);                    
            return dv;
    }
    
    /**
     * another helper
     * @param val
     * @return
     */
    public static DataValue createNamedIDDataValue(String name)
    {
            DataValue dv = new DataValue();                    
            NamedID cID = new NamedID();
            cID.setName(name);
            dv.setNamedIDValue(cID);                    
            return dv;
    }
    
    public static DataValue createNamedIDDataValue(ChainSourceID sID)
    {
            DataValue dv = new DataValue();                    
            NamedID cID = new NamedID();
            cID.setID(sID);
            dv.setNamedIDValue(cID);                    
            return dv;
    }
    
    public static DataValue createNamedIDDataValue(ChainDestinationID dID)
    {
            DataValue dv = new DataValue();                    
            NamedID cID = new NamedID();
            cID.setID(dID);
            dv.setNamedIDValue(cID);                    
            return dv;
    }
    
    
    public static DataValue createObjectDataValue(String typeName, List<GenericField> genericFields)
            {
                    DataValue dv = new DataValue();
            
                    dv.setObjectValue(createGenericObject(typeName, genericFields));
                    
                    return dv;
            }
            
    public static GenericObject createGenericObject(String typeName, List<GenericField> genericFields)
            {
                    GenericObject genericObject = new GenericObject();
                    genericObject.setObjectType(createRNObjectType(typeName));
                    genericObject.getGenericFields().addAll(genericFields);
                    
                    return genericObject;
            }
    
    public static RNObjectType createRNObjectType(String typeName)
            {
                    RNObjectType objType = new RNObjectType();      
                    objType.setTypeName(typeName);
                    return objType;
            }
    
    public static DataValue createObjectListDataValue(String typeName, List<GenericObject> genericObjects)
    {
            DataValue dv = new DataValue();
    
            //dv.setObjectValue(createGenericObject(typeName, genericFields));
            dv.getObjectValueList().addAll(genericObjects);
            
            
            return dv;
    }

    /**
     * Marks a particular RNObject's ID as Source ID for ID chaining purposes.
     * @param obj
     * @param variableName
     */
    public static void addSourceChainID(RNObject obj, String variableName){
        ChainSourceID source  = new ChainSourceID();
        source.setVariableName(variableName);
        obj.setID(source);
    }
    
    /**
     * Adds a Generic ID Field under given Generic Object as a Destination ID field for ID chaining purposes
     * @param obj
     * @param fieldName
     * @param variableName
     */
    public static void addDestinationChainID_Generic(GenericObject obj, String fieldName, String variableName){
        
        ChainDestinationID destinationID  = new ChainDestinationID();
        destinationID.setVariableName(variableName);
        
        GenericField gfID = new GenericField();
        gfID.setName(fieldName);
        gfID.setDataType(DataTypeEnum.ID);
        gfID.setDataValue(ConnectHelper.createNamedIDDataValue(destinationID));
        
        obj.getGenericFields().add(gfID);
    }
    
    public static BatchRequestItem populateBatchRequestItem_Create(List<RNObject> objectList)
    {
            BatchRequestItem createItem = new BatchRequestItem();            
             
            CreateMsg createMsg = new CreateMsg();
            
            CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
            createProcessingOptions.setSuppressExternalEvents(false);
            createProcessingOptions.setSuppressRules(false);
            createMsg.setProcessingOptions(createProcessingOptions);
             
            createMsg.getRNObjects().addAll(objectList);
            createMsg.setProcessingOptions(createProcessingOptions);
             
            createItem.setCreateMsg(createMsg); 
            return createItem;
    }
    
    public static BatchRequestItem populateBatchRequestItem_Get(List<RNObject> objectList)
    {
            BatchRequestItem getItem = new BatchRequestItem();            
             
            GetMsg getMsg = new GetMsg();
            
            GetProcessingOptions getProcessingOptions = new GetProcessingOptions();
            getProcessingOptions.setFetchAllNames(false);            
            
            getMsg.setProcessingOptions(getProcessingOptions);
             
            getMsg.getRNObjects().addAll(objectList);
            getMsg.setProcessingOptions(getProcessingOptions);
             
            return getItem;
    }
    
}
