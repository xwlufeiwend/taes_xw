package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 考试信息表
 * 
 * @author 熊伟
 *
 */
public class Examination {
	// 考试id
	private Integer exId;
	// 考试代号
	private String exNo;
	// 考试名称
	private String exName;
	// 考试时间
	private String startYear;
	//考试地点
	private String address;
	//考试班级
	private ProfessionalClass professionalClass;
	
	//一场考试多个分数
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
