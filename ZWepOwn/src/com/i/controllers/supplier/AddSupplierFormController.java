package com.i.controllers.supplier;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.i.service.beans.SupplierBean;
import com.i.service.inter.SupplierServiceInter;



public class AddSupplierFormController  extends SimpleFormController{
	private SupplierServiceInter supplierService;

	public void setSupplierService(SupplierServiceInter supplierService) {
		this.supplierService = supplierService;
	}
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		SupplierForm supplierForm=(SupplierForm)command;
		SupplierBean supplierBean=new SupplierBean();
		
		supplierBean.setSupplier_ID(supplierForm.getSupplier_ID());
		supplierBean.setRegion(supplierForm.getRegion());
		supplierBean.setSupplier_Name(supplierForm.getSupplier_Name());
		supplierBean.setSupplier_Email(supplierForm.getSupplier_Email());
	    supplierService.saveSupplier(supplierBean);
		return new ModelAndView("redirect:supplierlist.htm");
	  /*return new ModelAndView("redirect:employeelist.htm");*/
	}
}
