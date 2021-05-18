package com.ttd.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PRIVILIGES_MASTER database table.
 * 
 */
@Entity
@Table(name="PRIVILIGES_MASTER")
@NamedQuery(name="PriviligesMaster.findAll", query="SELECT p FROM PriviligesMaster p")
public class PriviligesMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRIVILIGE_ID")
	private long priviligeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PRIVILIGE_DESCRIPTION")
	private String priviligeDescription;

	@Column(name="PRIVILIGE_NAME")
	private String priviligeName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to UserPrivilige
	@OneToMany(mappedBy="priviligesMaster")
	private List<UserPrivilige> userPriviliges;

	public PriviligesMaster() {
	}

	public long getPriviligeId() {
		return this.priviligeId;
	}

	public void setPriviligeId(long priviligeId) {
		this.priviligeId = priviligeId;
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

	public String getPriviligeDescription() {
		return this.priviligeDescription;
	}

	public void setPriviligeDescription(String priviligeDescription) {
		this.priviligeDescription = priviligeDescription;
	}

	public String getPriviligeName() {
		return this.priviligeName;
	}

	public void setPriviligeName(String priviligeName) {
		this.priviligeName = priviligeName;
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

	public List<UserPrivilige> getUserPriviliges() {
		return this.userPriviliges;
	}

	public void setUserPriviliges(List<UserPrivilige> userPriviliges) {
		this.userPriviliges = userPriviliges;
	}

	/*public UserPrivilige addUserPrivilige(UserPrivilige userPrivilige) {
		getUserPriviliges().add(userPrivilige);
		userPrivilige.setPriviligesMaster(this);

		return userPrivilige;
	}

	public UserPrivilige removeUserPrivilige(UserPrivilige userPrivilige) {
		getUserPriviliges().remove(userPrivilige);
		userPrivilige.setPriviligesMaster(null);

		return userPrivilige;
	}*/

}