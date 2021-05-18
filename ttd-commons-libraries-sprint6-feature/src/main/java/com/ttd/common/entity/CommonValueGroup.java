package com.ttd.common.entity;

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
 * The persistent class for the COMMON_VALUE_GROUP database table.
 * 
 */
@Entity
@Table(name="COMMON_VALUE_GROUP")
@NamedQuery(name="CommonValueGroup.findAll", query="SELECT c FROM CommonValueGroup c")
public class CommonValueGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VALUE_GROUP_ID")
	private long valueGroupId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="VALUE_GROUP_DESCRIPTION")
	private String valueGroupDescription;

	@Column(name="VALUE_GROUP_NAME")
	private String valueGroupName;

	//bi-directional many-to-one association to CommonValueMaster
	@OneToMany(mappedBy="commonValueGroup")
	private List<CommonValueMaster> commonValueMasters;

	public CommonValueGroup() {
	}

	public long getValueGroupId() {
		return this.valueGroupId;
	}

	public void setValueGroupId(long valueGroupId) {
		this.valueGroupId = valueGroupId;
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

	public String getValueGroupDescription() {
		return this.valueGroupDescription;
	}

	public void setValueGroupDescription(String valueGroupDescription) {
		this.valueGroupDescription = valueGroupDescription;
	}

	public String getValueGroupName() {
		return this.valueGroupName;
	}

	public void setValueGroupName(String valueGroupName) {
		this.valueGroupName = valueGroupName;
	}

	public List<CommonValueMaster> getCommonValueMasters() {
		return this.commonValueMasters;
	}

	public void setCommonValueMasters(List<CommonValueMaster> commonValueMasters) {
		this.commonValueMasters = commonValueMasters;
	}

	public CommonValueMaster addCommonValueMaster(CommonValueMaster commonValueMaster) {
		getCommonValueMasters().add(commonValueMaster);
		commonValueMaster.setCommonValueGroup(this);

		return commonValueMaster;
	}

	public CommonValueMaster removeCommonValueMaster(CommonValueMaster commonValueMaster) {
		getCommonValueMasters().remove(commonValueMaster);
		commonValueMaster.setCommonValueGroup(null);

		return commonValueMaster;
	}

}