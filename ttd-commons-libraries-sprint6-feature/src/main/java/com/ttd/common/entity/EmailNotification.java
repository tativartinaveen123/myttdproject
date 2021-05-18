package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.donor.entity.DollarBooking;
import com.ttd.ehundi.entity.HundiOffering;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EMAIL_NOTIFCATION database table.
 * 
 */
@Entity
@Table(name="EMAIL_NOTIFCATION")
//@NamedQuery(name="EmailNotifcation.findAll", query="SELECT e FROM EmailNotifcation e")
public class EmailNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMAIL_NOTIFCATION_EMAILNOTIFICATIONID_GENERATOR", sequenceName="EMAIL_NOTIFCATION_EMAIL_NOTIFI", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMAIL_NOTIFCATION_EMAILNOTIFICATIONID_GENERATOR")
	@Column(name="EMAIL_NOTIFICATION_ID")
	private long emailNotificationId;

	@Column(name="ATTACHMENT_NAME")
	private String attachmentName;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="EMAIL_BODY")
	private String emailBody;

	@Column(name="EMAIL_CC")
	private String emailCc;

	@Column(name="EMAIL_FROM")
	private String emailFrom;

	@Column(name="EMAIL_SUBJECT")
	private String emailSubject;

	@Column(name="EMAIL_TO")
	private String emailTo;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;
	
	@Column(name="EMAIL_STATUS")
	private String emailStatus;

	public String getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to HundiOffering
	@OneToMany(mappedBy="emailNotifcation")
	private List<HundiOffering> hundiOfferings;
	

	//bi-directional many-to-one association to DollarBooking
		@OneToMany(mappedBy="emailNotifcation")
		private List<DollarBooking> dollarBookings;

		public List<DollarBooking> getDollarBookings() {
			return dollarBookings;
		}

		public void setDollarBookings(List<DollarBooking> dollarBookings) {
			this.dollarBookings = dollarBookings;
		}


	public EmailNotification() {
	}

	public long getEmailNotificationId() {
		return this.emailNotificationId;
	}

	public void setEmailNotificationId(long emailNotificationId) {
		this.emailNotificationId = emailNotificationId;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
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

	public String getEmailBody() {
		return this.emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailCc() {
		return this.emailCc;
	}

	public void setEmailCc(String emailCc) {
		this.emailCc = emailCc;
	}

	public String getEmailFrom() {
		return this.emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
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

	public List<HundiOffering> getHundiOfferings() {
		return this.hundiOfferings;
	}

	public void setHundiOfferings(List<HundiOffering> hundiOfferings) {
		this.hundiOfferings = hundiOfferings;
	}

	public HundiOffering addHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().add(hundiOffering);
		hundiOffering.setEmailNotifcation(this);

		return hundiOffering;
	}

	public HundiOffering removeHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().remove(hundiOffering);
		hundiOffering.setEmailNotifcation(null);

		return hundiOffering;
	}

}