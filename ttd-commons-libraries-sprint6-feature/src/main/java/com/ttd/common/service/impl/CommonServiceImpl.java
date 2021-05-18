package com.ttd.common.service.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.ttd.common.dao.CommonDAO;
import com.ttd.common.email.MailSender;
import com.ttd.common.email.TTDEmailSender;
import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.Country;
import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.DonorSelfService;
import com.ttd.common.entity.ImagesStore;
import com.ttd.common.entity.LanguageWatcher;
import com.ttd.common.entity.MobileAppData;
import com.ttd.common.entity.PgMaster;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.SessionInfo;
import com.ttd.common.entity.State;
import com.ttd.common.entity.TempUserPwd;
import com.ttd.common.entity.User;
import com.ttd.common.entity.UserPersonalDetail;
import com.ttd.common.entity.UsersFriendsAndFamily;
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
import com.ttd.common.model.ResetPasswordInfo;
import com.ttd.common.model.ServiceAndRequestTypeIdsModel;
import com.ttd.common.model.ServiceNoteDetail;
import com.ttd.common.model.Status;
import com.ttd.common.model.UserFriendsAndFamilyModel;
import com.ttd.common.model.UserHistory;
import com.ttd.common.service.CommonService;
import com.ttd.common.sms.SMSServices;
import com.ttd.common.util.CommonUtility;
import com.ttd.edonation.entity.DonationOffering;
import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.ussesvvd.entity.UssesVvdOffering;
import com.ttd.eaccommodation.entity.AccomBooking;

@Service
public class CommonServiceImpl implements CommonService {
	@Autowired
	private CommonDAO commonDAO;


	
	@Autowired
	private SMSServices smsService;

	@Autowired
	private TTDEmailSender ttdemailsender;

	@Autowired
	private VelocityEngine velocityEngine;

	@Autowired
	private MailSender mailSenderSimpleMessage;

	private String subject;
	private String profileImagesFileServerLoc;
	private String isPgMock;
	
	Logger logger = Logger.getLogger(CommonServiceImpl.class);

	public ResourceBundle getResource() {
		String techpgName = null;
		String targetEnvironment = System.getProperty("active.env");
		if (targetEnvironment == null) {
			techpgName = "techpg";
		} else {
			techpgName = "techpg_" + targetEnvironment;
		}
		ResourceBundle resource = ResourceBundle.getBundle(techpgName);
		return resource;
	}
	public String getIsPgMock() {
		return isPgMock;
	}

