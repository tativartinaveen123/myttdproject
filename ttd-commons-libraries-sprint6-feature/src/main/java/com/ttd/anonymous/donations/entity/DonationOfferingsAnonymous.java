package com.ttd.anonymous.donations.entity;

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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DONATION_OFFERINGS_ANONYMOUS database table.
 * 
 */
@Entity
@Table(name="DONATION_OFFERINGS_ANONYMOUS") 
@NamedQuery(name="DonationOfferingsAnonymous.findAll", query="SELECT d FROM DonationOfferingsAnonymous d")
public class DonationOfferingsAnonymous  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "ANONYMOUS_ID_GENERATOR", sequenceName = "DONATION_OFF_ANONYMOUS_ID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANONYMOUS_ID_GENERATOR")
	@Column(name="ANONYMOUS_ID")
	private long anonymousId;	
	
	@Column(name="OFFERING_ID")
	private String offerinfId;
	
	@Column(name="DONOR_TYPE")
	private String donorType;
	
	@Column(name="TRUST_ID")
	private BigDecimal trustId;
	
	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;
	
	@Column(name="DONATION_STATUS")	
	private String donationStatus;
	
	@Column(name="FILE_PATH")
	private String filePath;
		
	@Column(name="DONATION_FOR")
	private String donationFor;
		
	@Column(name="OFFERING_ON_BEHALF")
	private String offeringOnBehalf;
	
	@Column(name="DONATION_ACCESS_FROM")
	private String donationAccessFrom;
	
	@Column(name="IS_IDENTIFIED")	
	private String isIdentified;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;
	
	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@OneToMany(mappedBy="donationOfferingsAnonymous", cascade = CascadeType.ALL)
	private List<DonorCounterOfferAnonymous> donorCounterOfferings;
	
	

	public List<DonorCounterOfferAnonymous> getDonorCounterOfferings() {
		return donorCounterOfferings;
	}



	public void setDonorCounterOfferings(List<DonorCounterOfferAnonymous> donorCounterOfferings) {
		this.donorCounterOfferings = donorCounterOfferings;
	}



	public DonationOfferingsAnonymous() {
		
	}

	

	public long getAnonymousId() {
		return anonymousId;
	}



	public void setAnonymousId(long anonymousId) {
		this.anonymousId = anonymousId;
	}



	public String getOfferinfId() {
		return offerinfId;
	}

	public void setOfferinfId(String offerinfId) {
		this.offerinfId = offerinfId;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public BigDecimal getTrustId() {
		return trustId;
	}

	public void setTrustId(BigDecimal trustId) {
		this.trustId = trustId;
	}

	public BigDecimal getOfferingAmount() {
		return offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public String getDonationStatus() {
		return donationStatus;
	}

	public void setDonationStatus(String donationStatus) {
		this.donationStatus = donationStatus;
	}

	

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	

	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}

	

	public String getOfferingOnBehalf() {
		return offeringOnBehalf;
	}

	public void setOfferingOnBehalf(String offeringOnBehalf) {
		this.offeringOnBehalf = offeringOnBehalf;
	}

	public String getDonationAccessFrom() {
		return donationAccessFrom;
	}

	public void setDonationAccessFrom(String donationAccessFrom) {
		this.donationAccessFrom = donationAccessFrom;
	}

	public String getIsIdentified() {
		return isIdentified;
	}

	public void setIsIdentified(String isIdentified) {
		this.isIdentified = isIdentified;
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
	
	
}
