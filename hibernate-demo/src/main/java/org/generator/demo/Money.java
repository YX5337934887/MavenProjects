package org.generator.demo;

// Generated 2016-9-5 22:56:24 by Hibernate Tools 4.0.0

/**
 * Money generated by hbm2java
 */
public class Money implements java.io.Serializable {

	private Integer id;
	private UserInfo userInfo;
	private String code;
	private double money;
	private Integer status;

	public Money() {
	}

	public Money(double money) {
		this.money = money;
	}

	public Money(UserInfo userInfo, String code, double money, Integer status) {
		this.userInfo = userInfo;
		this.code = code;
		this.money = money;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getMoney() {
		return this.money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
