package com.tae.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.PaperScoreDetailsDao;
import com.tae.domain.PaperScoreDetails;

public class PaperScoreDetailsDaoImpl extends HibernateDaoSupport implements PaperScoreDetailsDao {

	@Override
	public void save(PaperScoreDetails paperScoreDetails) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(paperScoreDetails);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PaperScoreDetails> show(int paperId) {
		// TODO Auto-generated method stub
		String hql = "from PaperScoreDetails where paperId = ?";
		return (List<PaperScoreDetails>) this.getHibernateTemplate().find(hql, paperId);
	}
	
}
