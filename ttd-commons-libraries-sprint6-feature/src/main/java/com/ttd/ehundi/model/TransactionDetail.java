package com.ttd.ehundi.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ttd.eseva.entity.SevaBookingDetail;

public class TransactionDetail {

	private static final long serialVersionUID = 1L;

	private long userId;
	private String offeringId;

	private BigDecimal createdBy;

	private BigDecimal offeringAmount;

	private String piligrimPhoneMobile;

	private String piligrimFirstName;

	private String piligrimLastName;
	private String txnMsg;

	private Date createdTime;

	private String pgReference;

	private String pgRequestBody;

	private String pgResponseBody;

	private String pgS2sNotification;

	private String pgS2sNotificationBody;

	private String pgStatus;

	private String pgType;
	
	private String hundiType;

	private BigDecimal rowStatus;

	private BigDecimal updatedBy;

	private Date updatedTime;

	private String inputUpdatedTime;

	private String piligrimEmail;

	private String piligrimCity;

	private long pgId;
	
	private long responsePgId;

	private long smsNotificationId;

	private long emailNotificationId;

	private String ackReceiptName;

	private String onBehalfOf;

	private String responseFlag;

	private boolean doProceed;

	private String ackReceiptStatus;

	private String pUserFirstName;

	private String pUserLastName;

	private String location;

	private Date bookingDate;

	private String slotFromTime;

	private String slotToTime;

	private String idProof;

	private int numberOfPersons;

	private BigDecimal numberOfTickets;

	private long accomTypeId;

	private long sevaId;

	private BigDecimal channelId;

	private long locationId;

	private String pUserMobilenumber;

	private String pUserEmailId;

	private boolean isPrimaryUser;

	private String userType;

	private BigDecimal sevaNoOfPersons;

	private String sevaName;

	private String sevaReportingTime;

	private List<String> nameAndNoOfBahumanas;

	private String idProofType;

	private List<SevaBookingDetail> list;

	private String userImage;

	private long flag;

	private List<PiligrimDetail> piligrimDetails;

	private long ticketCost;
	private String transType;

	private String donationAccessFrom;
	private Date instrDate;
	private long accomLocationId;
	private String guestHouseName;

	private BigDecimal piligrimAge;

	private String piligrimGender;

	private BigDecimal pilgrimIdProofType;

	private String userAddress;

	private String userAddress1;

	private String userAddress2;

	private String ITReceiptName;

	private String proceedingsReceiptName;

	private String zipCode;

	private String state;

	private String country;

	private String instrBank;

	private String instrNumber;

	private String instrBranch;

	private String donorPassbookNo;

	private String passbookReceiptName;

	private Date dob;

	private String firstProceedingNo;

	private Date firstProceedingDate;

	private String renewedProceedingNo;

	private Date renewedProceedingDate;

	private String jointDonorFirstName;

	private String validity;

	private String onOccasionOf;

	private Date occasionDate;

	private String donorType;

	private Date passbookIssueDate;

	private String donor;

	private boolean darshanFlag;

	private String reqChannel;
	private String sessionId;
	
	private String merchantCode;
	
	private boolean darshanAccomFlag;
	
	private BigDecimal sgstAmount;
	
	private BigDecimal cgstAmount;
	
	private BigDecimal totalAmount;
	
	private double responseAmount;
	
	private String txnAmount;
	private boolean liveAmountTurnon;
	private String bookingStatus;//// added for redirecvt issue
	
	private boolean darshandonationFlag;
	private BigDecimal cautionDeposit;
private String beforeDvResponse;
private String paymentMode;
private String pgAmount;

private String sevaPerformingTime;

private String postalSeqNum;

private String darshanOptedFLag;

private String darshanSlotName;
private String darshanDate;
private long laddus;
private long additionalLaddus;
private long additionalLadduPrice;
private String darshanPersons;
private long darshanAmount;
private long hundiAmount;


