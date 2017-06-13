package com.i.controllers.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.i.service.beans.SupplierPageServiceBean;
import com.i.service.inter.SupplierPageServiceInter;


public class SupplierHistoryListController implements Controller{
	private SupplierPageServiceInter supplierPageService;
	public void setSupplierPageService(SupplierPageServiceInter supplierPageService) {
		this.supplierPageService = supplierPageService;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
			List<SupplierPageServiceBean> supplierhistory=supplierPageService.getAllSupplierPage();
			
		
		request.setAttribute("supplierhistory",supplierhistory);
		
		return new ModelAndView("WEB-INF/Supplier/supplierhistorylist");
		
	}

}
