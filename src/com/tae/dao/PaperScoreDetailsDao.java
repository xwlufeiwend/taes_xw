package com.tae.dao;

import java.util.List;

import com.tae.domain.PaperScoreDetails;

public interface PaperScoreDetailsDao {
	/**
	 * ���浽���ݿ�
	 * @param paperScoreDetails
	 */
	void save(PaperScoreDetails paperScoreDetails);
	/**
	 * ��ʾ����
	 * @param paperId
	 * @return
	 */
	List<PaperScoreDetails> show(int paperId);

}
