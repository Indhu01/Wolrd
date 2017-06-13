package com.i.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.i.dao.Interface.SupplierDao;
import com.i.dao.model.Supplier;

public class SupplierDaoImple  implements SupplierDao{
	
	
	private HibernateTemplate ht;

public SupplierDaoImple(HibernateTemplate ht){
	this.ht=ht;
}

	@Override
	public Integer saveSupplier(Supplier sp) {
		int i=(Integer)ht.save(sp);
		return i;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		List<Supplier> list=ht.find("from supplier");
		
		return list;
	}

	@Override
	public Supplier getSupplier(Integer supplier_No) {
		Supplier spl=(Supplier)ht.get(Supplier.class,supplier_No);
		return spl;
	}

	@Override
	public boolean deleteSupplier(Integer supplier_No) {
		
		ht.delete(supplier_No);
		
		return true;
	}

	@Override
	public boolean updateSupplier(Supplier supplier_No) {
	ht.update(supplier_No);
		return true;
	}

	

}
