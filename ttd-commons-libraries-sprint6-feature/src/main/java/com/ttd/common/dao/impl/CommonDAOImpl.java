package com.ttd.common.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttd.common.dao.CommonDAO;
import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.Country;
import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.DonorSelfService;
import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.LanguageWatcher;
import com.ttd.common.entity.MobileAppData;
import com.ttd.common.entity.PgMaster;
import com.ttd.common.entity.ServiceNote;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.SessionInfo;
import com.ttd.common.entity.State;
import com.ttd.common.entity.TempUserPwd;
import com.ttd.common.entity.User;
import com.ttd.common.entity.UserPersonalDetail;
import com.ttd.common.entity.UsersFriendsAndFamily;
import com.ttd.common.entity.WatchList;
import com.ttd.common.model.Banks;
import com.ttd.common.model.CountriesSort;
import com.ttd.common.model.EmailNotificationDetails;
import com.ttd.common.model.GlobalProperties;
import com.ttd.common.model.GlobalPropertiesResponse;
import com.ttd.common.model.MasterList;
import com.ttd.common.model.MobileAppInfo;
import com.ttd.common.model.PGDetails;
import com.ttd.common.model.ResetPasswordInfo;
import com.ttd.common.model.ServiceNoteDetail;
import com.ttd.common.model.Status;
import com.ttd.common.model.UserHistory;
import com.ttd.common.util.CommonUtility;
import com.ttd.edarshan.dip.entity.SedDipSchedule;
import com.ttd.edonation.entity.DonationOffering;
import com.ttd.edonation.entity.TrustMaster;
import com.ttd.ehundi.entity.HundiOffering;
import com.ttd.eseva.dip.entity.SevaDipSchedule;
import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.RulesMaster;
import com.ttd.eseva.entity.SevaMaster;
import com.ttd.km.entity.KMBooking;

@Repository
public class CommonDAOImpl implements CommonDAO {

