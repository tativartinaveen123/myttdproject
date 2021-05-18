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

import com.ttd.eaccommodation.entity.BookingPilgrim;
import com.ttd.edarshan.dip.entity.SedDipRegistration;
import com.ttd.edarshan.entity.SlotsMaster;
import com.ttd.eseva.entity.RequestApprovalPrivilege;
import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.eseva.entity.RulesMaster;
import com.ttd.eseva.entity.ServiceChannelRulesConfig;
import com.ttd.eseva.entity.SevaChannelRulesConfig;
import com.ttd.ussesvvd.entity.UssesDonationPrivMaster;


/**
 * The persistent class for the SERVICE_TYPE_MASTER database table.
 * 
 */
@Entity
@Table(name="SERVICE_TYPE_MASTER")
@NamedQuery(name="ServiceTypeMaster.findAll", query="SELECT s FROM ServiceTypeMaster s")
public class ServiceTypeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_TYPE_ID")
	private long serviceTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_DESCRIPTION")
	private String serviceDescription;

	@Column(name="SERVICE_TYPE_NAME")
	private String serviceTypeName;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="PARENT_SERVICE_TYPE_ID")
	private BigDecimal parentServiceTypeId;

	@Column(name="PARENT_SERVICE_TYPE_NAME")
	private String parentServiceTypeName;

	//bi-directional many-to-one association to BookingPilgrim
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<BookingPilgrim> bookingPilgrims;

	//bi-directional many-to-one association to RequestApprovalPrivilege
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<RequestApprovalPrivilege> requestApprovalPrivileges;

	//bi-directional many-to-one association to RequestTypeMaster
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<RequestTypeMaster> requestTypeMasters;

	//bi-directional many-to-one association to RulesMaster
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<RulesMaster> rulesMasters;

	//bi-directional many-to-one association to ServiceChannelRulesConfig
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<ServiceChannelRulesConfig> serviceChannelRulesConfigs;

	//bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<ServiceNote> serviceNotes;

	//bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy="serviceTypeMaster")
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;
	
	//bi-directional many-to-one association to UssesDonationPrivMaster
		@OneToMany(mappedBy="serviceTypeMaster")
		private List<UssesDonationPrivMaster> ussesDonationPrivMasters;

		@OneToMany(mappedBy="serviceTypeMaster")
		private List<SedDipRegistration> sedDipRegistrations;
		
		//bi-directional many-to-one association to SlotsMaster
		@OneToMany(mappedBy="serviceTypeMaster")
		private List<SlotsMaster> slotsMasters;
		
	public ServiceTypeMaster() {
	}

	public long getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(long serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
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

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getServiceTypeName() {
		return this.serviceTypeName;
	}

	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
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

	public List<BookingPilgrim> getBookingPilgrims() {
		return this.bookingPilgrims;
	}

	public void setBookingPilgrims(List<BookingPilgrim> bookingPilgrims) {
		this.bookingPilgrims = bookingPilgrims;
	}

	public BookingPilgrim addBookingPilgrim(BookingPilgrim bookingPilgrim) {
		getBookingPilgrims().add(bookingPilgrim);
		bookingPilgrim.setServiceTypeMaster(this);

		return bookingPilgrim;
	}

	public BookingPilgrim removeBookingPilgrim(BookingPilgrim bookingPilgrim) {
		getBookingPilgrims().remove(bookingPilgrim);
		bookingPilgrim.setServiceTypeMaster(null);

		return bookingPilgrim;
	}

	public List<RequestApprovalPrivilege> getRequestApprovalPrivileges() {
		return this.requestApprovalPrivileges;
	}

	public void setRequestApprovalPrivileges(List<RequestApprovalPrivilege> requestApprovalPrivileges) {
		this.requestApprovalPrivileges = requestApprovalPrivileges;
	}

	public RequestApprovalPrivilege addRequestApprovalPrivilege(RequestApprovalPrivilege requestApprovalPrivilege) {
		getRequestApprovalPrivileges().add(requestApprovalPrivilege);
		requestApprovalPrivilege.setServiceTypeMaster(this);

		return requestApprovalPrivilege;
	}

	public RequestApprovalPrivilege removeRequestApprovalPrivilege(RequestApprovalPrivilege requestApprovalPrivilege) {
		getRequestApprovalPrivileges().remove(requestApprovalPrivilege);
		requestApprovalPrivilege.setServiceTypeMaster(null);

		return requestApprovalPrivilege;
	}

	public List<RequestTypeMaster> getRequestTypeMasters() {
		return this.requestTypeMasters;
	}

	public void setRequestTypeMasters(List<RequestTypeMaster> requestTypeMasters) {
		this.requestTypeMasters = requestTypeMasters;
	}

	public RequestTypeMaster addRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
		getRequestTypeMasters().add(requestTypeMaster);
		requestTypeMaster.setServiceTypeMaster(this);

		return requestTypeMaster;
	}

	public RequestTypeMaster removeRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
		getRequestTypeMasters().remove(requestTypeMaster);
		requestTypeMaster.setServiceTypeMaster(null);

		return requestTypeMaster;
	}

	public List<RulesMaster> getRulesMasters() {
		return this.rulesMasters;
	}

	public void setRulesMasters(List<RulesMaster> rulesMasters) {
		this.rulesMasters = rulesMasters;
	}

	public RulesMaster addRulesMaster(RulesMaster rulesMaster) {
		getRulesMasters().add(rulesMaster);
		rulesMaster.setServiceTypeMaster(this);

		return rulesMaster;
	}

	public RulesMaster removeRulesMaster(RulesMaster rulesMaster) {
		getRulesMasters().remove(rulesMaster);
		rulesMaster.setServiceTypeMaster(null);

		return rulesMaster;
	}

	public List<ServiceChannelRulesConfig> getServiceChannelRulesConfigs() {
		return this.serviceChannelRulesConfigs;
	}

	public void setServiceChannelRulesConfigs(List<ServiceChannelRulesConfig> serviceChannelRulesConfigs) {
		this.serviceChannelRulesConfigs = serviceChannelRulesConfigs;
	}

	public ServiceChannelRulesConfig addServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().add(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setServiceTypeMaster(this);

		return serviceChannelRulesConfig;
	}

	public ServiceChannelRulesConfig removeServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().remove(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setServiceTypeMaster(null);

		return serviceChannelRulesConfig;
	}

	public List<ServiceNote> getServiceNotes() {
		return this.serviceNotes;
	}

	public void setServiceNotes(List<ServiceNote> serviceNotes) {
		this.serviceNotes = serviceNotes;
	}

	public ServiceNote addServiceNote(ServiceNote serviceNote) {
		getServiceNotes().add(serviceNote);
		serviceNote.setServiceTypeMaster(this);

		return serviceNote;
	}

	public ServiceNote removeServiceNote(ServiceNote serviceNote) {
		getServiceNotes().remove(serviceNote);
		serviceNote.setServiceTypeMaster(null);

		return serviceNote;
	}

	public List<SevaChannelRulesConfig> getSevaChannelRulesConfigs() {
		return this.sevaChannelRulesConfigs;
	}

	public void setSevaChannelRulesConfigs(List<SevaChannelRulesConfig> sevaChannelRulesConfigs) {
		this.sevaChannelRulesConfigs = sevaChannelRulesConfigs;
	}

	public SevaChannelRulesConfig addSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().add(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setServiceTypeMaster(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setServiceTypeMaster(null);

		return sevaChannelRulesConfig;
	}

	public BigDecimal getParentServiceTypeId() {
		return this.parentServiceTypeId;
	}

	public void setParentServiceTypeId(BigDecimal parentServiceTypeId) {
		this.parentServiceTypeId = parentServiceTypeId;
	}

	public String getParentServiceTypeName() {
		return this.parentServiceTypeName;
	}

	public void setParentServiceTypeName(String parentServiceTypeName) {
		this.parentServiceTypeName = parentServiceTypeName;
	}
	
	public List<UssesDonationPrivMaster> getUssesDonationPrivMasters() {
		return this.ussesDonationPrivMasters;
	}

	public void setUssesDonationPrivMasters(List<UssesDonationPrivMaster> ussesDonationPrivMasters) {
		this.ussesDonationPrivMasters = ussesDonationPrivMasters;
	}

	public UssesDonationPrivMaster addUssesDonationPrivMaster(UssesDonationPrivMaster ussesDonationPrivMaster) {
		getUssesDonationPrivMasters().add(ussesDonationPrivMaster);
		ussesDonationPrivMaster.setServiceTypeMaster(this);

		return ussesDonationPrivMaster;
	}

	public UssesDonationPrivMaster removeUssesDonationPrivMaster(UssesDonationPrivMaster ussesDonationPrivMaster) {
		getUssesDonationPrivMasters().remove(ussesDonationPrivMaster);
		ussesDonationPrivMaster.setServiceTypeMaster(null);

		return ussesDonationPrivMaster;
	}
	
	public List<SedDipRegistration> getSedDipRegistrations() {
		return this.sedDipRegistrations;
	}

	public void setSedDipRegistrations(List<SedDipRegistration> sedDipRegistrations) {
		this.sedDipRegistrations = sedDipRegistrations;
	}

	public SedDipRegistration addSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().add(sedDipRegistration);
		sedDipRegistration.setServiceTypeMaster(this);

		return sedDipRegistration;
	}

	public SedDipRegistration removeSedDipRegistration(SedDipRegistration sedDipRegistration) {
		getSedDipRegistrations().remove(sedDipRegistration);
		sedDipRegistration.setServiceTypeMaster(null);

		return sedDipRegistration;
	}

	public List<SlotsMaster> getSlotsMasters() {
		return this.slotsMasters;
	}

	public void setSlotsMasters(List<SlotsMaster> slotsMasters) {
		this.slotsMasters = slotsMasters;
	}

	public SlotsMaster addSlotsMaster(SlotsMaster slotsMaster) {
		getSlotsMasters().add(slotsMaster);
		slotsMaster.setServiceTypeMaster(this);

		return slotsMaster;
	}

	public SlotsMaster removeSlotsMaster(SlotsMaster slotsMaster) {
		getSlotsMasters().remove(slotsMaster);
		slotsMaster.setServiceTypeMaster(null);

		return slotsMaster;
	}

}