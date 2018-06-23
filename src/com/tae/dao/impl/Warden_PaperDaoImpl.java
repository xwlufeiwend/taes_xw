package com.tae.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_PaperDao;
import com.tae.domain.Paper;

public class Warden_PaperDaoImpl extends HibernateDaoSupport implements Warden_PaperDao {

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Paper";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Paper> findByPage(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Paper.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<Paper> list = (List<Paper>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paper> find() {
		// TODO Auto-generated method stub
		String hql = "from Paper";
		return (List<Paper>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public void save(Paper paper) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(paper);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paper> findByName(String paperName) {
		// TODO Auto-generated method stub
		String hql = "from Paper where paperName like '%"+paperName+"%'";
		return (List<Paper>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public Paper findById(int paperId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Paper.class, paperId);
	}

	@Override
	public void update(Paper paper) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(paper);
	}

	@Override
	public void delete(Paper paper) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(paper);
	}

	@Override
	public void saveD(int paperId, String title, int pScore) {
		// TODO Auto-generated method stub
		String hql = "insert into PaperScoreDetails";
	}

}
