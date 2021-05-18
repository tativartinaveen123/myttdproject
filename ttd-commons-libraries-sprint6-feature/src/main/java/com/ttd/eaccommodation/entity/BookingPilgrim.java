package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.ImagesStore;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.eseva.entity.SevaBookingDetail;

/**
 * The persistent class for the BOOKING_PILGRIM database table.
 * 
 */
@Entity
@Table(name = "BOOKING_PILGRIM")
@NamedQuery(name = "BookingPilgrim.findAll", query = "SELECT b FROM BookingPilgrim b")
public class BookingPilgrim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "BOOKING_PILGRIM_PILGRIMID_GENERATOR", sequenceName = "BOOKING_PILGRIM_ACCOM_BOOKING_", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKING_PILGRIM_PILGRIMID_GENERATOR")
	@Column(name = "PILGRIM_ID")
	private long pilgrimId;

	@Column(name = "BOOKING_ID")
	private String bookingId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "PILGRIM_AGE")
	private BigDecimal pilgrimAge;

	@Column(name = "PILGRIM_GENDER")
	private String pilgrimGender;

	@Column(name = "PILIGRIM_ID_PROOF_NUMBER")
	private String piligrimIdProofNumber;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "USER_ADDR1")
	private String userAddr1;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	// @Lob
	@Column(name = "USER_IMAGE")
	private String userImage;

	@Column(name = "USER_MOBILE")
	private String userMobile;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_TYPE")
	private String userType;

	// bi-directional many-to-one association to AccomBooking
//	@OneToMany(mappedBy = "bookingPilgrim")
//	private List<AccomBooking> accomBookings;

	// bi-directional many-to-one association to CommonValueMaster
	@ManyToOne
	@JoinColumn(name = "PILIGRIM_ID_PROOF_TYPE")
	private CommonValueMaster commonValueMaster;

	// bi-directional many-to-one association to ImagesStore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "IMAGE_ID")
	private ImagesStore imagesStore;

	// bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to SevaBookingDetail
	@OneToMany(mappedBy = "bookingPilgrim")
	private List<SevaBookingDetail> sevaBookingDetails;
	
	@Column(name = "GOTHRAM")
	private String gothram;


	@Column(name = "FAMILY_NAMES")
	private String familyNames;

	@Column(name = "USER_CITY")
	private String userCity;

	@Column(name = "USER_STATE")
	private String userState;

	
	@Column(name = "USER_COUNTRY")
	private String userCountry;

	@Column(name = "USER_ZIP_CODE")
	private String userZipCode;

	
	@Column(name = "USER_DISTRICT")
	private String userDistrict;

	public String getUserDistrict() {
		return userDistrict;
	}

	public void setUserDistrict(String userDistrict) {
		this.userDistrict = userDistrict;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserZipCode() {
		return userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}

	public String getGothram() {
		return gothram;
	}

	public void setGothram(String gothram) {
		this.gothram = gothram;
	}

	public String getFamilyNames() {
		return familyNames;
	}

	public void setFamilyNames(String familyNames) {
		this.familyNames = familyNames;
	}

	public BookingPilgrim() {
	}

	public long getPilgrimId() {
		return this.pilgrimId;
	}

	public void setPilgrimId(long pilgrimId) {
		this.pilgrimId = pilgrimId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
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

	public BigDecimal getPilgrimAge() {
		return this.pilgrimAge;
	}

	public void setPilgrimAge(BigDecimal pilgrimAge) {
		this.pilgrimAge = pilgrimAge;
	}

	public String getPilgrimGender() {
		return this.pilgrimGender;
	}

	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}

	public String getPiligrimIdProofNumber() {
		return this.piligrimIdProofNumber;
	}

	public void setPiligrimIdProofNumber(String piligrimIdProofNumber) {
		this.piligrimIdProofNumber = piligrimIdProofNumber;
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

	public String getUserAddr1() {
		return this.userAddr1;
	}

	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImage() {
		return this.userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

//	public List<AccomBooking> getAccomBookings() {
//		return this.accomBookings;
//	}
//
//	public void setAccomBookings(List<AccomBooking> accomBookings) {
//		this.accomBookings = accomBookings;
//	}
//
//	public AccomBooking addAccomBooking(AccomBooking accomBooking) {
//		getAccomBookings().add(accomBooking);
//		accomBooking.setBookingPilgrim(this);
//
//		return accomBooking;
//	}
//
//	public AccomBooking removeAccomBooking(AccomBooking accomBooking) {
//		getAccomBookings().remove(accomBooking);
//		accomBooking.setBookingPilgrim(null);
//
//		return accomBooking;
//	}

	public CommonValueMaster getCommonValueMaster() {
		return this.commonValueMaster;
	}

	public void setCommonValueMaster(CommonValueMaster commonValueMaster) {
		this.commonValueMaster = commonValueMaster;
	}

	public ImagesStore getImagesStore() {
		return this.imagesStore;
	}

	public void setImagesStore(ImagesStore imagesStore) {
		this.imagesStore = imagesStore;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public List<SevaBookingDetail> getSevaBookingDetails() {
		return this.sevaBookingDetails;
	}

	public void setSevaBookingDetails(List<SevaBookingDetail> sevaBookingDetails) {
		this.sevaBookingDetails = sevaBookingDetails;
	}

	public SevaBookingDetail addSevaBookingDetail(
			SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().add(sevaBookingDetail);
		sevaBookingDetail.setBookingPilgrim(this);

		return sevaBookingDetail;
	}

	public SevaBookingDetail removeSevaBookingDetail(
			SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().remove(sevaBookingDetail);
		sevaBookingDetail.setBookingPilgrim(null);

		return sevaBookingDetail;
	}

}