	Logger logger = Logger.getLogger(CommonDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	// Method that connects the db and retrieves the data using hibernate
	@SuppressWarnings("unchecked")
	public List<PgMaster> getBankDetails() {
		logger.info("Start of getBankDetails ()  in CommonDAOImpl");
		List<PgMaster> list = null;

		Session session = this.sessionFactory.getCurrentSession();

		logger.info("Executing the Query");
		Query queryResult = session.createQuery("from PgMaster where rowStatus = 0");
		logger.info("Converting into a list formate");
		list = queryResult.list();
	
		logger.info("End of getBankDetails () in CommonDAOImpl" + list);
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<PgMaster> getHundiBankDetails() {
		logger.info("Start of getHundiBankDetails ()  in CommonDAOImpl");
		List<PgMaster> list = null;

		Session session = this.sessionFactory.getCurrentSession();

		logger.info("Executing the Query");
		Query queryResult = session.createQuery("from PgMaster");
		logger.info("Converting into a list formate");
		list = queryResult.list();
	
		logger.info("End of getHundiBankDetails () in CommonDAOImpl" + list);
		return list;
	}



	public List<CurrencyMaster> getCurrencyDetails() {
		logger.info("Start of getCurrencyDetails ()  in CommonDAOImpl");
		List<CurrencyMaster> list = null;
		Session session = this.sessionFactory.getCurrentSession();

		logger.info("before query implementation");
		Query queryResult = session.createQuery("from CurrencyMaster");
		logger.info("converting query into list");
		list = queryResult.list();
		logger.info("End of getCurrencyDetails () in CommonDAOImpl" + list);
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Country> listCountries() {
		logger.info("Start of listCountries ()  in CommonDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		List<Country> countryList = session.createQuery("from Country").list();
		Collections.sort(countryList, new CountriesSort());
		logger.info("End of listCountries () in CommonDAOImpl" + countryList);
		return countryList;

	}
	@SuppressWarnings("unchecked")
	public List<String> getRelationshipList(String groupType)
	{
		logger.info("Start of getRelationshipList ()  in CommonDAOImpl");
		
		Session session = this.sessionFactory.getCurrentSession();
		//String groupType = "RelationShip";
		logger.info("before query implementation");
		List<String> list = new ArrayList<String>();
		
		Query queryResult = session.createQuery("select master.valueName from CommonValueMaster master where master.commonValueGroup.valueGroupId IN(SELECT valueGroupId FROM CommonValueGroup group1 "+
		" WHERE group1.valueGroupName = :GROUP_NAME) AND master.rowStatus = 0 ORDER BY master.valueId ASC");
		queryResult.setString("GROUP_NAME", groupType); 
		
		logger.info("converting query into list");
		
		list =  queryResult.list();
		logger.info("End of getUserDetail () in CommonDAOImpl" + list);
		return list;
	}
	
	
	@SuppressWarnings("unchecked")
	public Map<String,String> getCommomValue(String groupType)
	{
		logger.info("Start of getRelationshipList ()  in CommonDAOImpl");
		
		Session session = this.sessionFactory.getCurrentSession();
		//String groupType = "RelationShip";
		logger.info("before query implementation");
		Map<String,String> map = new HashMap<String,String>();
		List<Object[]> commonValueList = null;
		
		Query queryResult = session.createQuery("select master.valueId,master.valueName from CommonValueMaster master where master.commonValueGroup.valueGroupId IN(SELECT valueGroupId FROM CommonValueGroup group1 "+
		" WHERE group1.valueGroupName = :GROUP_NAME) AND master.rowStatus = 0 ORDER BY master.valueId ASC");
		queryResult.setString("GROUP_NAME", groupType); 
		
		logger.info("converting query into list");
		
		commonValueList =  queryResult.list();
		
		for (Object[] obj : commonValueList) {
			map.put(obj[0].toString(), (String)obj[1]);
		}
		
		logger.info("End of getUserDetail () in CommonDAOImpl" + map);
		return map;
	}
	
	public User getUser(long userId){
		logger.info("Start of getUser ()  in CommonDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User)session.load(User.class, userId);
		logger.info("End of getUser () in CommonDAOImpl" + user);
		return user;
	}

	public UserPersonalDetail getUserDetail(long user)
	{
		logger.info("Start of getUserDetail ()  in CommonDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		UserPersonalDetail userPersonalDetail = (UserPersonalDetail)session.load(UserPersonalDetail.class, user);
		logger.info("End of getUserDetail () in CommonDAOImpl" + userPersonalDetail);
		return userPersonalDetail;
	}
	
	@SuppressWarnings("unchecked")
	public List<UserHistory> getUserHistory(Long id){
		
		logger.info("Start of getUserHistory ()  in CommonDAOImpl");
		
		 List<UserHistory> userHistoryList= new ArrayList<UserHistory>();
		 List<Object[] > hundiOfferingList=null;
		 
		 Session session = this.sessionFactory.getCurrentSession();

		 logger.info("before query implementation");

		 Query queryResult = session.createQuery("select hundi.paymentStatus,hundi.offeringId,hundi.createdTime,hundi.offeringAmount,hundi.paymentReceipt,hundi.hundiType from HundiOffering hundi where hundi.user.userId = :USERID ORDER BY hundi.createdTime DESC");
			queryResult.setLong("USERID", id); 
			
			logger.info("converting query into list");
			
			hundiOfferingList = queryResult.list();
		
			for (Object[] obj : hundiOfferingList) {
			
				if (! "Pending".equalsIgnoreCase((String) obj[0]) && ! "Initiated".equalsIgnoreCase((String) obj[0])){
					UserHistory userHistory = new UserHistory();
					userHistory.setRemarks(((String)obj[0]));
					userHistory.setReferenceNo(((String)obj[1]));
					userHistory.setOfferingDate(CommonUtility.formatDateNew((Date)obj[2]));
					userHistory.setAmount((BigDecimal)obj[3]);
					userHistory.setPaymentReceipt((String)obj[4]);
					if(obj[5]!=null)
					userHistory.setHundiType((String)obj[5]);
					else 
						userHistory.setHundiType("SRIVARI");
					userHistoryList.add(userHistory); 
				}
			
			}
			logger.info("End of getUserHistory () in CommonDAOImpl" + userHistoryList);
			return userHistoryList;
	}
	@SuppressWarnings("unchecked")
	public List<UserHistory> getUserHistoryHundi(Long id,String hundiType){
		
		logger.info("Start of getUserHistory ()  in CommonDAOImpl");
		
		 List<UserHistory> userHistoryList= new ArrayList<UserHistory>();
		 List<Object[] > hundiOfferingList=null;
		 
		 Session session = this.sessionFactory.getCurrentSession();

		 logger.info("before query implementation");

		 Query queryResult = session.createQuery("select hundi.paymentStatus,hundi.offeringId,hundi.createdTime,hundi.offeringAmount,hundi.paymentReceipt from HundiOffering hundi where hundi.user.userId = :USERID  and hundi.hundiType =:HUNDITYPE ORDER BY hundi.createdTime DESC");
			queryResult.setLong("USERID", id);
			queryResult.setString("HUNDITYPE", hundiType); 
			
			logger.info("converting query into list");
			
			hundiOfferingList = queryResult.list();
		
			for (Object[] obj : hundiOfferingList) {
			
				if (! "Pending".equalsIgnoreCase((String) obj[0]) && ! "Initiated".equalsIgnoreCase((String) obj[0])){
					UserHistory userHistory = new UserHistory();
					userHistory.setRemarks(((String)obj[0]));
					userHistory.setReferenceNo(((String)obj[1]));
					userHistory.setOfferingDate(CommonUtility.formatDateNew((Date)obj[2]));
					userHistory.setAmount((BigDecimal)obj[3]);
					userHistory.setPaymentReceipt((String)obj[4]);
					userHistoryList.add(userHistory); 
				}
			
			}
			logger.info("End of getUserHistory () in CommonDAOImpl" + userHistoryList);
			return userHistoryList;
	}
	

	@SuppressWarnings("unchecked")
	public List<UserHistory> getUserHistoryMobile(Long id){
		
		logger.info("Start of getUserHistoryMobile ()  in CommonDAOImpl");
		
		 List<UserHistory> userHistoryList= new ArrayList<UserHistory>();
		 List<Object[] > hundiOfferingList=null;
		 
		 Session session = this.sessionFactory.getCurrentSession();

		 logger.info("before query implementation");

		 Query queryResult = session.createQuery("select hundi.paymentStatus,hundi.offeringId,hundi.createdTime,hundi.offeringAmount,hundi.paymentReceipt,hundi.hundiType from HundiOffering hundi where hundi.user.userId = :USERID ORDER BY hundi.createdTime DESC");
		 
			queryResult.setLong("USERID", id); 			
			logger.info("converting query into list");			
			hundiOfferingList = queryResult.list();
		
			for (Object[] obj : hundiOfferingList) {
			
				if (! "Pending".equalsIgnoreCase((String) obj[0]) && ! "Initiated".equalsIgnoreCase((String) obj[0])){
					UserHistory userHistory = new UserHistory();
					userHistory.setRemarks(((String)obj[0]));
					userHistory.setReferenceNo(((String)obj[1]));
					userHistory.setOfferingDate(CommonUtility.formatDateNew((Date)obj[2]));
					userHistory.setAmount((BigDecimal)obj[3]);
					userHistory.setPaymentReceipt((String)obj[4]);
					if(obj[5]!=null)
						userHistory.setHundiType((String)obj[5]);
						else 
							userHistory.setHundiType("SRIVARI");
					userHistoryList.add(userHistory); 
				}
			
			}
			
			 Query queryResult1 = session.createSQLQuery("select BOOKING_STATUS,DARSHAN_BOOKING_ID,CREATED_TIME,HUNDI_AMOUNT,HUNDI_RECEIPT from DARSHAN_BOOKING  where user_Id = :USERID and BOOKING_STATUS = 'Success' and HUNDI_AMOUNT > 0 ORDER BY created_Time DESC");
			 
				queryResult1.setLong("USERID", id); 			
				logger.info("converting query into list");			
				hundiOfferingList = queryResult1.list();
			
				for (Object[] obj : hundiOfferingList) {				
					
						UserHistory userHistory = new UserHistory();
						userHistory.setRemarks(((String)obj[0]));
						userHistory.setReferenceNo(((String)obj[1]));
						userHistory.setOfferingDate(CommonUtility.formatDateNew((Date)obj[2]));
						userHistory.setAmount((BigDecimal)obj[3]);
						userHistory.setPaymentReceipt((String)obj[4]);
						userHistoryList.add(userHistory); 
					
				
				}
			
			
			
			
			logger.info("End of getUserHistoryMobile () in CommonDAOImpl" + userHistoryList);
			return userHistoryList;
	}
	
public ResetPasswordInfo changePassword(long userId, String password){
		
		String encryptedPassword = CommonUtility.encryptPassword(password);		
		ResetPasswordInfo resetPasswordInfo = new ResetPasswordInfo();
		
		
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("update User set userPassword = :USERPASSWORD, updatedTime = :UPDATEDTIME " +
    				" where userId = :USERID");
		Query updateQuery = session.createQuery("update TempUserPwd set userPass = :USERPASS, updatedTime = :UPDATEDTIME where user.userId = :USERID");
		query.setParameter("USERPASSWORD", encryptedPassword);
		query.setParameter("USERID", userId);
		query.setParameter("UPDATEDTIME", CommonUtility.currentTimeStamp());
		updateQuery.setString("USERPASS", password);
		updateQuery.setParameter("UPDATEDTIME", CommonUtility.currentTimeStamp());
		updateQuery.setParameter("USERID", userId);
		
		int result = query.executeUpdate();
		updateQuery.executeUpdate();
		
		if(result > 0){
			logger.info("Password has been saved."+" "+System.currentTimeMillis());
			Query queryUserInfo = session.createQuery("select user.userId, user.userName, user.updatedTime, userDetail.userFirstName, userDetail.userPhoneMobile from User user, UserPersonalDetail userDetail where user.userId = userDetail.userId AND user.userId= :USERID");
			logger.info("After the query updated"+" "+System.currentTimeMillis());
			queryUserInfo.setParameter("USERID", userId);
			List<Object[]> objList = queryUserInfo.list();
			if(objList.size() != 0){
				Object[] obj = objList.get(0);
				resetPasswordInfo.setUserId((Long)obj[0]);
				resetPasswordInfo.setUserEmail((String)obj[1]);
				resetPasswordInfo.setUpdatedTime((Date)obj[2]);
				resetPasswordInfo.setUserFirstName((String)obj[3]);
				resetPasswordInfo.setUserPhoneMobile((String)obj[4]);
				
			
			}	
			logger.info("Method Return"+" "+System.currentTimeMillis());
			return resetPasswordInfo;
		}else{
			return null;
		}
}	
		
	
	
	public Status login(String userName, String password) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session
				.createQuery("select userId,userStatus,smsVerification,emailVerification,watchListFlag,mobileNumber from User where userName= :USERNAME AND userPassword= :PASSWORD");
		query.setParameter("USERNAME", userName);
		query.setParameter("PASSWORD", CommonUtility.encryptPassword(password));
		List<Object[]> objList = query.list();
		String mobileNumber = null;
		String WatchListStatus = null;
		Status userStatus = new Status();
		
		logger.info("In login list size: " + objList.size());
		if (objList.size() != 0) {
			Object[] obj = objList.get(0);
			userStatus.setUserId((Long) obj[0]);
			userStatus.setUserStatus(new Boolean((String) obj[1]));
			userStatus.setSmsVerification(new Boolean((String) obj[2]));
			userStatus.setEmailVerification(new Boolean((String) obj[3]));
			userStatus.setWatchListFlag((String) obj[4]);
			userStatus.setUserVerified(true);
			userStatus.setPasswordVerified(true);
			mobileNumber = (String) obj[5];
			WatchListStatus = (String) obj[4];
			WatchList watchlistCheck = getWatchList(mobileNumber);
			if (WatchListStatus.equalsIgnoreCase("N")
					&& watchlistCheck != null) {
				userStatus.setWatchListFlag("N");				
			}
		}

		return userStatus;
	}

	
	@SuppressWarnings("unchecked")
	public ServiceNoteDetail getNotes(long serviceType, long ruleId){
		logger.info("service type id and rule id" +serviceType+ "" +ruleId);
		logger.info("Start of getAccomBookingInstruction ()  in EAccomodationDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select snote.notesDescription from ServiceNote snote where  snote.rulesMaster.ruleId=:RULEID AND snote.serviceTypeMaster.serviceTypeId= :SERVICETYPE AND snote.status=1001001 and snote.rowStatus=0");
		//Query query = session.createQuery("select service.,service. serviceSubtype, service.notesType, service.notesTypeDescription from ServiceNote serviceNote where service.serviceType= :SERVICETYPE AND service.serviceSubtype= :SERVICESUBTYPE AND service.notesType= :NOTESTYPE");
		query.setLong("SERVICETYPE", serviceType);
		query.setLong("RULEID", ruleId);
		//List<Object[]> list = query.list();
		String notesString = (String)query.uniqueResult();
		ServiceNoteDetail serviceNote = new ServiceNoteDetail();
		logger.info("notesString=============="+notesString);
		if(notesString!=null){
			serviceNote.setDescription(notesString);
		}

			
		return serviceNote;
	}
	@SuppressWarnings("unchecked")
	public ServiceNoteDetail getNotesKM(long serviceType, long ruleId){
		logger.info("service type id and rule id" +serviceType+ "" +ruleId);
		logger.info("Start of getAccomBookingInstruction ()  in EAccomodationDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select snote.notesDescription from ServiceNote snote where  snote.rulesMaster.ruleId=:RULEID AND snote.serviceTypeMaster.serviceTypeId= :SERVICETYPE AND snote.status=1001001 and snote.rowStatus=0");
		//Query query = session.createQuery("select service.,service. serviceSubtype, service.notesType, service.notesTypeDescription from ServiceNote serviceNote where service.serviceType= :SERVICETYPE AND service.serviceSubtype= :SERVICESUBTYPE AND service.notesType= :NOTESTYPE");
		query.setLong("SERVICETYPE", serviceType);
		query.setLong("RULEID", ruleId);
		//List<Object[]> list = query.list();
		String notesString = (String)query.uniqueResult();
		ServiceNoteDetail serviceNote = new ServiceNoteDetail();
		logger.info("notesString=============="+notesString);
		if(notesString!=null){
			serviceNote.setDescription(notesString);
		}

			
		return serviceNote;
	}
	
	@SuppressWarnings("unchecked")
	public List<MasterList> displayMasterList(long userId){
		logger.info("Start of displayMasterList ()  in CommonDAOImpl");
		
		List<MasterList> userMasterList= new ArrayList<MasterList>();
		List<Object[] > MasterLists=null;
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("select userFAF.familyPersonId,userFAF.familyPersonFirstName from UsersFriendsAndFamily userFAF where userFAF.user.userId = :USERID ");
		query.setLong("USERID", userId);
		MasterLists = query.list();
		if(MasterLists.size()>0){
			for (Object[] obj : MasterLists) {
				try{
					MasterList masterList = new MasterList();
					masterList.setUserId(((Long)obj[0]));
					masterList.setUserName(((String)obj[1]));
					userMasterList.add(masterList); 
				}
				catch(Exception e){
					logger.error(e.getMessage());
				}
			
			}
		}
		logger.info("end of displayMasterList in CommonDAOImpl");
		return userMasterList;
	}
	
	public boolean saveMasterDetails(
			UsersFriendsAndFamily userFriendsAndFamily) {
		logger.info("Start of saveMasterDetails in CommonDAOImpl");
		try{
			this.sessionFactory.getCurrentSession().saveOrUpdate(userFriendsAndFamily);
			logger.info("End of saveMasterDetails in CommonDAOImpl");
			return true;
		}
		catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}	
	}
	
	public UsersFriendsAndFamily userInMasterList(long userId){
		logger.info("Start of userInMAsterList ()  in CommonDAOImpl");
		
		UsersFriendsAndFamily usersFriendsAndFamily = (UsersFriendsAndFamily)sessionFactory.getCurrentSession().load(UsersFriendsAndFamily.class, userId);
		
		logger.info("End of userInMAsterList ("+usersFriendsAndFamily.getFamilyPersonId()+")  in CommonDAOImpl");
		
		return usersFriendsAndFamily;
	}
	
	public CommonValueMaster getCommonValueMaster(long piligrimIdProofType) {
		logger.info("Start of  getCommonValueMaster () in CommonDAOImpl");
		CommonValueMaster commonValueMaster = new CommonValueMaster();
		commonValueMaster = (CommonValueMaster) sessionFactory
				.getCurrentSession().load(CommonValueMaster.class,
						piligrimIdProofType);
		logger.info("End of  getCommonValueMaster () in CommonDAOImpl");
		return commonValueMaster;
	}
	
	public WatchList getWatchList(String mobileNumber) {
		logger.info("Start of getWatchList in CommonDAOImpl");
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from WatchList w where w.mobileNumber= :MOBILENUMBER");
		query.setString("MOBILENUMBER", mobileNumber);
		WatchList watchList = (WatchList) query.uniqueResult();
		logger.info("End of getWatchList in CommonDAOImpl");
		return watchList;
	}
	
	public List<Object[]> allChannelDetails(){
		logger.info("Start of allChannelDetails() in CommonDAOImpl");
		List<Object[]> list = new ArrayList<Object[]>();
		Query query = sessionFactory.getCurrentSession().createQuery(
				"select channelTypeId, channelName, channelDescription from ChannelMaster");
		list = query.list();
		logger.info("End of allChannelDetails() in CommonDAOImpl");
		return list;
	}
	
	public long retrieveChannelId(String channelName){
		
		long channelId = 0l;
		
		logger.info("Start of retrieveChannelId() in CommonDAOImpl");
		Query query = sessionFactory.getCurrentSession().createQuery(
				"select cm.channelTypeId from ChannelMaster cm where cm.channelName = :CHANNELNAME and rowStatus = 0");
		query.setString("CHANNELNAME", channelName);
		logger.info("End of retrieveChannelId() in CommonDAOImpl");
		Object obj = query.uniqueResult();
		
		if(obj != null){
		channelId = (Long)obj;
		}
		return channelId;
	}
	

	public long getServiceTypeId(String serviceName){
		logger.info("Start of getServiceTypeId() in CommonDAOImpl");
		
		Query query = sessionFactory.getCurrentSession().createQuery(
				"select stm.serviceTypeId from ServiceTypeMaster stm where stm.serviceTypeName = :SERVICETYPENAME and stm.rowStatus = 0");
		query.setString("SERVICETYPENAME", serviceName);
		
		long serviceTypeId = (Long)query.uniqueResult();
		return serviceTypeId;
		
	}
	
	public long getRuleId(String ruleName){
		
       logger.info("Start of getRuleId() in CommonDAOImpl");
		
		Query query = sessionFactory.getCurrentSession().createQuery(
				"select rtm.ruleId from RulesMaster rtm where rtm.ruleName = :RULENAME and rtm.serviceTypeMaster.serviceTypeId = :SERVICETYPEID and rtm.rowStatus = 0");
		query.setString("RULENAME", ruleName);
		query.setLong("SERVICETYPEID", getServiceTypeId("seva"));
		
		long ruleId = (Long)query.uniqueResult();
		return ruleId;
		
	}
	
	public Long getRuleId(String ruleName, Long serviceTypeId) {

		logger.info("Start of getRuleId() in CommonDAOImpl");

		Query query = sessionFactory
				.getCurrentSession()
				.createQuery(
						"select rtm.ruleId from RulesMaster rtm where rtm.ruleName = :RULENAME and rtm.serviceTypeMaster.serviceTypeId = :SERVICETYPEID and rtm.rowStatus = 0");
		query.setString("RULENAME", ruleName);
		query.setLong("SERVICETYPEID", serviceTypeId);

		long ruleId = (Long) query.uniqueResult();
		return ruleId;

	}
	public boolean saveOrUpdateReqWorkflow(RequestWorkflow requestWorkflow) {
		logger.info("Start of saveOrUpdateRequestWorkflow() in commonDAOImpl");
		sessionFactory.getCurrentSession().saveOrUpdate(requestWorkflow);
		logger.info("End of saveOrUpdateRequestWorkflow() in commonDAOImpl");
		return true;
	}

	public ServiceTypeMaster getServiceTypeMasterObj(long serviceTypeId) {
		logger.info("Start of getServiceTypeMaster() in commonDAOImpl");
		ServiceTypeMaster serviceTypeMaster = (ServiceTypeMaster) sessionFactory
				.getCurrentSession().load(ServiceTypeMaster.class,
						serviceTypeId);
		logger.info("End of getServiceTypeMaster() in commonDAOImpl");
		return serviceTypeMaster;
	}

	public RulesMaster getRulesMasterObj(long ruleId) {
		logger.info("Start of getRulesMaster() in commonDAOImpl");
		RulesMaster rulesMaster = (RulesMaster) sessionFactory
				.getCurrentSession().load(RulesMaster.class, ruleId);
		logger.info("End of getRulesMaster() in commonDAOImpl");
		return rulesMaster;
	}

	public RequestTypeMaster getRequestTypeMasterObj(long requestTypeId) {
		logger.info("Start of getRequestTypeMaster() in commonDAOImpl");
		RequestTypeMaster requestTypeMaster = (RequestTypeMaster) sessionFactory
				.getCurrentSession().load(RequestTypeMaster.class,
						requestTypeId);
		logger.info("End of getRequestTypeMaster() in commonDAOImpl");
		return requestTypeMaster;
	}
	
	public long getStatus(String valueGroupName, String valueName) {
		logger.info("Start of getStatus() in CommonDAOImpl");
		long statusCode = 0;
		String queryString = "Select value_id from common_value_master cvm "
				+ "join common_value_group cvg on cvm.VALUE_GROUP_ID = cvg.value_group_id "
				+ "where upper(cvg.VALUE_GROUP_NAME) = upper(:VALUEGROUPNAME) and "
				+ "upper(cvm.VALUE_NAME) = upper(:VALUENAME)";

		Query queryResult = sessionFactory.getCurrentSession()
				.createSQLQuery(queryString);

		queryResult.setString("VALUEGROUPNAME", valueGroupName);
		queryResult.setString("VALUENAME", valueName);
		statusCode = ((Number) queryResult.uniqueResult()).longValue();
		logger.info("End of getStatus() in CommonDAOImpl");
		return statusCode;
	}
	
	public RequestWorkflow loadRequestWorkflow(long requestId) {
		logger.info("Start of loadRequestWorkflow() in CommonDAOImpl");

		logger.info("getting request workflow" + requestId);
		RequestWorkflow requestWorkflow = (RequestWorkflow) sessionFactory
				.getCurrentSession().load(RequestWorkflow.class, requestId);
		logger.info("requestworkflow object" + requestWorkflow);
		logger.info("End of loadRequestWorkflow() in CommonDAOImpl");
		return requestWorkflow;
	}
	
	public ServiceNote loadServiceNote(long id) {
		logger.info("Start of loadRequestWorkflow() in CommonDAOImpl");

		logger.info("getting ServiceNote" + id);
		ServiceNote serviceNote = (ServiceNote) sessionFactory
				.getCurrentSession().load(ServiceNote.class, id);
		logger.info("requestworkflow object" + serviceNote);
		logger.info("End of loadRequestWorkflow() in CommonDAOImpl");
		return serviceNote;
	}
	
	public RulesMaster getRulesMaster(long ruleId) {
		logger.info("Start of getRulesMaster() in CommonDAOImpl");
		RulesMaster rulesMaster = (RulesMaster) sessionFactory
				.getCurrentSession().load(RulesMaster.class, ruleId);
		logger.info("End of getRulesMaster() in CommonDAOImpl");
		return rulesMaster;
	}

	public RequestTypeMaster getRequestTypeMaster(long requestTypeId) {
		logger.info("Start of getRequestTypeMaster() in CommonDAOImpl");
		RequestTypeMaster requestTypeMaster = (RequestTypeMaster) sessionFactory
				.getCurrentSession().load(RequestTypeMaster.class,
						requestTypeId);
		logger.info("End of getRequestTypeMaster() in CommonDAOImpl");
		return requestTypeMaster;
	}

	public ChannelMaster getchannelMaster(long channelId) {
		logger.info("Start of getchannelMaster() in CommonDAOImpl");
		ChannelMaster channelMaster = (ChannelMaster) sessionFactory
				.getCurrentSession().load(ChannelMaster.class, channelId);
		logger.info("End of getchannelMaster() in CommonDAOImpl");
		return channelMaster;
	}

	public ServiceTypeMaster getServiceTypeMaster(long serviceTypeId) {
		logger.info("Start of getServiceTypeMaster() in CommonDAOImpl");
		ServiceTypeMaster serviceTypeMaster = (ServiceTypeMaster) sessionFactory
				.getCurrentSession().load(ServiceTypeMaster.class,
						serviceTypeId);
		logger.info("End of getServiceTypeMaster() in CommonDAOImpl");
		return serviceTypeMaster;
	}
	
	public List<ServiceTypeMaster> serviceTypeIds() {
		logger.info("Start of serviceTypeIds() in CommonDAOImpl");
		List<ServiceTypeMaster> list = new ArrayList<ServiceTypeMaster>();

		String sql = "from ServiceTypeMaster where rowStatus = 0";

		Query query = sessionFactory.getCurrentSession().createQuery(sql);

		list = (List<ServiceTypeMaster>) query.list();
		logger.info("End of requestTypeIds() in CommonDAOImpl");
		return list;

	}

	public List<RequestTypeMaster> requestTypeIds(long serviceTypeId) {

		logger.info("Start of requestTypeIds() in CommonDAOImpl");
		List<RequestTypeMaster> list = new ArrayList<RequestTypeMaster>();

		String sql = "from RequestTypeMaster where rowStatus = 0 and serviceTypeMaster.serviceTypeId = :SERVICETYPEID";

		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		query.setLong("SERVICETYPEID", serviceTypeId);

		list = (List<RequestTypeMaster>) query.list();
		logger.info("End of requestTypeIds() in CommonDAOImpl");
		return list;

	}
	public void updateUser(User user) {
		logger.info("Start of updateUser() in commonDAOImpl");
		sessionFactory.getCurrentSession().update(user);
		logger.info("End of updateUser() in commonDAOImpl");
	}
	
	public SevaMaster getSevaMaster(long sevaId){
		logger.info("Start of getSevaMaster() in commonDAOImpl");
		SevaMaster sevaMaster = (SevaMaster)sessionFactory.getCurrentSession().load(SevaMaster.class, sevaId);
		return sevaMaster;
	}
	
	public SessionInfo getSessionInfo(String offeringId){
		logger.info("Start of sessionInfo ()  in CommonDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		SessionInfo sessionInfo = (SessionInfo)session.load(SessionInfo.class, offeringId);
		logger.info("End of sessionInfo () in CommonDAOImpl" + sessionInfo);
		return sessionInfo;
	}

	public boolean saveSessionInfo(SessionInfo sessionInfo) {
		logger.info("Start of saveSessionInfo in CommonDAOImpl");
		try{
			SessionInfo sessionInfoexists = (SessionInfo)this.sessionFactory.getCurrentSession().get(SessionInfo.class, sessionInfo.getOfferingId());
			if (sessionInfoexists == null) {	
				this.sessionFactory.getCurrentSession().saveOrUpdate(sessionInfo);
			}
			logger.info("End of saveSessionInfo in CommonDAOImpl");
			return true;
		}
		catch(Exception e){
			logger.error(e.getMessage());
			return false;
		}	
	}
	
public GlobalPropertiesResponse getGlobalProperties(GlobalProperties globalpropertice) {
	
	GlobalPropertiesResponse globalPropertiesResponse=new GlobalPropertiesResponse();
		
		logger.info("Start of globalPropertice () service  in donordaoimpl");
		String sql = "select property_value from Global_Prop where group_name=:GROUPNAME and property_Name=:PROPERTYNAME";
		
		SQLQuery queryResult = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
	
		queryResult.setString("GROUPNAME", globalpropertice.getGroupName());
		
		queryResult.setString("PROPERTYNAME",globalpropertice.getPropertyName());
		
		String propertyValue=(String) queryResult.uniqueResult();
		
		globalPropertiesResponse.setPropertyValue(propertyValue);
		
		return globalPropertiesResponse;
	}
public GlobalPropertiesResponse getGlobalPropertiesAccom(GlobalProperties globalpropertice) {
	
	GlobalPropertiesResponse globalPropertiesResponse=new GlobalPropertiesResponse();
		
		logger.info("Start of globalPropertice () service  in donordaoimpl");
		String sql = "select property_value from Global_Prop where group_name=:GROUPNAME and property_Name=:PROPERTYNAME and row_status=0";
		
		SQLQuery queryResult = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
	
		queryResult.setString("GROUPNAME", globalpropertice.getGroupName());
		
		queryResult.setString("PROPERTYNAME",globalpropertice.getPropertyName());
		
		String propertyValue=(String) queryResult.uniqueResult();
		
		globalPropertiesResponse.setPropertyValue(propertyValue);
		
		return globalPropertiesResponse;
	}
public List<Object[]> getGlobalProps(GlobalProperties globalpropertice) {
	
		logger.info("Start of globalPropertice () service  in donordaoimpl");
		
		String sql = "select property_name,property_value from Global_Prop where group_name=:GROUPNAME";
		
		SQLQuery queryResult = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
	
		queryResult.setString("GROUPNAME", globalpropertice.getGroupName());
		
		List<Object[]> globalPropertiesResponse=  queryResult.list();
		
		return globalPropertiesResponse;
	}

public String getCountOfDonations(){
	
	String sql = "select count(*)+1 from DONATION_OFFERINGS where trunc(CREATED_TIME,'DD') = trunc(sysdate,'DD')";
	SQLQuery queryResult = sessionFactory.getCurrentSession().createSQLQuery(sql);
	logger.error("/////////////////////////"+queryResult.uniqueResult().toString());
	return queryResult.uniqueResult().toString();
}


public long saveDonorInfo(DonorSelfService donorInfo){
	
	long retVal = 0;
	sessionFactory.getCurrentSession().save(donorInfo);
	retVal = donorInfo.getDonorSelfServiceId();
	return retVal;
}

public List<RequestTypeMaster> reqTypeIds() {

	logger.info("Start of requestTypeIds() in CommonDAOImpl");
	List<RequestTypeMaster> list = new ArrayList<RequestTypeMaster>();

	String sql = "from RequestTypeMaster where rowStatus = 0";

	Query query = sessionFactory.getCurrentSession().createQuery(sql);

	list = (List<RequestTypeMaster>) query.list();
	logger.info("End of requestTypeIds() in CommonDAOImpl");
	return list;

}

public List<Object[]> serviceNotes() {

	logger.info("Start of requestTypeIds() in CommonDAOImpl");
	String sql = "select sn.service_type_id, sn.request_type_id, sn.NOTES_DESCRIPTION, sn.rule_id, rm.rule_name from service_notes sn join RULES_MASTER rm on rm.rule_id = sn.RULE_ID where sn.STATUS = 1001001";

	Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);

	return query.list();

}

public String getGlobalProp(String groupName, String propertyName) {
	
		
		logger.info("Start of globalPropertice () service  in donordaoimpl");
		String sql = "select property_value from Global_Prop where group_name=:GROUPNAME and property_Name=:PROPERTYNAME";
		
		SQLQuery queryResult = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
	
		queryResult.setString("GROUPNAME", groupName);
		
		queryResult.setString("PROPERTYNAME",propertyName);
		
		String propertyValue=(String) queryResult.uniqueResult();
		
		return propertyValue;
	}

	public Country countryName(int id){
		
		return (Country)sessionFactory.getCurrentSession().load(Country.class, id);
		
	}
	
	public State stateName(int id){
		
		return (State)sessionFactory.getCurrentSession().load(State.class, id);
		
	}
	
	public  PGDetails getPGDetails(String offeringId,String modName){
		
		PGDetails pgDetails = new PGDetails();
		if("EHUN".equals(modName)){
			HundiOffering hundiOffering = (HundiOffering) sessionFactory
					.getCurrentSession().load(HundiOffering.class,
							offeringId);
			pgDetails.setFirstName(hundiOffering.getPiligrimFirstName());
			pgDetails.setLastName(hundiOffering.getPiligrimLastName());
			pgDetails.setBehalf(hundiOffering.getOnBehalfOf());
			pgDetails.setOccasionOf(hundiOffering.getOnOccasionOf());
			
		}
		if("EDON".equals(modName)){
			
			DonationOffering donations = (DonationOffering) sessionFactory
					.getCurrentSession().load(DonationOffering.class,
							offeringId);
			UserPersonalDetail user = (UserPersonalDetail) sessionFactory
					.getCurrentSession().load(UserPersonalDetail.class,
							donations.getUser().getUserId());
			
			pgDetails.setUserId(donations.getUser().getUserId()+"");
			if(pgDetails.getUserId().equalsIgnoreCase("4748880")){
				pgDetails.setFirstName(donations.getOfferingOnBehalf().split("\\$")[0]);
				pgDetails.setLastName("");
			}
			else {
			pgDetails.setFirstName(user.getUserFirstName());
			pgDetails.setBehalf(donations.getOfferingOnBehalf());
			pgDetails.setLastName(user.getUserLastName());
			}
			
			
			
			
		}
		
		
		return pgDetails;
		
	}
	
	public User getUserExists(long userId){
		logger.info("Start of getUser ()  in CommonDAOImpl");
		
		String queryString = "FROM User WHERE userId = :USERID";
		Query query = this.sessionFactory.getCurrentSession().createQuery(
				queryString);
		query.setLong("USERID", userId);
		
		User user = (User)query.uniqueResult();
		logger.info("End of getUser () in CommonDAOImpl" + user);
		return user;
	}
	public User getUserDetails(final String userName) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		return (User) criteria.uniqueResult();
	}
	public SevaDipSchedule getSevaDipSchedule() {
		logger.info("Start of nextAvailableDipSchedule() in ESevaDipDAOImpl");
		String queryStr = "from SevaDipSchedule where rowStatus=0 and startDate >= to_date(to_char(sysdate,'dd-mon-yy'),'dd-mon-yy') order by startDate";
		Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
		query.setMaxResults(1);
		SevaDipSchedule sevaDipSchedule = (SevaDipSchedule) query.uniqueResult();
		logger.info("End of nextAvailableDipSchedule() in ESevaDipDAOImpl");
		return sevaDipSchedule;
	}
	public SedDipSchedule getDarshanDipSchedule() {
		logger.info("Start of getDarshanDipSchedule() in ESevaDipDAOImpl");
		String queryStr = "from SedDipSchedule where rowStatus=0 and startDate >= to_date(to_char(sysdate,'dd-mon-yy'),'dd-mon-yy') order by startDate";
		Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
		query.setMaxResults(1);
		SedDipSchedule darshanDipSchedule = (SedDipSchedule) query.uniqueResult();
		logger.info("End of getDarshanDipSchedule() in ESevaDipDAOImpl");
		return darshanDipSchedule;
	}
	public Integer isUserDipRegistered(Long userId, Long channelId, Date sevaStartDate, Date sevaEndDate) {
		String queryStr = "FROM SevaDipRegistrations sdr WHERE  sdr.channelMaster.channelTypeId = :CHANNELID"
				+ " AND sdr.sevaDate BETWEEN :FROMDATE AND :TODATE AND sdr.user.userId = :USERID  ORDER BY sevaDate";

		Query query = sessionFactory.getCurrentSession().createQuery(queryStr);

		query.setDate("FROMDATE", sevaStartDate);
		query.setDate("TODATE", sevaEndDate);
		query.setLong("CHANNELID", channelId);
		query.setLong("USERID", userId);
		return query.list().size();
	}


	public Boolean checkIfDipSeva(String offeringId) {
		String queryStr = "from SevaDipRegistrations sdr where sdr.sevaBookingId = :BOOKINGID";
		Query query = sessionFactory.getCurrentSession().createQuery(
				queryStr);
		query.setString("BOOKINGID", offeringId);
		if (query.list().size() > 0) {
			return true;
		}
		return false;
	}
	
	public LanguageWatcher getExistingLangWatcher(Date currDate,
			String language) {
		logger.info("Start of getExistingLangWatcher() in CommonDAOImpl");
		String queryStr = "from LanguageWatcher where languageName = :LANGUAGE AND watcherDate = :WATCHERDATE AND rowStatus=0";
		Query query = sessionFactory.getCurrentSession().createQuery(
				queryStr);
		query.setString("LANGUAGE", language);
		query.setDate("WATCHERDATE", currDate);
		LanguageWatcher languageWatcher = (LanguageWatcher)query.uniqueResult();
		logger.info("End of getExistingLangWatcher() in CommonDAOImpl");
		return languageWatcher;
	}

	public void saveOrUpdateLangWatcher(LanguageWatcher languageWatcher) {
		logger.info("Start of saveOrUpdateLangWatcher() in CommonDAOImpl");
		this.sessionFactory.getCurrentSession().saveOrUpdate(languageWatcher);
		logger.info("Start of saveOrUpdateLangWatcher() in CommonDAOImpl");
	}

	public List<State> getstates() {
		logger.info("Start of getstates ()  in CommonDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
		List<State> satesList = session.createQuery("from State").list();		
		logger.info("End of getstates () in CommonDAOImpl" + satesList);
		return satesList;
	}
	
	public TrustMaster getTrustMaster(long trustId) {
		logger.info("Start of getTrustMaster() in commonDAOImpl");
		TrustMaster trustMaster = (TrustMaster) sessionFactory
				.getCurrentSession().load(TrustMaster.class, trustId);
		logger.info("End of getTrustMaster() in commonDAOImpl");
		return trustMaster;
	}
	
	public TempUserPwd getTempUserPwd(long userId){	
		
		String queryStr = "from TempUserPwd where user.userId = :USERID ";
		Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
		query.setMaxResults(1);
		query.setLong("USERID", userId);
		TempUserPwd tempUserPwd = (TempUserPwd) query.uniqueResult();
		logger.info("End of getDarshanDipSchedule() in ESevaDipDAOImpl");
		return tempUserPwd;
	}
	
	public List<String> eCounterNames(){
		
		String queryStr =  "select Distinct(COUNTER_NAME) from TTD_ECOUNTER_DATA";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(queryStr);
		List<String> eCountersList = query.list();
		return eCountersList;
	}

	public Banks getBanksListMob(String pgsEnabled) {
		logger.info("Start of getBankDetails ()  in CommonDAOImpl");
		List<PgMaster> list = null;

		Session session = this.sessionFactory.getCurrentSession();

		logger.info("Executing the Query");
		Query queryResult = session.createQuery("from PgMaster where rowStatus = 0 AND pgId in ("+pgsEnabled+")");
		logger.info("Converting into a list formate");
		list = queryResult.list();
		Banks banks = new Banks();
		banks.setBankList(list);
		logger.info("End of getBankDetails () in CommonDAOImpl" + list);
		return banks;
	}

	public List deleteSession(Long userid) {
		List list = null;
		try {
		logger.info("Start of deleteSession ()  in CommonDAOImpl");
		

		Session session = this.sessionFactory.getCurrentSession();

		logger.info("Executing the Query");
		Query queryResult = session.createQuery("select audit.sessionId from LoginAudit audit where audit.user.userId = :USERID and trunc(login_time)=trunc(sysdate) and login_status='Success'	and login_time>(sysdate-30/1440))");
		queryResult.setLong("USERID", userid); 
		logger.info("Converting into a list formate");
		list = queryResult.list();	
		logger.error("End of deleteSession () in CommonDAOImpl" + list.size());
		/*
		 * if(null!=list) { if(list.size()>0) { for(int i=0;i<list.size();i++) { String
		 * key ="spring:session:sessions:"+list.get(i);
		 * CommonUtility.deleteKey(key.trim()); } } }
		 */
		}
		catch(Exception e)
		{
			logger.error("Error in deleteSession () in CommonDAOImpl");
		}
		return list;
	}

	public String saveUserMobileInfo(MobileAppData mobileObj) {
		// TODO Auto-generated method stub
		String retVal=null;
		sessionFactory.getCurrentSession().saveOrUpdate(mobileObj);
		retVal = mobileObj.getDeviceToken();
		return retVal;
	}
	
	public User loadUserMvtac(String userName) {

		logger.info("User Name :: " + userName);
		Session session=this.sessionFactory.getCurrentSession();
		User user = null;
		try {
			Query query = session.createQuery(
					"from User u where u.userName = :NAME");
			query.setString("NAME", userName);

			user = (User) query.uniqueResult();
			} catch (Exception exe) {
			exe.printStackTrace();
		}

		logger.info("USER :: " + user);
		//logger.info("User Id :: " + user.getUserId());

		return user;

	}
	//New service
	public List<Object[]> upcomingBookings(long userid)
	{
		logger.error("Into upcomingBookings() service" );
		
		List<Object[]> list=new ArrayList<Object[]>();
		list=null;
		
			Session session=this.sessionFactory.getCurrentSession();
			logger.error("executing Query");
			String queryString="SELECT a.DARSHAN_BOOKING_ID,TRUNC(a.DARSHAN_DATE),a.Reporting_time,'1','Special Entry Darshan',   " + 
					"                      case when a.ACCOM_BOOKING_ID is null   " + 
					"                      then 'No booking'   " + 
					"                      else   " + 
					"                      ACCOM_BOOKING_ID   " + 
					"                      end ACCOM_BOOKING_ID   " + 
					"                      FROM DARSHAN_BOOKING a   " + 
					"                      WHERE  a.BOOKING_STATUS='Success' and a.USER_ID=:USERID   and      " + 
					"					  TRUNC(a.DARSHAN_DATE)>=TRUNC(SYSDATE)    " + 
					"                      UNION ALL   " + 
					"                      SELECT ACCOM_BOOKING_ID as BOOKING_ID,TRUNC(ACCOM_DATE) as Service_date,checkin_time_slot as Slot,'2' as SERVICE_ID,'Accommodation' as SERVICE_NAME,'NA'     " + 
					"					 FROM ACCOM_BOOKING WHERE BOOKING_STATUS='Success'    " + 
					"					and USER_ID=:USERID and    " + 
					"					TRUNC(ACCOM_DATE)>=TRUNC(SYSDATE) ";
			logger.error("After query execution");
			Query query=session.createSQLQuery(queryString);
			//Query query=sessionFactory.getCurrentSession().createSQLQuery(queryString);
			query.setParameter("USERID", userid);
			list= query.list();//Converting data to list format
			
		
			
			return list;
	}
	
}
