package com.ttd.publications.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the PUBLICATIONS_CATEGORY_MASTER database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_CATEGORY_MASTER")
@NamedQuery(name="PublicationsCategoryMaster.findAll", query="SELECT p FROM PublicationsCategoryMaster p")
public class PublicationsCategoryMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PCM_ID")
	private long pcmId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PCM_DESCRIPTION")
	private String pcmDescription;

	@Column(name="PCM_NAME")
	private String pcmName;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to PublicationsSubcateMaster
	@OneToMany(mappedBy="publicationsCategoryMaster")
	private List<PublicationsSubcateMaster> publicationsSubcateMasters;
	
	@OneToMany(mappedBy="publicationsCategoryMaster")
	private List<PublicationsBookingDtl> publicationsBookingDtls;

	public PublicationsCategoryMaster() {
	}

	public long getPcmId() {
		return this.pcmId;
	}

	public void setPcmId(long pcmId) {
		this.pcmId = pcmId;
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

	public String getPcmDescription() {
		return this.pcmDescription;
	}

	public void setPcmDescription(String pcmDescription) {
		this.pcmDescription = pcmDescription;
	}

	public String getPcmName() {
		return this.pcmName;
	}

	public void setPcmName(String pcmName) {
		this.pcmName = pcmName;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
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

	public List<PublicationsSubcateMaster> getPublicationsSubcateMasters() {
		return this.publicationsSubcateMasters;
	}

	public void setPublicationsSubcateMasters(List<PublicationsSubcateMaster> publicationsSubcateMasters) {
		this.publicationsSubcateMasters = publicationsSubcateMasters;
	}

	public PublicationsSubcateMaster addPublicationsSubcateMaster(PublicationsSubcateMaster publicationsSubcateMaster) {
		getPublicationsSubcateMasters().add(publicationsSubcateMaster);
		publicationsSubcateMaster.setPublicationsCategoryMaster(this);

		return publicationsSubcateMaster;
	}

	public PublicationsSubcateMaster removePublicationsSubcateMaster(PublicationsSubcateMaster publicationsSubcateMaster) {
		getPublicationsSubcateMasters().remove(publicationsSubcateMaster);
		publicationsSubcateMaster.setPublicationsCategoryMaster(null);

		return publicationsSubcateMaster;
	}

	public List<PublicationsBookingDtl> getPublicationsBookingDtls() {
		return this.publicationsBookingDtls;
	}

	public void setPublicationsBookingDtls(List<PublicationsBookingDtl> publicationsBookingDtls) {
		this.publicationsBookingDtls = publicationsBookingDtls;
	}

	public PublicationsBookingDtl addPublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().add(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsCategoryMaster(this);

		return publicationsBookingDtl;
	}

	public PublicationsBookingDtl removePublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().remove(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsCategoryMaster(null);

		return publicationsBookingDtl;
	}

}