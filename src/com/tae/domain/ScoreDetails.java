package com.tae.domain;

public class ScoreDetails {
	//���� id
	private Integer sdId;
	//����id
	private Score score;
	//��Ŀ ��Ŀ���Ծ��ṩ
	private String title;
	//�÷�
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
