package com.i.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.i.dao.Interface.SupplierPageDao;
import com.i.dao.model.SupplierPage;

public class SupplierDaoPageImple implements SupplierPageDao{
   private HibernateTemplate ht;
   
   public SupplierDaoPageImple(HibernateTemplate ht ){
	   this.ht=ht;
   }
	

	@Override
	public Integer savePassword(SupplierPage sp) {
		Integer lockId=(Integer)ht.save(sp);
		return lockId;
	}

	@Override
	public List<SupplierPage> getAllSupplierPage() {
		List<SupplierPage> list=ht.find("from supplierpage");
		return list;
	}

	@Override
	public SupplierPage getSupplierPage(Integer lockId) {
		SupplierPage sp=(SupplierPage)ht.get(SupplierPage.class,lockId);
		return sp;
	}

	@Override
	public boolean updateItems(SupplierPage sp) {
		ht.update(sp);
		return true;
	}

	
}
