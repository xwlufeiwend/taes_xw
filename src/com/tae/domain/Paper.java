package com.tae.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * �Ծ���Ϣ��
 * @author ��ΰ
 *
 */
public class Paper {
	//�Ծ�id'
	private Integer paperId;
	//�Ծ����
	private String paperNo;
	//�Ծ�����
	private String paperName;
	//�Ծ�����ֵ
	private Integer fullScore;
	//��Ŀ����
	private Integer problemNum;
	//�ύ��ʦ
	private String tijiaoTeacher;
	//�����ʦ
	private String shenheTeacher;
	//�γ�
	private Courses courses;
	
	private PaperScoreDetails paperScoreDetails;
	
	//һ���Ծ�������
	private Set<Score> scores = new HashSet<>();
	
	
	public Integer getPaperId() {
		return paperId;
	}
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	public String getPaperNo() {
		return paperNo;
	}
	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public Integer getFullScore() {
		return fullScore;
	}
	public void setFullScore(Integer fullScore) {
		this.fullScore = fullScore;
	}
	public Integer getProblemNum() {
		return problemNum;
	}
	public void setProblemNum(Integer problemNum) {
		this.problemNum = problemNum;
	}
	public String getTijiaoTeacher() {
		return tijiaoTeacher;
	}
	public void setTijiaoTeacher(String tijiaoTeacher) {
		this.tijiaoTeacher = tijiaoTeacher;
	}
	public String getShenheTeacher() {
		return shenheTeacher;
	}
	public void setShenheTeacher(String shenheTeacher) {
		this.shenheTeacher = shenheTeacher;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Set<Score> getScores() {
		return scores;
	}
	public void setScores(Set<Score> scores) {
		this.scores = scores;
	}
	public PaperScoreDetails getPaperScoreDetails() {
		return paperScoreDetails;
	}
	public void setPaperScoreDetails(PaperScoreDetails paperScoreDetails) {
		this.paperScoreDetails = paperScoreDetails;
	}
	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
