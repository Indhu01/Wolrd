package com.i.service.impl;

import java.util.ArrayList;
import java.util.List;





import java.util.ListIterator;




import com.i.dao.Interface.SupplierPageDao;
import com.i.dao.model.SupplierPage;
import com.i.service.beans.SupplierPageServiceBean;
import com.i.service.inter.SupplierPageServiceInter;

public class SupplierPageServiceImpl implements SupplierPageServiceInter{
	private SupplierPageDao dao;
	

	public SupplierPageServiceImpl(SupplierPageDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Integer saveSupplierPage(SupplierPageServiceBean sp) {
		SupplierPage supplierPage = new SupplierPage();
		supplierPage.setLockId(sp.getLockId());
		supplierPage.setProductName(sp.getProductName());
     	supplierPage.setPrice(sp.getPrice());
		supplierPage.setPassword(sp.getPassword());
		return dao.savePassword(supplierPage);
	}

	@Override
	public List<SupplierPageServiceBean> getAllSupplierPage() {
		List<SupplierPageServiceBean> suppliers=null;
		List<SupplierPage> lsuppliers=dao.getAllSupplierPage();
		if(lsuppliers!=null)
		{
			suppliers=new ArrayList<SupplierPageServiceBean>();
			ListIterator<SupplierPage> li=lsuppliers.listIterator();
			while(li.hasNext())
			{
				SupplierPage supplierPage=li.next();
				SupplierPageServiceBean supplierPageBean=new SupplierPageServiceBean();
				supplierPageBean.setLockId(supplierPage.getLockId());
				supplierPageBean.setPassword(supplierPage.getPassword());
				System.out.println("In service Layer"+supplierPage.getPassword());
				supplierPageBean.setProductName(supplierPage.getProductName());
				supplierPageBean.setPrice(supplierPage.getPrice());
				suppliers.add(supplierPageBean);
			}
		}
		
		return suppliers;
	}

	@Override
	public SupplierPageServiceBean getSupplierPAge(Integer lockId) {
		SupplierPage supplierPage=dao.getSupplierPage(lockId);
        SupplierPageServiceBean supplierPageBean=null;
		if(supplierPage!=null)
		{
			supplierPageBean=new SupplierPageServiceBean();
			supplierPageBean.setLockId(supplierPage.getLockId());
			supplierPageBean.setProductName(supplierPage.getProductName());
			supplierPageBean.setPrice(supplierPage.getPrice());
			supplierPageBean.setPassword(supplierPage.getPassword());
			System.out.println("Password in service layer:  "+supplierPage.getPassword()  );
		
		}
		return supplierPageBean;
		
	}

	@Override
	public boolean modifySupplier(SupplierPageServiceBean sp) {

		SupplierPage supplierPage=new SupplierPage();
		supplierPage.setLockId(sp.getLockId());
		supplierPage.setPassword(sp.getPassword());
		supplierPage.setPrice(sp.getPrice());
		supplierPage.setProductName(sp.getProductName());
		dao.updateItems(supplierPage);
		
		return true;
	}
	

}
