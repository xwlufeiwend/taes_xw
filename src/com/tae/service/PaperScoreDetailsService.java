package com.tae.service;

import java.util.List;

import com.tae.domain.PaperScoreDetails;

public interface PaperScoreDetailsService {
	/**
	 * �����Ծ���Ŀ��ֵ
	 * @param paperScoreDetails
	 */
	void save(PaperScoreDetails paperScoreDetails);
	/**
	 * ��ʾ���Ծ��ϸ����
	 * @param paperId
	 * @return
	 */
	List<PaperScoreDetails> show(int paperId);

}
