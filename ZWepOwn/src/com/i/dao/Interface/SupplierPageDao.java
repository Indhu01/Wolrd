package com.i.dao.Interface;

import java.util.List;

import com.i.dao.model.SupplierPage;



public interface SupplierPageDao {
public Integer savePassword(SupplierPage sp);
public List<SupplierPage> getAllSupplierPage( );
public SupplierPage getSupplierPage(Integer lockId);
public boolean updateItems(SupplierPage sp);


}
