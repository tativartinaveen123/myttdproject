package com.ttd.common.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ttd.common.entity.State;
import com.ttd.common.model.ActiveEnvironment;
import com.ttd.common.model.Banks;
import com.ttd.common.model.ChannelDetails;
import com.ttd.common.model.Countries;
import com.ttd.common.model.CountryDetails;
import com.ttd.common.model.Currencies;
import com.ttd.common.model.DonorInfoModel;
import com.ttd.common.model.GlobalProperties;
import com.ttd.common.model.GlobalPropertiesResponse;
import com.ttd.common.model.Login;
import com.ttd.common.model.MasterDetails;
import com.ttd.common.model.MasterList;
import com.ttd.common.model.MobileAppInfo;
import com.ttd.common.model.NewStatus;
import com.ttd.common.model.PGDetails;
import com.ttd.common.model.PasswordStatus;
import com.ttd.common.model.RegisterUserDetails;
import com.ttd.common.model.ServiceNoteDetail;
import com.ttd.common.model.Status;
import com.ttd.common.model.UserFriendsAndFamilyModel;
import com.ttd.common.model.UserHistoryList;
import com.ttd.common.model.ServiceAndRequestTypeIdsModel;
import com.ttd.common.security.model.UserInformation;
import com.ttd.common.service.CommonService;
import com.ttd.common.util.ValidateCaptcha;

//Bank details controller
@RestController

@RequestMapping(value = {"/common/","/mob/v1/common"})
public class CommonController {
	Logger logger = Logger.getLogger(CommonController.class);

	@Autowired
	private CommonService commonService;

	// method to retrieve the bank details
	@RequestMapping(value = "/banks", method = RequestMethod.GET)
	
	public Banks getBankDetails() {
		logger.info("Start of getBankDetails ()  in CommonController");
		Banks bankList = new Banks();
		try {
		bankList.setBankList(commonService.getBankDetails());
		logger.info("End of getBankDetails () in CommonController" + bankList);
		return bankList;
		}
		catch(Exception e)
		{
			logger.error("Error of getBankDetails () in CommonController" + e.getMessage());
		}
		return bankList;
	}
	
	@RequestMapping(value = "/hundiBanks", method = RequestMethod.GET)
	
	public Banks getHundiBankDetails() {
		logger.info("Start of getBankDetails ()  in CommonController");
		Banks bankList = new Banks();
		try {
		bankList.setBankList(commonService.getHundiBankDetails());
		logger.info("End of getBankDetails () in CommonController" + bankList);
		return bankList;
		}
		catch(Exception e)
		{
			logger.error("Error of getBankDetails () in CommonController" + e.getMessage());
		}
		return bankList;
	}

	@RequestMapping(value = "/currency", method = RequestMethod.GET)
	
	public Currencies getCurrencyDetails() {
		
		logger.info("Start of getCurrencyDetails ()  in CommonController");
		Currencies currenciesList = new Currencies();
		try {
		currenciesList.setCurrencyList(commonService.getCurrencyDetails());
		logger.info("End of getCurrencyDetails () in CommonController"
				+ currenciesList);
		return currenciesList;
		}
		catch(Exception e)
		{
			logger.error("Error of getCurrencyDetails () in CommonController"+e.getMessage());
		}
		return currenciesList;
	}

	@RequestMapping(value = "/countriesAndStates", method = RequestMethod.GET)
	
	public Countries getCountriesAndStates() {
		
		logger.info("Start of getCountriesAndStates ()  in CommonController");
		Countries countries = new Countries();
		try {
		countries.setCountries(this.commonService.listCountries());
		logger.info("End of getCountriesAndStates () in CommonController"
				+ countries);
		return countries;
		}
		catch(Exception e)
		{
			logger.error("End of getCountriesAndStates () in CommonController"+e.getMessage());
		}
		return countries;
	 }
	
	@RequestMapping(value = "/getAllCountryDetails", method = RequestMethod.GET)
	
