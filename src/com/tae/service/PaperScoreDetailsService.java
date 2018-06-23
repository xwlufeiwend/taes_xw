package com.tae.service;

import java.util.List;

import com.tae.domain.PaperScoreDetails;

public interface PaperScoreDetailsService {
	/**
	 * 保存试卷题目分值
	 * @param paperScoreDetails
	 */
	void save(PaperScoreDetails paperScoreDetails);
	/**
	 * 显示改试卷的细分项
	 * @param paperId
	 * @return
	 */
	List<PaperScoreDetails> show(int paperId);

}
