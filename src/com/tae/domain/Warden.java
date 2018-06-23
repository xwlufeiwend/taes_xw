package com.tae.domain;

/**
 * 管理员信息
 * 
 * @author 熊伟
 *
 */
public class Warden {
	// 管理员id
	private Integer wId;
	// 管理员编号
	private String wNo;
	// 姓名
	private String wName;
	// 管理员联系电话
	private String tel;
	//管理员隶属院系
	//private String collegeName;
	//管理员等级
	private String level;
	// 管理员登录密码
	private String wPassword;
	
	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
	}

	public String getwNo() {
		return wNo;
	}

	public void setwNo(String wNo) {
		this.wNo = wNo;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getwPassword() {
		return wPassword;
	}

	public void setwPassword(String wPassword) {
		this.wPassword = wPassword;
	}

	public Warden() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
