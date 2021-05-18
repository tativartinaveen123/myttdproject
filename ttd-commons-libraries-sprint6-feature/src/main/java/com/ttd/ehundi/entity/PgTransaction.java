package com.ttd.ehundi.entity;

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

import com.ttd.common.entity.PgMaster;
import com.ttd.publications.entity.PublicationsBooking;


/**
 * The persistent class for the PG_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="PG_TRANSACTION")
@NamedQuery(name="PgTransaction.findAll", query="SELECT p FROM PgTransaction p")
public class PgTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PG_TRANSACTION_PGTRANSACTIONID_GENERATOR", sequenceName="PG_TRANSACTION_PG_TRANSACTION_", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PG_TRANSACTION_PGTRANSACTIONID_GENERATOR")
	@Column(name="PG_TRANSACTION_ID")
	private long pgTransactionId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable = false,updatable = false)
	private Date createdTime;

	@Column(name="PG_REFERENCE")
	private String pgReference;

	@Column(name="PG_REQUEST_BODY")
	private String pgRequestBody;

	@Column(name="PG_RESPONSE_BODY")
	private String pgResponseBody;

	@Column(name="PG_S2S_NOTIFICATION")
	private String pgS2sNotification;

	@Column(name="PG_S2S_NOTIFICATION_BODY")
	private String pgS2sNotificationBody;

	@Column(name="PG_STATUS")
	private String pgStatus;

	@Column(name="PG_TYPE")
	private String pgType;

	@Column(name="ROW_STATUS", insertable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="OFFERING_ID")
	private String offeringId;
	
	@Column(name="PG_RESPONSE_BEFORE_DV")
	private String PgBeforeDvResponse;
	
	//bi-directional many-to-one association to HundiOffering
	@OneToMany(mappedBy="pgTransaction")
	private List<HundiOffering> hundiOfferings;

	//bi-directional many-to-one association to PgMaster
	@ManyToOne
	@JoinColumn(name="PG_ID")
	private PgMaster pgMaster;
	
	@OneToMany(mappedBy="pgTransaction")
	private List<PublicationsBooking> publicationsBookings;

	@Column(name="RESPONSE_PG_ID")
	private BigDecimal responsePgId;
	
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="TXN_MSG")
	private String txnMsg;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
	

	
	@Column(name="AMOUNT")
	private String pGAmount;
	
	

	public String getpGAmount() {
		return pGAmount;
	}

	public void setpGAmount(String pGAmount) {
		this.pGAmount = pGAmount;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

	public String getPgBeforeDvResponse() {
		return PgBeforeDvResponse;
	}

	public void setPgBeforeDvResponse(String pgBeforeDvResponse) {
		PgBeforeDvResponse = pgBeforeDvResponse;
	}

	public BigDecimal getResponsePgId() {
		return responsePgId;
	}

	public void setResponsePgId(BigDecimal responsePgId) {
		this.responsePgId = responsePgId;
	}

	public PgTransaction() {
	}

	public long getPgTransactionId() {
		return this.pgTransactionId;
	}

	public void setPgTransactionId(long pgTransactionId) {
		this.pgTransactionId = pgTransactionId;
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

	public String getPgReference() {
		return this.pgReference;
	}

	public void setPgReference(String pgReference) {
		this.pgReference = pgReference;
	}

	public String getPgRequestBody() {
		return this.pgRequestBody;
	}

	public void setPgRequestBody(String pgRequestBody) {
		this.pgRequestBody = pgRequestBody;
	}

	public String getPgResponseBody() {
		return this.pgResponseBody;
	}

	public void setPgResponseBody(String pgResponseBody) {
		this.pgResponseBody = pgResponseBody;
	}

	public String getPgS2sNotification() {
		return this.pgS2sNotification;
	}

	public void setPgS2sNotification(String pgS2sNotification) {
		this.pgS2sNotification = pgS2sNotification;
	}

	public String getPgS2sNotificationBody() {
		return this.pgS2sNotificationBody;
	}

	public void setPgS2sNotificationBody(String pgS2sNotificationBody) {
		this.pgS2sNotificationBody = pgS2sNotificationBody;
	}

	public String getPgStatus() {
		return this.pgStatus;
	}

	public void setPgStatus(String pgStatus) {
		this.pgStatus = pgStatus;
	}

	public String getPgType() {
		return this.pgType;
	}

	public void setPgType(String pgType) {
		this.pgType = pgType;
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

	public List<HundiOffering> getHundiOfferings() {
		return this.hundiOfferings;
	}

	public void setHundiOfferings(List<HundiOffering> hundiOfferings) {
		this.hundiOfferings = hundiOfferings;
	}

	public HundiOffering addHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().add(hundiOffering);
		hundiOffering.setPgTransaction(this);

		return hundiOffering;
	}

	public HundiOffering removeHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().remove(hundiOffering);
		hundiOffering.setPgTransaction(null);

		return hundiOffering;
	}
	
	public List<PublicationsBooking> getPublicationsBookings() {
		return this.publicationsBookings;
	}

	public void setPublicationsBookings(List<PublicationsBooking> publicationsBookings) {
		this.publicationsBookings = publicationsBookings;
	}

	public PublicationsBooking addPublicationsBooking(PublicationsBooking publicationsBooking) {
		getPublicationsBookings().add(publicationsBooking);
		publicationsBooking.setPgTransaction(this);

		return publicationsBooking;
	}

	public PublicationsBooking removePublicationsBooking(PublicationsBooking publicationsBooking) {
		getPublicationsBookings().remove(publicationsBooking);
		publicationsBooking.setPgTransaction(null);

		return publicationsBooking;
	}

	public PgMaster getPgMaster() {
		return this.pgMaster;
	}

	public void setPgMaster(PgMaster pgMaster) {
		this.pgMaster = pgMaster;
	}

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getTxnMsg() {
		return txnMsg;
	}

	public void setTxnMsg(String txnMsg) {
		this.txnMsg = txnMsg;
	}

}