package com.i.controllers.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.i.service.beans.SupplierBean;
import com.i.service.inter.SupplierServiceInter;


public class SupplierListController implements Controller{
	private SupplierServiceInter supplierService;
	//private LockService lockService;
	








//	public void setLockService(LockService lockService) {
//		this.lockService = lockService;
//	}




	public void setSupplierService(SupplierServiceInter supplierService) {
		this.supplierService = supplierService;
	}




	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//			List<LockBean> locks=lockService.getAllLock();
//			request.setAttribute("locks",locks);
		
		List<SupplierBean> suppliers=supplierService.getAllSupplier();
		
		request.setAttribute("suppliers",suppliers);
		
		return new ModelAndView("WEB-INF/Supplier/supplierlist");
		
	}

}
