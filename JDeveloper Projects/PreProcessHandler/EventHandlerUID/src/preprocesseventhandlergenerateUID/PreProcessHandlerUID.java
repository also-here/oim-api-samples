package preprocesseventhandlergenerateUID;

import java.util.HashMap;
import oracle.iam.platform.context.ContextAware;
import oracle.iam.platform.kernel.spi.PreProcessHandler;
import oracle.iam.platform.kernel.vo.AbstractGenericOrchestration;
import oracle.iam.platform.kernel.vo.BulkEventResult;
import oracle.iam.platform.kernel.vo.BulkOrchestration;
import oracle.iam.platform.kernel.vo.EventResult;
import oracle.iam.platform.kernel.vo.Orchestration;

import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;

import oracle.core.ojdl.logging.ODLLogger;
import java.util.logging.Logger;

public class PreProcessHandlerUID implements PreProcessHandler  {
    public static final Logger logger = ODLLogger.get
    public PreProcessHandlerUID() {
        super();       
    }

    public EventResult execute(long processId, long eventId, Orchestration orchestration) {
        
        HashMap<String, Serializable> parameters = orchestration.getParameters();
        Set<String> keyset=parameters.keySet();
        Iterator<String> itr=keyset.iterator();
        while(itr.hasNext()){
            String attrName=itr.next();
            }
        String uID = getParameterValue(parameters, UserManagerConstants.AttributeName.USER_LOGIN.getId());
    
        if (uID==null||uID.isEmpty()) {
                String firstName = getParameterValue(parameters, UserManagerConstants.AttributeName.FIRSTNAME.getId());
                String lastName = getParameterValue(parameters, UserManagerConstants.AttributeName.LASTNAME.getId());
                String generatedUID = generateUID(firstName,lastName);
                String setUID = searchUID(generatedUID);
                
                orchestration.addParameter(UserManagerConstants.AttributeName.USER_LOGIN.getId(), setUID);
            }
        return new EventResult();
    }
    
    
    private String getParameterValue(HashMap<String, Serializable> parameters,
            String key) {
            String value = (parameters.get(key) instanceof ContextAware)
            ? (String) ((ContextAware) parameters.get(key)).getObjectValue()
            : (String) parameters.get(key);
            return value;
            }


    private String generateUID(String firstName, String lastName) {
        firstName = firstName.substring(0, 1);
        return firstName+lastName;
    }
    
// -------------------method to search UserID and generate unique one --------------------
    private String searchUID(String generatedUID) {

        Hashtable env = new Hashtable();        
            OIMClient oimClient = new OIMClient(env);
            UserManager usrMgr = oimClient.getService(UserManager.class);
            boolean uniqueid = false;  
            int count=0;
            do { 
                if (count> 0){
                    generatedUID=generatedUID+count;
                }                
                             
            SearchCriteria criteria = new SearchCriteria("User Login", generatedUID, SearchCriteria.Operator.EQUAL);
            Set resltSet = new HashSet();
            resltSet.add(AttributeName.USER_LOGIN.getId());
            
            try {
                    List<User> users = usrMgr.search(criteria, resltSet, null);
                if (users.isEmpty()){
                    uniqueid = true;
                } else {
                    uniqueid= false;
                    count++;
                }
                                    
                } catch (UserSearchException e) {
            } 
        }while(!(uniqueid=true));
        return generatedUID;
    }
    
    public BulkEventResult execute(long l, long l1,
                                   BulkOrchestration bulkOrchestration) {
        return null;
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

}

