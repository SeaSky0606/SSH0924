package com.seasky.kmall;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.seasky.kmall.pojo.Account;
import com.seasky.kmall.service.AccountService;

public class TestKmall {
	
	private static ApplicationContext context=null;
	private static AccountService accountService=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		accountService  = (AccountService) context.getBean("accountService");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testSpring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context.getBean("date"));
	}
	@Test
	public void testHibernate() throws Exception {
		System.out.println(HibernateSessionFactory.getSession());
	}
	@Test
	public void testSpringHibernate() throws Exception {
		Account account = new Account();
		account.setAname("a1");
		account.setApassword("p1");
		
		accountService.save(account);
	}
}
