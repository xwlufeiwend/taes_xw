package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * �γ���Ϣ
 * 
 * @author ��ΰ
 *
 */
public class Courses{
	//����
	private Integer coursesId;
	// �γ̴���
	private String coursesNo;
	// �γ�����
	private String coursesName;
	// �γ�ѧ��
	private double credits;
	// �γ�רҵ
	private Profession profession;
	
	//����γ̶����ʦ
	private Set<CouresesTeacher> couresesTeachers = new HashSet<>();
	//һ���γ̶����Ծ�
	private Set<Paper> papers = new HashSet<>();
	//һ�ſγ̶������
	private Set<Score> scores = new HashSet<>();
	
	public Integer getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(Integer coursesId) {
		this.coursesId = coursesId;
	}

	public String getCoursesNo() {
		return coursesNo;
	}

	public void setCoursesNo(String coursesNo) {
		this.coursesNo = coursesNo;
	}

	public String getCoursesName() {
		return coursesName;
	}

	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Set<CouresesTeacher> getCouresesTeachers() {
		return couresesTeachers;
	}

	public void setCouresesTeachers(Set<CouresesTeacher> couresesTeachers) {
		this.couresesTeachers = couresesTeachers;
	}

	public Set<Paper> getPapers() {
		return papers;
	}

	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}

	public Set<Score> getScores() {
		return scores;
	}

	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
