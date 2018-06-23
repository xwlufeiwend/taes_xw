package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ������Ϣ��
 * 
 * @author ��ΰ
 *
 */
public class Examination {
	// ����id
	private Integer exId;
	// ���Դ���
	private String exNo;
	// ��������
	private String exName;
	// ����ʱ��
	private String startYear;
	//���Եص�
	private String address;
	//���԰༶
	private ProfessionalClass professionalClass;
	
	//һ�����Զ������
	private Set<Score> scores = new HashSet<>();
	
	public Integer getExId() {
		return exId;
	}
	public void setExId(Integer exId) {
		this.exId = exId;
	}
	public String getExNo() {
		return exNo;
	}
	public void setExNo(String exNo) {
		this.exNo = exNo;
	}
	public String getExName() {
		return exName;
	}
	public void setExName(String exName) {
		this.exName = exName;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ProfessionalClass getProfessionalClass() {
		return professionalClass;
	}
	public void setProfessionalClass(ProfessionalClass professionalClass) {
		this.professionalClass = professionalClass;
	}
	public Set<Score> getScores() {
		return scores;
	}
	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