	public void setIsPgMock(String isPgMock) {
		this.isPgMock = isPgMock;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProfileImagesFileServerLoc() {
		return profileImagesFileServerLoc;
	}

	public void setProfileImagesFileServerLoc(String profileImagesFileServerLoc) {
		this.profileImagesFileServerLoc = profileImagesFileServerLoc;
	}

	@Transactional
	public List<PgMaster> getBankDetails() {
		logger.info("Inside getBankDetails of CommonServiceImpl");
		return commonDAO.getBankDetails();

	}
	
	@Transactional
	public List<PgMaster> getHundiBankDetails() {
		logger.info("Inside getHundiBankDetails of CommonServiceImpl");
		return commonDAO.getHundiBankDetails();

	}

	@Transactional
	public List<CurrencyMaster> getCurrencyDetails() {
		logger.info("Inside getCurrencyDetails of CommonServiceImpl");
		return commonDAO.getCurrencyDetails();
	}

	@Transactional
	public List<Country> listCountries() {
		logger.info("Inside listCountries of CommonServiceImpl");
		return this.commonDAO.listCountries();
	}
	
	@Transactional
	public List<CountryModel> listAllCountryDetails(){
		logger.info("Inside listCountries of CommonServiceImpl");
		List<Country> countryList = this.commonDAO.listCountries();
		List<CountryModel> countryModels = new ArrayList<CountryModel>();
		CountryModel countryModel;
		for(Country country : countryList) {
			countryModel =  new CountryModel();
			countryModel.setId(country.getId());
			countryModel.setCountryCode(country.getCountry2DigitCode());
			countryModel.setCountry3DigitCode(country.getCountry3DigitCode());
			countryModel.setCountry_name(country.getCountry_name());
			countryModel.setDialCode(country.getCountryIsdCode());
			countryModel.setCreatedBy(country.getCreatedBy());
			countryModel.setCreatedTime(country.getCreatedTime());
			countryModel.setRowStatus(country.getRowStatus());
			countryModel.setStates(country.getStates());
			countryModel.setUpdatedBy(country.getUpdatedBy());
			countryModel.setUpdatedTime(country.getUpdatedTime());
			countryModels.add(countryModel);
		}
		return countryModels;
	}
	
	@Transactional
	public List<String> getRelationshipList(String groupType)
	{
		logger.info("Start of getRelationshipList ()  in CommonServiceImpl");
		return this.commonDAO.getRelationshipList(groupType);
	}
	
	@Transactional
	public Map<String,String> getCommonValue(String groupType)
	{
		logger.info("Start of getRelationshipList ()  in CommonServiceImpl");
		return this.commonDAO.getCommomValue(groupType);
	}

	@Transactional
	public RegisterUserDetails getUserDetailsMorphed(long userId) {

		RegisterUserDetails userDetails = new RegisterUserDetails();

		logger.info("Start of getUserDetails ()  in CommonServiceImpl");
		User userExists = commonDAO.getUserExists(userId);
		if(userExists==null){
			userDetails.setErrMsg("Account has already been merged");
		}
		
		else{
		
		UserPersonalDetail userPersonalDetail = this.commonDAO
				.getUserDetail(userId);
		User user = this.commonDAO.getUser(userId);
		userDetails.setUserId(userPersonalDetail.getUserId());
		userDetails.setUserFirstName(userPersonalDetail.getUserFirstName());
		userDetails.setUserMiddleName(userPersonalDetail.getUserMiddleName());
		userDetails.setUserLastName(userPersonalDetail.getUserLastName());
		userDetails.setUserTitle(userPersonalDetail.getUserTitle());
		userDetails.setUserPhoneMobile(userPersonalDetail.getUserPhoneMobile());
		userDetails.setUserPhoneOther(userPersonalDetail.getUserPhoneOther());
		userDetails.setUserAddressLine1(userPersonalDetail
				.getUserAddressLine1());
		userDetails.setUserAddressLine2(userPersonalDetail
				.getUserAddressLine2());
		userDetails.setUserState(userPersonalDetail.getUserState());
		userDetails.setUserCountry(userPersonalDetail.getUserCountry());
		userDetails.setUserCity(userPersonalDetail.getUserCity());
		userDetails.setUserZipCode(userPersonalDetail.getUserZipCode());
		userDetails.setUserDob(userPersonalDetail.getUserDob());
		String DonorId;
		ResourceBundle resource = getResource();
		String disableLog="N";
		try {
		disableLog= resource.getString("dmsFlag");
		}
		catch(Exception e)
		{
			disableLog="N";
		}
		
		if(null==disableLog)
		{
			disableLog="N";
		}
		
		if(user.getIsDonor() != null && (user.getIsDonor().equalsIgnoreCase("Y") || user.getIsDonor().equalsIgnoreCase("SD") || user.getIsDonor().equalsIgnoreCase("TD") ||user.getIsDonor().equalsIgnoreCase("ID") || user.getIsDonor().equalsIgnoreCase("CD") || user.getIsDonor().equalsIgnoreCase("OD") )){
		if (user.getDonationOfferings().size() > 0) {
			for (DonationOffering donationOffObj : user.getDonationOfferings()) {
				if (donationOffObj.getDonorNewId() != null) {
					userDetails.setDonorId(donationOffObj.getDonorNewId());
				}
			}
		}
		if (user.getDonationOfferings().size() > 0) {
			for (DonationOffering donationOffObj : user.getDonationOfferings()) {
				if (donationOffObj.getDonationStatus().equalsIgnoreCase("Success")) {
					userDetails.setDonationFlag("Y");
					break;
				}else{
					userDetails.setDonationFlag("N");
				}
			}
		}
		}
		
		if(user.getUssesVvdOfferings().size() >0)
		 for(UssesVvdOffering ussesVvdOffering : user.getUssesVvdOfferings()){
			 if("Success".equalsIgnoreCase(ussesVvdOffering.getDonationStatus())){
				 if("USSES".equalsIgnoreCase(ussesVvdOffering.getSchemeName())){
					 userDetails.setUssesFlag(true);
				 }
				 if("VVD".equalsIgnoreCase(ussesVvdOffering.getSchemeName())){
					 userDetails.setVvdFlag(true);
				 }
			 }
		 }
		
		Calendar dob = Calendar.getInstance();

		if (userPersonalDetail.getUserDob() != null) {

			dob.setTime(userPersonalDetail.getUserDob());
			Calendar today = Calendar.getInstance();
			int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
			if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
				age--;
			} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
					&& today.get(Calendar.DAY_OF_MONTH) < dob
							.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
			userDetails.setAge(age);
		}

		userDetails.setUserEmail(user.getUserName());
		
		//Added country code
		if(user.getCountryCode()!=null){
		userDetails.setCountryCode(user.getCountryCode());}
		else{
			userDetails.setCountryCode("IN");
		}
		
//		//Added isd code
//		if(user.getIsdCode()!=null){
//		userDetails.setIsdCode(user.getIsdCode().longValue());}
//		else{
//			userDetails.setIsdCode(91);
//		}
		
		
		if (userPersonalDetail.getUserImage() != null ) {
			userDetails.setUserImageLocation(getProfileImagesFileServerLoc()
					.substring(getProfileImagesFileServerLoc().indexOf("images"))
					+ "/" + userPersonalDetail.getUserImage());
		}
		userDetails.setGender(userPersonalDetail.getUserGender());
		if (!(userPersonalDetail.getUserPannumber() == "")
				&& (userPersonalDetail.getUserPannumber() != null)) {
			userDetails.setUserPannumber(userPersonalDetail.getUserPannumber());
		}
		userDetails.setUserRationcardNumber(userPersonalDetail
				.getUserRationcardNumber());
		userDetails.setUserPassportNumber(userPersonalDetail
				.getUserPassportNumber());
		userDetails.setUserDrivinglicenseNumber(userPersonalDetail
				.getUserDrivinglicenseNumber());
		userDetails.setUserAadharNumber(userPersonalDetail
				.getUserAadharNumber());
		userDetails.setUserVoteridNumber(userPersonalDetail
				.getUserVoteridNumber());
		userDetails.setIsDonor(user.getIsDonor());
		
		if(userPersonalDetail.getUserCountry() != null){
			
			boolean check = true;
			try  
			  {  
			    Double.parseDouble(userPersonalDetail.getUserCountry());  
			  }  
			  catch(NumberFormatException nfe)  
			  {  
			   check = false;  
			  }  
			if(check){
				Country country = commonDAO.countryName(Integer.parseInt(userPersonalDetail.getUserCountry()));
				userDetails.setCountryName(country.getCountry_name());
				boolean stateCheck = true;
				
				if(userPersonalDetail.getUserState() != null){
					try  
					  {  
					    Double.parseDouble(userPersonalDetail.getUserState());  
					  }  
					  catch(NumberFormatException nfe)  
					  {  
						  stateCheck = false;  
					  }  
					
					userDetails.setStateName(stateCheck ? commonDAO.stateName(Integer.parseInt(userPersonalDetail.getUserState())).getState_name() : userPersonalDetail.getUserState());
				}
			}else{
				userDetails.setCountryName(userPersonalDetail.getUserCountry());
				userDetails.setStateName(userPersonalDetail.getUserState());
			}
		}
		}
		
		logger.info("End of getUserDetails () in CommonServiceImpl"
				+ userDetails);

		return userDetails;

	}

