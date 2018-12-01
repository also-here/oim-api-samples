package com.java;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.python.parser.ast.Str;

//import com.octetstring.vde.Connection;



import oracle.iam.notification.api.NotificationService;
import oracle.iam.notification.exception.EventException;
import oracle.iam.notification.exception.MultipleTemplateException;
import oracle.iam.notification.exception.NotificationException;
import oracle.iam.notification.exception.NotificationResolverNotFoundException;
import oracle.iam.notification.exception.TemplateNotFoundException;
import oracle.iam.notification.exception.UnresolvedNotificationDataException;
import oracle.iam.notification.exception.UserDetailsNotFoundException;
import oracle.iam.notification.vo.NotificationEvent;
import oracle.iam.platform.OIMClient;
import oracle.iam.platform.Platform;
import oracle.iam.scheduler.vo.TaskSupport;

public class pwdWarnNotify extends TaskSupport{

	private String strClassName = getClass().getName();
	@Override
	public void execute(HashMap scheduleParam) throws Exception {
		// TODO Auto-generated method stub
		String interval =(String)scheduleParam.get("Interval");
		String emailTemplate = (String)scheduleParam.get("Email Template");
		String dataSource = (String)scheduleParam.get("Data Source");
		
		String[] intervalArr = interval.split(",");
		StringBuilder sqlQuery = getUsersQuery(intervalArr);
		
		ArrayList<HashMap<String, String>> users = getUsers(dataSource, sqlQuery);
		sendEmail(emailTemplate,users);
		
	}

	private void sendEmail(String emailTemplate,
			ArrayList<HashMap<String, String>> users) {
		// TODO Auto-generated method stub
		
		System.out.println("Entering to"+this.strClassName+":"+new java.lang.Exception().getStackTrace()[0].getMethodName());
		
		NotificationService notService = (NotificationService) Platform.getService(NotificationService.class);
		NotificationEvent event = new NotificationEvent();
		
		String[] receiverUserIds = new String[1];
		event.setTemplateName(emailTemplate);
		
		event.setSender("XELSYSADM");
		HashMap<String, Object> templagteParams = new HashMap();
		
		for(HashMap<String, String> user : users){
			templagteParams.put("Interval", ((String)user.get("DAYS_LEFT")).toString());
			templagteParams.put("firstName", ((String)user.get("USR_FIRST_NAME")).toString());
			templagteParams.put("lastName", ((String)user.get("USR_LAST_NAME")).toString());
			templagteParams.put("userLogin", ((String)user.get("USR_LOGIN")).toString());
			
			event.setParams(templagteParams);
			receiverUserIds[0] = ((String)user.get("USR_LOGIN")).toString();
			event.setUserIds(receiverUserIds);
			
			try {
				notService.notify(event);
			} catch (UserDetailsNotFoundException | EventException
					| UnresolvedNotificationDataException
					| TemplateNotFoundException | MultipleTemplateException
					| NotificationResolverNotFoundException
					| NotificationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("emailSend method ends");
			
		}
		
	}

	private ArrayList<HashMap<String, String>> getUsers(String dataSource,
			StringBuilder sqlQuery) throws SQLException,NamingException {
		System.out.println("Entering to"+this.strClassName+":"+new java.lang.Exception().getStackTrace()[0].getMethodName());
		
		ArrayList<HashMap<String, String>> users = new ArrayList<>();
		
		HashMap<String, String> userDetails = null;
		
		Connection oimConnection = openDBConnection(dataSource);
		PreparedStatement prepreStmt = oimConnection.prepareStatement(sqlQuery.toString());
		
		ResultSet rs = prepreStmt.executeQuery();
		while(rs.next()){
			userDetails = new HashMap();
			userDetails.put("USR_LOGIN", rs.getString("USR_LOGIN"));
			userDetails.put("DAYS_LEFT", rs.getString("DAYS_LEFT"));
			userDetails.put("USR_FIRST_NAME", rs.getString("USR_FIRST_NAME"));
			userDetails.put("USR_LAST_NAME", rs.getString("USR_LAST_NAME"));
			
			users.add(userDetails);
			
		}
		closeDBConnection(oimConnection,prepreStmt,rs);
		
		
		return users;
	}

	

	private void closeDBConnection(Connection connection,
			PreparedStatement prepareStmt, ResultSet resultSet) {
		// TODO Auto-generated method stub
		try{
			if((resultSet != null)&& (!resultSet.isClosed())){
				resultSet.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			if((prepareStmt !=null)&&(!prepareStmt.isClosed())){
				prepareStmt.close();
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try{
			if((connection !=null)&&(!connection.isClosed())){
				connection.close();
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private Connection openDBConnection(String dataSourceName) 
	throws SQLException,NamingException{
		// TODO Auto-generated method stub
		Connection connection = null;
		try{
			
		
		Context ctx = new InitialContext();
		//
		DataSource dataSource =  (DataSource) ctx.lookup(dataSourceName);
		connection = dataSource.getConnection();
		}catch(NamingException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return connection;
	}

	private StringBuilder getUsersQuery(String[] intervalArr) {
		// TODO Auto-generated method stub
		System.out.println("Entering to"+this.strClassName+":"+new java.lang.Exception().getStackTrace()[0].getMethodName());

		StringBuilder sqlQuery = new StringBuilder("SELECT USR_LOGIN, TRUNC(USR_PWD_EXPIRE_DATE)-TRUNC(SYSDBA) AS DAYS_LEFT, USR_FIRST_NAME, USR_LAST_NAME"
				+ "FROM USR WHERE USR_STATUS='Active' AND TRUNC(USR_PWD_EXPIRE_DATE) IN(");
		
		int count=1;
		int numOfNotifications = intervalArr.length;
		
		String[] arrayOfString;
		int j = (arrayOfString = intervalArr).length;
		for(int i=0;i<j;i++){
			String singleInterval = arrayOfString[1];
			if(count == numOfNotifications){
				sqlQuery.append("TRUNC(SYSDATE+").append(singleInterval).append("))");
			}else{
				sqlQuery.append("TRUNC(SYSDATE+").append(singleInterval).append("),");
			}
			count++;
			
			
		}
		return sqlQuery;
		
	}

	@Override
	public HashMap getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttributes() {
		// TODO Auto-generated method stub
		
	}

}
