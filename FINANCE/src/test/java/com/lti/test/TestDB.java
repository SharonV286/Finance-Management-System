package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.DashBoard;
import com.lti.repository.DashBoardImp;

import junit.framework.TestCase;

public class TestDB{
	
	@Test
	public void Testdatabase(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		DashBoardImp card = (DashBoardImp) ctx.getBean(DashBoardImp.class);
		DashBoard db = (DashBoard)card. getCardDetailsbyId(12345);
        System.out.println(db.getCARD_NO()+ db.getUS_NAME()+ db.getVALID_TILL()
        	+ db.getCARD_TYPE() + db.getCARD_STATUS());
 
		
		
	}
	


}
