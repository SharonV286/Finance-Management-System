package com.lti.component;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CARD_DETAILS")
public class DashBoard {
	
	@Id
	private int CARD_NO;
	
	private int US_ID;
	private String US_NAME;
	private Date ISSUE_DATE;
	private Date VALID_TILL;
	private String CARD_TYPE;
	private String CARD_STATUS;
	private double TOTAL_CREDIT;
	private double USED_CREDIT;
	private double REMAINING_CREDIT;
	private double CARD_LIMIT;
	public int getCARD_NO() {
		return CARD_NO;
	}
	public int getUS_ID() {
		return US_ID;
	}
	public void setUS_ID(int uS_ID) {
		US_ID = uS_ID;
	}
	public String getUS_NAME() {
		return US_NAME;
	}
	public void setUS_NAME(String uS_NAME) {
		US_NAME = uS_NAME;
	}
	public Date getISSUE_DATE() {
		return ISSUE_DATE;
	}
	public void setISSUE_DATE(Date iSSUE_DATE) {
		ISSUE_DATE = iSSUE_DATE;
	}
	public Date getVALID_TILL() {
		return VALID_TILL;
	}
	public void setVALID_TILL(Date vALID_TILL) {
		VALID_TILL = vALID_TILL;
	}
	public String getCARD_TYPE() {
		return CARD_TYPE;
	}
	public void setCARD_TYPE(String cARD_TYPE) {
		CARD_TYPE = cARD_TYPE;
	}
	public String getCARD_STATUS() {
		return CARD_STATUS;
	}
	public void setCARD_STATUS(String cARD_STATUS) {
		CARD_STATUS = cARD_STATUS;
	}
	public double getTOTAL_CREDIT() {
		return TOTAL_CREDIT;
	}
	public void setTOTAL_CREDIT(double tOTAL_CREDIT) {
		TOTAL_CREDIT = tOTAL_CREDIT;
	}
	public double getUSED_CREDIT() {
		return USED_CREDIT;
	}
	public void setUSED_CREDIT(double uSED_CREDIT) {
		USED_CREDIT = uSED_CREDIT;
	}
	public double getREMAINING_CREDIT() {
		return REMAINING_CREDIT;
	}
	public void setREMAINING_CREDIT(double rEMAINING_CREDIT) {
		REMAINING_CREDIT = rEMAINING_CREDIT;
	}
	public double getCARD_LIMIT() {
		return CARD_LIMIT;
	}
	public void setCARD_LIMIT(double cARD_LIMIT) {
		CARD_LIMIT = cARD_LIMIT;
	}
	public void setCARD_NO(int cARD_NO) {
		CARD_NO = cARD_NO;
	}
	@Override
	public String toString() {
		return "DashBoard [CARD_NO=" + CARD_NO + ", US_ID=" + US_ID + ", US_NAME=" + US_NAME + ", ISSUE_DATE="
				+ ISSUE_DATE + ", VALID_TILL=" + VALID_TILL + ", CARD_TYPE=" + CARD_TYPE + ", CARD_STATUS="
				+ CARD_STATUS + ", TOTAL_CREDIT=" + TOTAL_CREDIT + ", USED_CREDIT=" + USED_CREDIT
				+ ", REMAINING_CREDIT=" + REMAINING_CREDIT + ", CARD_LIMIT=" + CARD_LIMIT + "]";
	}
	
	
	
	
	
	
	

}
