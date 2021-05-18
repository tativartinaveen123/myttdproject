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

import com.ttd.edarshan.dip.entity.SedDipRegistration;
import com.ttd.eseva.entity.ServiceChannelRulesConfig;
import com.ttd.eseva.entity.SevaAvailability;
import com.ttd.eseva.entity.SevaBooking;
import com.ttd.eseva.entity.SevaBookingDetail;
import com.ttd.eseva.entity.SevaChannelMaster;
import com.ttd.eseva.entity.SevaChannelRulesConfig;
import com.ttd.eseva.entity.SevaDefaultQuotaMaster;
import com.ttd.eseva.entity.SevaQuotaConfig;
import com.ttd.eseva.entity.SevaQuotaConfigPending;
import com.ttd.eseva.entity.SevaQuotaMaster;


/**
 * The persistent class for the CHANNEL_MASTER database table.
 * 
 */
@Entity
@Table(name="CHANNEL_MASTER")
@NamedQuery(name="ChannelMaster.findAll", query="SELECT c FROM ChannelMaster c")
public class ChannelMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CHANNEL_TYPE_ID")
	private long channelTypeId;

	@Column(name="CHANNEL_DESCRIPTION")
	private String channelDescription;

	@Column(name="CHANNEL_NAME")
	private String channelName;

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
/*
	//bi-directional many-to-one association to AccomAvailability
	@OneToMany(mappedBy="channelMaster")
	private List<AccomAvailability> accomAvailabilities;*/

	/*//bi-directional many-to-one association to AccomQuotaMaster
	@OneToMany(mappedBy="channelMaster")
	private List<AccomQuotaMaster> accomQuotaMasters;*/

	//bi-directional many-to-one association to ServiceChannelRulesConfig
	@OneToMany(mappedBy="channelMaster")
	private List<ServiceChannelRulesConfig> serviceChannelRulesConfigs;

	//bi-directional many-to-one association to SevaAvailability
	@OneToMany(mappedBy="channelMaster")
	private List<SevaAvailability> sevaAvailabilities;

	//bi-directional many-to-one association to SevaBooking
	@OneToMany(mappedBy="channelMaster")
	private List<SevaBooking> sevaBookings;

	//bi-directional many-to-one association to SevaBookingDetail
	@OneToMany(mappedBy="channelMaster")
	private List<SevaBookingDetail> sevaBookingDetails;

	//bi-directional many-to-one association to SevaChannelMaster
	@OneToMany(mappedBy="channelMaster")
	private List<SevaChannelMaster> sevaChannelMasters;

	//bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy="channelMaster")
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;

	//bi-directional many-to-one association to SevaDefaultQuotaMaster
	@OneToMany(mappedBy="channelMaster")
	private List<SevaDefaultQuotaMaster> sevaDefaultQuotaMasters;

	//bi-directional many-to-one association to SevaQuotaConfig
	@OneToMany(mappedBy="channelMaster")
	private List<SevaQuotaConfig> sevaQuotaConfigs;

	//bi-directional many-to-one association to SevaQuotaConfigPending
	@OneToMany(mappedBy="channelMaster")
	private List<SevaQuotaConfigPending> sevaQuotaConfigPendings;

	//bi-directional many-to-one association to SevaQuotaMaster
	@OneToMany(mappedBy="channelMaster")
	private List<SevaQuotaMaster> sevaQuotaMasters;
	
	@OneToMany(mappedBy="channelMaster")
	private List<SedDipRegistration> sedDipRegistrations;

	public ChannelMaster() {
	}

	public long getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(long channelTypeId) {
		this.channelTypeId = channelTypeId;
	}

	public String getChannelDescription() {
		return this.channelDescription;
	}

	public void setChannelDescription(String channelDescription) {
		this.channelDescription = channelDescription;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
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

	/*public List<AccomAvailability> getAccomAvailabilities() {
		return this.accomAvailabilities;
	}

	public void setAccomAvailabilities(List<AccomAvailability> accomAvailabilities) {
		this.accomAvailabilities = accomAvailabilities;
	}*/

	/*public AccomAvailability addAccomAvailability(AccomAvailability accomAvailability) {
		getAccomAvailabilities().add(accomAvailability);
		accomAvailability.setChannelMaster(this);

		return accomAvailability;
	}

	public AccomAvailability removeAccomAvailability(AccomAvailability accomAvailability) {
		getAccomAvailabilities().remove(accomAvailability);
		accomAvailability.setChannelMaster(null);

		return accomAvailability;
	}*/

	/*public List<AccomQuotaMaster> getAccomQuotaMasters() {
		return this.accomQuotaMasters;
	}

	public void setAccomQuotaMasters(List<AccomQuotaMaster> accomQuotaMasters) {
		this.accomQuotaMasters = accomQuotaMasters;
	}*/

	/*public AccomQuotaMaster addAccomQuotaMaster(AccomQuotaMaster accomQuotaMaster) {
		getAccomQuotaMasters().add(accomQuotaMaster);
		accomQuotaMaster.setChannelMaster(this);

		return accomQuotaMaster;
	}

	public AccomQuotaMaster removeAccomQuotaMaster(AccomQuotaMaster accomQuotaMaster) {
		getAccomQuotaMasters().remove(accomQuotaMaster);
		accomQuotaMaster.setChannelMaster(null);

		return accomQuotaMaster;
	}*/

	public List<ServiceChannelRulesConfig> getServiceChannelRulesConfigs() {
		return this.serviceChannelRulesConfigs;
	}

	public void setServiceChannelRulesConfigs(List<ServiceChannelRulesConfig> serviceChannelRulesConfigs) {
		this.serviceChannelRulesConfigs = serviceChannelRulesConfigs;
	}

	public ServiceChannelRulesConfig addServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().add(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setChannelMaster(this);

		return serviceChannelRulesConfig;
	}

	public ServiceChannelRulesConfig removeServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().remove(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setChannelMaster(null);

		return serviceChannelRulesConfig;
	}

	public List<SevaAvailability> getSevaAvailabilities() {
		return this.sevaAvailabilities;
	}

	public void setSevaAvailabilities(List<SevaAvailability> sevaAvailabilities) {
		this.sevaAvailabilities = sevaAvailabilities;
	}

	public SevaAvailability addSevaAvailability(SevaAvailability sevaAvailability) {
		getSevaAvailabilities().add(sevaAvailability);
		sevaAvailability.setChannelMaster(this);

		return sevaAvailability;
	}

	public SevaAvailability removeSevaAvailability(SevaAvailability sevaAvailability) {
		getSevaAvailabilities().remove(sevaAvailability);
		sevaAvailability.setChannelMaster(null);

		return sevaAvailability;
	}

	public List<SevaBooking> getSevaBookings() {
		return this.sevaBookings;
	}

	public void setSevaBookings(List<SevaBooking> sevaBookings) {
		this.sevaBookings = sevaBookings;
	}

	public SevaBooking addSevaBooking(SevaBooking sevaBooking) {
		getSevaBookings().add(sevaBooking);
		sevaBooking.setChannelMaster(this);

		return sevaBooking;
	}

	public SevaBooking removeSevaBooking(SevaBooking sevaBooking) {
		getSevaBookings().remove(sevaBooking);
		sevaBooking.setChannelMaster(null);

		return sevaBooking;
	}

	public List<SevaBookingDetail> getSevaBookingDetails() {
		return this.sevaBookingDetails;
	}

	public void setSevaBookingDetails(List<SevaBookingDetail> sevaBookingDetails) {
		this.sevaBookingDetails = sevaBookingDetails;
	}

	public SevaBookingDetail addSevaBookingDetail(SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().add(sevaBookingDetail);
		sevaBookingDetail.setChannelMaster(this);

		return sevaBookingDetail;
	}

	public SevaBookingDetail removeSevaBookingDetail(SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().remove(sevaBookingDetail);
		sevaBookingDetail.setChannelMaster(null);

		return sevaBookingDetail;
	}

	public List<SevaChannelMaster> getSevaChannelMasters() {
		return this.sevaChannelMasters;
	}

	public void setSevaChannelMasters(List<SevaChannelMaster> sevaChannelMasters) {
		this.sevaChannelMasters = sevaChannelMasters;
	}

	public SevaChannelMaster addSevaChannelMaster(SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().add(sevaChannelMaster);
		sevaChannelMaster.setChannelMaster(this);

		return sevaChannelMaster;
	}

	public SevaChannelMaster removeSevaChannelMaster(SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().remove(sevaChannelMaster);
		sevaChannelMaster.setChannelMaster(null);

		return sevaChannelMaster;
	}

	public List<SevaChannelRulesConfig> getSevaChannelRulesConfigs() {
		return this.sevaChannelRulesConfigs;
	}

	public void setSevaChannelRulesConfigs(List<SevaChannelRulesConfig> sevaChannelRulesConfigs) {
		this.sevaChannelRulesConfigs = sevaChannelRulesConfigs;
	}

	public SevaChannelRulesConfig addSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().add(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setChannelMaster(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setChannelMaster(null);

		return sevaChannelRulesConfig;
	}

	public List<SevaDefaultQuotaMaster> getSevaDefaultQuotaMasters() {
		return this.sevaDefaultQuotaMasters;
	}

	public void setSevaDefaultQuotaMasters(List<SevaDefaultQuotaMaster> sevaDefaultQuotaMasters) {
		this.sevaDefaultQuotaMasters = sevaDefaultQuotaMasters;
	}

	public SevaDefaultQuotaMaster addSevaDefaultQuotaMaster(SevaDefaultQuotaMaster sevaDefaultQuotaMaster) {
		getSevaDefaultQuotaMasters().add(sevaDefaultQuotaMaster);
		sevaDefaultQuotaMaster.setChannelMaster(this);

		return sevaDefaultQuotaMaster;
	}

	public SevaDefaultQuotaMaster removeSevaDefaultQuotaMaster(SevaDefaultQuotaMaster sevaDefaultQuotaMaster) {
		getSevaDefaultQuotaMasters().remove(sevaDefaultQuotaMaster);
		sevaDefaultQuotaMaster.setChannelMaster(null);

		return sevaDefaultQuotaMaster;
	}

	public List<SevaQuotaConfig> getSevaQuotaConfigs() {
		return this.sevaQuotaConfigs;
	}

	public void setSevaQuotaConfigs(List<SevaQuotaConfig> sevaQuotaConfigs) {
		this.sevaQuotaConfigs = sevaQuotaConfigs;
	}

	public SevaQuotaConfig addSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().add(sevaQuotaConfig);
		sevaQuotaConfig.setChannelMaster(this);

		return sevaQuotaConfig;
	}

	public SevaQuotaConfig removeSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().remove(sevaQuotaConfig);
		sevaQuotaConfig.setChannelMaster(null);

		return sevaQuotaConfig;
	}

	public List<SevaQuotaConfigPending> getSevaQuotaConfigPendings() {
		return this.sevaQuotaConfigPendings;
	}

	public void setSevaQuotaConfigPendings(List<SevaQuotaConfigPending> sevaQuotaConfigPendings) {
		this.sevaQuotaConfigPendings = sevaQuotaConfigPendings;
	}

	public SevaQuotaConfigPending addSevaQuotaConfigPending(SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().add(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setChannelMaster(this);

		return sevaQuotaConfigPending;
	}

	public SevaQuotaConfigPending removeSevaQuotaConfigPending(SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().remove(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setChannelMaster(null);

		return sevaQuotaConfigPending;
	}

	public List<SevaQuotaMaster> getSevaQuotaMasters() {
		return this.sevaQuotaMasters;
	}

	public void setSevaQuotaMasters(List<SevaQuotaMaster> sevaQuotaMasters) {
		this.sevaQuotaMasters = sevaQuotaMasters;
	}

	public SevaQuotaMaster addSevaQuotaMaster(SevaQuotaMaster sevaQuotaMaster) {
		getSevaQuotaMasters().add(sevaQuotaMaster);
		sevaQuotaMaster.setChannelMaster(this);

		return sevaQuotaMaster;
	}

	public SevaQuotaMaster removeSevaQuotaMaster(SevaQuotaMaster sevaQuotaMaster) {
		getSevaQuotaMasters().remove(sevaQuotaMaster);
		sevaQuotaMaster.setChannelMaster(null);

		return sevaQuotaMaster;
	}
	public List<SedDipRegistration> getSedDipRegistrations() {
		return this.sedDipRegistrations;
	}

	public void setSedDipRegistrations(List<SedDipRegistration> sedDipRegistrations) {
		this.sedDipRegistrations = sedDipRegistrations;
	}

	public SedDipRegistration addSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().add(sedDipRegistration);
		sedDipRegistration.setChannelMaster(this);

		return sedDipRegistration;
	}

	public SedDipRegistration removeSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().remove(sedDipRegistration);
		sedDipRegistration.setChannelMaster(null);

		return sedDipRegistration;
	}
}