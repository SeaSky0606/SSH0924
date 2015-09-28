package com.seasky.kmall.pojo;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer aid;
	private String aname;
	private String apassword;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(String aname, String apassword) {
		this.aname = aname;
		this.apassword = apassword;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return this.apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}

}