	public long getHundiAmount() {
	return hundiAmount;
}

public void setHundiAmount(long hundiAmount) {
	this.hundiAmount = hundiAmount;
}

	public String getDarshanOptedFLag() {
	return darshanOptedFLag;
}

public void setDarshanOptedFLag(String darshanOptedFLag) {
	this.darshanOptedFLag = darshanOptedFLag;
}

public String getDarshanSlotName() {
	return darshanSlotName;
}

public void setDarshanSlotName(String darshanSlotName) {
	this.darshanSlotName = darshanSlotName;
}

public String getDarshanDate() {
	return darshanDate;
}

public void setDarshanDate(String darshanDate) {
	this.darshanDate = darshanDate;
}

public long getLaddus() {
	return laddus;
}

public void setLaddus(long laddus) {
	this.laddus = laddus;
}

public long getAdditionalLaddus() {
	return additionalLaddus;
}

public void setAdditionalLaddus(long additionalLaddus) {
	this.additionalLaddus = additionalLaddus;
}

public long getAdditionalLadduPrice() {
	return additionalLadduPrice;
}

public void setAdditionalLadduPrice(long additionalLadduPrice) {
	this.additionalLadduPrice = additionalLadduPrice;
}

public String getDarshanPersons() {
	return darshanPersons;
}

public void setDarshanPersons(String darshanPersons) {
	this.darshanPersons = darshanPersons;
}

public long getDarshanAmount() {
	return darshanAmount;
}

public void setDarshanAmount(long darshanAmount) {
	this.darshanAmount = darshanAmount;
}

	public String getPostalSeqNum() {
	return postalSeqNum;
}

public void setPostalSeqNum(String postalSeqNum) {
	this.postalSeqNum = postalSeqNum;
}

	public String getSevaPerformingTime() {
	return sevaPerformingTime;
}

public void setSevaPerformingTime(String sevaPerformingTime) {
	this.sevaPerformingTime = sevaPerformingTime;
}

	public String getHundiType() {
	return hundiType;
}

public void setHundiType(String hundiType) {
	this.hundiType = hundiType;
}

	public String getPgAmount() {
	return pgAmount;
}

public void setPgAmount(String pgAmount) {
	this.pgAmount = pgAmount;
}

	public String getBeforeDvResponse() {
		return beforeDvResponse;
	}

	public void setBeforeDvResponse(String beforeDvResponse) {
		this.beforeDvResponse = beforeDvResponse;
	}

	public BigDecimal getCautionDeposit() {
		return cautionDeposit;
	}

	public void setCautionDeposit(BigDecimal cautionDeposit) {
		this.cautionDeposit = cautionDeposit;
	}

	public long getResponsePgId() {
		return responsePgId;
	}

	public void setResponsePgId(long responsePgId) {
		this.responsePgId = responsePgId;
	}

	public boolean getDarshandonationFlag() {
		return darshandonationFlag;
	}

