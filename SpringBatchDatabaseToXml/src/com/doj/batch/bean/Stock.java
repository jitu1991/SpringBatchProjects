package com.doj.batch.bean;

import java.sql.Date;
import java.sql.Time;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jitender Kumar
 *
 */
@XmlRootElement(name="stock")
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class Stock {
	private int tradeId;
	private double tradePrice;
	private String security;
	private String instrumentType;
	private Date tradeDate;
	private Time tradeTime;
	private String currency;
	private String broker;
	private String direction;

	public int getTradeId() {
		return tradeId;
	}
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	public double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(double tradePrice) {
		this.tradePrice = tradePrice;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public Time getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(Time tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBroker() {
		return broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
}
