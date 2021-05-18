package com.ttd.common.entity;





import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the REFUND_TRACKER database table.
 * 
 */
@Entity
@Table(name="REFUND_REQUEST_TRACKER")
@NamedQuery(name="RefundRequestTracker.findAll", query="SELECT r FROM RefundRequestTracker r")
public class RefundRequestTracker implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "REFUND_REQUEST_TRACKER_ID_SEQ", sequenceName = "REFUND_REQUEST_TRACKER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REFUND_REQUEST_TRACKER_ID_SEQ")
	@Column(name = "REFUND_FILE_SEQ")
	private long refundFileSeq;

	
	public long getRefundFileSeq() {
		return refundFileSeq;
	}

	public void setRefundFileSeq(long refundFileSeq) {
		this.refundFileSeq = refundFileSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="FILE_STATUS")
	private String fileStatus;

	@Column(name="REFUND_FILE_NAME")
	private String refundFileName;

	

	private String remarks;

	@Column(name="ROWCOUNT")
	private BigDecimal rowcount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	@Lob
	@Column(name="UPLOADED_FILE")
	private byte[] uploadedFile;
	
	@Column(name="SERVICETYPE")
	private String serviceType;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public RefundRequestTracker() {
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getRefundFileName() {
		return this.refundFileName;
	}

	public void setRefundFileName(String refundFileName) {
		this.refundFileName = refundFileName;
	}

	
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getRowcount() {
		return this.rowcount;
	}

	public void setRowcount(BigDecimal rowcount) {
		this.rowcount = rowcount;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public byte[] getUploadedFile() {
		return this.uploadedFile;
	}

	public void setUploadedFile(byte[] uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

}