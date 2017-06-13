package com.i.controllers.supplier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.i.dao.Interface.SupplierDao;




public class DeleteSupplierController implements Controller {
	private SupplierDao supplierDAO;

	
	public SupplierDao getSupplierDAO() {
		return supplierDAO;
	}


	public void setSupplierDAO(SupplierDao supplierDAO) {
		this.supplierDAO = supplierDAO;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String supplier_No=request.getParameter("supplier_No");
	 // System.out.println(machineNo);
	    supplierDAO.deleteSupplier(new Integer(supplier_No));
	     
		
		return new ModelAndView("redirect:supplierlist.htm");
	}
}