	@Transactional
	public List<UserHistory> getUserHistory(Long id) {
		logger.info("Start of getUserHistory (" + id + ") of CommonServiceImpl");
		return commonDAO.getUserHistory(id);
	}
	@Transactional
	public List<UserHistory> getUserHistoryHundi(long id,String hundiType) {
		logger.info("Start of getUserHistory (" + id + ") of CommonServiceImpl");
		return commonDAO.getUserHistoryHundi(id,hundiType);
	}
	
	@Transactional
	public List<UserHistory> getUserHistoryMobile(Long id) {
		logger.info("Start of getUserHistoryMobile (" + id + ") of CommonServiceImpl");
		return commonDAO.getUserHistoryMobile(id);
	}

	public String processSMS(String smsText, String phoneNumber) {
		logger.info("Start of processSMS (" + phoneNumber
				+ ") of CommonServiceImpl");
		return smsService.sendSMStoPiligrim(smsText, phoneNumber);
	}

	
	public String sendEmailtoPiligrim(SimpleMailMessage msg, String emailBody,
			String recieptName) {
		logger.info("Start of sendEmailtoPiligrim (" + msg.getTo()[0]
				+ ") of CommonServiceImpl");
		return ttdemailsender.send(msg, emailBody, recieptName);
	}
	
	@Async
	public String sendEmailtoPiligrimToAsync(final String emailTo,final String emailFrom, final String emailSubject, final String emailBody,
			final String recieptName) {
		logger.info("Start of sendEmailtoPiligrim (" + emailSubject
				+ ") of CommonServiceImpl");
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(emailTo);
		msg.setFrom(emailFrom);
		msg.setSubject(emailSubject);
		return ttdemailsender.send(msg,emailBody, recieptName);
	}

	public String sendEmailtoPiligrimAdmin(SimpleMailMessage msg,
			String emailBody, String recieptName) {
		logger.info("Start of sendEmailtoPiligrim (" + msg.getTo()[0]
				+ ") of CommonServiceImpl");
		return ttdemailsender.send(msg, emailBody, recieptName);
	}

	@Transactional
	public boolean changePassword(long userId, boolean isEmail, String password) {
		logger.info("Start of savePassword for user (" + userId
				+ ") of CommonServiceImpl");
		ResetPasswordInfo resetPasswordInfo;
		resetPasswordInfo = commonDAO.changePassword(userId, password.trim());

		if (resetPasswordInfo != null) {
			String emailBody = prepareEmailDetails(resetPasswordInfo, isEmail);
			mailSenderSimpleMessage.setTo(resetPasswordInfo.getUserEmail());
			mailSenderSimpleMessage.setSubject(getSubject());
			logger.info("Reset password email subject : "
					+ mailSenderSimpleMessage.getSubject());
			logger.info("Reset password email body : " + emailBody);
			//this.sendEmailtoPiligrim(mailSenderSimpleMessage, emailBody, null); commented as Emails are not getting triggered.
			return true;
		}

		return false;
	}

