package com.ttd.eseva.dip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.SevaMaster;

@Entity
@Table(name = "SEVA_DIP")
@NamedQuery(name = "SevaDip.findAll", query = "SELECT e FROM SevaDip e")
public class SevaDip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEVA_DIP_GENERATOR", sequenceName = "SEVA_DIP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEVA_DIP_GENERATOR")
	@Column(name = "SEVA_DIP_ID")
	private Long sevaDipId;

	@ManyToOne
	@JoinColumn(name="SEVA_DIP_SCHEDULE_ID")
	private SevaDipSchedule sevaDipSchedule;

	// bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name = "SEVA_ID")
	private SevaMaster sevaMaster;

	@Column(name = "SEVA_NAME")
	private String sevaName;

	@Column(name = "SEVA_ORDER")
	private String sevaOrder;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;
	
	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	//bi-directional many-to-one association to SevaDipAvailability
	@OneToMany(mappedBy="sevaDip")
	private List<SevaDipAvailability> sevaDipAvailabilities;

	public Long getSevaDipId() {
		return sevaDipId;
	}

	public void setSevaDipId(Long sevaDipId) {
		this.sevaDipId = sevaDipId;
	}

	
	public SevaDipSchedule getSevaDipSchedule() {
		return sevaDipSchedule;
	}

	public void setSevaDipSchedule(SevaDipSchedule sevaDipSchedule) {
		this.sevaDipSchedule = sevaDipSchedule;
	}

	public SevaMaster getSevaMaster() {
		return sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

	public String getSevaName() {
		return sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
	}

	public String getSevaOrder() {
		return sevaOrder;
	}

	public void setSevaOrder(String sevaOrder) {
		this.sevaOrder = sevaOrder;
	}

	public RequestWorkflow getRequestWorkflow() {
		return requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public List<SevaDipAvailability> getSevaDipAvailabilities() {
		return sevaDipAvailabilities;
	}

	public void setSevaDipAvailabilities(
			List<SevaDipAvailability> sevaDipAvailabilities) {
		this.sevaDipAvailabilities = sevaDipAvailabilities;
	}
	
	
	/**
     * Comparator to sort seva dip list or array in dip order
     */
    public static Comparator<SevaDip> DipOrderComparator = new Comparator<SevaDip>() {

        public int compare(SevaDip sd1, SevaDip sd2) {
            return Integer.parseInt(sd1.getSevaOrder()) - Integer.parseInt(sd2.getSevaOrder());
        }
    };
	
}