	public CountryDetails getAllCountryDetails() {
		logger.info("Start of getAllCountryDetails ()  in CommonController");
		CountryDetails countries = new CountryDetails();
		try {
		countries.setCountries(this.commonService.listAllCountryDetails());
		logger.info("End of getAllCountryDetails () in CommonController"
				+ countries);
		return countries;
		}
		catch(Exception e)
		{
			logger.error("Error of getAllCountryDetails () in CommonController"+e.getMessage());
		}
		return countries;
	 }
	
	
	@RequestMapping(value = "/getRelationship/{groupType}", method = RequestMethod.POST)
	public List<String> getRelationshipList(@PathVariable String groupType) {
		try {
		logger.info("Start of getCommonValueMasterList()  in CommonController");
		
		logger.info("End of getCommonValueMasterList () in CommonController"
				);
		return this.commonService.getRelationshipList(groupType);
		}
		catch(Exception e)
		{
			logger.error("End of getCommonValueMasterList () in CommonController"+e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(value = "/getCommonValue/{groupType}", method = RequestMethod.POST)
	public Map<String,String> getCommonValue(@PathVariable String groupType) {
		try {
		logger.info("Start of getCommonValueMasterList()  in CommonController");
		
		logger.info("End of getCommonValueMasterList () in CommonController");
		
		return this.commonService.getCommonValue(groupType);
		}
		catch(Exception e)
		{
			logger.error("End of getCommonValueMasterList () in CommonController"+e.getMessage());
		}
		return null;
	}
	
	/*
	 * SR034270
	 */

	@RequestMapping(value = {"/getUserDetail/{userId}","/user/detail/{userId}"}, method = RequestMethod.POST)
	public RegisterUserDetails getUserDetails(@PathVariable String userId) {
		logger.info("Start of getUserDetails ()  in CommonController");
		RegisterUserDetails userDetails = new RegisterUserDetails();
		try {
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		if (getUserId() == Long.parseLong(userId)) {
			userDetails = this.commonService.getUserDetails(Long.parseLong(userId));
		}
		}
		return userDetails;
		}
		catch(Exception e)
		{
			logger.error("Start of getUserDetails ()  in CommonController"+e.getMessage());
		}
		return userDetails;
	}
	
	@RequestMapping(value = {"/getUserDetailM/{userId}","/user/detailM/{userId}"}, method = RequestMethod.POST)
	public RegisterUserDetails getUserDetailsM(@PathVariable String userId) {
		logger.info("Start of getUserDetails ()  in CommonController");
		RegisterUserDetails userDetails = new RegisterUserDetails();
		try {
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		if (getUserId() == Long.parseLong(userId)) {
			userDetails = this.commonService.getUserDetailsMorphed(Long.parseLong(userId));
		}
		}
		return userDetails;
		}
		catch(Exception e)
		{
			logger.error("Start of getUserDetails ()  in CommonController"+e.getMessage());
		}
		return userDetails;
	}

	@RequestMapping(value = {"/userHistory/{userId}", "hundihistory/{userId:[\\d]+}"}, method = RequestMethod.GET)
	public UserHistoryList getUserHistory(@PathVariable String userId) {
		logger.info("Start of getUserHistory ()  in CommonController");
		UserHistoryList userHistoryList = new UserHistoryList();
		try {
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		if (getUserId() == Long.parseLong(userId)) {
			userHistoryList.setUserHistoryList(commonService
					.getUserHistory(Long.parseLong(userId)));
		}
		}
		logger.info("End of getUserHistory () in CommonController"
				+ userHistoryList);
		return userHistoryList;
		}
		catch(Exception e)
		{
			logger.error("End of getUserHistory () in CommonController"+e.getMessage());
		}
		return userHistoryList;
	}
	
