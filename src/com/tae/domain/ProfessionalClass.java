package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 班级表
 * @author 熊伟
 *
 */
public class ProfessionalClass {
	//zhujian
	private Integer pcId;
	// 班级代号 专业缩写加成立年份和月份
	private String pcNo;
	// 班级名称
	private String pcName;
	//人数
	private Integer studentNum;
	// 所属专业
	private Profession profession;
	
	//一个专业班级多场考试信息
	private Set<Examination> examinations = new HashSet<>();
	//一个班级多个学生
	private Set<Student> students = new HashSet<>();
	
	public Integer getPcId() {
		return pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public String getPcNo() {
		return pcNo;
	}

	public void setPcNo(String pcNo) {
		this.pcNo = pcNo;
	}

	public String getPcName() {
		return pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public Integer getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(Integer studentNum) {
		this.studentNum = studentNum;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Set<Examination> getExaminations() {
		return examinations;
	}

	public void setExaminations(Set<Examination> examinations) {
		this.examinations = examinations;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public ProfessionalClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
