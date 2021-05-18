package com.ttd.common.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;

import com.ttd.common.entity.Country;
import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.PgMaster;
import com.ttd.common.entity.State;
import com.ttd.common.model.ActiveEnvironment;
import com.ttd.common.model.Banks;
import com.ttd.common.model.ChannelDetails;
import com.ttd.common.model.CountryModel;
import com.ttd.common.model.DonorInfoModel;
import com.ttd.common.model.GlobalProperties;
import com.ttd.common.model.GlobalPropertiesResponse;
import com.ttd.common.model.MasterDetails;
import com.ttd.common.model.MasterList;
import com.ttd.common.model.MobileAppInfo;
import com.ttd.common.model.NewStatus;
import com.ttd.common.model.PGDetails;
import com.ttd.common.model.PasswordStatus;
import com.ttd.common.model.RegisterUserDetails;
import com.ttd.common.model.ServiceAndRequestTypeIdsModel;
import com.ttd.common.model.ServiceNoteDetail;
import com.ttd.common.model.Status;
import com.ttd.common.model.UserFriendsAndFamilyModel;
import com.ttd.common.entity.User;
import com.ttd.common.model.UserHistory;

public interface CommonService {

	public List<PgMaster> getBankDetails();
	
	public List<PgMaster> getHundiBankDetails();

	public List<CurrencyMaster> getCurrencyDetails();

	public List<Country> listCountries();
	
	public List<CountryModel> listAllCountryDetails();
	
	public RegisterUserDetails getUserDetails(long userId);
	public RegisterUserDetails getUserDetailsMorphed(long userId);
	
	public List<UserHistory> getUserHistory(Long id);
	
	public List<UserHistory> getUserHistoryMobile(Long id);
	
	public String processSMS(String smsText,String phoneNumber);
	
	public String sendEmailtoPiligrim(SimpleMailMessage msg, String emailBody, String recieptName);
	

	
	public String sendEmailtoPiligrimAdmin(SimpleMailMessage msg, String emailBody,
			String recieptName) ;
	
	public boolean changePassword(long userId, boolean isEmail, String password);
	
	public Status login(String userName, String password);
	
	public ServiceNoteDetail getNotes(ServiceNoteDetail noteInfo);
	
	public List<MasterList> displayMasterList(long userId);
	
	public Boolean addMasterDetails(MasterDetails masterDetails);
	
	public UserFriendsAndFamilyModel userInMasterList(long userId);
	
	public List<ChannelDetails> allChannelDetails();
	
    public HashMap<Long,String> serviceTypeIds();
	
	public HashMap<Long,String> requestTypeIds(long serviceTypeId);

	public PasswordStatus passwordChange(NewStatus newStatus);
	
	public Properties sevaList();
	
	public String getSevaNameByCode(String sevaCode);
	public List<String> getRelationshipList(String groupType);
	
	public Boolean saveSessionInfo(String offeringId, String sessionValue); 
		
	public String getSessionInfoValue(String offeringId); 
	
	public GlobalPropertiesResponse getGlobalProperties(GlobalProperties globalpropertice);
	public String sendEmailtoPiligrimToAsync(String emailTo,String emailFrom,String emailSubject, String emailBody,
			String recieptName);
	
	public boolean saveDonorInfo(DonorInfoModel donorInfoModel);

	public Map<String, String> getCommonValue(String groupType);
	
	public String getIsPgMock();
	
	public ServiceAndRequestTypeIdsModel serviceAndRequestTypeIds();
	
	PGDetails getPGDetails(String offeringId,String modName);
	public User getUserDetails(final String userName);

	public Boolean checkIfDip(String offeringId);
	
	public void increaseLangCount(String language);

	public List<State> getstates();

	public List<String> geteCounterNames();

	public ServiceNoteDetail getNotesKM(ServiceNoteDetail serviceNotesDetail);

	public Banks banksListMob(String serviceName);

	//public List<UserHistory> getUserHistoryHundi(long parseLong);

	public List<UserHistory> getUserHistoryHundi(long id,String hundiType);

	public boolean saveUserMobileInfo(MobileAppInfo mobileAppInfo);
	
	public RegisterUserDetails getUserDetailsForMvtac(String userEmail);

	public List<HashMap<String, String>> getUpcomingBookings(long userid);

}
