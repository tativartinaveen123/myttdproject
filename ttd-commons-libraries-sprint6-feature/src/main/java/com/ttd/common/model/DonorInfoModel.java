package com.ttd.common.model;

import java.io.Serializable;
import java.util.Date;

public class DonorInfoModel implements Serializable {

	private String donorName;
	private String donorId;
	private String trustName;
	private String donorEmail;
	private String donorMobileNo;
	private String donorPancardNo;
	private String donorAadharCard;
	private String dateOfBirth;
	private String remarks;
	private long trustId;
	private String entityRegNo;
	private String donorPassbookNo;
	

	public String getDonorPassbookNo() {
		return donorPassbookNo;
	}


	public void setDonorPassbookNo(String donorPassbookNo) {
		this.donorPassbookNo = donorPassbookNo;
	}


	public String getDonorName() {
		return donorName;
	}


	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}


	public String getDonorId() {
		return donorId;
	}


	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}


	public String getTrustName() {
		return trustName;
	}


	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}


	public String getDonorEmail() {
		return donorEmail;
	}


	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}


	public String getDonorMobileNo() {
		return donorMobileNo;
	}


	public void setDonorMobileNo(String donorMobileNo) {
		this.donorMobileNo = donorMobileNo;
	}


	public String getDonorPancardNo() {
		return donorPancardNo;
	}


	public void setDonorPancardNo(String donorPancardNo) {
		this.donorPancardNo = donorPancardNo;
	}


	public String getDonorAadharCard() {
		return donorAadharCard;
	}


	public void setDonorAadharCard(String donorAadharCard) {
		this.donorAadharCard = donorAadharCard;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public long getTrustId() {
		return trustId;
	}


	public void setTrustId(long trustId) {
		this.trustId = trustId;
	}


	public String getEntityRegNo() {
		return entityRegNo;
	}


	public void setEntityRegNo(String entityRegNo) {
		this.entityRegNo = entityRegNo;
	}

}