	/*@RequestMapping(value = {"/userHistory/{userId}/{hundiType}", "hundihistory/{userId:[\\d]+}"}, method = RequestMethod.GET)
	public UserHistoryList getUserHistory(@PathVariable String userId,@PathVariable String hundiType) {
		logger.info("Start of getUserHistory ()  in CommonController");
		UserHistoryList userHistoryList = new UserHistoryList();
		//try {
		logger.info("userId "+userId);
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		if (getUserId() == Long.parseLong(userId)) {
			userHistoryList.setUserHistoryList(commonService
					.getUserHistoryHundi(Long.parseLong(userId),hundiType));
		}
		}
		logger.info("End of getUserHistory () in CommonController"
				+ userHistoryList);
		return userHistoryList;
		/*}
		catch(Exception e)
		{
			logger.error("End of getUserHistory () in CommonController"+e.getMessage());
		}
		return userHistoryList;
	}*/

	/*
	 * SR034270
	 */
	@RequestMapping(value = {"/userHistoryMobile/{userId}", "hundihistoryMobile/{userId:[\\d]+}"}, method = RequestMethod.GET)
	public UserHistoryList getUserHistoryMobile(@PathVariable String userId) {
		logger.info("Start of getUserHistoryMobile ()  in CommonController");
		UserHistoryList userHistoryList = new UserHistoryList();
		try {
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		if (getUserId() == Long.parseLong(userId)) {
			userHistoryList.setUserHistoryList(commonService
					.getUserHistoryMobile(Long.parseLong(userId)));
		}
		}
		logger.info("End of getUserHistoryMobile () in CommonController"
				+ userHistoryList);
		return userHistoryList;
		}
		catch(Exception e)
		{
			logger.error("End of getUserHistoryMobile () in CommonController"+e.getMessage());
		}
		return userHistoryList;
	}
	/*
	 * @RequestMapping(value = "/changePassword/{userId}/{isEmail}", method =
	 * RequestMethod.POST) public boolean changePassword(@PathVariable("userId")
	 * long userId,@PathVariable("isEmail") boolean isEmail,@RequestBody
	 * Password password) {
	 * logger.info("Start of getDonationHistory ()  in CommonController");
	 * boolean passwordChanged = commonService.changePassword(userId, isEmail,
	 * password.getPassword()); return passwordChanged; }
	 */
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public boolean changePassword(@RequestBody Status status) {
		try 
		{
		logger.info("Start of changePassword ()  in CommonController");
		boolean passwordChanged = commonService.changePassword(
				status.getUserId(), status.getIsEmail(), status.getPassword());
		return passwordChanged;
		}
		catch(Exception e)
		{
			logger.error("Error of changePassword ()  in CommonController"+e.getMessage());
		}
		return false;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Status login(@RequestBody Login login)
			throws java.net.URISyntaxException,
			org.json.simple.parser.ParseException {
		logger.info("Start of login ()  in CommonController");
       try {
		ValidateCaptcha captchValid = new ValidateCaptcha();
		String captchaRes = login.getCaptchaResponse();
		if (captchaRes != null && !captchaRes.equalsIgnoreCase("undefined")
				&& !captchaRes.equals("")) {
			boolean captchStatus = captchValid.validateInputCaptcha(captchaRes);
			if (!captchStatus) {
				return new Status();
			}
		}

		String userName = login.getUserName();
		String password = login.getUserPassword();
		Status userStatus = commonService.login(userName, password);
		return userStatus;
       }
       catch(Exception e)
       {
    	   logger.error("Error of login ()  in CommonController"+e.getMessage());  
       }
       return null;
	}

	@RequestMapping(value = "/getNotes", method = RequestMethod.POST)
	public ServiceNoteDetail getNotes(@RequestBody ServiceNoteDetail noteInfo) {
		try {
		logger.info("Start of getNotes ()  in CommonController");
		ServiceNoteDetail note = commonService.getNotes(noteInfo);
		return note;
		}
		catch(Exception e)
		{
			logger.error("Error of getNotes ()  in CommonController"+e.getMessage());
		}
		return null;
	}

	/*
	 * SR034270
	 */
	@RequestMapping(value = "/displayMasterList/{userId}", method = RequestMethod.POST)
	public List<MasterList> displayMasterList(@PathVariable String userId) {
		
	 logger.info("Start of displayMasterList ()  in CommonController");
	 List<MasterList> masterList= new ArrayList<MasterList>();
	 try {
	 if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
	 {
		masterList = commonService.displayMasterList(Long
				.parseLong(userId));
	 }
		logger.info("End of displayMasterList ()  in CommonController");
		return masterList;
	 }
	 catch(Exception e)
	 {
		 logger.error("Error of displayMasterList ()  in CommonController"+e.getMessage());
	 }
	 return masterList;
	}

	@RequestMapping(value = "/addToMasterList", method = RequestMethod.POST)
	public Boolean addToMasterList(
			@Valid @RequestBody MasterDetails masterDetails)
	{
		Boolean result = false;
		try {
		logger.info("Start of addToMasterList  in CommonController" + result);
		result = commonService.addMasterDetails(masterDetails);
		logger.info("End of addToMasterList () in CommonController" + result);
		return result;
		}
		catch(Exception e)
		{
			logger.error("Error of addToMasterList () in CommonController" + e.getMessage());
		}
		return result;
	}

	@RequestMapping(value = "/userOfMasterList/{userId}", method = RequestMethod.POST)
	public UserFriendsAndFamilyModel userOfMasterList(
			@PathVariable String userId) {
		
		logger.info("Start of userOfMasterList ()  in CommonController");
		UserFriendsAndFamilyModel userFriendsAndFamilyModel =new UserFriendsAndFamilyModel(); 
		try {
		if (userId != null && !userId.equalsIgnoreCase("undefined") && !userId.equals(""))
		{
		userFriendsAndFamilyModel=commonService.userInMasterList(Long.parseLong(userId));
		}
		logger.info("End of userOfMasterList () in CommonController");
		return userFriendsAndFamilyModel;
		}
		catch(Exception e)
		{
			logger.error("Error of userOfMasterList () in CommonController"+e.getMessage());
		}
		return userFriendsAndFamilyModel;
	}

	@RequestMapping(value = "/channelDetails", method = RequestMethod.POST)
	
	public List<ChannelDetails> AllChannelDetails() {
		try 
		{
		logger.info("Start of channelDetails ()  in CommonController");
		return commonService.allChannelDetails();
		}
		catch(Exception e)
		{
			logger.error("Error of channelDetails ()  in CommonController"+e.getMessage());
		}
		return null;
	}

	private long getUserId() {

		UserInformation userDetails = (UserInformation) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();

		return userDetails.getUserId();

	}

	@RequestMapping(value = "/serviceTypeIds", method = RequestMethod.POST)
	
	public HashMap<Long, String> serviceTypeIds() {
		try 
		{
		logger.info("Start of serviceTypeIds ()  in CommonController");
		return commonService.serviceTypeIds();
		}
		catch(Exception e)
		{
		logger.error("End of serviceTypeIds ()  in CommonController"+e.getMessage());
		}
		return null;
	}

	@RequestMapping(value = "/requestTypeIds/{serviceTypeId}", method = RequestMethod.POST)
	public HashMap<Long, String> serviceTypeIds(@PathVariable long serviceTypeId) {
		try {
		logger.info("Start of serviceTypeIds ()  in CommonController");
		return commonService.requestTypeIds(serviceTypeId);
		}
		catch(Exception e)
		{
			logger.error("Error of serviceTypeIds ()  in CommonController"+e.getMessage());
		}
		return null;
	}

	@RequestMapping(value = "/passwordChange", method = RequestMethod.POST)
	public PasswordStatus passwordChange(@RequestBody NewStatus newStatus) {
		PasswordStatus passwordStatus1=null;
		try {
		logger.info("Start of passwordChange ()  in CommonController");
		PasswordStatus passwordStatus = commonService.passwordChange(newStatus);
		return passwordStatus;
		}
		catch(Exception e)
		{
			passwordStatus1=new PasswordStatus();
			logger.error("Error of passwordChange ()  in CommonController"+e.getMessage());
		}
		return passwordStatus1;
	}
	
	@RequestMapping(value = "/listOfSevas", method = RequestMethod.POST)
	
	public Properties sevaList() {
		try {
		return commonService.sevaList();
		}
		catch(Exception e)
		{
			logger.error("Error in sevaList ()  in commoncontroller"+e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(value = "/getSevaNameByCode/{sevaCode}", method = RequestMethod.POST)
	public String getSevaNameByCode(@PathVariable String sevaCode){
		try 
		{
		return  commonService.getSevaNameByCode(sevaCode);
		}
		catch(Exception e)
		{
			logger.error("Error of getSevaNameByCode ()  in commoncontroller"+e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(value = "/saveSessionInfo/{offeringId}/{sessionValue}", method = RequestMethod.GET)
	public String saveSessionInfo(@PathVariable String offeringId,@PathVariable String sessionValue){
		try 
		{
		return  Boolean.toString(commonService.saveSessionInfo(offeringId,sessionValue));
		}
		catch(Exception e)
		{
			logger.error("Error of saveSessionInfo ()  in commoncontroller"+e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(value = "/rest_saveSessionInfo/{offeringId}", method = RequestMethod.POST)
	public String rest_saveSessionInfo(@PathVariable String offeringId, HttpEntity<String> sessionValue){
		try 
		{
		String sessionValues = sessionValue.getBody();
		return  Boolean.toString(commonService.saveSessionInfo(offeringId,sessionValues));
		}
		catch(Exception e)
		{
			logger.error("Error of rest_saveSessionInfo ()  in commoncontroller"+e.getMessage());
		}
		return null;
	}
	
	
	@RequestMapping(value = "/getSessionInfo/{offeringId}", method = RequestMethod.GET)
	public String getSessionInfo(@PathVariable String offeringId){
		try 
		{
		return  commonService.getSessionInfoValue(offeringId);
		}
		catch(Exception e)
		{
			logger.error("Error of getSessionInfo ()  in commoncontroller"+e.getMessage());
		}
		return null;
	}
	
	@RequestMapping(value="/getGlobalProperties",method=RequestMethod.POST)
	public GlobalPropertiesResponse getGlobalProperties(@RequestBody GlobalProperties globalproperties)
	{
	GlobalPropertiesResponse globalPropertiesResponse =new GlobalPropertiesResponse();
	logger.info("Start of globalPropertice ()  in commoncontroller");
	globalPropertiesResponse=commonService.getGlobalProperties(globalproperties);
	logger.info("end of globalPropertice ()  in DonorController");
	return globalPropertiesResponse;
}
	
	@RequestMapping(value="/saveDonorInfo",method=RequestMethod.POST)
	public boolean saveDonorInfo(@RequestBody DonorInfoModel donorInfoModel){
		try 
		{
		return commonService.saveDonorInfo(donorInfoModel);
		}
		catch(Exception e)
		{
			logger.error("Error in saveDonorInfo ()  in commoncontroller"+e.getMessage());
		}
		return false;
	}
	
	@RequestMapping(value="/activeEnv",method=RequestMethod.POST)
	
	public ActiveEnvironment activeEnv(){
		
		ActiveEnvironment activeEnvironment = new ActiveEnvironment();
		activeEnvironment.setActiveEnv(System.getProperty("active.env"));
		activeEnvironment.setIsMock(commonService.getIsPgMock());
		
		return activeEnvironment;
	}
	
	@RequestMapping(value = "/serviceAndRequestTypeIds", method = RequestMethod.POST)
	
	public ServiceAndRequestTypeIdsModel serviceAndRequestTypeIds() {
		logger.info("Start of serviceTypeIds ()  in CommonController");
		ServiceAndRequestTypeIdsModel serviceAndRequestTypeIdsModel = new ServiceAndRequestTypeIdsModel();
		try{
			return commonService.serviceAndRequestTypeIds();
			}
		catch(Exception e)
		{
			logger.error("Error of serviceTypeIds ()  in CommonController"+e.getMessage());
		}
		return serviceAndRequestTypeIdsModel;
	}
	@RequestMapping(value = "/idprooftypes", method = RequestMethod.POST)
	public Map<String,String> idprooftypes(){
		
		Map<String,String> idProofTypes = new HashMap<String,String>();
		idProofTypes.put("1011", "PAN CARD");
		idProofTypes.put("1012", "RATION CARD");
		idProofTypes.put("1013", "PASSPORT");
		idProofTypes.put("1014", "DRIVING LICENSE");
		idProofTypes.put("1015", "AADHAR CARD");
		idProofTypes.put("1016", "VOTER CARD");
		return idProofTypes;
		
	}
	
	@RequestMapping(value = "/getAckDetails/{offeringID}/{modName}", method = RequestMethod.POST)
	public PGDetails getPGDetails(@PathVariable String offeringID,@PathVariable String modName) {
		logger.info("Start of getPGDetails ()  in CommonController");
		PGDetails pgDetails = new PGDetails();
		try
		{
			return commonService.getPGDetails(offeringID,modName);
		}
		catch(Exception e)
		{
			logger.error("Error of getPGDetails ()  in CommonController"+e.getMessage());
		}
		return pgDetails;
	}
	
	@RequestMapping(value = "/checkIfDipSeva/{offeringId}", method = RequestMethod.GET)
	public Boolean checkIfDipSeva(@PathVariable String offeringId){
		
		try {
			return  commonService.checkIfDip(offeringId);	
		} catch(Exception e)
		{
			logger.error("Exception of checkIfDipSeva ()  in CommonController"+e.getMessage()); 
		}
		return false;
		
	}
	
	@RequestMapping(value = "/languageWatcherCount/{language}", method = RequestMethod.POST)
	public void languageWatcherCount(@PathVariable String language){
		logger.info("Start of languageWatcherCount ()  in CommonController"); 
		try 
		{
		commonService.increaseLangCount(language);
		}
		catch(Exception e) 
		{
			logger.error("Exception of languageWatcherCount ()  in CommonController"+e.getMessage()); 	
		}
		logger.info("End of languageWatcherCount ()  in CommonController"); 
	}
	
	@RequestMapping(value = "/StatesList", method = RequestMethod.GET)
	
	public List<State> getStates() {
		logger.info("Start of StatesList ()  in CommonController");
		List<State> states = new ArrayList<State>();
		try 
		{
		states = commonService.getstates();
		}
		catch(Exception e)
		{
			logger.error("Error of StatesList ()  in CommonController"+e.getMessage());
		}
		return states;
	 }
	
	@RequestMapping(value = "/eCounterNames", method = RequestMethod.GET)
	
	public List<String> eCounterNames() {
		logger.info("Start of eCounterNames ()  in CommonController");
		List<String> eCounterNames = new ArrayList<String>();
		try 
		{
		eCounterNames = commonService.geteCounterNames();
		}
		catch(Exception e)
		{
			logger.error("Error of eCounterNames ()  in CommonController"+e.getMessage());
		}
		return eCounterNames;
	 }
	
	@RequestMapping(value = "/banksListMob/{serviceName}", method = RequestMethod.POST)
	public Banks banksListMob(@PathVariable String serviceName) {
		logger.info("Start of banksListMob ()  in CommonController");
		Banks bankList = new Banks();
		try 
		{
			bankList = commonService.banksListMob(serviceName);	
		} 
		catch(Exception e) 
		{
			logger.error("Error of banksListMob ()  in CommonController"+e.getMessage());
		}
		return bankList;
	 }
	
	@RequestMapping(value="/saveUserMobileInfo",method=RequestMethod.POST)
	public boolean saveUserMobileInfo(@RequestBody MobileAppInfo mobileAppInfo){
		
		return commonService.saveUserMobileInfo(mobileAppInfo);
		
		
		//return false;
	}
	
	//New Services
	@RequestMapping(value = "/getUpcomingBookings/{userid}", method = RequestMethod.POST)
	 public List<HashMap<String,String>> getUpcomingBookings (@PathVariable long userid)
	 {
		List<HashMap<String,String>> lmap=new ArrayList<HashMap<String,String>>();
		try
		{
			lmap=commonService.getUpcomingBookings(userid);
		}
		catch(Exception e)
		{
			logger.error("Error of getUpcomingBookings ()  in CommonController");
		}
		return lmap;
	 }
	
	
}