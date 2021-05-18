package com.ttd.edonation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TRUST_MASTER")
@NamedQuery(name = "TrustMaster.findAll", query = "SELECT t FROM TrustMaster t")
public class TrustMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TRUST_MASTER_TRUSTID_GENERATOR", sequenceName = "TRUST_MASTER_TRUST_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRUST_MASTER_TRUSTID_GENERATOR")
	@Column(name = "TRUST_ID")
	private long trustId;;

	@Column(name = "TRUST_NAME")
	private String trustName;;

	@Column(name = "TRUST_OBJECTIVES")
	private String trustObjectives;

	@Column(name = "TRUST_ADDRESS1")
	private String trustAddress1;;;

	@Column(name = "TRUST_ADDRESS2")
	private String trustAddress2;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;;

	@Column(name = "ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name = "ACTIVE_FLAG")
	private long activeFlag;

	@Column(name = "TRUST_EMAILID")
	private String trustEmailid;

	@Column(name = "TRUST_PHONE_MOBILE")
	private String trustPhoneMobile;

	@Column(name = "TRUST_ROC_NO")
	private long trustRocNo;

	@Column(name = "TRUST_REGISTERED_ID")
	private String trustRegisteredId;

	@Column(name = "TRUST_IT_FILE_NOHQRS")
	private String trustItFileNohqrs;

	@Column(name = "TRUST_PANNUMBER")
	private String trustPannumber;
	
	@Column(name = "IT_ACT_NO")	
	private String itActNo;
	
	@Column(name = "BRANCH_NAME")	
	private String branchName;
	
	
	@Column(name = "BANK_NAME")	
	private String bankName;
	
	@Column(name = "BANK_IFSCODE")	
	private String bankIFScode;
	
	public String getTrustPhoneMobile() {
		return trustPhoneMobile;
	}

	public void setTrustPhoneMobile(String trustPhoneMobile) {
		this.trustPhoneMobile = trustPhoneMobile;
	}

	public long getTrustRocNo() {
		return trustRocNo;
	}

	public void setTrustRocNo(long trustRocNo) {
		this.trustRocNo = trustRocNo;
	}

	public String getTrustRegisteredId() {
		return trustRegisteredId;
	}

	public void setTrustRegisteredId(String trustRegisteredId) {
		this.trustRegisteredId = trustRegisteredId;
	}

	public String getTrustItFileNohqrs() {
		return trustItFileNohqrs;
	}

	public void setTrustItFileNohqrs(String trustItFileNohqrs) {
		this.trustItFileNohqrs = trustItFileNohqrs;
	}

	// bi-directional many-to-one association to TrustScheme
	// @OneToMany(mappedBy = "trustMaster",fetch = FetchType.EAGER)
	// private List<TrustScheme> trustSchemes;

	public String getTrustEmailid() {
		return trustEmailid;
	}

	public void setTrustEmailid(String trustEmailid) {
		this.trustEmailid = trustEmailid;
	}

	public TrustMaster() {
	}

	public long getTrustId() {
		return this.trustId;
	}

	public void setTrustId(long trustId) {
		this.trustId = trustId;
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

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getTrustAddress1() {
		return this.trustAddress1;
	}

	public void setTrustAddress1(String trustAddress1) {
		this.trustAddress1 = trustAddress1;
	}

	public String getTrustAddress2() {
		return this.trustAddress2;
	}

	public void setTrustAddress2(String trustAddress2) {
		this.trustAddress2 = trustAddress2;
	}

	public String getTrustName() {
		return this.trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public String getTrustObjectives() {
		return this.trustObjectives;
	}

	public void setTrustObjectives(String trustObjectives) {
		this.trustObjectives = trustObjectives;
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

	public long getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(long activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getTrustPannumber() {
		return trustPannumber;
	}

	public void setTrustPannumber(String trustPannumber) {
		this.trustPannumber = trustPannumber;
	}

	public String getItActNo() {
		return itActNo;
	}

	public void setItActNo(String itActNo) {
		this.itActNo = itActNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFScode() {
		return bankIFScode;
	}

	public void setBankIFScode(String bankIFScode) {
		this.bankIFScode = bankIFScode;
	}
	
	

	// public List<TrustScheme> getTrustSchemes() {
	// return this.trustSchemes;
	// }
	//
	// public void setTrustSchemes(List<TrustScheme> trustSchemes) {
	// this.trustSchemes = trustSchemes;
	// }

	// public TrustScheme addTrustScheme(TrustScheme trustScheme) {
	// getTrustSchemes().add(trustScheme);
	// trustScheme.setTrustMaster(this);
	//
	// return trustScheme;
	// }
	//
	// public TrustScheme removeTrustScheme(TrustScheme trustScheme) {
	// getTrustSchemes().remove(trustScheme);
	// trustScheme.setTrustMaster(null);
	//
	// return trustScheme;
	// }

}
