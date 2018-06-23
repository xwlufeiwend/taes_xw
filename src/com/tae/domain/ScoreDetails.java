package com.tae.domain;

public class ScoreDetails {
	//主键 id
	private Integer sdId;
	//分数id
	private Score score;
	//题目 题目由试卷提供
	private String title;
	//得分
	private Integer pscore;
	public Integer getSdId() {
		return sdId;
	}
	public void setSdId(Integer sdId) {
		this.sdId = sdId;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPscore() {
		return pscore;
	}
	public void setPscore(Integer pscore) {
		this.pscore = pscore;
	}
	public ScoreDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
