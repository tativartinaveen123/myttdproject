package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.eaccommodation.entity.BookingPilgrim;


/**
 * The persistent class for the SEVA_BOOKING_DETAILS database table.
 * 
 */
@Entity
@Table(name="SEVA_BOOKING_DETAILS")
@NamedQuery(name="SevaBookingDetail.findAll", query="SELECT s FROM SevaBookingDetail s")
public class SevaBookingDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVA_BOOKING_DETAILS_PILGRIMID_GENERATOR", sequenceName="SEVA_BOOKING_SEVA_BOOKING_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVA_BOOKING_DETAILS_PILGRIMID_GENERATOR")
	@Column(name="BOOKING_DETAILS_ID")
	private long bookingDetailsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to BookingPilgrim
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PILGRIM_ID")
	private BookingPilgrim bookingPilgrim;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to SevaBooking
	@ManyToOne
	@JoinColumn(name="SEVA_BOOKING_ID")
	private SevaBooking sevaBooking;

	public SevaBookingDetail() {
	}

	public long getBookingDetailsId() {
		return this.bookingDetailsId;
	}

	public void setBookingDetailsId(long bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
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

	public BookingPilgrim getBookingPilgrim() {
		return this.bookingPilgrim;
	}

	public void setBookingPilgrim(BookingPilgrim bookingPilgrim) {
		this.bookingPilgrim = bookingPilgrim;
	}

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public SevaBooking getSevaBooking() {
		return this.sevaBooking;
	}

	public void setSevaBooking(SevaBooking sevaBooking) {
		this.sevaBooking = sevaBooking;
	}

}