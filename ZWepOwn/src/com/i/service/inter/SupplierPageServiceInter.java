package com.i.service.inter;

import java.util.List;

import com.i.service.beans.SupplierPageServiceBean;

public interface SupplierPageServiceInter {
	
	 public Integer saveSupplierPage(SupplierPageServiceBean sp);
	 public List<SupplierPageServiceBean> getAllSupplierPage();
	 public SupplierPageServiceBean getSupplierPAge(Integer lockId);
	 public boolean modifySupplier(SupplierPageServiceBean sp);
	 
	 

}
