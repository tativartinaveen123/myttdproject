package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the DONOR_PRIV_REDEEM database table.
 * 
 */
@Entity
@Table(name="DONOR_PRIV_REDEEM")
@NamedQuery(name="DonorPrivRedeem.findAll", query="SELECT d FROM DonorPrivRedeem d")
public class DonorPrivRedeem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_PRIV_REDEEM_GENERATOR", sequenceName = "DONOR_PRIV_REDEEM_DON_PRV_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_PRIV_REDEEM_GENERATOR")
	@Column(name="DONOR_REDEEM_ID")
	private long donorRedeemId;

	private String availed;

	@Column(name="AVAILED_DATE")
	private String availedDate;

	@Column(name="AVAILED_QUANTITY")
	private BigDecimal availedQuantity;

	private String comments;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="GIFT_DESCRIPTION")
	private String giftDescription;

	private BigDecimal quantity;

	@Temporal(TemporalType.DATE)
	@Column(name="REDEEM_UPTO")
	private Date redeemUpto;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_OR_GIFT")
	private String serviceOrGift;

	@Column(name="SERVICE_SUB_TYPE_ID")
	private BigDecimal serviceSubTypeId;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private long userId;
	
	@Column(name = "VALIDITY_YEARS")
	private long validityYears;

	//bi-directional many-to-one association to DonationOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;

	//bi-directional many-to-one association to DonationPrivMaster
	@ManyToOne
	@JoinColumn(name="DONATION_PRV_ID")
	private DonationPrivMaster donationPrivMaster;

	//bi-directional many-to-one association to DonorPrivRedeemService
	@OneToMany(mappedBy="donorPrivRedeem")
	private List<DonorPrivRedeemService> donorPrivRedeemServices;
	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_DATE")
	private Date validityDate;
	
	
	@Column(name="REDEEM_CODE")
	private String redeemCode;
	
	
	

	public DonorPrivRedeem() {
	}

	public long getDonorRedeemId() {
		return this.donorRedeemId;
	}

	public void setDonorRedeemId(long donorRedeemId) {
		this.donorRedeemId = donorRedeemId;
	}

	public String getAvailed() {
		return this.availed;
	}

	public void setAvailed(String availed) {
		this.availed = availed;
	}

	public String getAvailedDate() {
		return this.availedDate;
	}

	public void setAvailedDate(String availedDate) {
		this.availedDate = availedDate;
	}

	public BigDecimal getAvailedQuantity() {
		return this.availedQuantity;
	}

	public void setAvailedQuantity(BigDecimal availedQuantity) {
		this.availedQuantity = availedQuantity;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public Date getRedeemUpto() {
		return this.redeemUpto;
	}

	public void setRedeemUpto(Date redeemUpto) {
		this.redeemUpto = redeemUpto;
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

	public BigDecimal getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(BigDecimal serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
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

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public DonationOffering getDonationOffering() {
		return this.donationOffering;
	}

	public void setDonationOffering(DonationOffering donationOffering) {
		this.donationOffering = donationOffering;
	}

	public DonationPrivMaster getDonationPrivMaster() {
		return this.donationPrivMaster;
	}

	public void setDonationPrivMaster(DonationPrivMaster donationPrivMaster) {
		this.donationPrivMaster = donationPrivMaster;
	}

	public List<DonorPrivRedeemService> getDonorPrivRedeemServices() {
		return this.donorPrivRedeemServices;
	}
	
	public long getValidityYears() {
		return validityYears;
	}

	public void setValidityYears(long validityYears) {
		this.validityYears = validityYears;
	}
	
	public void setDonorPrivRedeemServices(List<DonorPrivRedeemService> donorPrivRedeemServices) {
		this.donorPrivRedeemServices = donorPrivRedeemServices;
	}

	public DonorPrivRedeemService addDonorPrivRedeemService(DonorPrivRedeemService donorPrivRedeemService) {
		getDonorPrivRedeemServices().add(donorPrivRedeemService);
		donorPrivRedeemService.setDonorPrivRedeem(this);

		return donorPrivRedeemService;
	}

	public DonorPrivRedeemService removeDonorPrivRedeemService(DonorPrivRedeemService donorPrivRedeemService) {
		getDonorPrivRedeemServices().remove(donorPrivRedeemService);
		donorPrivRedeemService.setDonorPrivRedeem(null);

		return donorPrivRedeemService;
	}

	public Date getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}

	public String getRedeemCode() {
		return redeemCode;
	}

	public void setRedeemCode(String redeemCode) {
		this.redeemCode = redeemCode;
	}

	
	
	

}