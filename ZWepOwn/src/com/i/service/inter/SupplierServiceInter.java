package com.i.service.inter;

import java.util.List;

import com.i.service.beans.SupplierBean;

public interface SupplierServiceInter {

	public Integer saveSupplier(SupplierBean sb);
	public List<SupplierBean> getAllSupplier();
	public SupplierBean getSupplier(Integer supplier_No);
	public boolean modifySupplier(SupplierBean sb); 
	
}
