package com.ttd.km.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eaccommodation.entity.AccomBooking;
@Entity
@Table(name = "KM_BOOKING_DETAILS")
@NamedQuery(name = "KMBookingDetails.findAll", query = "SELECT k FROM KMBookingDetails  k")
public class KMBookingDetails implements Serializable{
	private static final long serialVersionUID = 1L;

	/*@Id
	@SequenceGenerator(name = "KM_BOOKING_SEQ_GENERATOR", sequenceName = "KM_BOOKING_SEQ_GENERATOR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KM_BOOKING_SEQ_GENERATOR")*/
	@Id
	@SequenceGenerator(name = "KM_BOOKING_DELS_ID_SEQ_GENERATOR", sequenceName = "KM_BOOKING_DELS_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KM_BOOKING_DELS_ID_SEQ_GENERATOR")
	@Column(name="KM_BOOKING_DELS_ID")
	private long kmBookingDelsID;
	
	@OneToOne
	@JoinColumn(name="KM_BOOKING_ID")
	private KMBooking kmBooking;
	
	
	@Column(name="KM_FUNCTION_ID")
	private long kmFunctionId;
	
	@Column(name="FUNCTION_NAME")
	private String kmFunctionName;
	
	@Column(name="PILGRIM_ID")
	private long pilgrimId;
	
	@Column(name="PILGRIM_NAME")
	private String  pilgrimName;
	
	@Column(name="PILGRIM_AGE")
	private long pilgrimDOB;
	
	@Column(name="PILGRIM_GENDER")
	private String pilgrimGender;
	
	
	@Column(name="PILGRIM_ID_PROOF_TYPE")
	private String pilgrimIdProofType;
	
	@Column(name="PILGRIM_IDPROOF_NO")
	private String pilgrimIdProofNumber;
	
	@Column(name="APPLICANT_NAME")
	private String applicantName;
	
	@Column(name="APPLICANT_AGE")
	private long applicantDOB;
	
	@Column(name="APPLICANT_GENDER")
	private String applicationGender;
	
	@Column(name="APPLICANT_ID_PROOF_TYPE")
	private String applicationIdproofType;
	
