package com.ttd.ussesvvd.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.User;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;


/**
 * The persistent class for the USSES_DONOR_PRIV_REDEM_SERVICE database table.
 * 
 */
@Entity
@Table(name="USSES_DONOR_PRIV_REDEM_SERVICE")
@NamedQuery(name="UssesDonorPrivRedemService.findAll", query="SELECT u FROM UssesDonorPrivRedemService u")
public class UssesDonorPrivRedemService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USSES_DONOR_P_REDEM_SERVID_SEQ_GENERATOR", sequenceName="USSES_DONOR_P_REDEM_SERVID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USSES_DONOR_P_REDEM_SERVID_SEQ_GENERATOR")
	@Column(name="DONOR_REDEEM_SERVICE_ID")
	private BigDecimal donorRedeemServiceId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="AVAILED_DATE")
	private Date availedDate;

	@Column(name="BAHUMANAMS_AVAILED")
	private String bahumanamsAvailed;

	private String comments;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@ManyToOne
	@JoinColumn(name="DONOR_PRIV_ID")
	private UssesDonationPrivMaster ussesDonationPrivMaster;

	@Column(name="LADDU_QUANTITY")
	private BigDecimal ladduQuantity;

	@Column(name="NO_OF_DAYS")
	private BigDecimal noOfDays;

	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private UssesVvdOffering ussesVvdOffering;

	@Column(name="PLANNED_ARRIVE_DATE")
	private String plannedArriveDate;

	@Column(name="PLANNED_ARRIVE_TIME")
	private String plannedArriveTime;

	@Column(name="PRIV_REDEEM_ID")
	private String privRedeemId;

	@Column(name="REDEEMED_FROM")
	private String redeemedFrom;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SCHEME_NAME")
	private String schemeName;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;
	
	@Column(name="STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;


	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	public UssesDonorPrivRedemService() {
	}

	public Date getAvailedDate() {
		return this.availedDate;
	}

	public void setAvailedDate(Date availedDate) {
		this.availedDate = availedDate;
	}

	public String getBahumanamsAvailed() {
		return this.bahumanamsAvailed;
	}

	public void setBahumanamsAvailed(String bahumanamsAvailed) {
		this.bahumanamsAvailed = bahumanamsAvailed;
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

	
	public UssesDonationPrivMaster getUssesDonationPrivMaster() {
		return ussesDonationPrivMaster;
	}

	public void setUssesDonationPrivMaster(
			UssesDonationPrivMaster ussesDonationPrivMaster) {
		this.ussesDonationPrivMaster = ussesDonationPrivMaster;
	}

	public BigDecimal getDonorRedeemServiceId() {
		return this.donorRedeemServiceId;
	}

	public void setDonorRedeemServiceId(BigDecimal donorRedeemServiceId) {
		this.donorRedeemServiceId = donorRedeemServiceId;
	}

	public BigDecimal getLadduQuantity() {
		return this.ladduQuantity;
	}

	public void setLadduQuantity(BigDecimal ladduQuantity) {
		this.ladduQuantity = ladduQuantity;
	}

	public BigDecimal getNoOfDays() {
		return this.noOfDays;
	}

	public void setNoOfDays(BigDecimal noOfDays) {
		this.noOfDays = noOfDays;
	}

	
	public UssesVvdOffering getUssesVvdOffering() {
		return ussesVvdOffering;
	}

	public void setUssesVvdOffering(UssesVvdOffering ussesVvdOffering) {
		this.ussesVvdOffering = ussesVvdOffering;
	}

	public String getPlannedArriveDate() {
		return this.plannedArriveDate;
	}

	public void setPlannedArriveDate(String plannedArriveDate) {
		this.plannedArriveDate = plannedArriveDate;
	}

	public String getPlannedArriveTime() {
		return this.plannedArriveTime;
	}

	public void setPlannedArriveTime(String plannedArriveTime) {
		this.plannedArriveTime = plannedArriveTime;
	}

	public String getPrivRedeemId() {
		return this.privRedeemId;
	}

	public void setPrivRedeemId(String privRedeemId) {
		this.privRedeemId = privRedeemId;
	}

	public String getRedeemedFrom() {
		return this.redeemedFrom;
	}

	public void setRedeemedFrom(String redeemedFrom) {
		this.redeemedFrom = redeemedFrom;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
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


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static Comparator<UssesDonorPrivRedemService> SevaDateComparator = new Comparator<UssesDonorPrivRedemService>() {

        public int compare(UssesDonorPrivRedemService sd1, UssesDonorPrivRedemService sd2) {
        	if(sd1.getAvailedDate().after(sd2.getAvailedDate())){
        		return -1;
        	}
        	else if(sd1.getAvailedDate().before(sd2.getAvailedDate())){
        		return 1;
        	}
        	else
        		return 0;
        }
    };

}