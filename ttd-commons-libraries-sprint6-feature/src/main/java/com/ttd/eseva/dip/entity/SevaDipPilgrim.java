package com.ttd.eseva.dip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.CommonValueMaster;
import com.ttd.common.entity.ImagesStore;
import com.ttd.common.entity.ServiceTypeMaster;

@Entity
@Table(name = "SEVA_DIP_PILGRIM")
@NamedQuery(name = "SevaDipPilgrim.findAll", query = "SELECT e FROM SevaDipPilgrim e")
public class SevaDipPilgrim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DIP_PILGRIM_GENERATOR", sequenceName = "SEVA_DIP_PILGRIM_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIP_PILGRIM_GENERATOR")
	@Column(name = "SEVA_DIP_PILGRIM_ID")
	private Long sevaDipPilgrimId;

	@ManyToOne
	@JoinColumn(name = "SEVA_DIP_REG_ID")
	private SevaDipRegistrations sevaDipRegistrations;
	
	@Column(name = "SEVA_DIP_FORM_ID")
	private String sevaDipFormId;
	
	@Column(name = "PILGRIM_NAME")
	private String pilgrimName;

	@Column(name = "PILGRIM_MOBILE")
	private String pilgrimMobile;

	@Column(name = "PILGRIM_EMAIL")
	private String pilgrimEmail;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PILIGRIM_ID_PROOF_TYPE")
	private CommonValueMaster commonValueMaster;

	@Column(name = "PILIGRIM_ID_PROOF_NUMBER")
	private String piligrimIdNumber;

	@Column(name = "PILGRIM_IMAGE")
	private String piligrimImage;

	@Column(name = "PILGRIM_TYPE")
	private String piligrimType;

	@Column(name = "PILGRIM_AGE")
	private BigDecimal pilgrimAge;

	@Column(name = "PILGRIM_GENDER")
	private String pilgrimGender;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "IMAGE_ID")
	private ImagesStore imagesStore;
	
	@Column(name = "IS_USER_NRI")
	private String isUserNRI;
	
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "ANY_SEVA_OPTED")
	private String anySevaOpted;
	
	@Column(name = "SEVA_DIP_SCHEDULE_ID")
	private Long sevaDipScheduleId;
	

	public Long getSevaDipPilgrimId() {
		return sevaDipPilgrimId;
	}

	public void setSevaDipPilgrimId(Long sevaDipPilgrimId) {
		this.sevaDipPilgrimId = sevaDipPilgrimId;
	}

	public String getPilgrimName() {
		return pilgrimName;
	}

	public void setPilgrimName(String pilgrimName) {
		this.pilgrimName = pilgrimName;
	}

	public String getPilgrimMobile() {
		return pilgrimMobile;
	}

	public void setPilgrimMobile(String pilgrimMobile) {
		this.pilgrimMobile = pilgrimMobile;
	}

	public String getPilgrimEmail() {
		return pilgrimEmail;
	}

	public void setPilgrimEmail(String pilgrimEmail) {
		this.pilgrimEmail = pilgrimEmail;
	}

	public CommonValueMaster getCommonValueMaster() {
		return commonValueMaster;
	}

	public void setCommonValueMaster(CommonValueMaster commonValueMaster) {
		this.commonValueMaster = commonValueMaster;
	}

	public String getPiligrimIdNumber() {
		return piligrimIdNumber;
	}

	public void setPiligrimIdNumber(String piligrimIdNumber) {
		this.piligrimIdNumber = piligrimIdNumber;
	}

	public String getPiligrimImage() {
		return piligrimImage;
	}

	public void setPiligrimImage(String piligrimImage) {
		this.piligrimImage = piligrimImage;
	}

	public String getPiligrimType() {
		return piligrimType;
	}

	public void setPiligrimType(String piligrimType) {
		this.piligrimType = piligrimType;
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

	public ImagesStore getImagesStore() {
		return imagesStore;
	}

	public void setImagesStore(ImagesStore imagesStore) {
		this.imagesStore = imagesStore;
	}

	public String getIsUserNRI() {
		return isUserNRI;
	}

	public void setIsUserNRI(String isUserNRI) {
		this.isUserNRI = isUserNRI;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
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

	public String getSevaDipFormId() {
		return sevaDipFormId;
	}

	public void setSevaDipFormId(String sevaDipFormId) {
		this.sevaDipFormId = sevaDipFormId;
	}

	public SevaDipRegistrations getSevaDipRegistrations() {
		return sevaDipRegistrations;
	}

	public void setSevaDipRegistrations(SevaDipRegistrations sevaDipRegistrations) {
		this.sevaDipRegistrations = sevaDipRegistrations;
	}

	public String getAnySevaOpted() {
		return anySevaOpted;
	}

	public void setAnySevaOpted(String anySevaOpted) {
		this.anySevaOpted = anySevaOpted;
	}

	public Long getSevaDipScheduleId() {
		return sevaDipScheduleId;
	}

	public void setSevaDipScheduleId(Long sevaDipScheduleId) {
		this.sevaDipScheduleId = sevaDipScheduleId;
	}
	
}
