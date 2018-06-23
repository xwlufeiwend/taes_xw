package com.tae.dao;

import java.util.List;

import com.tae.domain.PaperScoreDetails;

public interface PaperScoreDetailsDao {
	/**
	 * 保存到数据库
	 * @param paperScoreDetails
	 */
	void save(PaperScoreDetails paperScoreDetails);
	/**
	 * 显示数据
	 * @param paperId
	 * @return
	 */
	List<PaperScoreDetails> show(int paperId);

}
