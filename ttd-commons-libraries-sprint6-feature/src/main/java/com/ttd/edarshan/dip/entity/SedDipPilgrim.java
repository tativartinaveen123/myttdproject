package com.ttd.edarshan.dip.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.ImagesStore;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.eseva.dip.entity.SevaDipRegistrations;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SED_DIP_PILGRIM database table.
 * 
 */
@Entity
@Table(name="SED_DIP_PILGRIM")
@NamedQuery(name="SedDipPilgrim.findAll", query="SELECT s FROM SedDipPilgrim s")
public class SedDipPilgrim implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "DIP_PILGRIM_GENERATOR", sequenceName = "SED_DIP_PILGRIM_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIP_PILGRIM_GENERATOR")
	@Column(name="SED_DIP_PILGRIM_ID")
	private BigDecimal sedDipPilgrimId;

	@Column(name="ANY_SED_OPTED")
	private String anySedOpted;
	
	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="IMAGE_ID")
	private ImagesStore imagesStore;

	@Column(name="IS_USER_NRI")
	private String isUserNri;

	@Column(name="PILGRIM_AGE")
	private BigDecimal pilgrimAge;

	@Column(name="PILGRIM_EMAIL")
	private String pilgrimEmail;

	@Column(name="PILGRIM_GENDER")
	private String pilgrimGender;

	@Column(name="PILGRIM_IMAGE")
	private String pilgrimImage;

	@Column(name="PILGRIM_MOBILE")
	private String pilgrimMobile;

	@Column(name="PILGRIM_NAME")
	private String pilgrimName;

	@Column(name="PILGRIM_TYPE")
	private String pilgrimType;

	@Column(name="PILIGRIM_ID_PROOF_NUMBER")
	private String piligrimIdProofNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PILIGRIM_ID_PROOF_TYPE")
	private CommonValueMaster commonValueMaster;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SED_DIP_FORM_ID")
	private String sedDipFormId;

	@ManyToOne
	@JoinColumn(name = "SED_DIP_REG_ID")
	private SedDipRegistration sedDipRegistration;
	
	@Column(name="SED_DIP_SCHEDULE_ID")
	private BigDecimal sedDipScheduleId;

	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public SedDipPilgrim() {
	}

	public String getAnySedOpted() {
		return this.anySedOpted;
	}

	public void setAnySedOpted(String anySedOpted) {
		this.anySedOpted = anySedOpted;
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

	
	public ImagesStore getImagesStore() {
		return imagesStore;
	}

	public void setImagesStore(ImagesStore imagesStore) {
		this.imagesStore = imagesStore;
	}

	public String getIsUserNri() {
		return this.isUserNri;
	}

	public void setIsUserNri(String isUserNri) {
		this.isUserNri = isUserNri;
	}

	public BigDecimal getPilgrimAge() {
		return this.pilgrimAge;
	}

	public void setPilgrimAge(BigDecimal pilgrimAge) {
		this.pilgrimAge = pilgrimAge;
	}

	public String getPilgrimEmail() {
		return this.pilgrimEmail;
	}

	public void setPilgrimEmail(String pilgrimEmail) {
		this.pilgrimEmail = pilgrimEmail;
	}

	public String getPilgrimGender() {
		return this.pilgrimGender;
	}

	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}

	public String getPilgrimImage() {
		return this.pilgrimImage;
	}

	public void setPilgrimImage(String pilgrimImage) {
		this.pilgrimImage = pilgrimImage;
	}

	public String getPilgrimMobile() {
		return this.pilgrimMobile;
	}

	public void setPilgrimMobile(String pilgrimMobile) {
		this.pilgrimMobile = pilgrimMobile;
	}

	public String getPilgrimName() {
		return this.pilgrimName;
	}

	public void setPilgrimName(String pilgrimName) {
		this.pilgrimName = pilgrimName;
	}

	public String getPilgrimType() {
		return this.pilgrimType;
	}

	public void setPilgrimType(String pilgrimType) {
		this.pilgrimType = pilgrimType;
	}

	public String getPiligrimIdProofNumber() {
		return this.piligrimIdProofNumber;
	}

	public void setPiligrimIdProofNumber(String piligrimIdProofNumber) {
		this.piligrimIdProofNumber = piligrimIdProofNumber;
	}

	
	public CommonValueMaster getCommonValueMaster() {
		return commonValueMaster;
	}

	public void setCommonValueMaster(CommonValueMaster commonValueMaster) {
		this.commonValueMaster = commonValueMaster;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSedDipFormId() {
		return this.sedDipFormId;
	}

	public void setSedDipFormId(String sedDipFormId) {
		this.sedDipFormId = sedDipFormId;
	}

	public BigDecimal getSedDipPilgrimId() {
		return this.sedDipPilgrimId;
	}

	public void setSedDipPilgrimId(BigDecimal sedDipPilgrimId) {
		this.sedDipPilgrimId = sedDipPilgrimId;
	}

	public BigDecimal getSedDipScheduleId() {
		return this.sedDipScheduleId;
	}

	public void setSedDipScheduleId(BigDecimal sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
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

	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public SedDipRegistration getSedDipRegistration() {
		return sedDipRegistration;
	}

	public void setSedDipRegistration(SedDipRegistration sedDipRegistration) {
		this.sedDipRegistration = sedDipRegistration;
	}
	
}