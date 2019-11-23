package com.lti.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.component.DashBoard;
import com.lti.repository.DashBoardImp;
import com.lti.service.ServiceDb;

@Controller
public class DbController {
	
@Autowired
ServiceDb service;

@Autowired
DashBoardImp repo;
	
@RequestMapping(path="dashboard.lti" , method=RequestMethod.POST)
public String fetch(HttpServletRequest request){
	
 DashBoard db = new DashBoard();
 	int card_no = 0;
 	String dis =(db.getCARD_NO() + db.getUS_NAME() + db.getVALID_TILL() + db.getCARD_TYPE());
 	System.out.println(dis);
 	service.DisplayDetails(dis,card_no);
	return "dashboard.jsp";
}



}
