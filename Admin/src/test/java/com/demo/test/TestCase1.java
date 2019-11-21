package com.demo.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.AdminDetails;
import com.demo.entity.BankDetails;
import com.demo.entity.UserDetails;
import com.demo.repository.AdminRepository;

public class TestCase1 {	
	@Test
	public void save()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository vr = ctx.getBean(AdminRepository.class);
		UserDetails ud = new UserDetails();
		BankDetails bk = new BankDetails();
		bk.setBANK_NAME("SBI");
		bk.setCARD_TYPE("GOLD");
		bk.setIFSC_CODE(556);
		ud.setNAME("Arjun");
		ud.setUSERID(104);
		ud.setEMAIL("Ar@k2.com");
		ud.setPASSWORD("qwerty");
		ud.setPHONE_NO(2451);
		bk.setUsd(ud);
		Set<BankDetails> bankd = new HashSet<BankDetails>();
		bankd.add(bk);
		ud.setDetails(bankd);
		vr.add(ud);
	}
	
	@Test
	public void view()
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository vr = ctx.getBean(AdminRepository.class);
		UserDetails ud = (UserDetails) vr.fetchById(UserDetails.class,315);
		
	       System.out.println(ud.getNAME());
	       System.out.println(ud.getEMAIL());
	       System.out.println(ud.getPASSWORD());
	       System.out.println(ud.getPHONE_NO());	 
	       System.out.println(vr.fetchbyPk(ud.getUSERID()));
	}
	@Test
	public void addAdmin()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad = new AdminDetails();
		ad.setAdminId(101);
		ad.setAdminName("LTI");
		ad.setAdminPassword("admin@123");
		ar.add(ad);
	}
	
	@Test
	public void viewAdmin()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad = (AdminDetails) ar.fetchById(AdminDetails.class,101);
		System.out.println(ad.getAdminName());
		System.out.println(ad.getAdminPassword());
		
	}
	
	@Test
	public void viewAdmin2()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		System.out.print(ar.fetchAll());
	}

}
