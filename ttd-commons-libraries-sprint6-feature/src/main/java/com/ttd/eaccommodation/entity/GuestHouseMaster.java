package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GUEST_HOUSE_MASTER database table.
 * 
 */
@Entity
@Table(name="GUEST_HOUSE_MASTER")
@NamedQuery(name="GuestHouseMaster.findAll", query="SELECT g FROM GuestHouseMaster g")
public class GuestHouseMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GUEST_HOUSE_ID")
	private long guestHouseId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="GUEST_HOUSE_DTLS")
	private String guestHouseDtls;

	@Column(name="GUEST_HOUSE_NAME")
	private String guestHouseName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to LocationMaster
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private LocationMaster locationMaster;

	public GuestHouseMaster() {
	}

	public long getGuestHouseId() {
		return this.guestHouseId;
	}

	public void setGuestHouseId(long guestHouseId) {
		this.guestHouseId = guestHouseId;
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

	public String getGuestHouseDtls() {
		return this.guestHouseDtls;
	}

	public void setGuestHouseDtls(String guestHouseDtls) {
		this.guestHouseDtls = guestHouseDtls;
	}

	public String getGuestHouseName() {
		return this.guestHouseName;
	}

	public void setGuestHouseName(String guestHouseName) {
		this.guestHouseName = guestHouseName;
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

	public LocationMaster getLocationMaster() {
		return this.locationMaster;
	}

	public void setLocationMaster(LocationMaster locationMaster) {
		this.locationMaster = locationMaster;
	}

}