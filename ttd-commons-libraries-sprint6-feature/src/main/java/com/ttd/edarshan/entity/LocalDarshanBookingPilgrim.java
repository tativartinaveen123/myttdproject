package com.ttd.edarshan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
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

import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.ImagesStore;
import com.ttd.common.entity.ServiceTypeMaster;

/**
 * The persistent class for the DARSHAN_BOOKING_PILGRIM database table.
 * 
 */
@Entity
@Table(name = "LOCAL_DARSHAN_BOOKING_PILGRIM")
@NamedQuery(name = "LocalDarshanBookingPilgrim.findAll", query = "SELECT d FROM LocalDarshanBookingPilgrim d")
public class LocalDarshanBookingPilgrim implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "BOOKING_PILGRIM_PILGRIMID_GENERATOR", sequenceName = "DARSHAN_BOOKING_DARSHAN_BOOKIN", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKING_PILGRIM_PILGRIMID_GENERATOR")
	@Column(name = "PILGRIM_ID")
	private long pilgrimId;
	
	

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

	@Column(name = "USER_IMAGE")
	private String userImage;

	@Column(name = "USER_MOBILE")
	private String userMobile;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_TYPE")
	private String userType;

	// bi-directional many-to-one association to DarshanBooking
	@ManyToOne
	@JoinColumn(name = "BOOKING_ID")
	private LocalDarshanBooking localDarshanBooking;

	// bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	
	 @ManyToOne(cascade = CascadeType.ALL)	 
	  @JoinColumn(name = "PILIGRIM_ID_PROOF_TYPE")
	 private CommonValueMaster commonValueMaster;
	  
	  // bi-directional many-to-one association to ImagesStore
	  @ManyToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "IMAGE_ID") private ImagesStore imagesStore;
	 
	  @Column(name = "PILGRIM_BOOKING_ID")
		private String pilgrimBOokingId;
	  
	  
	public String getPilgrimBOokingId() {
		return pilgrimBOokingId;
	}

	public void setPilgrimBOokingId(String pilgrimBOokingId) {
		this.pilgrimBOokingId = pilgrimBOokingId;
	}

	public LocalDarshanBookingPilgrim() {
	}

	public long getPilgrimId() {
		return pilgrimId;
	}

	public void setPilgrimId(long pilgrimId) {
		this.pilgrimId = pilgrimId;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getPilgrimAge() {
		return pilgrimAge;
	}

	public void setPilgrimAge(BigDecimal pilgrimAge) {
		this.pilgrimAge = pilgrimAge;
	}

	public String getPilgrimGender() {
		return pilgrimGender;
	}

	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}

	public String getPiligrimIdProofNumber() {
		return piligrimIdProofNumber;
	}

	public void setPiligrimIdProofNumber(String piligrimIdProofNumber) {
		this.piligrimIdProofNumber = piligrimIdProofNumber;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUserAddr1() {
		return userAddr1;
	}

	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public LocalDarshanBooking getLocalDarshanBooking() {
		return localDarshanBooking;
	}

	public void setLocalDarshanBooking(LocalDarshanBooking localDarshanBooking) {
		this.localDarshanBooking = localDarshanBooking;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public CommonValueMaster getCommonValueMaster() {
		return commonValueMaster;
	}

	public void setCommonValueMaster(CommonValueMaster commonValueMaster) {
		this.commonValueMaster = commonValueMaster;
	}

	public ImagesStore getImagesStore() {
		return imagesStore;
	}

	public void setImagesStore(ImagesStore imagesStore) {
		this.imagesStore = imagesStore;
	}

	

}
