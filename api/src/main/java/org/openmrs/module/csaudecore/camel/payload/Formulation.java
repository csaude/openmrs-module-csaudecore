package org.openmrs.module.csaudecore.camel.payload;

public class Formulation {
	
	private String orderUuid;
	
	private String drugUuid;
	
	private String drugName;
	
	private int quantity;
	
	private String quantityUnit;
	
	private int duration;
	
	private String durationUnit;
	
	public String getOrderUuid() {
		return orderUuid;
	}
	
	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}
	
	public String getDrugUuid() {
		return drugUuid;
	}
	
	public void setDrugUuid(String drugUuid) {
		this.drugUuid = drugUuid;
	}
	
	public String getDrugName() {
		return drugName;
	}
	
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getQuantityUnit() {
		return quantityUnit;
	}
	
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getDurationUnit() {
		return durationUnit;
	}
	
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
}