	public void setDarshandonationFlag(boolean darshandonationFlag) {
		this.darshandonationFlag = darshandonationFlag;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public List<PiligrimDetail> getPiligrimDetails() {
		return piligrimDetails;
	}

	public void setPiligrimDetails(List<PiligrimDetail> piligrimDetails) {
		this.piligrimDetails = piligrimDetails;
	}

	public long getFlag() {
		return flag;
	}

	public void setFlag(long flag) {
		this.flag = flag;
	}

	public String getAckReceiptStatus() {
		return ackReceiptStatus;
	}

	public void setAckReceiptStatus(String ackReceiptStatus) {
		this.ackReceiptStatus = ackReceiptStatus;
	}

	public boolean isDoProceed() {
		return doProceed;
	}

	public void setDoProceed(boolean doProceed) {
		this.doProceed = doProceed;
	}

	public String getResponseFlag() {
		return responseFlag;
	}

	public void setResponseFlag(String responseFlag) {
		this.responseFlag = responseFlag;
	}

	public long getSmsNotificationId() {
		return smsNotificationId;
	}

	public void setSmsNotificationId(long smsNotificationId) {
		this.smsNotificationId = smsNotificationId;
	}

	public long getEmailNotificationId() {
		return emailNotificationId;
	}

	public void setEmailNotificationId(long emailNotificationId) {
		this.emailNotificationId = emailNotificationId;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getPgReference() {
		return this.pgReference;
	}

	public void setPgReference(String pgReference) {
		this.pgReference = pgReference;
	}

	public String getPgRequestBody() {
		return this.pgRequestBody;
	}

	public void setPgRequestBody(String pgRequestBody) {
		this.pgRequestBody = pgRequestBody;
	}

	public String getPgResponseBody() {
		return this.pgResponseBody;
	}

	public void setPgResponseBody(String pgResponseBody) {
		this.pgResponseBody = pgResponseBody;
	}

	public String getPgS2sNotification() {
		return this.pgS2sNotification;
	}

	public void setPgS2sNotification(String pgS2sNotification) {
		this.pgS2sNotification = pgS2sNotification;
	}

	public String getPgS2sNotificationBody() {
		return this.pgS2sNotificationBody;
	}

	public void setPgS2sNotificationBody(String pgS2sNotificationBody) {
		this.pgS2sNotificationBody = pgS2sNotificationBody;
	}

	public String getPgStatus() {
		return this.pgStatus;
	}

	public void setPgStatus(String pgStatus) {
		this.pgStatus = pgStatus;
	}

	public String getPgType() {
		return this.pgType;
	}

	public void setPgType(String pgType) {
		this.pgType = pgType;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public BigDecimal getOfferingAmount() {
		return offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public String getPiligrimPhoneMobile() {
		return piligrimPhoneMobile;
	}

	public void setPiligrimPhoneMobile(String piligrimPhoneMobile) {
		this.piligrimPhoneMobile = piligrimPhoneMobile;
	}

	public String getPiligrimFirstName() {
		return piligrimFirstName;
	}

	public void setPiligrimFirstName(String piligrimFirstName) {
		this.piligrimFirstName = piligrimFirstName;
	}

	public String getPiligrimLastName() {
		return piligrimLastName;
	}

	public void setPiligrimLastName(String piligrimLastName) {
		this.piligrimLastName = piligrimLastName;
	}

	public String getPiligrimEmail() {
		return piligrimEmail;
	}

	public void setPiligrimEmail(String piligrimEmail) {
		this.piligrimEmail = piligrimEmail;
	}

	public String getPiligrimCity() {
		return piligrimCity;
	}

	public void setPiligrimCity(String piligrimCity) {
		this.piligrimCity = piligrimCity;
	}

	public long getPgId() {
		return pgId;
	}

	public void setPgId(long pgId) {
		this.pgId = pgId;
	}

	public String getAckReceiptName() {
		return ackReceiptName;
	}

	public void setAckReceiptName(String ackReceiptName) {
		this.ackReceiptName = ackReceiptName;
	}

	public String getOnBehalfOf() {
		return onBehalfOf;
	}

	public void setOnBehalfOf(String onBehalfOf) {
		this.onBehalfOf = onBehalfOf;
	}

	public String getInputUpdatedTime() {
		return inputUpdatedTime;
	}

	public void setInputUpdatedTime(String inputUpdatedTime) {
		this.inputUpdatedTime = inputUpdatedTime;
	}

	public String getpUserFirstName() {
		return pUserFirstName;
	}

	public void setpUserFirstName(String pUserFirstName) {
		this.pUserFirstName = pUserFirstName;
	}

	public String getpUserLastName() {
		return pUserLastName;
	}

	public void setpUserLastName(String pUserLastName) {
		this.pUserLastName = pUserLastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSlotFromTime() {
		return slotFromTime;
	}

	public void setSlotFromTime(String slotFromTime) {
		this.slotFromTime = slotFromTime;
	}

	public String getSlotToTime() {
		return slotToTime;
	}

	public void setSlotToTime(String slotToTime) {
		this.slotToTime = slotToTime;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public long getAccomTypeId() {
		return accomTypeId;
	}

	public void setAccomTypeId(long accomTypeId) {
		this.accomTypeId = accomTypeId;
	}

	public BigDecimal getChannelId() {
		return channelId;
	}

	public void setChannelId(BigDecimal channelId) {
		this.channelId = channelId;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getpUserMobilenumber() {
		return pUserMobilenumber;
	}

	public void setpUserMobilenumber(String pUserMobilenumber) {
		this.pUserMobilenumber = pUserMobilenumber;
	}

	public String getpUserEmailId() {
		return pUserEmailId;
	}

	public void setpUserEmailId(String pUserEmailId) {
		this.pUserEmailId = pUserEmailId;
	}

	public boolean getIsPrimaryUser() {
		return isPrimaryUser;
	}

	public void setIsPrimaryUser(boolean isPrimaryUser) {
		this.isPrimaryUser = isPrimaryUser;
	}

	public long getSevaId() {
		return sevaId;
	}

	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BigDecimal getSevaNoOfPersons() {
		return sevaNoOfPersons;
	}

	public void setSevaNoOfPersons(BigDecimal sevaNoOfPersons) {
		this.sevaNoOfPersons = sevaNoOfPersons;
	}

	public String getSevaName() {
		return sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
	}

	public String getSevaReportingTime() {
		return sevaReportingTime;
	}

	public void setSevaReportingTime(String sevaReportingTime) {
		this.sevaReportingTime = sevaReportingTime;
	}

	public List<String> getNameAndNoOfBahumanas() {
		return nameAndNoOfBahumanas;
	}

	public void setNameAndNoOfBahumanas(List<String> nameAndNoOfBahumanas) {
		this.nameAndNoOfBahumanas = nameAndNoOfBahumanas;
	}

	public String getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}

	public List<SevaBookingDetail> getList() {
		return list;
	}

	public void setList(List<SevaBookingDetail> list) {
		this.list = list;
	}

	public BigDecimal getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(BigDecimal numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public void setPrimaryUser(boolean isPrimaryUser) {
		this.isPrimaryUser = isPrimaryUser;
	}

	public long getAccomLocationId() {
		return accomLocationId;
	}

	public void setAccomLocationId(long accomLocationId) {
		this.accomLocationId = accomLocationId;
	}

	public String getGuestHouseName() {
		return guestHouseName;
	}

	public void setGuestHouseName(String guestHouseName) {
		this.guestHouseName = guestHouseName;
	}

	public BigDecimal getPiligrimAge() {
		return piligrimAge;
	}

	public void setPiligrimAge(BigDecimal piligrimAge) {
		this.piligrimAge = piligrimAge;
	}

	public String getPiligrimGender() {
		return piligrimGender;
	}

	public void setPiligrimGender(String piligrimGender) {
		this.piligrimGender = piligrimGender;
	}

	public BigDecimal getPilgrimIdProofType() {
		return pilgrimIdProofType;
	}

	public void setPilgrimIdProofType(BigDecimal pilgrimIdProofType) {
		this.pilgrimIdProofType = pilgrimIdProofType;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getDonationAccessFrom() {
		return donationAccessFrom;
	}

	public void setDonationAccessFrom(String donationAccessFrom) {
		this.donationAccessFrom = donationAccessFrom;
	}

	public Date getInstrDate() {
		return instrDate;
	}

	public void setInstrDate(Date instrDate) {
		this.instrDate = instrDate;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getProceedingsReceiptName() {
		return proceedingsReceiptName;
	}

	public void setProceedingsReceiptName(String proceedingsReceiptName) {
		this.proceedingsReceiptName = proceedingsReceiptName;
	}

	public String getITReceiptName() {
		return ITReceiptName;
	}

	public void setITReceiptName(String iTReceiptName) {
		ITReceiptName = iTReceiptName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(long ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getInstrBank() {
		return instrBank;
	}

	public void setInstrBank(String instrBank) {
		this.instrBank = instrBank;
	}

	public String getInstrNumber() {
		return instrNumber;
	}

	public void setInstrNumber(String instrNumber) {
		this.instrNumber = instrNumber;
	}

	public String getInstrBranch() {
		return instrBranch;
	}

	public void setInstrBranch(String instrBranch) {
		this.instrBranch = instrBranch;
	}

	public String getDonorPassbookNo() {
		return donorPassbookNo;
	}

	public void setDonorPassbookNo(String donorPassbookNo) {
		this.donorPassbookNo = donorPassbookNo;
	}

	public String getPassbookReceiptName() {
		return passbookReceiptName;
	}

	public void setPassbookReceiptName(String passbookReceiptName) {
		this.passbookReceiptName = passbookReceiptName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstProceedingNo() {
		return firstProceedingNo;
	}

	public void setFirstProceedingNo(String firstProceedingNo) {
		this.firstProceedingNo = firstProceedingNo;
	}

	public Date getFirstProceedingDate() {
		return firstProceedingDate;
	}

	public void setFirstProceedingDate(Date firstProceedingDate) {
		this.firstProceedingDate = firstProceedingDate;
	}

	public String getRenewedProceedingNo() {
		return renewedProceedingNo;
	}

	public void setRenewedProceedingNo(String renewedProceedingNo) {
		this.renewedProceedingNo = renewedProceedingNo;
	}

	public Date getRenewedProceedingDate() {
		return renewedProceedingDate;
	}

	public void setRenewedProceedingDate(Date renewedProceedingDate) {
		this.renewedProceedingDate = renewedProceedingDate;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getJointDonorFirstName() {
		return jointDonorFirstName;
	}

	public void setJointDonorFirstName(String jointDonorFirstName) {
		this.jointDonorFirstName = jointDonorFirstName;
	}

	public String getOnOccasionOf() {
		return onOccasionOf;
	}

	public void setOnOccasionOf(String onOccasionOf) {
		this.onOccasionOf = onOccasionOf;
	}

	public Date getOccasionDate() {
		return occasionDate;
	}

	public void setOccasionDate(Date occasionDate) {
		this.occasionDate = occasionDate;
	}

	public Date getPassbookIssueDate() {
		return passbookIssueDate;
	}

	public void setPassbookIssueDate(Date passbookIssueDate) {
		this.passbookIssueDate = passbookIssueDate;
	}

	public String getDonor() {
		return donor;
	}

	public void setDonor(String donor) {
		this.donor = donor;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public boolean getDarshanFlag() {
		return darshanFlag;
	}

	public void setDarshanFlag(boolean darshanFlag) {
		this.darshanFlag = darshanFlag;
	}

	public String getReqChannel() {
		return reqChannel;
	}

	public void setReqChannel(String reqChannel) {
		this.reqChannel = reqChannel;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public boolean getDarshanAccomFlag() {
		return darshanAccomFlag;
	}

	public void setDarshanAccomFlag(boolean darshanAccomFlag) {
		this.darshanAccomFlag = darshanAccomFlag;
	}

	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getResponseAmount() {
		return responseAmount;
	}

	public void setResponseAmount(double responseAmount) {
		this.responseAmount = responseAmount;
	}

	public String getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}

	public boolean isLiveAmountTurnon() {
		return liveAmountTurnon;
	}

	public void setLiveAmountTurnon(boolean liveAmountTurnon) {
		this.liveAmountTurnon = liveAmountTurnon;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getTxnMsg() {
		return txnMsg;
	}

	public void setTxnMsg(String txnMsg) {
		this.txnMsg = txnMsg;
	}

	
	
}