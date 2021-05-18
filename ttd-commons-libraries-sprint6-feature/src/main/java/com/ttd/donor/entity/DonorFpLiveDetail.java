package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ttd.common.entity.User;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DONOR_FP_LIVE_DETAILS database table.
 * 
 */
@Entity
@Table(name="DONOR_FP_LIVE_DETAILS")
@NamedQuery(name="DonorFpLiveDetail.findAll", query="SELECT d FROM DonorFpLiveDetail d")
public class DonorFpLiveDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "USERS_USER_ID_GENERATOR")
	@GenericGenerator(name = "USERS_USER_ID_GENERATOR", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	@Column(name = "USER_ID", unique = true, nullable = false)
	private long userId;

	@Column(name="COMMENTS")
	private String comments;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="DONOADDR_FIRM_REG_NO")
	private String donoaddrFirmRegNo;

	@Temporal(TemporalType.DATE)
	@Column(name="DONOR_FIRM_REG_DATE")
	private Date donorFirmRegDate;

	@Column(name="DONOR_FIRM_REG_DETAILS")
	private String donorFirmRegDetails;

	@Column(name="DONOR_FP_IMAGE")
	private String donorFpImage;

	@Temporal(TemporalType.DATE)
	@Column(name="DONOR_LC_SUBMIT_DATE")
	private Date donorLcSubmitDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DONOR_LC_SUBMIT_DUE_DATE")
	private Date donorLcSubmitDueDate;

	@Column(name="DONOR_LIVE_CERT_IMAGE")
	private String donorLiveCertImage;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional one-to-one association to User
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;

	public DonorFpLiveDetail() {
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

	public String getDonoaddrFirmRegNo() {
		return this.donoaddrFirmRegNo;
	}

	public void setDonoaddrFirmRegNo(String donoaddrFirmRegNo) {
		this.donoaddrFirmRegNo = donoaddrFirmRegNo;
	}

	public Date getDonorFirmRegDate() {
		return this.donorFirmRegDate;
	}

	public void setDonorFirmRegDate(Date donorFirmRegDate) {
		this.donorFirmRegDate = donorFirmRegDate;
	}

	public String getDonorFirmRegDetails() {
		return this.donorFirmRegDetails;
	}

	public void setDonorFirmRegDetails(String donorFirmRegDetails) {
		this.donorFirmRegDetails = donorFirmRegDetails;
	}

	public String getDonorFpImage() {
		return this.donorFpImage;
	}

	public void setDonorFpImage(String donorFpImage) {
		this.donorFpImage = donorFpImage;
	}

	public Date getDonorLcSubmitDate() {
		return this.donorLcSubmitDate;
	}

	public void setDonorLcSubmitDate(Date donorLcSubmitDate) {
		this.donorLcSubmitDate = donorLcSubmitDate;
	}

	public Date getDonorLcSubmitDueDate() {
		return this.donorLcSubmitDueDate;
	}

	public void setDonorLcSubmitDueDate(Date donorLcSubmitDueDate) {
		this.donorLcSubmitDueDate = donorLcSubmitDueDate;
	}

	public String getDonorLiveCertImage() {
		return this.donorLiveCertImage;
	}

	public void setDonorLiveCertImage(String donorLiveCertImage) {
		this.donorLiveCertImage = donorLiveCertImage;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}