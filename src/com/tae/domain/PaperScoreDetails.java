package com.tae.domain;
/**
 * �Ծ���ϸ��Ϣ
 * @author ��ΰ
 *
 */
public class PaperScoreDetails {
		//id
		private Integer id;
		//��Ŀ���
		private String timuNo;
		//��Ŀ
		private String title;
		//��Ŀ�ķ���
		private Integer pScore;
		//�Ծ���Ϣ
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
