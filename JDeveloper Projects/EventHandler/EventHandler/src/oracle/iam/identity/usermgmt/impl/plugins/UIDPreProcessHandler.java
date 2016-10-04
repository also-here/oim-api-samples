package oracle.iam.identity.usermgmt.impl.plugins;
import java.io.Serializable;

import java.util.HashMap;

import oracle.core.ojdl.logging.ODLLogger;

import oracle.iam.platform.context.ContextAware;
import oracle.iam.platform.kernel.spi.PreProcessHandler;
import oracle.iam.platform.kernel.vo.AbstractGenericOrchestration;
import oracle.iam.platform.kernel.vo.BulkEventResult;
import oracle.iam.platform.kernel.vo.BulkOrchestration;
import oracle.iam.platform.kernel.vo.EventResult;
import oracle.iam.platform.kernel.vo.Orchestration;
import oracle.core.ojdl.logging.ODLLogger;

public class UIDPreProcessHandler implements PreProcessHandler {
    private ODLLogger logger = ODLLogger.getODLLogger("LogUID");
    
    public EventResult execute(long processId, long eventId,Orchestration orchestration) {
        logger.info("inside of execute method");
        HashMap<String, Serializable> parameters =orchestration.getParameters();
        
        String firstName = getParameterValue(parameters, "First Name");
        logger.info("First Name: "+firstName);
        String lastName = getParameterValue(parameters, "Last Name");
        logger.info("Last name :"+lastName);
        String userLogin = getParameterValue(parameters, "User Login");
        logger.info("User Login: "+userLogin);
        if (isNullOrEmpty(userLogin)) {
        userLogin = (firstName.substring(0, 1)+lastName).toString();
        orchestration.addParameter("User Login", userLogin);
        }
        return new EventResult();
    }
    
    public BulkEventResult execute(long l, long l1,
    BulkOrchestration bulkOrchestration) {
    throw new RuntimeException("Bulk Orchestration not yet implmented");
    }
    
    public void compensate(long l, long l1,
    AbstractGenericOrchestration abstractGenericOrchestration) {
    }
    
    public boolean cancel(long l, long l1,
    AbstractGenericOrchestration abstractGenericOrchestration) {
    return false;
    }
    
    public void initialize(HashMap<String, String> hashMap) {
    }
    
    private String getParameterValue(HashMap<String, Serializable> parameters,
    String key) {
    String value =
    (parameters.get(key) instanceof ContextAware) ? (String)((ContextAware)parameters.get(key)).getObjectValue() :
    (String)parameters.get(key);
    return value;
    }
    
    private boolean isNullOrEmpty(String str) {
    return str == null || str.isEmpty();
    }
}