	private String prepareEmailDetails(ResetPasswordInfo resetPasswordInfo,
			boolean isEmail) {
		String emailBody;
		Map<String, Object> props = new HashMap<String, Object>();

		props.put("firstName", resetPasswordInfo.getUserFirstName());
		if (isEmail == true) {
			props.put("resetVia", resetPasswordInfo.getUserEmail());
		} else {
			props.put("resetVia", resetPasswordInfo.getUserPhoneMobile());
		}
		if(resetPasswordInfo.getUpdatedTime()!=null){
		props.put("updatedDate", resetPasswordInfo.getUpdatedTime()
				.toLocaleString());

		props.put("day", new SimpleDateFormat("EEEE").format(resetPasswordInfo
				.getUpdatedTime()));
		}
		else{
			logger.error("resetPasswordInfo.getUpdatedTime() is null");
		}
		emailBody = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,
				"/resetPasswordEmailBody.vm", "UTF-8", props);
		return emailBody;

	}

	@Transactional
	public Status login(String userName, String password) {
		logger.info("Start of login for user (" + userName
				+ ") of CommonServiceImpl");
		Status userStatus = commonDAO.login(userName, password);
		return userStatus;
	}

	@Transactional
	public ServiceNoteDetail getNotes(ServiceNoteDetail noteInfo) {
		logger.info("Start of getNotes for serviceType ("
				+ noteInfo.getServiceType() + ") of CommonServiceImpl");
		ServiceNoteDetail note = commonDAO.getNotes(noteInfo.getServiceType(),
				noteInfo.getRuleId());
		return note;
	}
	
	@Transactional
	public ServiceNoteDetail getNotesKM(ServiceNoteDetail noteInfo) {
		logger.info("Start of getNotes for serviceType ("
				+ noteInfo.getServiceType() + ") of CommonServiceImpl");
		ServiceNoteDetail note = commonDAO.getNotesKM(noteInfo.getServiceType(),
				noteInfo.getRuleId());
		return note;
	}

	@Transactional
	public List<MasterList> displayMasterList(long userId) {
		logger.info("Start of displayMasterList () in CommonServiceImpl");
		List<MasterList> masterList = commonDAO.displayMasterList(userId);
		logger.info("end of displayMasterList () in CommonServiceImpl");
		return masterList;
	}

	@Transactional
	public Boolean addMasterDetails(MasterDetails masterDetails) {
		logger.info("Start of addMasterDetails () of CommonServiceImpl");
		UsersFriendsAndFamily userFriendsAndFamily = new UsersFriendsAndFamily();
		ImagesStore imagesStore = new ImagesStore();
		Boolean isUserExists = false;
		int id = (int) masterDetails.getIdProofType();
		String idProofNumber = null;
		switch (id) {
		case 1011:
			idProofNumber = masterDetails.getUserPanNumber();
			break;
		case 1012:
			idProofNumber = masterDetails.getUserRationcardNumber();
			break;
		case 1013:
			idProofNumber = masterDetails.getUserPassportNumber();
			break;
		case 1014:
			idProofNumber = masterDetails.getUserDrivinglicenseNumber();
			break;
		case 1015:
			idProofNumber = masterDetails.getUserAadharNumber();
			break;
		case 1016:
			idProofNumber = masterDetails.getUserVoterIdNumber();
			break;
		default:
			break;
		}
		User user = commonDAO.getUser(masterDetails.getUserId());
		userFriendsAndFamily.setUser(user);
		List<UsersFriendsAndFamily> usersFriendsAndFamilyList = user
				.getUsersFriendsAndFamilies();
		logger.info("after getting usersFriendsAndFamilyList in ESevaServiceImpl ");
		for (UsersFriendsAndFamily obj : usersFriendsAndFamilyList) {

			if (idProofNumber.equalsIgnoreCase(obj
					.getFamilyPersonIdproofNumber())) {
				isUserExists = true;
				logger.info("User already exists in masterList of ESevaServiceImpl"
						+ isUserExists);
			}
		}
		if (isUserExists == false) {
			logger.info("Start of If Loop for new masterDetails in ESevaServiceImpl");
			CommonValueMaster commonValueMaster = new CommonValueMaster();
/*			userFriendsAndFamily.setFamilyPersonId(UniqueIDGenerator
					.generateUniqueId());*/
			userFriendsAndFamily.setFamilyPersonFirstName(masterDetails
					.getFirstName());
			userFriendsAndFamily.setFamilyPersonPhoneMobile(masterDetails
					.getMobile());
			userFriendsAndFamily.setFamilyPersonGender(masterDetails
					.getGender());
			userFriendsAndFamily.setFamilyPersonAge(masterDetails.getAge());
			userFriendsAndFamily.setFamilyPersonEmailid(masterDetails
					.getEmailId());
			userFriendsAndFamily.setFamilyPersonAddressLine1(masterDetails
					.getAddress());
			if (masterDetails.getUserImage() != null) {
				// imagesStore.setImage(masterDetails.getUserImage());
				userFriendsAndFamily.setImagesStore(imagesStore);
			}
			userFriendsAndFamily.setCommonValueMaster(commonDAO
					.getCommonValueMaster(masterDetails.getIdProofType()));
			userFriendsAndFamily.setFamilyPersonIdproofNumber(idProofNumber);
			logger.info("End of If Loop for new masterDetails in CommonServiceImpl");
			commonDAO.saveMasterDetails(userFriendsAndFamily);
		}
		logger.info("End of addMasterDetails () of ESevaServiceImpl"
				+ isUserExists);
		return isUserExists;

	}

	@Transactional
	public UserFriendsAndFamilyModel userInMasterList(long userId) {
		logger.info("Start of userInMAsterList () in CommonServiceImpl");
		UsersFriendsAndFamily usersFriendsAndFamily = commonDAO
				.userInMasterList(userId);
		UserFriendsAndFamilyModel userFriendsAndFamilyModel = new UserFriendsAndFamilyModel();
		userFriendsAndFamilyModel.setAddress(usersFriendsAndFamily
				.getFamilyPersonAddressLine1());
		userFriendsAndFamilyModel.setAge(usersFriendsAndFamily
				.getFamilyPersonAge().intValue());
		userFriendsAndFamilyModel.setEmailAddress(usersFriendsAndFamily
				.getFamilyPersonEmailid());
		userFriendsAndFamilyModel.setIdProofType(usersFriendsAndFamily
				.getCommonValueMaster().getValueName());
		userFriendsAndFamilyModel.setGender(usersFriendsAndFamily
				.getFamilyPersonGender());
		userFriendsAndFamilyModel.setIdCardNum(usersFriendsAndFamily
				.getFamilyPersonIdproofNumber());
		userFriendsAndFamilyModel.setMobileNumber(usersFriendsAndFamily
				.getFamilyPersonPhoneMobile());
		userFriendsAndFamilyModel.setName(usersFriendsAndFamily
				.getFamilyPersonFirstName());
		if (usersFriendsAndFamily.getImagesStore() != null) {
			// userFriendsAndFamilyModel.setImage(usersFriendsAndFamily.getImagesStore().getImage());
		}
		logger.info("End of userInMAsterList () in CommonServiceImpl");
		return userFriendsAndFamilyModel;
	}

	@Transactional
	public List<ChannelDetails> allChannelDetails() {

		List<ChannelDetails> channelDetailsList = new ArrayList<ChannelDetails>();

		List<Object[]> list = commonDAO.allChannelDetails();

		for (Object[] obj : list) {
			ChannelDetails channelDetails = new ChannelDetails();

			channelDetails
					.setChannelTypeId(Integer.parseInt(obj[0].toString()));
			channelDetails.setChannelName(obj[1].toString());
			channelDetails.setChannelDescription(obj[2].toString());

			channelDetailsList.add(channelDetails);
		}

		return channelDetailsList;

	}

	@Transactional
	public HashMap<Long, String> serviceTypeIds() {

		List<ServiceTypeMaster> list = commonDAO.serviceTypeIds();
		HashMap<Long, String> hm = new HashMap<Long, String>();

		for (ServiceTypeMaster serviceTypeMaster : list) {
			hm.put(serviceTypeMaster.getServiceTypeId(),
					serviceTypeMaster.getServiceTypeName());
		}
		return hm;
	}

	@Transactional
	public HashMap<Long, String> requestTypeIds(long serviceTypeId) {

		List<RequestTypeMaster> list = commonDAO.requestTypeIds(serviceTypeId);
		HashMap<Long, String> hm = new HashMap<Long, String>();

		for (RequestTypeMaster requestTypeMaster : list) {
			hm.put(requestTypeMaster.getRequestTypeId(),
					requestTypeMaster.getRequestTypeName());
		}
		return hm;
	}

	@Transactional
	public PasswordStatus passwordChange(NewStatus newStatus) {
		logger.info("Start of passwordChange for user ("
				+ newStatus.getUserId() + ") of CommonServiceImpl");
		PasswordStatus passwordStatus = new PasswordStatus();
		String currentPassword = CommonUtility.encryptPassword(newStatus
				.getCurrentPassword());
		User user = commonDAO.getUser(newStatus.getUserId());
		passwordStatus.setUserId(user.getUserId());
		String passwordFrmDb = user.getUserPassword();
		if (currentPassword.equals(passwordFrmDb)) {
			ResetPasswordInfo resetPasswordInfo;
			resetPasswordInfo = commonDAO.changePassword(newStatus.getUserId(),
					newStatus.getNewPassword().trim());

			if (resetPasswordInfo != null) {
				String emailBody = prepareEmailDetails(resetPasswordInfo, true);
				mailSenderSimpleMessage.setTo(resetPasswordInfo.getUserEmail());
				mailSenderSimpleMessage.setSubject(getSubject());
				logger.info("Reset password email subject : "
						+ mailSenderSimpleMessage.getSubject());
				logger.info("Reset password email body : " + emailBody);
				this.sendEmailtoPiligrim(mailSenderSimpleMessage, emailBody,
						null);
				passwordStatus.setPasswordStatus("passwordChanged");
				
				TempUserPwd tmp =	commonDAO.getTempUserPwd(user.getUserId());
				if(tmp != null)
				{
					tmp.setUserPass(newStatus.getNewPassword());
					tmp.setUser(user);
					ArrayList<TempUserPwd> tempUserPwds = new ArrayList<TempUserPwd>();
					tempUserPwds.add(tmp);
					user.setTempUserPwds(tempUserPwds);
				}
				else{
				TempUserPwd tempUserPwd = new TempUserPwd();
				tempUserPwd.setUserPass(newStatus.getNewPassword());
				tempUserPwd.setUser(user);
				ArrayList<TempUserPwd> tempUserPwds = new ArrayList<TempUserPwd>();
				tempUserPwds.add(tempUserPwd);
				user.setTempUserPwds(tempUserPwds);
				}
				commonDAO.updateUser(user);
				
			} else {
				passwordStatus.setPasswordStatus("password not Changed");
			}
		} else {
			passwordStatus.setPasswordStatus("wrong current password");
		}
		return passwordStatus;
	}
	
	public Properties sevaList() {
		
		Resource resource = new ClassPathResource("/seva.properties");
		Properties props = null;
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.info("********************"+props);
		
		return props;
		
	}
	
