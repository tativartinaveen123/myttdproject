package com.ttd.common.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.Country;
import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.DonorSelfService;
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
import com.ttd.edarshan.dip.entity.SedDipSchedule;
import com.ttd.edonation.entity.TrustMaster;
import com.ttd.eseva.dip.entity.SevaDipSchedule;
import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.RulesMaster;
import com.ttd.eseva.entity.SevaMaster;

public interface CommonDAO {
	public List<PgMaster> getBankDetails();
	
	public List<PgMaster> getHundiBankDetails();

	public List<CurrencyMaster> getCurrencyDetails();

	public List<Country> listCountries();
	
	public User getUser(long userId);

	public UserPersonalDetail getUserDetail(long userId);
	
	public List<UserHistory> getUserHistory(Long id);
	
	public ResetPasswordInfo changePassword(long userId, String password);
	
	public Status login(String userName, String password);
	
	public ServiceNoteDetail getNotes(long serviceType, long ruleId);
	
	public List<MasterList> displayMasterList(long userId);
	
	public boolean saveMasterDetails(UsersFriendsAndFamily userFriendsAndFamily);
	
	public UsersFriendsAndFamily userInMasterList(long userId);
	
	public CommonValueMaster getCommonValueMaster(long piligrimIdProofType);
	
	public WatchList getWatchList(String mobileNumber);
	
	public List<Object[]> allChannelDetails();
	
	public long retrieveChannelId(String channelName);
	
	public ServiceNote loadServiceNote(long id);
	

	public long getServiceTypeId(String serviceName);
	
	public long getRuleId(String RuleName);
	
	public boolean saveOrUpdateReqWorkflow(RequestWorkflow requestWorkflow);
	
	public RequestTypeMaster getRequestTypeMasterObj(long requestTypeId);
	
	public RulesMaster getRulesMasterObj(long ruleId);
	
	public ServiceTypeMaster getServiceTypeMasterObj(long serviceTypeId);
	
	public long getStatus(String valueGroupName, String valueName);
	
	public RequestWorkflow loadRequestWorkflow(long requestId);
	
	public RulesMaster getRulesMaster(long ruleId);
	
	public RequestTypeMaster getRequestTypeMaster(long requestTypeId);
	
	public ChannelMaster getchannelMaster(long channelId);
		
	public ServiceTypeMaster getServiceTypeMaster(long serviceTypeId);
	
	public List<ServiceTypeMaster> serviceTypeIds();
	
	public List<RequestTypeMaster> requestTypeIds(long serviceTypeId);
	
	public boolean saveSessionInfo(SessionInfo sessionInfo);
	
	public SessionInfo getSessionInfo(String offeringId);
	public void updateUser(User user);

	public GlobalPropertiesResponse getGlobalProperties(GlobalProperties globalpropertice);
	public GlobalPropertiesResponse getGlobalPropertiesAccom(GlobalProperties globalpropertice);
	public List<String> getRelationshipList(String groupType);
	public SevaMaster getSevaMaster(long sevaId);
	
	public String getCountOfDonations();
	
	public long saveDonorInfo(DonorSelfService donorInfo);

	public Map<String, String> getCommomValue(String groupType);
	public List<RequestTypeMaster> reqTypeIds();
	
	public List<Object[]> serviceNotes();
	
	public String getGlobalProp(String groupName, String propertyName);
	
	public Country countryName(int id);
	
	public State stateName(int id);
	
	PGDetails getPGDetails(String offeringId,String modName);
	
	public User getUserExists(long userId);
	public User getUserDetails(final String userName);
	public Long getRuleId(String string, Long serviceId);
	
	public List<Object[]> getGlobalProps(GlobalProperties globalpropertice) ;

	public SevaDipSchedule getSevaDipSchedule();

	public Integer isUserDipRegistered(Long userId, Long channelId, Date startDate, Date endDate);

	public Boolean checkIfDipSeva(String offeringId);

	public LanguageWatcher getExistingLangWatcher(Date currDate, String language);
	
	public void saveOrUpdateLangWatcher(LanguageWatcher languageWatcher);

	public List<State> getstates();
	
	public SedDipSchedule getDarshanDipSchedule();
	
	public TrustMaster getTrustMaster(long trustId);

	public TempUserPwd getTempUserPwd(long userId);

	public List<UserHistory> getUserHistoryMobile(Long id);

	public List<String> eCounterNames();

	public ServiceNoteDetail getNotesKM(long serviceType, long ruleId);

	public Banks getBanksListMob(String pgsEnabled);

	
	public List deleteSession(Long userId);

	public List<UserHistory> getUserHistoryHundi(Long id, String hundiType);

	public String saveUserMobileInfo(MobileAppData mobileObj);
	
	public User loadUserMvtac(String userName);

	public List<Object[]> upcomingBookings(long userid);
	
}
