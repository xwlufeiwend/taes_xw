package com.tae.domain;

/**
 * ����Ա��Ϣ
 * 
 * @author ��ΰ
 *
 */
public class Warden {
	// ����Աid
	private Integer wId;
	// ����Ա���
	private String wNo;
	// ����
	private String wName;
	// ����Ա��ϵ�绰
	private String tel;
	//����Ա����Ժϵ
	//private String collegeName;
	//����Ա�ȼ�
	private String level;
	// ����Ա��¼����
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
