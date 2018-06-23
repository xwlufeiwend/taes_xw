package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生表
 * 
 * @author 熊伟
 *
 */
public class Student{
	// 主键
	private Integer studentId;
	// 学号
	private String studentNo;
	// 学生姓名
	private String studentName;
	// 学制
	private int xuezhi;
	// 入学时间
	private String admissionDate;
	// 所属专业班级
	private ProfessionalClass professionalClass;
	
	//密码
	private String password;
	
	//一个学生多个分数
	private Set<Score> scores = new HashSet<>();

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getXuezhi() {
		return xuezhi;
	}

	public void setXuezhi(int xuezhi) {
		this.xuezhi = xuezhi;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public ProfessionalClass getProfessionalClass() {
		return professionalClass;
	}

	public void setProfessionalClass(ProfessionalClass professionalClass) {
		this.professionalClass = professionalClass;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	
	
	
}