public String getSevaNameByCode(String sevaCode) {
		
		Resource resource = new ClassPathResource("/seva.properties");
		Properties props = null;
		try {
			props = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("******************"+sevaCode);
		logger.info("********************"+props);
		
		return  props.getProperty(sevaCode, "defaultValue");
		
	}

	@Transactional
	public Boolean saveSessionInfo(String offeringId, String sessionValue) {
			logger.info("Start of saveSessionInfo saveSessionInfo () in CommonServiceImpl");
			SessionInfo sessionInfo = new SessionInfo();
			sessionInfo.setOfferingId(offeringId);
			if(sessionValue.contains("::")){
			sessionValue = sessionValue.replace("::", "/");
			}
			sessionInfo.setSessionValue(sessionValue);
			logger.info("end of saveSessionInfo () in CommonServiceImpl: offeringId"+offeringId);
			logger.info("end of saveSessionInfo () in CommonServiceImpl: sessionValue"+sessionValue);
			boolean retValue = commonDAO.saveSessionInfo(sessionInfo);
			logger.info("end of saveSessionInfo () in CommonServiceImpl");
		return retValue;
	}
	
	@Transactional
	public String getSessionInfoValue(String offeringId) {
			logger.info("Start of saveSessionInfo saveSessionInfo () in CommonServiceImpl");
			SessionInfo retValue = commonDAO.getSessionInfo(offeringId);
			logger.info("end of saveSessionInfo () in CommonServiceImpl");
			return  retValue.getSessionValue();		
	}

	@Transactional
	public GlobalPropertiesResponse getGlobalProperties (GlobalProperties globalProperties) {
		
		GlobalPropertiesResponse globalPropertiesResponse = new GlobalPropertiesResponse();
		logger.info("Start of globalProperties() service  in CommomServiceImpl");

		globalPropertiesResponse=commonDAO.getGlobalProperties(globalProperties);
		
		return globalPropertiesResponse;
	}
	
	@Transactional
	public boolean saveDonorInfo(DonorInfoModel donorInfoModel){
		
		DonorSelfService donorInfo = new DonorSelfService();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			if(donorInfoModel.getDateOfBirth() != null){
			date = sdf.parse(donorInfoModel.getDateOfBirth());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		donorInfo.setDateOfBirth(date);
		donorInfo.setDonorAadharCard(donorInfoModel.getDonorAadharCard());
		donorInfo.setDonorEmail(donorInfoModel.getDonorEmail());
		donorInfo.setDonorId(donorInfoModel.getDonorId());
		donorInfo.setDonorMobileNo(donorInfoModel.getDonorMobileNo());
		donorInfo.setDonorName(donorInfoModel.getDonorName());
		donorInfo.setDonorPancardNo(donorInfoModel.getDonorPancardNo());
		donorInfo.setEntityRegNo(donorInfoModel.getEntityRegNo());
		donorInfo.setRemarks(donorInfoModel.getRemarks());
		donorInfo.setTrustId(donorInfoModel.getTrustId());
		donorInfo.setTrustName(donorInfoModel.getTrustName());
		donorInfo.setDonorPassbookNo(donorInfoModel.getDonorPassbookNo());
		
		return commonDAO.saveDonorInfo(donorInfo) != 0 ? true : false ;
	}
	
	@Transactional
	public ServiceAndRequestTypeIdsModel serviceAndRequestTypeIds(){
		
		HashMap<Long, String> serviceTypeids = serviceTypeIds();
		
		ServiceAndRequestTypeIdsModel serviceAndRequestTypeIdsModel = new ServiceAndRequestTypeIdsModel();
		
		serviceAndRequestTypeIdsModel.setServiceTypeIds(serviceTypeids);
		
		HashMap<Long, HashMap<Long, String>> requestTypeIds = new HashMap<Long, HashMap<Long,String>>();
		HashMap<Long, HashMap<String, String>> serviceNotes = new HashMap<Long, HashMap<String,String>>();
		
		Iterator<Map.Entry<Long, String>> it = serviceTypeids.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<Long, String> pair = it.next(); 
		    HashMap<Long, String> reqids = new HashMap<Long, String>();
		    for(RequestTypeMaster requesttypeMaster : commonDAO.reqTypeIds()){
		    	if(requesttypeMaster.getServiceTypeMaster().getServiceTypeId() == pair.getKey()){
		    		reqids.put(requesttypeMaster.getRequestTypeId(), requesttypeMaster.getRequestTypeName());
		    		requestTypeIds.put(pair.getKey(), reqids) ;
		    	}
		    }
		    HashMap<String, String> notes = new HashMap<String, String>();
		    for(Object[] obj : commonDAO.serviceNotes()){
		    	
		    	if(Long.parseLong(obj[0].toString()) == pair.getKey()){
		    		notes.put(obj[4].toString(), obj[2].toString());
		    		serviceNotes.put(pair.getKey(), notes);
		    	}
		    }
		    
		}
		serviceAndRequestTypeIdsModel.setRequestTypeIds(requestTypeIds);
		serviceAndRequestTypeIdsModel.setServiceNotes(serviceNotes);
		
		return serviceAndRequestTypeIdsModel;
		
	}
	
	@Transactional
	public  PGDetails getPGDetails(String offeringId,String modName){
		return commonDAO.getPGDetails(offeringId, modName);
	}

	@Transactional
	public User getUserDetails(String userName) {
		return commonDAO.getUserDetails(userName);
	}

	@Transactional
	public Boolean checkIfDip(String offeringId) {
		return commonDAO.checkIfDipSeva(offeringId);
	}
	
	@Transactional
	public void increaseLangCount(String language){
		logger.info("Start of increaseLangCount () in CommonServiceImpl");
		LanguageWatcher languageWatcher;
		Date today = new Date();
		String dateStr = CommonUtility.formatDateNew(today);
		Date newDate = CommonUtility.stringToDateFormaterNew(dateStr);
		languageWatcher = commonDAO.getExistingLangWatcher(newDate, language);
		if(languageWatcher != null){
			languageWatcher.setWatcherCount(languageWatcher.getWatcherCount()+1);
		}
		else{
			languageWatcher = new LanguageWatcher();
			languageWatcher.setLanguageName(language);
			languageWatcher.setWatcherDate(newDate);
			languageWatcher.setWatcherCount(1L);
		}
		commonDAO.saveOrUpdateLangWatcher(languageWatcher);
		logger.info("End of increaseLangCount () in CommonServiceImpl");
	}
	
	@Transactional
	public List<State> getstates() {		
		return  commonDAO.getstates();
	}
	
	@Transactional
	public List<String> geteCounterNames() {
		return commonDAO.eCounterNames();
	}
	@Transactional
	public Banks banksListMob(String serviceName) {
		// TODO Auto-generated method stub
		
		  GlobalProperties globalpropertice = new GlobalProperties();
		  globalpropertice.setGroupName("PGs Enabled");
		  globalpropertice.setPropertyName(serviceName); String
		  pgsEnabled=getGlobalProperties(globalpropertice).
		  getPropertyValue();
		 
		
		return commonDAO.getBanksListMob(pgsEnabled);
		
		
		
		
	}

	@Transactional
	public RegisterUserDetails getUserDetails(long userId) {

		RegisterUserDetails userDetails = new RegisterUserDetails();

		logger.info("Start of getUserDetails ()  in CommonServiceImpl");
		User userExists = commonDAO.getUserExists(userId);
		if(userExists==null){
			userDetails.setErrMsg("Account has already been merged");
		}
		
		else{
		
		UserPersonalDetail userPersonalDetail = this.commonDAO
				.getUserDetail(userId);
		User user = this.commonDAO.getUser(userId);
		userDetails.setUserId(userPersonalDetail.getUserId());
		userDetails.setUserFirstName(userPersonalDetail.getUserFirstName());
		userDetails.setUserMiddleName(userPersonalDetail.getUserMiddleName());
		userDetails.setUserLastName(userPersonalDetail.getUserLastName());
		userDetails.setUserTitle(userPersonalDetail.getUserTitle());
		userDetails.setUserPhoneMobile(userPersonalDetail.getUserPhoneMobile());
		userDetails.setUserPhoneOther(userPersonalDetail.getUserPhoneOther());
		userDetails.setUserAddressLine1(userPersonalDetail
				.getUserAddressLine1());
		userDetails.setUserAddressLine2(userPersonalDetail
				.getUserAddressLine2());
		userDetails.setUserState(userPersonalDetail.getUserState());
		userDetails.setUserCountry(userPersonalDetail.getUserCountry());
		userDetails.setUserCity(userPersonalDetail.getUserCity());
		userDetails.setUserZipCode(userPersonalDetail.getUserZipCode());
		userDetails.setUserDob(userPersonalDetail.getUserDob());
		String DonorId;
		ResourceBundle resource = getResource();
		String disableLog="N";
		try {
		disableLog= resource.getString("dmsFlag");
		}
		catch(Exception e)
		{
			disableLog="N";
		}
		
		if(null==disableLog)
		{
			disableLog="N";
		}
		
		
		 if(user.getIsDonor() != null && (user.getIsDonor().equalsIgnoreCase("Y") ||
		 user.getIsDonor().equalsIgnoreCase("SD") ||
		 user.getIsDonor().equalsIgnoreCase("TD")
		  ||user.getIsDonor().equalsIgnoreCase("ID") ||
		  user.getIsDonor().equalsIgnoreCase("CD") ||
		  user.getIsDonor().equalsIgnoreCase("OD") )){ if
		  (user.getDonationOfferings().size() > 0) { for (DonationOffering
		  donationOffObj : user.getDonationOfferings()) { if
		  (donationOffObj.getDonorNewId() != null) {
		  userDetails.setDonorId(donationOffObj.getDonorNewId()); } } } if
		 (user.getDonationOfferings().size() > 0) { for (DonationOffering
		 donationOffObj : user.getDonationOfferings()) { if
		(donationOffObj.getDonationStatus().equalsIgnoreCase("Success")) {
		 userDetails.setDonationFlag("Y"); break; }else{
		  userDetails.setDonationFlag("N"); } } } }
		 
		
		if(user.getUssesVvdOfferings().size() >0)
		 for(UssesVvdOffering ussesVvdOffering : user.getUssesVvdOfferings()){
			 if("Success".equalsIgnoreCase(ussesVvdOffering.getDonationStatus())){
				 if("USSES".equalsIgnoreCase(ussesVvdOffering.getSchemeName())){
					 userDetails.setUssesFlag(true);
				 }
				 if("VVD".equalsIgnoreCase(ussesVvdOffering.getSchemeName())){
					 userDetails.setVvdFlag(true);
				 }
			 }
		 }
		
		Calendar dob = Calendar.getInstance();

		if (userPersonalDetail.getUserDob() != null) {

			dob.setTime(userPersonalDetail.getUserDob());
			Calendar today = Calendar.getInstance();
			int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
			if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
				age--;
			} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
					&& today.get(Calendar.DAY_OF_MONTH) < dob
							.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
			userDetails.setAge(age);
		}

		userDetails.setUserEmail(user.getUserName());
		
		//Added country code
		if(user.getCountryCode()!=null){
		userDetails.setCountryCode(user.getCountryCode());}
		else{
			userDetails.setCountryCode("IN");
		}
		
//		//Added isd code
//		if(user.getIsdCode()!=null){
//		userDetails.setIsdCode(user.getIsdCode().longValue());}
//		else{
//			userDetails.setIsdCode(91);
//		}
		
		
		if (userPersonalDetail.getUserImage() != null ) {
			userDetails.setUserImageLocation(getProfileImagesFileServerLoc()
					.substring(getProfileImagesFileServerLoc().indexOf("images"))
					+ "/" + userPersonalDetail.getUserImage());
		}
		userDetails.setGender(userPersonalDetail.getUserGender());
		if (!(userPersonalDetail.getUserPannumber() == "")
				&& (userPersonalDetail.getUserPannumber() != null)) {
			userDetails.setUserPannumber(userPersonalDetail.getUserPannumber());
		}
		userDetails.setUserRationcardNumber(userPersonalDetail
				.getUserRationcardNumber());
		userDetails.setUserPassportNumber(userPersonalDetail
				.getUserPassportNumber());
		userDetails.setUserDrivinglicenseNumber(userPersonalDetail
				.getUserDrivinglicenseNumber());
		userDetails.setUserAadharNumber(userPersonalDetail
				.getUserAadharNumber());
		userDetails.setUserVoteridNumber(userPersonalDetail
				.getUserVoteridNumber());
		userDetails.setIsDonor(user.getIsDonor());
		
		if(userPersonalDetail.getUserCountry() != null){
			
			boolean check = true;
			try  
			  {  
			    Double.parseDouble(userPersonalDetail.getUserCountry());  
			  }  
			  catch(NumberFormatException nfe)  
			  {  
			   check = false;  
			  }  
			if(check){
				Country country = commonDAO.countryName(Integer.parseInt(userPersonalDetail.getUserCountry()));
				userDetails.setCountryName(country.getCountry_name());
				boolean stateCheck = true;
				
				if(userPersonalDetail.getUserState() != null){
					try  
					  {  
					    Double.parseDouble(userPersonalDetail.getUserState());  
					  }  
					  catch(NumberFormatException nfe)  
					  {  
						  stateCheck = false;  
					  }  
					
					userDetails.setStateName(stateCheck ? commonDAO.stateName(Integer.parseInt(userPersonalDetail.getUserState())).getState_name() : userPersonalDetail.getUserState());
				}
			}else{
				userDetails.setCountryName(userPersonalDetail.getUserCountry());
				userDetails.setStateName(userPersonalDetail.getUserState());
			}
		}
		}
		
		logger.info("End of getUserDetails () in CommonServiceImpl"
				+ userDetails);

		return userDetails;

	}
