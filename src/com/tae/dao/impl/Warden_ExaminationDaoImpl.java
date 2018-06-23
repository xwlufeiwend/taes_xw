package com.tae.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_ExaminationDao;
import com.tae.domain.Examination;

public class Warden_ExaminationDaoImpl extends HibernateDaoSupport implements Warden_ExaminationDao {

	@Override
	public void save(Examination examination) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(examination);
		
	}

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Examination";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Examination> findByPage(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Examination.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<Examination> list = (List<Examination>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void update(Examination examination) {
		// TODO Auto-generated method stub
		//System.err.println("考试dao中的数据"+examination.getExamName());
		this.getHibernateTemplate().update(examination);
	}

	@Override
	public void delete(Examination examination) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(examination);
	}

	@Override
	public Examination findById(int exId) {
		// TODO Auto-generated method stub
		Examination examination = this.getHibernateTemplate().get(Examination.class, exId);
		return examination;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Examination> findByName(String collegeName) {
		// TODO Auto-generated method stub
		String hql = "from Examination where college.collegeName like '%"+collegeName+"%'";
		return (List<Examination>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Examination> find() {
		// TODO Auto-generated method stub
		String hql = "from Examination";
		return (List<Examination>) this.getHibernateTemplate().find(hql);
	}

}
