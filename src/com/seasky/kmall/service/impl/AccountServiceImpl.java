package com.seasky.kmall.service.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;


import com.seasky.kmall.pojo.Account;
import com.seasky.kmall.service.AccountService;

public class AccountServiceImpl implements AccountService{
	private HibernateTemplate hibernateTemplate=null;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void save(Account account) {
		hibernateTemplate.save(account);
	}
	
}
