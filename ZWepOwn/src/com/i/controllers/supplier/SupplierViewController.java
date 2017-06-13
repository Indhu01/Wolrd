package com.i.controllers.supplier;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.i.service.beans.SupplierBean;
import com.i.service.inter.SupplierServiceInter;



public class SupplierViewController implements Controller{
private SupplierServiceInter  supplierService;



	public void setSupplierService(SupplierServiceInter supplierService) {
	this.supplierService = supplierService;
}


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		System.out.println(supplierService.getSupplier(new Integer(request.getParameter("supplier_No"))));
		//AgencyBean agency=agencyService.getAgency(new Integer(request.getParameter("agencyNo")));
		SupplierBean supplier=supplierService.getSupplier(new Integer(request.getParameter("supplier_No")));

		request.setAttribute("supplier", supplier);
		
		return new ModelAndView("WEB-INF/Supplier/viewsupplier");
	}

}
