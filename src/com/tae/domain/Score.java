package com.tae.domain;

/**
 * 分数信息
 * @author Administrator
 *
 */
public class Score{
	//主键
	private Integer scId;
	//学生
	private Student student;
	//课程
	private Courses courses;
	//考试时间
	private Examination examination;
	//得分数
	private Integer actualScore;
	//试卷
	private Paper paper;
	
	private ScoreDetails scoreDetails;

	public Integer getScId() {
		return scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public Examination getExamination() {
		return examination;
	}

	public void setExamination(Examination examination) {
		this.examination = examination;
	}

	public Integer getActualScore() {
		return actualScore;
	}

	public void setActualScore(Integer actualScore) {
		this.actualScore = actualScore;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public ScoreDetails getScoreDetails() {
		return scoreDetails;
	}

	public void setScoreDetails(ScoreDetails scoreDetails) {
		this.scoreDetails = scoreDetails;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
