package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ttd.eaccommodation.entity.BookingPilgrim;
import com.ttd.edarshan.entity.DarshanBookingPilgrim;

/**
 * The persistent class for the IMAGES_STORE database table.
 * 
 */
@Entity
@Table(name = "IMAGES_STORE")
@NamedQuery(name = "ImagesStore.findAll", query = "SELECT i FROM ImagesStore i")
public class ImagesStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "IMAGES_STORE_IMAGE_ID_GENERATOR", sequenceName = "IMAGES_STORE_IMAGE_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMAGES_STORE_IMAGE_ID_GENERATOR")
	@Column(name = "IMAGE_ID")
	private long imageId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	@Lob
	@Column(name = "IMAGE")
	private byte[] image;

	@Column(name = "IMG_PATH")
	private String imageName;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to BookingPilgrim
	@OneToMany(mappedBy = "imagesStore")
	private List<BookingPilgrim> bookingPilgrims;

	@OneToMany(mappedBy = "imagesStore")
	private List<DarshanBookingPilgrim> DarshanBookingPilgrims;

	// bi-directional many-to-one association to UsersFriendsAndFamily
	@OneToMany(mappedBy = "imagesStore")
	private List<UsersFriendsAndFamily> usersFriendsAndFamilies;

	public ImagesStore() {
	}

	public long getImageId() {
		return this.imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
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

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
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
		usersFriendsAndFamily.setImagesStore(this);

		return usersFriendsAndFamily;
	}

	public UsersFriendsAndFamily removeUsersFriendsAndFamily(
			UsersFriendsAndFamily usersFriendsAndFamily) {
		getUsersFriendsAndFamilies().remove(usersFriendsAndFamily);
		usersFriendsAndFamily.setImagesStore(null);

		return usersFriendsAndFamily;
	}

	public List<BookingPilgrim> getBookingPilgrims() {
		return this.bookingPilgrims;
	}

	public void setBookingPilgrims(List<BookingPilgrim> bookingPilgrims) {
		this.bookingPilgrims = bookingPilgrims;
	}

	public List<DarshanBookingPilgrim> getDarshanBookingPilgrims() {
		return DarshanBookingPilgrims;
	}

	public void setDarshanBookingPilgrims(
			List<DarshanBookingPilgrim> darshanBookingPilgrims) {
		DarshanBookingPilgrims = darshanBookingPilgrims;
	}

}