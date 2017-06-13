package com.i.controllers.supplier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.i.service.beans.SupplierBean;
import com.i.service.inter.SupplierServiceInter;



public class EditSupplierFormController  extends SimpleFormController {
	private SupplierServiceInter  supplierService;

	
	

	public void setSupplierService(SupplierServiceInter supplierService) {
		this.supplierService = supplierService;
	}

	
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		
		System.out.println("post");
		SupplierForm supplierForm=(SupplierForm)command;
		SupplierBean supplierBean=new SupplierBean();
		supplierBean.setRegion(supplierForm.getRegion());
		supplierBean.setSupplier_Email(supplierForm.getSupplier_Email());
		supplierBean.setSupplier_ID(supplierForm.getSupplier_ID());
		supplierBean.setSupplier_No(supplierForm.getSupplier_No());
		supplierBean.setSupplier_Name(supplierForm.getSupplier_Name());
		
		supplierService.modifySupplier(supplierBean);
		return new ModelAndView("redirect:supplierlist.htm");
	}
	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String supplier_No=request.getParameter("supplier_No");
		SupplierBean supplierBean=supplierService.getSupplier(new Integer(supplier_No));
		SupplierForm supplierForm=new SupplierForm();
         supplierForm.setSupplier_No(supplierBean.getSupplier_No());
		supplierForm.setSupplier_ID(supplierBean.getSupplier_ID());
		supplierForm.setRegion(supplierBean.getRegion());
		supplierForm.setSupplier_Email(supplierBean.getSupplier_Email());
		supplierForm.setSupplier_Name(supplierBean.getSupplier_Name());
		
		return supplierForm;
	}
	
}
	