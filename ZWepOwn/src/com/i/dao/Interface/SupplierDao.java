package com.i.dao.Interface;

import java.util.List;

import com.i.dao.model.Supplier;

public interface  SupplierDao {
	
	public Integer saveSupplier(Supplier sp);
	public  List<Supplier> getAllSupplier();
	public Supplier getSupplier(Integer supplier_No);
	public boolean deleteSupplier(Integer supplier_No);
	public boolean updateSupplier(Supplier supplier_No);
	

}