@Transactional
	public boolean saveUserMobileInfo(MobileAppInfo mobileAppInfo) {
		String result=null;
		boolean flag=false;
		MobileAppData mobileObj=new MobileAppData();
		mobileObj.setUserId(mobileAppInfo.getUserId());
		mobileObj.setDeviceToken(mobileAppInfo.getDeviceToken());
		mobileObj.setOsType(mobileAppInfo.getOsType());
		mobileObj.setCreatedTime(new Date());
		mobileObj.setCreatedBy(mobileAppInfo.getUserId());
		result= commonDAO.saveUserMobileInfo(mobileObj);
		if(result!=null)
		{
			flag=true;
		}
		return flag;
	}



@Transactional
public RegisterUserDetails getUserDetailsForMvtac(String userEmail) {

	RegisterUserDetails userDetails = new RegisterUserDetails();

	logger.info("Start of getUserDetailsForMvtac ()  in CommonServiceImpl");
	User userInfo=null;
	UserPersonalDetail userPersonalInfo=null;
//	long userId=commonDAO.getUserId(userEmail);
	if(userEmail!=null)
		userInfo=commonDAO.loadUserMvtac(userEmail);
	
	if(userInfo==null)
		userDetails.setErrMsg("No user is found for the given input E-mail Id");
	else {
		userPersonalInfo=userInfo.getUserPersonalDetail();
		
		userDetails.setUserFirstName(userPersonalInfo.getUserFirstName());
		userDetails.setUserLastName(userPersonalInfo.getUserLastName());
		userDetails.setUserEmail(userPersonalInfo.getUserEmail());
		userDetails.setUserId(userPersonalInfo.getUserId());
		userDetails.setUserPhoneMobile(userPersonalInfo.getUserPhoneMobile());
		userDetails.setUserAddressLine1(userPersonalInfo.getUserAddressLine1());
		userDetails.setUserAddressLine2(userPersonalInfo.getUserAddressLine2());
		userDetails.setUserCity(userPersonalInfo.getUserCity());
		userDetails.setGender(userPersonalInfo.getUserGender());
		userDetails.setCountryCode((userPersonalInfo.getUserCountry()));
		userDetails.setStateName(userPersonalInfo.getUserState());
		userDetails.setUserZipCode(userPersonalInfo.getUserZipCode());
		
	}
	

	
	
	logger.info("End of getUserDetails () in CommonServiceImpl"
			+ userDetails);

	return userDetails;

}
//New Service

