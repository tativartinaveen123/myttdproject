package com.ttd.common.entity;

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

import com.ttd.eaccommodation.entity.BookingPilgrim;
import com.ttd.edarshan.entity.DarshanBookingPilgrim;

/**
 * The persistent class for the COMMON_VALUE_MASTER database table.
 * 
 */
@Entity
@Table(name = "COMMON_VALUE_MASTER")
@NamedQuery(name = "CommonValueMaster.findAll", query = "SELECT c FROM CommonValueMaster c")
public class CommonValueMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VALUE_ID")
	private long valueId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	@Column(name = "ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "VALUE_DESCRIPTION")
	private String valueDescription;

	@Column(name = "VALUE_NAME")
	private String valueName;

	// bi-directional many-to-one association to BookingPilgrim
	@OneToMany(mappedBy = "commonValueMaster")
	private List<BookingPilgrim> bookingPilgrims;

	// bi-directional many-to-one association to CommonValueGroup
	@ManyToOne
	@JoinColumn(name = "VALUE_GROUP_ID")
	private CommonValueGroup commonValueGroup;

	// bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy = "commonValueMaster1")
	private List<ServiceNote> serviceNotes1;

	// bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy = "commonValueMaster2")
	private List<ServiceNote> serviceNotes2;

	// bi-directional many-to-one association to UsersFriendsAndFamily
	@OneToMany(mappedBy = "commonValueMaster")
	private List<UsersFriendsAndFamily> usersFriendsAndFamilies;

	@OneToMany(mappedBy = "commonValueMaster")
	private List<DarshanBookingPilgrim> darshanBookingPilgrims;

	public CommonValueMaster() {
	}

	public long getValueId() {
		return this.valueId;
	}

	public void setValueId(long valueId) {
		this.valueId = valueId;
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

	public String getValueDescription() {
		return this.valueDescription;
	}

	public void setValueDescription(String valueDescription) {
		this.valueDescription = valueDescription;
	}

	public String getValueName() {
		return this.valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public List<BookingPilgrim> getBookingPilgrims() {
		return this.bookingPilgrims;
	}

	public void setBookingPilgrims(List<BookingPilgrim> bookingPilgrims) {
		this.bookingPilgrims = bookingPilgrims;
	}

	public BookingPilgrim addBookingPilgrim(BookingPilgrim bookingPilgrim) {
		getBookingPilgrims().add(bookingPilgrim);
		bookingPilgrim.setCommonValueMaster(this);

		return bookingPilgrim;
	}

	public BookingPilgrim removeBookingPilgrim(BookingPilgrim bookingPilgrim) {
		getBookingPilgrims().remove(bookingPilgrim);
		bookingPilgrim.setCommonValueMaster(null);

		return bookingPilgrim;
	}

	public CommonValueGroup getCommonValueGroup() {
		return this.commonValueGroup;
	}

	public void setCommonValueGroup(CommonValueGroup commonValueGroup) {
		this.commonValueGroup = commonValueGroup;
	}

	public List<ServiceNote> getServiceNotes1() {
		return this.serviceNotes1;
	}

	public void setServiceNotes1(List<ServiceNote> serviceNotes1) {
		this.serviceNotes1 = serviceNotes1;
	}

	public ServiceNote addServiceNotes1(ServiceNote serviceNotes1) {
		getServiceNotes1().add(serviceNotes1);
		serviceNotes1.setCommonValueMaster1(this);

		return serviceNotes1;
	}

	public ServiceNote removeServiceNotes1(ServiceNote serviceNotes1) {
		getServiceNotes1().remove(serviceNotes1);
		serviceNotes1.setCommonValueMaster1(null);

		return serviceNotes1;
	}

	public List<ServiceNote> getServiceNotes2() {
		return this.serviceNotes2;
	}

	public void setServiceNotes2(List<ServiceNote> serviceNotes2) {
		this.serviceNotes2 = serviceNotes2;
	}

	public ServiceNote addServiceNotes2(ServiceNote serviceNotes2) {
		getServiceNotes2().add(serviceNotes2);
		serviceNotes2.setCommonValueMaster2(this);

		return serviceNotes2;
	}

	public ServiceNote removeServiceNotes2(ServiceNote serviceNotes2) {
		getServiceNotes2().remove(serviceNotes2);
		serviceNotes2.setCommonValueMaster2(null);

		return serviceNotes2;
	}

	public List<UsersFriendsAndFamily> getUsersFriendsAndFamilies() {
		return this.usersFriendsAndFamilies;
	}

	public void setUsersFriendsAndFamilies(
			List<UsersFriendsAndFamily> usersFriendsAndFamilies) {
		this.usersFriendsAndFamilies = usersFriendsAndFamilies;
	}

	public UsersFriendsAndFamily addUsersFriendsAndFamily(
			UsersFriendsAndFamily usersFriendsAndFamily) {
		getUsersFriendsAndFamilies().add(usersFriendsAndFamily);
		usersFriendsAndFamily.setCommonValueMaster(this);

		return usersFriendsAndFamily;
	}

	public UsersFriendsAndFamily removeUsersFriendsAndFamily(
			UsersFriendsAndFamily usersFriendsAndFamily) {
		getUsersFriendsAndFamilies().remove(usersFriendsAndFamily);
		usersFriendsAndFamily.setCommonValueMaster(null);

		return usersFriendsAndFamily;
	}

	public List<DarshanBookingPilgrim> getDarshanBookingPilgrims() {
		return darshanBookingPilgrims;
	}

	public void setDarshanBookingPilgrims(
			List<DarshanBookingPilgrim> darshanBookingPilgrims) {
		this.darshanBookingPilgrims = darshanBookingPilgrims;
	}

}