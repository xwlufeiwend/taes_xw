package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ѧ����
 * 
 * @author ��ΰ
 *
 */
public class Student{
	// ����
	private Integer studentId;
	// ѧ��
	private String studentNo;
	// ѧ������
	private String studentName;
	// ѧ��
	private int xuezhi;
	// ��ѧʱ��
	private String admissionDate;
	// ����רҵ�༶
	private ProfessionalClass professionalClass;
	
	//����
	private String password;
	
	//һ��ѧ���������
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
