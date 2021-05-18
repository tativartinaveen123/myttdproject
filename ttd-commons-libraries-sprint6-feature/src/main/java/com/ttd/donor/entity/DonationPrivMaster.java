package com.ttd.donor.entity;

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

import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.edonation.entity.TrustMaster;
import com.ttd.eseva.entity.RequestWorkflow;


/**
 * The persistent class for the DONATION_PRIV_MASTER database table.
 * 
 */
@Entity
@Table(name="DONATION_PRIV_MASTER")
@NamedQuery(name="DonationPrivMaster.findAll", query="SELECT d FROM DonationPrivMaster d")
public class DonationPrivMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONATION_PRIV_ID")
	private long donationPrivId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DONATION_FROM_AMT")
	private BigDecimal donationFromAmt;

	@Column(name="DONATION_TO_AMT")
	private BigDecimal donationToAmt;

	@Column(name="DONATION_TYPE")
	private String donationType;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="GIFT_DESCRIPTION")
	private String giftDescription;

	private BigDecimal quantity;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_OR_GIFT")
	private String serviceOrGift;

	@Column(name="SERVICE_SUB_TYPE_ID")
	private BigDecimal serviceSubTypeId;

	@Column(name="TIMEBOUND_OR_NOT")
	private String timeboundOrNot;

	@Column(name="TIMEBOUND_YEARS")
	private BigDecimal timeboundYears;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Temporal(TemporalType.DATE)
	@Column(name="YEARLY_ENDDATE_TOAVAIL")
	private Date yearlyEnddateToavail;
	
	@Column(name="DONATION_USER_TYPE")
	private String donationUserType;

	//bi-directional many-to-one association to CurrencyMaster
	@ManyToOne
	@JoinColumn(name="CURRENCY_ID")
	private CurrencyMaster currencyMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	//bi-directional many-to-one association to TrustMaster
	@ManyToOne
	@JoinColumn(name="TRUST_ID")
	private TrustMaster trustMaster;

	//bi-directional many-to-one association to DonorPrivRedeem
	@OneToMany(mappedBy="donationPrivMaster")
	private List<DonorPrivRedeem> donorPrivRedeems;

	public DonationPrivMaster() {
	}

	public long getDonationPrivId() {
		return this.donationPrivId;
	}

	public void setDonationPrivId(long donationPrivId) {
		this.donationPrivId = donationPrivId;
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

	public BigDecimal getDonationFromAmt() {
		return this.donationFromAmt;
	}

	public void setDonationFromAmt(BigDecimal donationFromAmt) {
		this.donationFromAmt = donationFromAmt;
	}

	public BigDecimal getDonationToAmt() {
		return this.donationToAmt;
	}

	public void setDonationToAmt(BigDecimal donationToAmt) {
		this.donationToAmt = donationToAmt;
	}

	public String getDonationType() {
		return this.donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getGiftDescription() {
		return this.giftDescription;
	}

	public void setGiftDescription(String giftDescription) {
		this.giftDescription = giftDescription;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceOrGift() {
		return this.serviceOrGift;
	}

	public void setServiceOrGift(String serviceOrGift) {
		this.serviceOrGift = serviceOrGift;
	}

	public BigDecimal getServiceSubTypeId() {
		return this.serviceSubTypeId;
	}

	public void setServiceSubTypeId(BigDecimal serviceSubTypeId) {
		this.serviceSubTypeId = serviceSubTypeId;
	}

	public String getTimeboundOrNot() {
		return this.timeboundOrNot;
	}

	public void setTimeboundOrNot(String timeboundOrNot) {
		this.timeboundOrNot = timeboundOrNot;
	}

	public BigDecimal getTimeboundYears() {
		return this.timeboundYears;
	}

	public void setTimeboundYears(BigDecimal timeboundYears) {
		this.timeboundYears = timeboundYears;
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

	public Date getYearlyEnddateToavail() {
		return this.yearlyEnddateToavail;
	}

	public void setYearlyEnddateToavail(Date yearlyEnddateToavail) {
		this.yearlyEnddateToavail = yearlyEnddateToavail;
	}

	public CurrencyMaster getCurrencyMaster() {
		return this.currencyMaster;
	}

	public void setCurrencyMaster(CurrencyMaster currencyMaster) {
		this.currencyMaster = currencyMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public TrustMaster getTrustMaster() {
		return this.trustMaster;
	}

	public void setTrustMaster(TrustMaster trustMaster) {
		this.trustMaster = trustMaster;
	}

	public List<DonorPrivRedeem> getDonorPrivRedeems() {
		return this.donorPrivRedeems;
	}

	public void setDonorPrivRedeems(List<DonorPrivRedeem> donorPrivRedeems) {
		this.donorPrivRedeems = donorPrivRedeems;
	}

	public DonorPrivRedeem addDonorPrivRedeem(DonorPrivRedeem donorPrivRedeem) {
		getDonorPrivRedeems().add(donorPrivRedeem);
		donorPrivRedeem.setDonationPrivMaster(this);

		return donorPrivRedeem;
	}

	public DonorPrivRedeem removeDonorPrivRedeem(DonorPrivRedeem donorPrivRedeem) {
		getDonorPrivRedeems().remove(donorPrivRedeem);
		donorPrivRedeem.setDonationPrivMaster(null);

		return donorPrivRedeem;
	}

	public String getDonationUserType() {
		return donationUserType;
	}

	public void setDonationUserType(String donationUserType) {
		this.donationUserType = donationUserType;
	}
	
}