	@Column(name="APPLICANT_IDPROOF_NO")
	private String applicantIdProofNumber;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="MOBILE_NUMBER")
	private long mobileNumber;
	
	@Column(name="ADDERESS_DTLS")
	private String addressDtls;
	
	@Column(name="BRIDE_NAME")
	private String brideName;
	
	@Column(name="BRIDE_SURNAME")
	private String brideSurname;
	
	@Temporal(TemporalType.DATE)
	@Column(name="BRIDE_DOB")
	private Date brideDate;
	
	@Column(name="BRIDE_ID_PROOF_TYPE")
	private String brideIdProofType;
	
	@Column(name="BRIDE_IDPROOF_NO")
	private String brideIdProofNumber;
	
	@Column(name="BRIDE_IMAGE")
	private String brideImage;
	
	@Column(name="BRIDE_IDPROOF_IMAGE")
	private String brideImageIdProof;
	
	
	
	
	@Column(name="BRIDEGROOM_IDPROOF_IMAGE")
	private String brideGroomImageIdProof;
	
	@Column(name="BRIDEGROOM_NAME")
	private String brideGroomName;
	
	
	@Column(name="BRIDEGROOM_SURNAME")
	private String brideGroomSurname;
	
	@Temporal(TemporalType.DATE)
	@Column(name="BRIDEGROOM_DOB")
	private Date brideGroomDOB;
	
	@Column(name="BRIDEGROOM_ID_PROOF_TYPE")
	private String brideGroomIdProofType;
	
	@Column(name="BRIDEGROOM_IDPROOF_NO")
	private String brideGroomIdProofNumber;
	
	@Column(name="BRIDEGROOM_IMAGE")
	private String brideGroomImage;
	
	@Column(name="CREATED_BY")
	private long createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;
	
	@Column(name="UPDATED_BY")
	private long updatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	
	@Column(name="ROW_STATUS")
	private long rowStatus;

	@Column(name="BRIDE_MOBILE")
	private String brideMobile;
	
	@Column(name="BRIDEGROOM_MOBILE")
	private String brideGroomMobile;
	
	@Column(name="NAME_OF_APPLICANT_ORG_PARENT")
	private String orgParent;
	
	@Column(name="SELF")
	private String self;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ID_PROOF")
	private String idProof;
	
	@Column(name="ID_NUMBER")
	private String idNumber;
	
	@Column(name="ID_FILE_UPLOAD")
	private String idFileUpload;
	
	
	@Column(name="PHOTO_UPLOAD")
	private String photoUpload;
	
	@Column(name="RELATION_SHIP")
	private String relationSHip;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="BABY_DATE_OF_BIRTH")
	private Date babyDOB;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="APPLICANT_DOB")
	private Date applicantDateOfBirth;
	
	@Column(name="AGE")
	private Long age;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DOB")
	private Date DOB;
	
	@Column(name="BABY_DATE_OF_BIRTH_PROOF")
	private String babyIDPrrof;
	
	@Column(name="NAME_OF_EMPLOYEE")
	private String nameofEmployee;
	
	@Column(name="EMPLOYEE_ID")
	private String employeeId;
	
	@Column(name="GIS_NO_PPO_NO")
	private String gisnoppono;
	
	@Column(name="PROCEEDINGS_NO")
	private String proceedingNo;
	
	@Column(name="PROCEEDINGS_UPLOAD")
	private String proceedingupload;
	
	@Column(name="DECLARATION_EMPLOYER_UPLOAD")
	private String declarationEmployerUpload;
	
	@Column(name="AMOUNT")
	private Long amount;
	
	@Column(name="REGISTRATION_NO_ORGANISATION")
	private String regNoOrg;
	
	@Column(name="REGISTRATION_PROOF_UPLOAD")
	private String regProofUpload;
	
	@Column(name="ID_PROFF_ORGANISOR")
	private String idProofOrg;
	
	@Column(name="PILGRIM_ID_PROOF_IMAGE")
	private String pilgrimIDProofImage;
	
	@Column(name="PILGIRM_PHOTO_UPLOAD")
	private String pilgrimPhotoUpload;
	
	@Column(name="PILGRIM_PASSBOOK_NO")
	private String piligrimPassBookImage;
	
	
	@Column(name="CANCELLATION_LETTER")
	private String cancelLetter;
	
	
	@Column(name="PERMISSION_CERTIFICATE")
	private String permissionCertificate;
	
	
	
	
	public String getPermissionCertificate() {
		return permissionCertificate;
	}


	public void setPermissionCertificate(String permissionCertificate) {
		this.permissionCertificate = permissionCertificate;
	}


	public String getPilgrimIDProofImage() {
		return pilgrimIDProofImage;
	}


	public void setPilgrimIDProofImage(String pilgrimIDProofImage) {
		this.pilgrimIDProofImage = pilgrimIDProofImage;
	}


	public String getPilgrimPhotoUpload() {
		return pilgrimPhotoUpload;
	}


	public void setPilgrimPhotoUpload(String pilgrimPhotoUpload) {
		this.pilgrimPhotoUpload = pilgrimPhotoUpload;
	}


	public long getKmBookingDelsID() {
		return kmBookingDelsID;
	}


	public void setKmBookingDelsID(long kmBookingDelsID) {
		this.kmBookingDelsID = kmBookingDelsID;
	}


	

	public long getKmFunctionId() {
		return kmFunctionId;
	}


	public void setKmFunctionId(long kmFunctionId) {
		this.kmFunctionId = kmFunctionId;
	}


	public String getKmFunctionName() {
		return kmFunctionName;
	}


	public void setKmFunctionName(String kmFunctionName) {
		this.kmFunctionName = kmFunctionName;
	}


	public long getPilgrimId() {
		return pilgrimId;
	}


	public void setPilgrimId(long pilgrimId) {
		this.pilgrimId = pilgrimId;
	}


	public String getPilgrimName() {
		return pilgrimName;
	}


	public void setPilgrimName(String pilgrimName) {
		this.pilgrimName = pilgrimName;
	}





	public String getPilgrimGender() {
		return pilgrimGender;
	}


	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}


	public String getPilgrimIdProofType() {
		return pilgrimIdProofType;
	}


	public void setPilgrimIdProofType(String pilgrimIdProofType) {
		this.pilgrimIdProofType = pilgrimIdProofType;
	}





	public String getApplicantName() {
		return applicantName;
	}


	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	


	public String getApplicationGender() {
		return applicationGender;
	}


	public void setApplicationGender(String applicationGender) {
		this.applicationGender = applicationGender;
	}


	public String getApplicationIdproofType() {
		return applicationIdproofType;
	}


	public void setApplicationIdproofType(String applicationIdproofType) {
		this.applicationIdproofType = applicationIdproofType;
	}




	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddressDtls() {
		return addressDtls;
	}


	public void setAddressDtls(String addressDtls) {
		this.addressDtls = addressDtls;
	}


	public String getBrideName() {
		return brideName;
	}


	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}


	public String getBrideSurname() {
		return brideSurname;
	}


	public void setBrideSurname(String brideSurname) {
		this.brideSurname = brideSurname;
	}


	public Date getBrideDate() {
		return brideDate;
	}


	public void setBrideDate(Date brideDate) {
		this.brideDate = brideDate;
	}


	public String getBrideIdProofType() {
		return brideIdProofType;
	}


	public void setBrideIdProofType(String brideIdProofType) {
		this.brideIdProofType = brideIdProofType;
	}




	public String getBrideImage() {
		return brideImage;
	}


	public void setBrideImage(String brideImage) {
		this.brideImage = brideImage;
	}


	public String getBrideGroomName() {
		return brideGroomName;
	}


	public void setBrideGroomName(String brideGroomName) {
		this.brideGroomName = brideGroomName;
	}


	public String getBrideGroomSurname() {
		return brideGroomSurname;
	}


	public void setBrideGroomSurname(String brideGroomSurname) {
		this.brideGroomSurname = brideGroomSurname;
	}


	public Date getBrideGroomDOB() {
		return brideGroomDOB;
	}


	public void setBrideGroomDOB(Date brideGroomDOB) {
		this.brideGroomDOB = brideGroomDOB;
	}


	public String getBrideGroomIdProofType() {
		return brideGroomIdProofType;
	}


	public void setBrideGroomIdProofType(String brideGroomIdProofType) {
		this.brideGroomIdProofType = brideGroomIdProofType;
	}





	public String getBrideGroomImage() {
		return brideGroomImage;
	}


	public void setBrideGroomImage(String brideGroomImage) {
		this.brideGroomImage = brideGroomImage;
	}


	public long getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}


	public long getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdatedTime() {
		return updatedTime;
	}


	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}


	public long getRowStatus() {
		return rowStatus;
	}


	public KMBooking getKmBooking() {
		return kmBooking;
	}


	public void setKmBooking(KMBooking kmBooking) {
		this.kmBooking = kmBooking;
	}


	public void setRowStatus(long rowStatus) {
		this.rowStatus = rowStatus;
	}


	public String getBrideMobile() {
		return brideMobile;
	}


	public void setBrideMobile(String brideMobile) {
		this.brideMobile = brideMobile;
	}


	public String getBrideGroomMobile() {
		return brideGroomMobile;
	}


	public void setBrideGroomMobile(String brideGroomMobile) {
		this.brideGroomMobile = brideGroomMobile;
	}


	public String getOrgParent() {
		return orgParent;
	}


	public void setOrgParent(String orgParent) {
		this.orgParent = orgParent;
	}


	public String getSelf() {
		return self;
	}


	public void setSelf(String self) {
		this.self = self;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIdProof() {
		return idProof;
	}


	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}



	public String getIdFileUpload() {
		return idFileUpload;
	}


	public void setIdFileUpload(String idFileUpload) {
		this.idFileUpload = idFileUpload;
	}


	public String getPhotoUpload() {
		return photoUpload;
	}


	public void setPhotoUpload(String photoUpload) {
		this.photoUpload = photoUpload;
	}


	public String getRelationSHip() {
		return relationSHip;
	}


	public void setRelationSHip(String relationSHip) {
		this.relationSHip = relationSHip;
	}


	public Date getBabyDOB() {
		return babyDOB;
	}


	public void setBabyDOB(Date babyDOB) {
		this.babyDOB = babyDOB;
	}


	public Long getAge() {
		return age;
	}


	public void setAge(Long age) {
		this.age = age;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getBabyIDPrrof() {
		return babyIDPrrof;
	}


	public void setBabyIDPrrof(String babyIDPrrof) {
		this.babyIDPrrof = babyIDPrrof;
	}


	public String getNameofEmployee() {
		return nameofEmployee;
	}


	public void setNameofEmployee(String nameofEmployee) {
		this.nameofEmployee = nameofEmployee;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getGisnoppono() {
		return gisnoppono;
	}


	public void setGisnoppono(String gisnoppono) {
		this.gisnoppono = gisnoppono;
	}


	public String getProceedingNo() {
		return proceedingNo;
	}


	public void setProceedingNo(String proceedingNo) {
		this.proceedingNo = proceedingNo;
	}


	public String getProceedingupload() {
		return proceedingupload;
	}


	public void setProceedingupload(String proceedingupload) {
		this.proceedingupload = proceedingupload;
	}


	public String getDeclarationEmployerUpload() {
		return declarationEmployerUpload;
	}


	public void setDeclarationEmployerUpload(String declarationEmployerUpload) {
		this.declarationEmployerUpload = declarationEmployerUpload;
	}


	public Long getAmount() {
		return amount;
	}


	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public String getRegNoOrg() {
		return regNoOrg;
	}


	public void setRegNoOrg(String regNoOrg) {
		this.regNoOrg = regNoOrg;
	}


	public String getRegProofUpload() {
		return regProofUpload;
	}


	public void setRegProofUpload(String regProofUpload) {
		this.regProofUpload = regProofUpload;
	}


	public String getIdProofOrg() {
		return idProofOrg;
	}


	public void setIdProofOrg(String idProofOrg) {
		this.idProofOrg = idProofOrg;
	}


	public long getApplicantDOB() {
		return applicantDOB;
	}


	public void setApplicantDOB(long applicantDOB) {
		this.applicantDOB = applicantDOB;
	}


	public long getPilgrimDOB() {
		return pilgrimDOB;
	}


	public void setPilgrimDOB(long pilgrimDOB) {
		this.pilgrimDOB = pilgrimDOB;
	}


	public String getBrideImageIdProof() {
		return brideImageIdProof;
	}


	public void setBrideImageIdProof(String brideImageIdProof) {
		this.brideImageIdProof = brideImageIdProof;
	}


	public String getBrideGroomImageIdProof() {
		return brideGroomImageIdProof;
	}


	public void setBrideGroomImageIdProof(String brideGroomImageIdProof) {
		this.brideGroomImageIdProof = brideGroomImageIdProof;
	}


	public String getPilgrimIdProofNumber() {
		return pilgrimIdProofNumber;
	}


	public void setPilgrimIdProofNumber(String pilgrimIdProofNumber) {
		this.pilgrimIdProofNumber = pilgrimIdProofNumber;
	}


	public String getApplicantIdProofNumber() {
		return applicantIdProofNumber;
	}


	public void setApplicantIdProofNumber(String applicantIdProofNumber) {
		this.applicantIdProofNumber = applicantIdProofNumber;
	}


	public String getBrideIdProofNumber() {
		return brideIdProofNumber;
	}


	public void setBrideIdProofNumber(String brideIdProofNumber) {
		this.brideIdProofNumber = brideIdProofNumber;
	}


	public String getBrideGroomIdProofNumber() {
		return brideGroomIdProofNumber;
	}


	public void setBrideGroomIdProofNumber(String brideGroomIdProofNumber) {
		this.brideGroomIdProofNumber = brideGroomIdProofNumber;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public Date getApplicantDateOfBirth() {
		return applicantDateOfBirth;
	}


	public void setApplicantDateOfBirth(Date applicantDateOfBirth) {
		this.applicantDateOfBirth = applicantDateOfBirth;
	}


	public String getPiligrimPassBookImage() {
		return piligrimPassBookImage;
	}


	public void setPiligrimPassBookImage(String piligrimPassBookImage) {
		this.piligrimPassBookImage = piligrimPassBookImage;
	}


	public String getCancelLetter() {
		return cancelLetter;
	}


	public void setCancelLetter(String cancelLetter) {
		this.cancelLetter = cancelLetter;
	}
	
}
