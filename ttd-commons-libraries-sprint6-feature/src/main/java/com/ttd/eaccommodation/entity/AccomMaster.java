package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eseva.entity.RequestWorkflow;


/**
 * The persistent class for the ACCOM_MASTER database table.
 * 
 */
@Entity
@Table(name="ACCOM_MASTER")
@NamedQuery(name="AccomMaster.findAll", query="SELECT a FROM AccomMaster a")
public class AccomMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOM_ID")
	private long accomId;

	@Column(name="ACCOM_AMENITIES_DESCR")
	private String accomAmenitiesDescr;

	@Column(name="ACCOM_CODE")
	private String accomCode;

	@Column(name="ACCOM_TYPE")
	private BigDecimal accomType;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CAUTION_DEPOSIT")
	private BigDecimal cautionDeposit;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="GUESTHOUSE_NAME")
	private String guesthouseName;

	@Column(name="LOCATION_NAME")
	private String locationName;

	@Column(name="MAX_PERSONS_BOOKING")
	private BigDecimal maxPersonsBooking;

	@Column(name="MIN_PERSONS_BOOKING")
	private BigDecimal minPersonsBooking;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	/*//bi-directional many-to-one association to AccomChnConf
	@OneToMany(mappedBy="accomMaster")
	private List<AccomChnConf> accomChnConfs;*/

	//bi-directional many-to-one association to AccomGuesthouseMaster
	@ManyToOne
	@JoinColumn(name="GUESTHOUSE_ID")
	private AccomGuesthouseMaster accomGuesthouseMaster;

	//bi-directional many-to-one association to AccomLocationMaster
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private AccomLocationMaster accomLocationMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	@Column(name="ADVANCE_CAUTION_DEPOSIT")
	private BigDecimal advCautionDeposit;
	public BigDecimal getAdvCautionDeposit() {
		return advCautionDeposit;
	}

	public void setAdvCautionDeposit(BigDecimal advCautionDeposit) {
		this.advCautionDeposit = advCautionDeposit;
	}

	public AccomMaster() {
	}

	public long getAccomId() {
		return this.accomId;
	}

	public void setAccomId(long accomId) {
		this.accomId = accomId;
	}

	public String getAccomAmenitiesDescr() {
		return this.accomAmenitiesDescr;
	}

	public void setAccomAmenitiesDescr(String accomAmenitiesDescr) {
		this.accomAmenitiesDescr = accomAmenitiesDescr;
	}

	public String getAccomCode() {
		return this.accomCode;
	}

	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	public BigDecimal getAccomType() {
		return this.accomType;
	}

	public void setAccomType(BigDecimal accomType) {
		this.accomType = accomType;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getCautionDeposit() {
		return this.cautionDeposit;
	}

	public void setCautionDeposit(BigDecimal cautionDeposit) {
		this.cautionDeposit = cautionDeposit;
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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getGuesthouseName() {
		return this.guesthouseName;
	}

	public void setGuesthouseName(String guesthouseName) {
		this.guesthouseName = guesthouseName;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public BigDecimal getMaxPersonsBooking() {
		return this.maxPersonsBooking;
	}

	public void setMaxPersonsBooking(BigDecimal maxPersonsBooking) {
		this.maxPersonsBooking = maxPersonsBooking;
	}

	public BigDecimal getMinPersonsBooking() {
		return this.minPersonsBooking;
	}

	public void setMinPersonsBooking(BigDecimal minPersonsBooking) {
		this.minPersonsBooking = minPersonsBooking;
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

	/*public List<AccomChnConf> getAccomChnConfs() {
		return this.accomChnConfs;
	}

	public void setAccomChnConfs(List<AccomChnConf> accomChnConfs) {
		this.accomChnConfs = accomChnConfs;
	}*/

	/*public AccomChnConf addAccomChnConf(AccomChnConf accomChnConf) {
		getAccomChnConfs().add(accomChnConf);
		accomChnConf.setAccomMaster(this);

		return accomChnConf;
	}

	public AccomChnConf removeAccomChnConf(AccomChnConf accomChnConf) {
		getAccomChnConfs().remove(accomChnConf);
		accomChnConf.setAccomMaster(null);

		return accomChnConf;
	}*/

	public AccomGuesthouseMaster getAccomGuesthouseMaster() {
		return this.accomGuesthouseMaster;
	}

	public void setAccomGuesthouseMaster(AccomGuesthouseMaster accomGuesthouseMaster) {
		this.accomGuesthouseMaster = accomGuesthouseMaster;
	}

	public AccomLocationMaster getAccomLocationMaster() {
		return this.accomLocationMaster;
	}

	public void setAccomLocationMaster(AccomLocationMaster accomLocationMaster) {
		this.accomLocationMaster = accomLocationMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getCgstRate() {
		return cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}

	public BigDecimal getSgstRate() {
		return sgstRate;
	}

	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

}