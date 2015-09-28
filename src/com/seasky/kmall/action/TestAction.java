package com.seasky.kmall.action;


import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	public String test(){
		System.out.println("--Action--");
		return SUCCESS;
	}
}
