package com.ttd.publications.entity;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PUBLICATIONS_SUBCATE_MASTER database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_SUBCATE_MASTER")
@NamedQuery(name="PublicationsSubcateMaster.findAll", query="SELECT p FROM PublicationsSubcateMaster p")
public class PublicationsSubcateMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PSCM_ID")
	private long pscmId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PSCM_DESCRIPTION")
	private String pscmDescription;

	@Column(name="PSCM_NAME")
	private String pscmName;

	@Column(name="PUBLICATION_PRICE")
	private BigDecimal publicationPrice;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to PublicationsCategoryMaster
	@ManyToOne
	@JoinColumn(name="PCM_ID")
	private PublicationsCategoryMaster publicationsCategoryMaster;
	
	@OneToMany(mappedBy="publicationsSubcateMaster")
	private List<PublicationsBookingDtl> publicationsBookingDtls;
	
	@Column(name="PUBLICATION_IMAGE")
	private String publicationImage;

	public PublicationsSubcateMaster() {
	}

	public long getPscmId() {
		return this.pscmId;
	}

	public void setPscmId(long pscmId) {
		this.pscmId = pscmId;
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

	public String getPscmDescription() {
		return this.pscmDescription;
	}

	public void setPscmDescription(String pscmDescription) {
		this.pscmDescription = pscmDescription;
	}

	public String getPscmName() {
		return this.pscmName;
	}

	public void setPscmName(String pscmName) {
		this.pscmName = pscmName;
	}

	public BigDecimal getPublicationPrice() {
		return this.publicationPrice;
	}

	public void setPublicationPrice(BigDecimal publicationPrice) {
		this.publicationPrice = publicationPrice;
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

	public PublicationsCategoryMaster getPublicationsCategoryMaster() {
		return this.publicationsCategoryMaster;
	}

	public void setPublicationsCategoryMaster(PublicationsCategoryMaster publicationsCategoryMaster) {
		this.publicationsCategoryMaster = publicationsCategoryMaster;
	}

	public String getPublicationImage() {
		return publicationImage;
	}

	public void setPublicationImage(String publicationImage) {
		this.publicationImage = publicationImage;
	}

	public List<PublicationsBookingDtl> getPublicationsBookingDtls() {
		return this.publicationsBookingDtls;
	}

	public void setPublicationsBookingDtls(List<PublicationsBookingDtl> publicationsBookingDtls) {
		this.publicationsBookingDtls = publicationsBookingDtls;
	}

	public PublicationsBookingDtl addPublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().add(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsSubcateMaster(this);

		return publicationsBookingDtl;
	}

	public PublicationsBookingDtl removePublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().remove(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsSubcateMaster(null);

		return publicationsBookingDtl;
	}
	
}