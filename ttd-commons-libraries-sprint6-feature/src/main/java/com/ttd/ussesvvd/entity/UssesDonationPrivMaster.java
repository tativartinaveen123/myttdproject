package com.ttd.ussesvvd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ServiceTypeMaster;


/**
 * The persistent class for the USSES_DONATION_PRIV_MASTER database table.
 * 
 */
@Entity
@Table(name="USSES_DONATION_PRIV_MASTER")
@NamedQuery(name="UssesDonationPrivMaster.findAll", query="SELECT u FROM UssesDonationPrivMaster u")
public class UssesDonationPrivMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONATION_PRIV_ID")
	private long donationPrivId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DONATION_SCHEME")
	private String donationScheme;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="PRIV_TYPE")
	private String privType;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SEVA_DAY")
	private String sevaDay;

	@Column(name="SEVA_NAME")
	private String sevaName;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="QUANTITY")
	private String quantity;
	
	@Column(name="REPORTING_TIME")
	private String reportingTime;
	
	@Column(name="REPORING_PLACE")
	private String reportingPlace;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;
	
	@OneToMany(mappedBy="ussesDonationPrivMaster")
	private List<UssesDonorPrivRedemService> ussesDonorPrivRedemServices;

	public UssesDonationPrivMaster() {
	}

	public long getDonationPrivId() {
		return this.donationPrivId;
	}

	public void setDonationPrivId(long donationPrivId) {
		this.donationPrivId = donationPrivId;
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

	public String getDonationScheme() {
		return this.donationScheme;
	}

	public void setDonationScheme(String donationScheme) {
		this.donationScheme = donationScheme;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPrivType() {
		return this.privType;
	}

	public void setPrivType(String privType) {
		this.privType = privType;
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

	public String getSevaDay() {
		return this.sevaDay;
	}

	public void setSevaDay(String sevaDay) {
		this.sevaDay = sevaDay;
	}

	public String getSevaName() {
		return this.sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
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

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<UssesDonorPrivRedemService> getUssesDonorPrivRedemServices() {
		return ussesDonorPrivRedemServices;
	}

	public void setUssesDonorPrivRedemServices(
			List<UssesDonorPrivRedemService> ussesDonorPrivRedemServices) {
		this.ussesDonorPrivRedemServices = ussesDonorPrivRedemServices;
	}

	public String getReportingTime() {
		return reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}

	public String getReportingPlace() {
		return reportingPlace;
	}

	public void setReportingPlace(String reportingPlace) {
		this.reportingPlace = reportingPlace;
	}
	
	

}