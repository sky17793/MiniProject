package com.carinfo;

import java.sql.Date;

public class CarInformation {
	int carId;
	String carNumber;
	String color;
	int slot;
	Date dateEtry;
	Date expiryDate;
	public CarInformation(int carId,String carNumber,String color,int slot,Date dateEtry,Date expiryDate)
	{
		this.carId=carId;
		this.carNumber=carNumber;
		this.color=color;
		this.slot=slot;
		this.dateEtry=dateEtry;
		this.expiryDate=expiryDate;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Carinfo [carId=" + carId + ", carNumber=" + carNumber + ", color=" + color + ", slot=" + slot
				+ ", dateEtry=" + dateEtry + ", expiryDate=" + expiryDate + "]";
	}




	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public Date getDateEtry() {
		return dateEtry;
	}
	public void setDateEtry(Date dateEtry) {
		this.dateEtry = dateEtry;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
