package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * �༶��
 * @author ��ΰ
 *
 */
public class ProfessionalClass {
	//zhujian
	private Integer pcId;
	// �༶���� רҵ��д�ӳ�����ݺ��·�
	private String pcNo;
	// �༶����
	private String pcName;
	//����
	private Integer studentNum;
	// ����רҵ
	private Profession profession;
	
	//һ��רҵ�༶�ೡ������Ϣ
	private Set<Examination> examinations = new HashSet<>();
	//һ���༶���ѧ��
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
