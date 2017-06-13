package com.i.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.i.dao.Interface.SupplierDao;
import com.i.dao.model.Supplier;
import com.i.service.beans.SupplierBean;
import com.i.service.inter.SupplierServiceInter;

public class SupplierServiceImple implements SupplierServiceInter{
	
	public SupplierDao dao;
	
	public SupplierServiceImple(SupplierDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Integer saveSupplier(SupplierBean sb) {
		Supplier s=new Supplier();
		s.setSupplier_ID(sb.getSupplier_ID());
		s.setRegion(sb.getRegion());
		s.setSupplier_Name(sb.getSupplier_Name());
		s.setSupplier_Email(sb.getSupplier_Email());
		
		dao.saveSupplier(s);
		
		return dao.saveSupplier(s);
	}

	@Override
	public List<SupplierBean> getAllSupplier() {
		List<SupplierBean> sbl=null;
		List<Supplier> sl=dao.getAllSupplier();
		if(sl!=null){
			sbl=new ArrayList<SupplierBean>();
			ListIterator <Supplier> it=sl.listIterator();
			while(it.hasNext()){
				Supplier sr=it.next();
				SupplierBean su=new SupplierBean();
				su.setSupplier_ID(sr.getSupplier_ID());
				su.setRegion(sr.getRegion());
				su.setSupplier_Name(sr.getSupplier_Name());
				su.setSupplier_Email(sr.getSupplier_Email());
				sbl.add(su);
				
			}
			
			
			
		}
		
		return sbl;
	}

	@Override
	public SupplierBean getSupplier(Integer supplier_No) {
		Supplier sp=dao.getSupplier(supplier_No);
        SupplierBean spp=null;
        if(sp!=null){
		
		    spp = new SupplierBean();
			spp.setSupplier_No(sp.getSupplier_No());
			spp.setSupplier_ID(sp.getSupplier_ID());
			spp.setRegion(sp.getRegion());
			spp.setSupplier_Email(sp.getSupplier_Email());
			spp.setSupplier_Name(sp.getSupplier_Name());
		}
		return spp;
	}

	@Override
	public boolean modifySupplier(SupplierBean sb) {
		Supplier supplier=new Supplier();
		supplier.setSupplier_No(sb.getSupplier_No());
		supplier.setSupplier_ID(sb.getSupplier_ID());
		supplier.setRegion(sb.getRegion());
		supplier.setSupplier_Email(sb.getSupplier_Email());
		supplier.setSupplier_Name(sb.getSupplier_Name());
		dao.updateSupplier(supplier);
		 
		return true;
	}

}
