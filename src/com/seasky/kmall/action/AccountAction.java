package com.seasky.kmall.action;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class AccountAction {
	private HibernateTemplate hibernateTemplate=null;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public String test(){
		System.out.println(hibernateTemplate);
		return "success";
	}
}
