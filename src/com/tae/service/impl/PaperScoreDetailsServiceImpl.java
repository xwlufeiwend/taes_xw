package com.tae.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tae.dao.PaperScoreDetailsDao;
import com.tae.domain.PaperScoreDetails;
import com.tae.service.PaperScoreDetailsService;
@Transactional
public class PaperScoreDetailsServiceImpl implements PaperScoreDetailsService{

	//zhuru
	private PaperScoreDetailsDao paperScoreDetailsDao;
	public void setPaperScoreDetailsDao(PaperScoreDetailsDao paperScoreDetailsDao) {
		this.paperScoreDetailsDao = paperScoreDetailsDao;
	}

	@Override
	public void save(PaperScoreDetails paperScoreDetails) {
		// TODO Auto-generated method stub
		paperScoreDetailsDao.save(paperScoreDetails);
	}

	@Override
	public List<PaperScoreDetails> show(int paperId) {
		// TODO Auto-generated method stub
		
		return paperScoreDetailsDao.show(paperId);
	}

}
