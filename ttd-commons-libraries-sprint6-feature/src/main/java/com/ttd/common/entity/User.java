package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.donor.entity.DollarBooking;
import com.ttd.donor.entity.DonorFpLiveDetail;
import com.ttd.eaccommodation.entity.AccomBooking;
import com.ttd.edarshan.dip.entity.SedDipRegistration;
import com.ttd.edonation.entity.DonationOffering;
import com.ttd.edonation.entity.DonorFamilyDetail;
import com.ttd.ehundi.entity.HundiOffering;
import com.ttd.eseva.entity.RequestApprovalPrivilege;
import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.SevaBooking;
import com.ttd.kalyanaVedika.entity.PilgrimMarriageDtl;
import com.ttd.publications.entity.PublicationsBooking;
import com.ttd.sgms.entity.SgmsBooking;
import com.ttd.ussesvvd.entity.UssesDonorPrivRedemService;
import com.ttd.ussesvvd.entity.UssesVvdOffering;



/**
 * The persistent class for the USERS database table. 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERS_USER_ID_GENERATOR", sequenceName="USERS_USER_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_USER_ID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="EMAIL_VERIFICATION")
	private String emailVerification;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FORGOT_PASSWORD_EXPIRE")
	private Date forgotPasswordExpire;

	@Column(name="FORGOT_PASSWORD_TOKEN")
	private String forgotPasswordToken;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_LOGIN_TIME")
	private Date lastLoginTime;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="REGISTRATION_EMAIL_LINK")
	private String registrationEmailLink;

	@Column(name="ROLE_ID", insertable = false, updatable = false)
	private BigDecimal roleId;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SMS_VERIFICATION")
	private String smsVerification;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_STATUS")
	private String userStatus;

	@Column(name="WATCH_LIST_FLAG")
	private String watchListFlag;
	
	@Column(name="ISDONOR")
	private String isDonor;

	@Column(name="COUNTRY_CODE")
	private String countryCode;
	
	@Column(name="DIP_COUNTER")
	private Long dipCounter;
	
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<PilgrimMarriageDtl> pilgrimMarriageDtls;
	
	//bi-directional many-to-one association to LoginAudit
	/*
	 * @OneToMany(mappedBy="user",fetch = FetchType.LAZY) private List<LoginAudit>
	 * loginAudits;
	 */

	//bi-directional many-to-one association to AccomBooking
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<AccomBooking> accomBookings;

		//bi-directional many-to-one association to DonationOffering UssesVvdOffering
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<DonationOffering> donationOfferings;
		
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<UssesVvdOffering> ussesVvdOfferings;
		
		//bi-directional many-to-one association to SapthagiriMagazine
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<SgmsBooking> sgmsBookings;

		//bi-directional many-to-one association to DonorFamilyDetail
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<DonorFamilyDetail> donorFamilyDetails;

		//bi-directional many-to-one association to HundiOffering
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<HundiOffering> hundiOfferings;

		//bi-directional many-to-one association to RequestApprovalPrivilege
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<RequestApprovalPrivilege> requestApprovalPrivileges;

		//bi-directional many-to-one association to RequestWorkflow
		@OneToMany(mappedBy="user1",fetch = FetchType.LAZY)
		private List<RequestWorkflow> requestWorkflows1;

		//bi-directional many-to-one association to RequestWorkflow
		@OneToMany(mappedBy="user2",fetch = FetchType.LAZY)
		private List<RequestWorkflow> requestWorkflows2;

		//bi-directional many-to-one association to SevaBooking
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<SevaBooking> sevaBookings;
		
		//bi-directional many-to-one association to TempUserPwd
		@OneToMany(mappedBy="user", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
		private List<TempUserPwd> tempUserPwds;

		//bi-directional many-to-one association to RolesMaster
		@ManyToOne
		@JoinColumn(name="ROLE_ID", insertable = false, updatable = false)
		private RolesMaster rolesMaster;

		//bi-directional many-to-one association to UsersFriendsAndFamily
		@OneToMany(mappedBy="user",fetch = FetchType.LAZY)
		private List<UsersFriendsAndFamily> usersFriendsAndFamilies;

		//bi-directional many-to-one association to UserOtp
		@OneToMany(mappedBy="user", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
		private List<UserOtp> userOtps;

		//bi-directional one-to-one association to UserPersonalDetail
		@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
		private UserPersonalDetail userPersonalDetail;
		
		//bi-directional one-to-one association to UserPersonalDetail
				@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
				private DonorFpLiveDetail donorFpLiveDetail;
				
				
				//bi-directional many-to-one association to DollarBooking
				@OneToMany(mappedBy="user")
				private List<DollarBooking> dollarBookings;

	public List<DollarBooking> getDollarBookings() {
					return dollarBookings;
				}

				public void setDollarBookings(List<DollarBooking> dollarBookings) {
					this.dollarBookings = dollarBookings;
				}

	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
	
	@OneToMany(mappedBy="user")
	private List<UssesDonorPrivRedemService> ussesDonorPrivRedemServices;
	
	@OneToMany(mappedBy="user")
	private List<PublicationsBooking> publicationsBookings;

	//bi-directional many-to-one association to SedDipRegistration
		@OneToMany(mappedBy="user")
		private List<SedDipRegistration> sedDipRegistrations;
	
		public User() {
		}

		public long getUserId() {
			return this.userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
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

		public String getEmailVerification() {
			return this.emailVerification;
		}

		public void setEmailVerification(String emailVerification) {
			this.emailVerification = emailVerification;
		}

		public Date getForgotPasswordExpire() {
			return this.forgotPasswordExpire;
		}

		public void setForgotPasswordExpire(Date forgotPasswordExpire) {
			this.forgotPasswordExpire = forgotPasswordExpire;
		}

		public String getForgotPasswordToken() {
			return this.forgotPasswordToken;
		}

		public void setForgotPasswordToken(String forgotPasswordToken) {
			this.forgotPasswordToken = forgotPasswordToken;
		}

		public Date getLastLoginTime() {
			return this.lastLoginTime;
		}

		public void setLastLoginTime(Date lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}

		public String getMobileNumber() {
			return this.mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getRegistrationEmailLink() {
			return this.registrationEmailLink;
		}

		public void setRegistrationEmailLink(String registrationEmailLink) {
			this.registrationEmailLink = registrationEmailLink;
		}

		public BigDecimal getRowStatus() {
			return this.rowStatus;
		}

		public void setRowStatus(BigDecimal rowStatus) {
			this.rowStatus = rowStatus;
		}

		public String getSmsVerification() {
			return this.smsVerification;
		}

		public void setSmsVerification(String smsVerification) {
			this.smsVerification = smsVerification;
		}
		
		public List<TempUserPwd> getTempUserPwds() {
			return this.tempUserPwds;
		}

		public void setTempUserPwds(List<TempUserPwd> tempUserPwds) {
			this.tempUserPwds = tempUserPwds;
		}

		public TempUserPwd addTempUserPwd(TempUserPwd tempUserPwd) {
			getTempUserPwds().add(tempUserPwd);
			tempUserPwd.setUser(this);

			return tempUserPwd;
		}

		public TempUserPwd removeTempUserPwd(TempUserPwd tempUserPwd) {
			getTempUserPwds().remove(tempUserPwd);
			tempUserPwd.setUser(null);

			return tempUserPwd;
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

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPassword() {
			return this.userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserStatus() {
			return this.userStatus;
		}

		public void setUserStatus(String userStatus) {
			this.userStatus = userStatus;
		}

		public String getWatchListFlag() {
			return this.watchListFlag;
		}

		public void setWatchListFlag(String watchListFlag) {
			this.watchListFlag = watchListFlag;
		}

		public List<AccomBooking> getAccomBookings() {
			return this.accomBookings;
		}

		public void setAccomBookings(List<AccomBooking> accomBookings) {
			this.accomBookings = accomBookings;
		}

		public AccomBooking addAccomBooking(AccomBooking accomBooking) {
			getAccomBookings().add(accomBooking);
			accomBooking.setUser(this);

			return accomBooking;
		}

		public AccomBooking removeAccomBooking(AccomBooking accomBooking) {
			getAccomBookings().remove(accomBooking);
			accomBooking.setUser(null);

			return accomBooking;
		}

		public List<DonationOffering> getDonationOfferings() {
			return this.donationOfferings;
		}

		public void setDonationOfferings(List<DonationOffering> donationOfferings) {
			this.donationOfferings = donationOfferings;
		}

	public DonationOffering addDonationOffering(
			DonationOffering donationOffering) {
		getDonationOfferings().add(donationOffering);
		donationOffering.setUser(this);

		return donationOffering;
	}

	public DonationOffering removeDonationOffering(
			DonationOffering donationOffering) {
		getDonationOfferings().remove(donationOffering);
		donationOffering.setUser(null);

		return donationOffering;
	}

		public List<DonorFamilyDetail> getDonorFamilyDetails() {
			return this.donorFamilyDetails;
		}

		public void setDonorFamilyDetails(List<DonorFamilyDetail> donorFamilyDetails) {
			this.donorFamilyDetails = donorFamilyDetails;
		}

	public DonorFamilyDetail addDonorFamilyDetail(
			DonorFamilyDetail donorFamilyDetail) {
		getDonorFamilyDetails().add(donorFamilyDetail);
		donorFamilyDetail.setUser(this);

		return donorFamilyDetail;
	}

	public DonorFamilyDetail removeDonorFamilyDetail(
			DonorFamilyDetail donorFamilyDetail) {
		getDonorFamilyDetails().remove(donorFamilyDetail);
		donorFamilyDetail.setUser(null);

		return donorFamilyDetail;
	}

		public List<HundiOffering> getHundiOfferings() {
			return this.hundiOfferings;
		}

		public void setHundiOfferings(List<HundiOffering> hundiOfferings) {
			this.hundiOfferings = hundiOfferings;
		}

		public HundiOffering addHundiOffering(HundiOffering hundiOffering) {
			getHundiOfferings().add(hundiOffering);
			hundiOffering.setUser(this);

			return hundiOffering;
		}

		public HundiOffering removeHundiOffering(HundiOffering hundiOffering) {
			getHundiOfferings().remove(hundiOffering);
			hundiOffering.setUser(null);

			return hundiOffering;
		}

		public List<RequestApprovalPrivilege> getRequestApprovalPrivileges() {
			return this.requestApprovalPrivileges;
		}

	public void setRequestApprovalPrivileges(
			List<RequestApprovalPrivilege> requestApprovalPrivileges) {
		this.requestApprovalPrivileges = requestApprovalPrivileges;
	}

	public RequestApprovalPrivilege addRequestApprovalPrivilege(
			RequestApprovalPrivilege requestApprovalPrivilege) {
		getRequestApprovalPrivileges().add(requestApprovalPrivilege);
		requestApprovalPrivilege.setUser(this);

		return requestApprovalPrivilege;
	}

	public RequestApprovalPrivilege removeRequestApprovalPrivilege(
			RequestApprovalPrivilege requestApprovalPrivilege) {
			getRequestApprovalPrivileges().remove(requestApprovalPrivilege);
			requestApprovalPrivilege.setUser(null);

			return requestApprovalPrivilege;
		}

		public List<RequestWorkflow> getRequestWorkflows1() {
			return this.requestWorkflows1;
		}

		public void setRequestWorkflows1(List<RequestWorkflow> requestWorkflows1) {
			this.requestWorkflows1 = requestWorkflows1;
		}

	public RequestWorkflow addRequestWorkflows1(
			RequestWorkflow requestWorkflows1) {
		getRequestWorkflows1().add(requestWorkflows1);
		requestWorkflows1.setUser1(this);

		return requestWorkflows1;
	}

	public RequestWorkflow removeRequestWorkflows1(
			RequestWorkflow requestWorkflows1) {
		getRequestWorkflows1().remove(requestWorkflows1);
		requestWorkflows1.setUser1(null);

		return requestWorkflows1;
	}

		public List<RequestWorkflow> getRequestWorkflows2() {
			return this.requestWorkflows2;
		}

		public void setRequestWorkflows2(List<RequestWorkflow> requestWorkflows2) {
			this.requestWorkflows2 = requestWorkflows2;
		}

	public RequestWorkflow addRequestWorkflows2(
			RequestWorkflow requestWorkflows2) {
		getRequestWorkflows2().add(requestWorkflows2);
		requestWorkflows2.setUser2(this);

		return requestWorkflows2;
	}

	public RequestWorkflow removeRequestWorkflows2(
			RequestWorkflow requestWorkflows2) {
		getRequestWorkflows2().remove(requestWorkflows2);
		requestWorkflows2.setUser2(null);

		return requestWorkflows2;
	}

		public List<SevaBooking> getSevaBookings() {
			return this.sevaBookings;
		}

		public void setSevaBookings(List<SevaBooking> sevaBookings) {
			this.sevaBookings = sevaBookings;
		}

		public SevaBooking addSevaBooking(SevaBooking sevaBooking) {
			getSevaBookings().add(sevaBooking);
			sevaBooking.setUser(this);

			return sevaBooking;
		}

		public SevaBooking removeSevaBooking(SevaBooking sevaBooking) {
			getSevaBookings().remove(sevaBooking);
			sevaBooking.setUser(null);

			return sevaBooking;
		}

		public RolesMaster getRolesMaster() {
			return this.rolesMaster;
		}

		public void setRolesMaster(RolesMaster rolesMaster) {
			this.rolesMaster = rolesMaster;
		}

		public List<UsersFriendsAndFamily> getUsersFriendsAndFamilies() {
			return this.usersFriendsAndFamilies;
		}

	public void setUsersFriendsAndFamilies(
			List<UsersFriendsAndFamily> usersFriendsAndFamilies) {
		this.usersFriendsAndFamilies = usersFriendsAndFamilies;
	}

	public UsersFriendsAndFamily addUsersFriendsAndFamily(
			UsersFriendsAndFamily usersFriendsAndFamily) {
		getUsersFriendsAndFamilies().add(usersFriendsAndFamily);
		usersFriendsAndFamily.setUser(this);

		return usersFriendsAndFamily;
	}

	public UsersFriendsAndFamily removeUsersFriendsAndFamily(
			UsersFriendsAndFamily usersFriendsAndFamily) {
		getUsersFriendsAndFamilies().remove(usersFriendsAndFamily);
		usersFriendsAndFamily.setUser(null);

		return usersFriendsAndFamily;
	}

		public List<UserOtp> getUserOtps() {
			return this.userOtps;
		}

		public void setUserOtps(List<UserOtp> userOtps) {
			this.userOtps = userOtps;
		}

		public UserOtp addUserOtp(UserOtp userOtp) {
			getUserOtps().add(userOtp);
			userOtp.setUser(this);

			return userOtp;
		}

		public UserOtp removeUserOtp(UserOtp userOtp) {
			getUserOtps().remove(userOtp);
			userOtp.setUser(null);

			return userOtp;
		}

		public UserPersonalDetail getUserPersonalDetail() {
			return this.userPersonalDetail;
		}

		public void setUserPersonalDetail(UserPersonalDetail userPersonalDetail) {
			this.userPersonalDetail = userPersonalDetail;
		}

		
		public DonorFpLiveDetail getDonorFpLiveDetail() {
			return donorFpLiveDetail;
		}

		public void setDonorFpLiveDetail(DonorFpLiveDetail donorFpLiveDetail) {
			this.donorFpLiveDetail = donorFpLiveDetail;
		}

		public String getIsDonor() {
			return isDonor;
		}

		public void setIsDonor(String isDonor) {
			this.isDonor = isDonor;
		}

		/*
		 * public List<LoginAudit> getLoginAudits() { return this.loginAudits; }
		 * 
		 * public void setLoginAudits(List<LoginAudit> loginAudits) { this.loginAudits =
		 * loginAudits; }
		 */

	/*
	 * public LoginAudit addLoginAudit(LoginAudit loginAudit) {
	 * getLoginAudits().add(loginAudit); loginAudit.setUser(this);
	 * 
	 * return loginAudit; }
	 * 
	 * public LoginAudit removeLoginAudit(LoginAudit loginAudit) {
	 * getLoginAudits().remove(loginAudit); loginAudit.setUser(null);
	 * 
	 * return loginAudit; }
	 */
	public List<PilgrimMarriageDtl> getPilgrimMarriageDtls() {
		return this.pilgrimMarriageDtls;
	}

	public void setPilgrimMarriageDtls(
			List<PilgrimMarriageDtl> pilgrimMarriageDtls) {
		this.pilgrimMarriageDtls = pilgrimMarriageDtls;
	}

	public PilgrimMarriageDtl addPilgrimMarriageDtl(
			PilgrimMarriageDtl pilgrimMarriageDtl) {
		getPilgrimMarriageDtls().add(pilgrimMarriageDtl);
		pilgrimMarriageDtl.setUser(this);

		return pilgrimMarriageDtl;
	}

	public PilgrimMarriageDtl removePilgrimMarriageDtl(
			PilgrimMarriageDtl pilgrimMarriageDtl) {
		getPilgrimMarriageDtls().remove(pilgrimMarriageDtl);
		pilgrimMarriageDtl.setUser(null);

		return pilgrimMarriageDtl;
	}

	public List<SgmsBooking> getSgmsBookings() {
		return sgmsBookings;
	}

	public void setSgmsBookings(List<SgmsBooking> sgmsBookings) {
		this.sgmsBookings = sgmsBookings;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public BigDecimal getRoleId() {
		return roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

	public List<UssesVvdOffering> getUssesVvdOfferings() {
		return ussesVvdOfferings;
	}

	public void setUssesVvdOfferings(List<UssesVvdOffering> ussesVvdOfferings) {
		this.ussesVvdOfferings = ussesVvdOfferings;
	}

//	public List<PublicationsBooking> getPublicationsBookings() {
//		return this.publicationsBookings;
//	}
//
//	public void setPublicationsBookings(List<PublicationsBooking> publicationsBookings) {
//		this.publicationsBookings = publicationsBookings;
//	}
//
//	public PublicationsBooking addPublicationsBooking(PublicationsBooking publicationsBooking) {
//		getPublicationsBookings().add(publicationsBooking);
//		publicationsBooking.setUser(this);
//
//		return publicationsBooking;
//	}
//
//	public PublicationsBooking removePublicationsBooking(PublicationsBooking publicationsBooking) {
//		getPublicationsBookings().remove(publicationsBooking);
//		publicationsBooking.setUser(null);
//
//		return publicationsBooking;
//	}
	
	public List<SedDipRegistration> getSedDipRegistrations() {
		return this.sedDipRegistrations;
	}

	public void setSedDipRegistrations(List<SedDipRegistration> sedDipRegistrations) {
		this.sedDipRegistrations = sedDipRegistrations;
	}

	public SedDipRegistration addSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().add(sedDipRegistration);
		sedDipRegistration.setUser(this);

		return sedDipRegistration;
	}

	public SedDipRegistration removeSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().remove(sedDipRegistration);
		sedDipRegistration.setUser(null);

		return sedDipRegistration;
	}

	public List<PublicationsBooking> getPublicationsBookings() {
		return publicationsBookings;
	}

	public void setPublicationsBookings(
			List<PublicationsBooking> publicationsBookings) {
		this.publicationsBookings = publicationsBookings;
	}

	public Long getDipCounter() {
		return dipCounter;
	}

	public void setDipCounter(Long dipCounter) {
		this.dipCounter = dipCounter;
	}

	
	
}