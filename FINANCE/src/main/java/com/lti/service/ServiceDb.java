package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.component.DashBoard;
import com.lti.repository.DashBoardImp;

@Service
public class ServiceDb {

@Autowired
DashBoardImp dbimp;

public void DisplayDetails(String dis, int card_no){
	
	int card_no1=0;
	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	DashBoardImp di = ctx.getBean(DashBoardImp.class);
	DashBoard db = (DashBoard) di. getCardDetailsbyId(card_no1);
}

}
