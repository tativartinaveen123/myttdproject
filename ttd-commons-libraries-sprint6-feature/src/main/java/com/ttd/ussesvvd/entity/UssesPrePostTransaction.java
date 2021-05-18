package com.ttd.ussesvvd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

import com.ttd.donor.entity.ModeOfPayment;
import com.ttd.eseva.entity.RequestWorkflow;


/**
 * The persistent class for the USSES_PRE_POST_TRANSACTIONS database table.
 * 
 */
@Entity
@Table(name="USSES_PRE_POST_TRANSACTIONS")
@NamedQuery(name="UssesPrePostTransaction.findAll", query="SELECT u FROM UssesPrePostTransaction u")
public class UssesPrePostTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "PRE_POST_PONEMENT_ID", sequenceName = "USSES_PRE_POST_TRANS_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRE_POST_PONEMENT_ID")
	@Column(name="PRE_POST_PONEMENT_ID")
	private long prePostPonementId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_AVAILED_DATE")
	private Date actualAvailedDate;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="INSTR_AMOUNT")
	private BigDecimal instrAmount;

	@Column(name="INSTR_BANK")
	private String instrBank;

	@Column(name="INSTR_BRANCH")
	private String instrBranch;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NUMBER")
	private String instrNumber;

	@Column(name="INSTR_PAYBLE_AT")
	private String instrPaybleAt;

	@Column(name="PAYMENT_MODE")
	private long paymentMode;


	@Column(name="PRE_POST_PONEMENT_BY")
	private String prePostPonementBy;

	@Temporal(TemporalType.DATE)
	@Column(name="PRE_POST_PONEMENT_DATE")
	private Date prePostPonementDate;

	@Column(name="PRE_POST_PONEMENT_STATUS")
	private String prePostPonementStatus;
	
	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_REALIZE_RECV_DT")
	private Date instrRealizeRecvDt;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_REALIZE_SENT_DT")
	private Date instrRealizeSentDt;

	@Column(name="INSTR_REALIZE_STATUS")
	private String instrRealizeStatus;

	@Column(name="INSTR_REALIZE_VALUE")
	private BigDecimal instrRealizeValue;
	
	@Column(name="REMARKS")
	private String remarks;

	@Column(name="ROW_STATUS",insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="DONATION_SCHEME")
	private String donationScheme;
	
	@Column(name="IS_ACCOM_AVAILED")
	private String isAccomAvailed;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;
	
	@Column(name="PRIV_REDEEM_ID")
	private String privRedeemId;
	

	//bi-directional many-to-one association to UssesVvdOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private UssesVvdOffering ussesVvdOffering;

	public UssesPrePostTransaction() {
	}

	public long getPrePostPonementId() {
		return this.prePostPonementId;
	}

	public void setPrePostPonementId(long prePostPonementId) {
		this.prePostPonementId = prePostPonementId;
	}

	public Date getActualAvailedDate() {
		return this.actualAvailedDate;
	}

	public void setActualAvailedDate(Date actualAvailedDate) {
		this.actualAvailedDate = actualAvailedDate;
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

	public BigDecimal getInstrAmount() {
		return this.instrAmount;
	}

	public void setInstrAmount(BigDecimal instrAmount) {
		this.instrAmount = instrAmount;
	}

	public String getInstrBank() {
		return this.instrBank;
	}

	public void setInstrBank(String instrBank) {
		this.instrBank = instrBank;
	}

	public String getInstrBranch() {
		return this.instrBranch;
	}

	public void setInstrBranch(String instrBranch) {
		this.instrBranch = instrBranch;
	}

	public Date getInstrDate() {
		return this.instrDate;
	}

	public void setInstrDate(Date instrDate) {
		this.instrDate = instrDate;
	}

	public String getInstrNumber() {
		return this.instrNumber;
	}

	public void setInstrNumber(String instrNumber) {
		this.instrNumber = instrNumber;
	}

	public String getInstrPaybleAt() {
		return this.instrPaybleAt;
	}

	public void setInstrPaybleAt(String instrPaybleAt) {
		this.instrPaybleAt = instrPaybleAt;
	}

	public long getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(long paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPrePostPonementBy() {
		return this.prePostPonementBy;
	}

	public void setPrePostPonementBy(String prePostPonementBy) {
		this.prePostPonementBy = prePostPonementBy;
	}

	public Date getPrePostPonementDate() {
		return this.prePostPonementDate;
	}

	public void setPrePostPonementDate(Date prePostPonementDate) {
		this.prePostPonementDate = prePostPonementDate;
	}

	public String getPrePostPonementStatus() {
		return this.prePostPonementStatus;
	}

	public void setPrePostPonementStatus(String prePostPonementStatus) {
		this.prePostPonementStatus = prePostPonementStatus;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public UssesVvdOffering getUssesVvdOffering() {
		return this.ussesVvdOffering;
	}

	public void setUssesVvdOffering(UssesVvdOffering ussesVvdOffering) {
		this.ussesVvdOffering = ussesVvdOffering;
	}

	public Date getInstrRealizeRecvDt() {
		return instrRealizeRecvDt;
	}

	public void setInstrRealizeRecvDt(Date instrRealizeRecvDt) {
		this.instrRealizeRecvDt = instrRealizeRecvDt;
	}

	public Date getInstrRealizeSentDt() {
		return instrRealizeSentDt;
	}

	public void setInstrRealizeSentDt(Date instrRealizeSentDt) {
		this.instrRealizeSentDt = instrRealizeSentDt;
	}

	public String getInstrRealizeStatus() {
		return instrRealizeStatus;
	}

	public void setInstrRealizeStatus(String instrRealizeStatus) {
		this.instrRealizeStatus = instrRealizeStatus;
	}

	public BigDecimal getInstrRealizeValue() {
		return instrRealizeValue;
	}

	public void setInstrRealizeValue(BigDecimal instrRealizeValue) {
		this.instrRealizeValue = instrRealizeValue;
	}

	public String getDonationScheme() {
		return donationScheme;
	}

	public void setDonationScheme(String donationScheme) {
		this.donationScheme = donationScheme;
	}

	public String getIsAccomAvailed() {
		return isAccomAvailed;
	}

	public void setIsAccomAvailed(String isAccomAvailed) {
		this.isAccomAvailed = isAccomAvailed;
	}

	public String getPrivRedeemId() {
		return privRedeemId;
	}

	public void setPrivRedeemId(String privRedeemId) {
		this.privRedeemId = privRedeemId;
	}

	
}