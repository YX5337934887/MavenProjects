package org.generator.demo;

// Generated 2016-9-5 22:56:24 by Hibernate Tools 4.0.0

/**
 * AdminInfo generated by hbm2java
 */
public class AdminInfo implements java.io.Serializable {

	private Integer id;
	private String nname;
	private String uname;
	private String upass;

	public AdminInfo() {
	}

	public AdminInfo(String nname, String uname, String upass) {
		this.nname = nname;
		this.uname = uname;
		this.upass = upass;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNname() {
		return this.nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return this.upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

}