@Transactional
public List<HashMap<String,String>> getUpcomingBookings (long userid)
{
	List<HashMap<String,String>> lmap=new ArrayList<HashMap<String,String>>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	List<Object[]> list=commonDAO.upcomingBookings(userid);
	User user = this.commonDAO.getUser(userid);
	if(list.size()!=0 && list!=null)
	{
	logger.error("list size:"+list.size());
	for (Object[] obj:list)
		{
		Date serviceDate=(Date) obj[1];
		Date newDate=CommonUtility.ConvertDate(serviceDate);
		Date currentdate=CommonUtility.ConvertDate(new Date());
		logger.info("new date"+newDate); 
		logger.info("sys date "+currentdate);
		
		if(newDate.compareTo(currentdate)==0)
		{
			HashMap<String,String> hmap=new HashMap<String,String>();
			hmap.put("BookingID",obj[0].toString());
			hmap.put("Date",(sdf.format(obj[1])).toString());
			hmap.put("Slot",obj[2].toString());
			hmap.put("ServiceID",obj[3].toString());
			hmap.put("Service", obj[4].toString());
			String result=obj[5].toString();
			if(result.equalsIgnoreCase("NA"))
			{
			hmap.put("isEligibleforAccom", "NA");
			}
		   else if(result.equalsIgnoreCase("No booking") )
			{
				hmap.put("isEligibleforAccom", "false");
			}
		else
		{
			
			if(user.getAccomBookings().size()>0)
			{
				for(AccomBooking ab:user.getAccomBookings())
					if(result.equalsIgnoreCase(ab.getAccomBookingId()))
						if("Success".equalsIgnoreCase(ab.getBookingStatus()))
							{
							hmap.put("isEligibleforAccom", "false");
							}
						else
						{
							hmap.put("isEligibleforAccom", "false");
						}
						
			}
		}
			lmap.add(hmap);
		}
		else 
		{
			HashMap<String,String> hmap=new HashMap<String,String>();
			hmap.put("BookingID",obj[0].toString());
			hmap.put("Date",(sdf.format(obj[1])).toString());
			hmap.put("Slot",obj[2].toString());
			hmap.put("ServiceID",obj[3].toString());
			hmap.put("Service", obj[4].toString());
			String result=obj[5].toString();
			if(result.equalsIgnoreCase("NA"))
				{
				hmap.put("isEligibleforAccom", "NA");
				}
			else if(result.equalsIgnoreCase("No booking") )
				{
					hmap.put("isEligibleforAccom", "true");
				}
			else
				{
				
				if(user.getAccomBookings().size()>0)
				{
					for(AccomBooking ab:user.getAccomBookings())
						if(result.equalsIgnoreCase(ab.getAccomBookingId()))
							if("Success".equalsIgnoreCase(ab.getBookingStatus()))
								{
								hmap.put("isEligibleforAccom", "false");
								}
							else
							{
								hmap.put("isEligibleforAccom", "true");
							}
							
				}
			}
			lmap.add(hmap);
		}
		}
	}
		logger.error("End in getUpcomingBookings() in CommonServiceImpl ");
	
	return lmap;
}

	

}

