package postprocesshandler;

import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import oracle.iam.identity.usermgmt.api.UserManagerConstants.AttributeName;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.platform.Platform;
import oracle.iam.platform.context.ContextAware;
import oracle.iam.platform.entitymgr.EntityManager;
import oracle.iam.platform.kernel.spi.PostProcessHandler;
import oracle.iam.platform.kernel.vo.AbstractGenericOrchestration;
import oracle.iam.platform.kernel.vo.BulkEventResult;
import oracle.iam.platform.kernel.vo.BulkOrchestration;
import oracle.iam.platform.kernel.vo.EventResult;
import oracle.iam.platform.kernel.vo.Orchestration;

import com.thortech.util.logging.Logger;

import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.identity.usermgmt.vo.User;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.entitymgr.vo.SearchCriteria;

public class PostProcessEmailGenEH implements PostProcessHandler {
   private Logger logger = Logger.getLogger("EmailHandlerLogger");
    public PostProcessEmailGenEH() {
        super();
    }

    public EventResult execute(long processId, long eventId, Orchestration orchestration) {
        logger.info("Start PostProcessEmailGenEH execute method");

        try{
            HashMap<String, Serializable> newParameters = orchestration.getParameters();
    //      HashMap<String, Serializable> interParameters = orchestration.getInterEventData();
            
            logger.info(String.format("New Parameters: %s ", newParameters));
            
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            //eventLogger.entering(methodName, "params:["+processId+","+eventId+"]");
            //EntityManager mgr=Platform.getService(EntityManager.class);
          
            String eMail=getParamaterValue(newParameters, UserManagerConstants.AttributeName.EMAIL.getId());
            
            if(eMail==null||eMail.isEmpty()){
                String firstName=getParamaterValue(newParameters, UserManagerConstants.AttributeName.FIRSTNAME.getId());
                String lastName=getParamaterValue(newParameters, UserManagerConstants.AttributeName.LASTNAME.getId());
                String generatedEmail=generateEmail(firstName,lastName);
                
                String setEmailID=searchEmailID(generatedEmail,lastName,firstName);
                
                HashMap modifyMap=new HashMap();
                modifyMap.put(UserManagerConstants.AttributeName.EMAIL.getId(),setEmailID);
                
            }
        }catch (Exception e){
                     logger.log(Level.SEVERE," Error In generating Email",e);
                 }
                                                                           
        return null;
    }

    private String generateEmail(String firstName, String lastName) {
           return firstName+"."+lastName+"@deliverycentric.com";
       }
    

    private String searchEmailID(String generatedEmail, String lastName,
                                 String firstName) {
       
        Hashtable env = new Hashtable();        
        OIMClient oimClient = new OIMClient(env);
        UserManager usrMgr = oimClient.getService(UserManager.class);
        boolean uniqueid = false;  
                int count=0;
                do { 
                    if (count > 0){
                        String nLastName=(lastName+count).toString();
                        generatedEmail=generateEmail(firstName,nLastName);
                    }                
        
                SearchCriteria criteria = new SearchCriteria(AttributeName.EMAIL.getId(), generatedEmail, SearchCriteria.Operator.EQUAL);
                Set resltSet = new HashSet();
                resltSet.add(AttributeName.EMAIL.getId());
                
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
            
            return generatedEmail;
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

    private String getParamaterValue(HashMap<String, Serializable> parameters, String key) {
      String value = (parameters.get(key) instanceof ContextAware)
      ? (String) ((ContextAware) parameters.get(key)).getObjectValue()
      : (String) parameters.get(key);
      return value;
    }
}

