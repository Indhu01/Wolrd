package com.i.controllers.supplier;

public class SupplierForm {
	private String region;
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	private String supplier_ID;
	private Integer supplier_No;
	private String supplier_Name;
	private String supplier_Email;
	public String getSupplier_Email() {
		return supplier_Email;
	}
	public void setSupplier_Email(String supplier_email) {
		this.supplier_Email = supplier_email;
	}
	public String getSupplier_ID() {
		System.out.println("supplier_ID"+ supplier_ID);
		return supplier_ID;
	}
	public void setSupplier_ID(String supplier_ID) {
		this.supplier_ID = supplier_ID;
	}
	public Integer getSupplier_No() {
		return supplier_No;
	}
	public void setSupplier_No(Integer supplier_No) {
		this.supplier_No = supplier_No;
	}
	public String getSupplier_Name() {
		return supplier_Name;
	}
	public void setSupplier_Name(String supplier_Name) {
		this.supplier_Name = supplier_Name;
	}
	
		

}