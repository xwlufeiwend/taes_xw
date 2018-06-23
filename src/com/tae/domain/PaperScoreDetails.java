package com.tae.domain;
/**
 * 试卷详细信息
 * @author 熊伟
 *
 */
public class PaperScoreDetails {
		//id
		private Integer id;
		//题目编号
		private String timuNo;
		//题目
		private String title;
		//题目的分数
		private Integer pScore;
		//试卷信息
		private Paper paper;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTimuNo() {
			return timuNo;
		}
		public void setTimuNo(String timuNo) {
			this.timuNo = timuNo;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public Integer getpScore() {
			return pScore;
		}
		public void setpScore(Integer pScore) {
			this.pScore = pScore;
		}
		public Paper getPaper() {
			return paper;
		}
		public void setPaper(Paper paper) {
			this.paper = paper;
		}
		public PaperScoreDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
