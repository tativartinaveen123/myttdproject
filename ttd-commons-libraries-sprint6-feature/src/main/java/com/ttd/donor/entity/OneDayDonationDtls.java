package com.ttd.donor.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the ONE_DAY_DONATION_DTLS database table.
 * 
 */

@Entity
@Table(name="ONE_DAY_DONATION_DTLS")
@NamedQuery(name="OneDayDonationDtls.findAll", query="SELECT o FROM OneDayDonationDtls o")

public class OneDayDonationDtls  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@SequenceGenerator(name="oneday_Donation_seq_GENERATOR", sequenceName="oneday_Donation_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="oneday_Donation_seq_GENERATOR")
	@Column(name="DONATION_DTLS_ID")
	private long donationDtlsId;
	
	
	@Column(name="OFFERING_ID")
	private String offeringId;
	
	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public long getDonationDtlsId() {
		return donationDtlsId;
	}

	public void setDonationDtlsId(long donationDtlsId) {
		this.donationDtlsId = donationDtlsId;
	}

	@Column(name="EXP_CATEGORY")
	private String expCategory;
	
	@Column(name="AMOUNT")
	private long amount;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OPTED")
	private Date dateOpted;
	
	@Column(name="DISPLAY_NAME")
	private String displayName;
	
	@Column(name="CREATED_BY")
	private long createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable=false, updatable=false)
	private Date createdTime;
	
	
	@Column(name="UPDATED_BY")
	private long updatedBy;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="ROW_STATUS")
	private long rowStatus;
	
	
	
	
	/*@OneToOne(fetch=FetchType.LAZY,optional=false) 
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;*/

	public OneDayDonationDtls(){
		
	}
	
	

	
	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}



	public String getExpCategory() {
		return expCategory;
	}

	public void setExpCategory(String expCategory) {
		this.expCategory = expCategory;
	}

	public Date getDateOpted() {
		return dateOpted;
	}

	public void setDateOpted(Date dateOpted) {
		this.dateOpted = dateOpted;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(long rowStatus) {
		this.rowStatus = rowStatus;
	}

}
