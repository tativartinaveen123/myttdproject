package com.ttd.kalyanaVedika.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.User;

/**
 * The persistent class for the PILGRIM_MARRIAGE_DTLS database table.
 * 
 */
@Entity
@Table(name = "PILGRIM_MARRIAGE_DTLS")
@NamedQuery(name = "PilgrimMarriageDtl.findAll", query = "SELECT p FROM PilgrimMarriageDtl p")
public class PilgrimMarriageDtl implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@SequenceGenerator(name="PILGRIM_MARRIAGE_DTLS_SEQ_GENERATOR", sequenceName="PILGRIM_MARRIAGE_DTLS_SEQ", allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PILGRIM_MARRIAGE_DTLS_SEQ_GENERATOR")
	@Column(name = "PILGRIM_MARRIAGE_ID")
	private long pilgrimMarriageId;

	@Id
	@Column(name = "KVBOOKING_ID")
	private String kvbookingId;

	private String bname;

	private String bsurname;

	@Temporal(TemporalType.DATE)
	private Date bdob;

	private BigDecimal bage;

	private String bcommunity;

	@Column(name = "BIDPROOF_TYPE")
	private String bidproofType;

	private String bmobile;

	private String bemail;

	@Column(name = "BADDRESS_LINE1")
	private String baddressLine1;

	@Column(name = "BADDRESS_LINE2")
	private String baddressLine2;

	@Column(name = "BPERSON_STATE")
	private String bpersonState;

	@Column(name = "BPERSON_COUNTRY")
	private BigDecimal bpersonCountry;

	@Column(name = "BPERSON_ZIP_CODE")
	private String bpersonZipCode;

	@Column(name = "BGUARDIAN_NAME")
	private String bguardianName;

	@Column(name = "BGUARDIAN_IDPROOF_TYPE")
	private String bguardianIdproofType;

	private String bgname;

	private String bgsurname;

	@Temporal(TemporalType.DATE)
	private Date bgdob;

	private BigDecimal bgage;

	private String bgcommunity;

	@Column(name = "BGIDPROOF_TYPE")
	private String bgidproofType;

	private String bgmobile;

	@Column(name = "BGADDRESS_LINE1")
	private String bgaddressLine1;

	@Column(name = "BGADDRESS_LINE2")
	private String bgaddressLine2;

	@Column(name = "BGPERSON_STATE")
	private String bgpersonState;

	@Column(name = "BGPERSON_COUNTRY")
	private BigDecimal bgpersonCountry;

	@Column(name = "BGPERSON_ZIP_CODE")
	private String bgpersonZipCode;

	@Column(name = "BGGUARDIAN_NAME")
	private String bgguardianName;

	@Column(name = "BGGUARDIAN_IDPROOF_TYPE")
	private String bgguardianIdproofType;

	private String bgemail;

	@Column(name = "MAXALLOWED_PERSONS")
	private String maxallowedPersons;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "REPORTING_PLACE")
	private String reportingPlace;

	@Temporal(TemporalType.DATE)
	@Column(name = "REPORTING_TIME")
	private Date reportingTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "MUHURTHAM_DATE")
	private Date muhurthamDate;

	@Column(name = "OCCASION_NAME")
	private String occasionName;

	@Temporal(TemporalType.DATE)
	@Column(name = "OCCASION_DATE")
	private Date occasionDate;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name = "MUHURTHAM_TIME")
	private String muhurthamTime;

	@Column(name = "BPERSON_CITY")
	private String bpersonCity;

	@Column(name = "BGPERSON_CITY")
	private String bgpersonCity;

	@Column(name = "BAGEPROOF_TYPE")
	private String bageproofType;

	@Column(name = "BGAGEPROOF_TYPE")
	private String bgageproofType;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
    
	@Column(name="B_GAURDIAN_AADHAR_NUMBER")
    private String bGuardianAadharNo;
	
	@Column(name="BG_GAURDIAN_AADHAR_NUMBER")
    private String bgGuardianAadharNo;
	
	@Column(name="B_MOTHERNAME")
    private String bMotherName;
   
	@Column(name="BG_MOTHERNAME")
	private String bgMotherName;
    
	@Column(name="B_MOTHER_AADHAR_NUMBER")
	private String bMotherAadharNo;
	
	@Column(name="BG_MOTHER_AADHAR_NUMBER")
    private String bgMotherAadharNo;
    
    @Column(name="B_AADHAR_NUMBER")
	private String bAadharNo;
    
    @Column(name="BG_AADHAR_NUMBER")
	private String bgAadharNo;
    
    @Column(name="BG_FATHER_NAME")
   	private String bgfatherName;
    
    @Column(name="B_FATHER_NAME")
   	private String bfatherName;
    
    @Column(name="B_ID_PROOF_NUMBER")
   	private String bidProofNumber;
    
    @Column(name="BG_ID_PROOF_NUMBER")
   	private String bgidProofNumber;
    
    @Column(name="BG_FATHER_AADHAR_NUMBER")
    private String bgFatherAadharNo;
	
	@Column(name="B_FATHER_AADHAR_NUMBER")
    private String bFatherAadharNo;
	
	
	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	public PilgrimMarriageDtl() {
	}

	public long getPilgrimMarriageId() {
		return this.pilgrimMarriageId;
	}

	public void setPilgrimMarriageId(long pilgrimMarriageId) {
		this.pilgrimMarriageId = pilgrimMarriageId;
	}

	public String getBaddressLine1() {
		return this.baddressLine1;
	}

	public void setBaddressLine1(String baddressLine1) {
		this.baddressLine1 = baddressLine1;
	}

	public String getBaddressLine2() {
		return this.baddressLine2;
	}

	public void setBaddressLine2(String baddressLine2) {
		this.baddressLine2 = baddressLine2;
	}

	public BigDecimal getBage() {
		return this.bage;
	}

	public void setBage(BigDecimal bage) {
		this.bage = bage;
	}

	public String getBcommunity() {
		return this.bcommunity;
	}

	public void setBcommunity(String bcommunity) {
		this.bcommunity = bcommunity;
	}

	public Date getBdob() {
		return this.bdob;
	}

	public void setBdob(Date bdob) {
		this.bdob = bdob;
	}

	public String getBemail() {
		return this.bemail;
	}

	public void setBemail(String bemail) {
		this.bemail = bemail;
	}

	public String getBgaddressLine1() {
		return this.bgaddressLine1;
	}

	public void setBgaddressLine1(String bgaddressLine1) {
		this.bgaddressLine1 = bgaddressLine1;
	}

	public String getBgaddressLine2() {
		return this.bgaddressLine2;
	}

	public void setBgaddressLine2(String bgaddressLine2) {
		this.bgaddressLine2 = bgaddressLine2;
	}

	public BigDecimal getBgage() {
		return this.bgage;
	}

	public void setBgage(BigDecimal bgage) {
		this.bgage = bgage;
	}

	public String getBgcommunity() {
		return this.bgcommunity;
	}

	public void setBgcommunity(String bgcommunity) {
		this.bgcommunity = bgcommunity;
	}

	public Date getBgdob() {
		return this.bgdob;
	}

	public void setBgdob(Date bgdob) {
		this.bgdob = bgdob;
	}

	public String getBgemail() {
		return this.bgemail;
	}

	public void setBgemail(String bgemail) {
		this.bgemail = bgemail;
	}

	public String getBgguardianIdproofType() {
		return this.bgguardianIdproofType;
	}

	public void setBgguardianIdproofType(String bgguardianIdproofType) {
		this.bgguardianIdproofType = bgguardianIdproofType;
	}

	public String getBgguardianName() {
		return this.bgguardianName;
	}

	public void setBgguardianName(String bgguardianName) {
		this.bgguardianName = bgguardianName;
	}

	public String getBgidproofType() {
		return this.bgidproofType;
	}

	public void setBgidproofType(String bgidproofType) {
		this.bgidproofType = bgidproofType;
	}

	public String getBgmobile() {
		return this.bgmobile;
	}

	public void setBgmobile(String bgmobile) {
		this.bgmobile = bgmobile;
	}

	public String getBgname() {
		return this.bgname;
	}

	public void setBgname(String bgname) {
		this.bgname = bgname;
	}

	public BigDecimal getBgpersonCountry() {
		return this.bgpersonCountry;
	}

	public void setBgpersonCountry(BigDecimal bgpersonCountry) {
		this.bgpersonCountry = bgpersonCountry;
	}

	public String getBgpersonState() {
		return this.bgpersonState;
	}

	public void setBgpersonState(String bgpersonState) {
		this.bgpersonState = bgpersonState;
	}

	public String getBgpersonZipCode() {
		return this.bgpersonZipCode;
	}

	public void setBgpersonZipCode(String bgpersonZipCode) {
		this.bgpersonZipCode = bgpersonZipCode;
	}

	public String getBgsurname() {
		return this.bgsurname;
	}

	public void setBgsurname(String bgsurname) {
		this.bgsurname = bgsurname;
	}
	
	public String getBguardianIdproofType() {
		return this.bguardianIdproofType;
	}

	public void setBguardianIdproofType(String bguardianIdproofType) {
		this.bguardianIdproofType = bguardianIdproofType;
	}

	public String getBguardianName() {
		return this.bguardianName;
	}

	public void setBguardianName(String bguardianName) {
		this.bguardianName = bguardianName;
	}

	public String getBidproofType() {
		return this.bidproofType;
	}

	public void setBidproofType(String bidproofType) {
		this.bidproofType = bidproofType;
	}

	public String getBmobile() {
		return this.bmobile;
	}

	public void setBmobile(String bmobile) {
		this.bmobile = bmobile;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public BigDecimal getBpersonCountry() {
		return this.bpersonCountry;
	}

	public void setBpersonCountry(BigDecimal bpersonCountry) {
		this.bpersonCountry = bpersonCountry;
	}

	public String getBpersonState() {
		return this.bpersonState;
	}

	public void setBpersonState(String bpersonState) {
		this.bpersonState = bpersonState;
	}

	public String getBpersonZipCode() {
		return this.bpersonZipCode;
	}

	public void setBpersonZipCode(String bpersonZipCode) {
		this.bpersonZipCode = bpersonZipCode;
	}

	public String getBsurname() {
		return this.bsurname;
	}

	public void setBsurname(String bsurname) {
		this.bsurname = bsurname;
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

	public String getKvbookingId() {
		return this.kvbookingId;
	}

	public void setKvbookingId(String kvbookingId) {
		this.kvbookingId = kvbookingId;
	}

	public String getMaxallowedPersons() {
		return this.maxallowedPersons;
	}

	public void setMaxallowedPersons(String maxallowedPersons) {
		this.maxallowedPersons = maxallowedPersons;
	}

	public Date getMuhurthamDate() {
		return this.muhurthamDate;
	}

	public void setMuhurthamDate(Date muhurthamDate) {
		this.muhurthamDate = muhurthamDate;
	}

	public Date getOccasionDate() {
		return this.occasionDate;
	}

	public void setOccasionDate(Date occasionDate) {
		this.occasionDate = occasionDate;
	}

	public String getOccasionName() {
		return this.occasionName;
	}

	public void setOccasionName(String occasionName) {
		this.occasionName = occasionName;
	}

	public String getReportingPlace() {
		return this.reportingPlace;
	}

	public void setReportingPlace(String reportingPlace) {
		this.reportingPlace = reportingPlace;
	}

	public Date getReportingTime() {
		return this.reportingTime;
	}

	public void setReportingTime(Date reportingTime) {
		this.reportingTime = reportingTime;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMuhurthamTime() {
		return muhurthamTime;
	}

	public void setMuhurthamTime(String muhuthamTime) {
		this.muhurthamTime = muhuthamTime;
	}

	public String getBpersonCity() {
		return bpersonCity;
	}

	public void setBpersonCity(String bpersonCity) {
		this.bpersonCity = bpersonCity;
	}

	public String getBgpersonCity() {
		return bgpersonCity;
	}

	public void setBgpersonCity(String bgpersonCity) {
		this.bgpersonCity = bgpersonCity;
	}

	public String getBageproofType() {
		return bageproofType;
	}

	public void setBageproofType(String bageproofType) {
		this.bageproofType = bageproofType;
	}

	public String getBgageproofType() {
		return bgageproofType;
	}

	public void setBgageproofType(String bgageproofType) {
		this.bgageproofType = bgageproofType;
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

	public String getbGuardianAadharNo() {
		return bGuardianAadharNo;
	}

	public void setbGuardianAadharNo(String bGuardianAadharNo) {
		this.bGuardianAadharNo = bGuardianAadharNo;
	}

	public String getBgGuardianAadharNo() {
		return bgGuardianAadharNo;
	}

	public void setBgGuardianAadharNo(String bgGuardianAadharNo) {
		this.bgGuardianAadharNo = bgGuardianAadharNo;
	}

	public String getbMotherName() {
		return bMotherName;
	}

	public void setbMotherName(String bMotherName) {
		this.bMotherName = bMotherName;
	}

	public String getBgMotherName() {
		return bgMotherName;
	}

	public void setBgMotherName(String bgMotherName) {
		this.bgMotherName = bgMotherName;
	}

	public String getbMotherAadharNo() {
		return bMotherAadharNo;
	}

	public void setbMotherAadharNo(String bMotherAadharNo) {
		this.bMotherAadharNo = bMotherAadharNo;
	}

	public String getBgMotherAadharNo() {
		return bgMotherAadharNo;
	}

	public void setBgMotherAadharNo(String bgMotherAadharNo) {
		this.bgMotherAadharNo = bgMotherAadharNo;
	}

	public String getbAadharNo() {
		return bAadharNo;
	}

	public void setbAadharNo(String bAadharNo) {
		this.bAadharNo = bAadharNo;
	}

	public String getBgAadharNo() {
		return bgAadharNo;
	}

	public void setBgAadharNo(String bgAadharNo) {
		this.bgAadharNo = bgAadharNo;
	}

	public String getBgfatherName() {
		return bgfatherName;
	}

	public void setBgfatherName(String bgfatherName) {
		this.bgfatherName = bgfatherName;
	}

	public String getBfatherName() {
		return bfatherName;
	}

	public void setBfatherName(String bfatherName) {
		this.bfatherName = bfatherName;
	}

	public String getBidProofNumber() {
		return bidProofNumber;
	}

	public void setBidProofNumber(String bidProofNumber) {
		this.bidProofNumber = bidProofNumber;
	}

	public String getBgidProofNumber() {
		return bgidProofNumber;
	}

	public void setBgidProofNumber(String bgidProofNumber) {
		this.bgidProofNumber = bgidProofNumber;
	}

	public String getBgFatherAadharNo() {
		return bgFatherAadharNo;
	}

	public void setBgFatherAadharNo(String bgFatherAadharNo) {
		this.bgFatherAadharNo = bgFatherAadharNo;
	}

	public String getbFatherAadharNo() {
		return bFatherAadharNo;
	}

	public void setbFatherAadharNo(String bFatherAadharNo) {
		this.bFatherAadharNo = bFatherAadharNo;
	}
	
	

}