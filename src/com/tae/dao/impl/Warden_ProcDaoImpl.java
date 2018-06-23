package com.tae.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_ProcDao;
import com.tae.domain.ProfessionalClass;

public class Warden_ProcDaoImpl extends HibernateDaoSupport implements Warden_ProcDao {


	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from ProfessionalClass";
		@SuppressWarnings("unchecked")
		List<Long> count = (List<Long>) this.getHibernateTemplate().find(hql);
		if (count.size()>0) {
			System.out.println(count);
			return count.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<ProfessionalClass> findByPage(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(ProfessionalClass.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<ProfessionalClass> pList = (List<ProfessionalClass>) this.getHibernateTemplate().findByCriteria(criteria, begin ,pageSize);
		return pList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProfessionalClass> findByName(String pcName) {
		// TODO Auto-generated method stub
		String hql = "from ProfessionalClass where pcName like ?";
		return (List<ProfessionalClass>) this.getHibernateTemplate().find(hql, "%"+pcName+"%");
	}

	@Override
	public void save(ProfessionalClass pClass) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(pClass);
	}

	@Override
	public void update(ProfessionalClass pClass) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(pClass);
	}

	@Override
	public void delete(ProfessionalClass proc) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(proc);
	}

	@Override
	public ProfessionalClass findById(int pcId) {
		// TODO Auto-generated method stub
		ProfessionalClass pList = this.getHibernateTemplate().get(ProfessionalClass.class, pcId);
		System.out.println("通过id查询到所要修改的数据："+pList);
		return pList;
	}

	@Override
	public List<ProfessionalClass> find() {
		// TODO Auto-generated method stub
		String hql = "from ProfessionalClass";
		@SuppressWarnings("unchecked")
		List<ProfessionalClass> pList = (List<ProfessionalClass>) this.getHibernateTemplate().find(hql);
		return pList;
	}

	@Override
	public List<ProfessionalClass> findByCollege(int collegeId) {
		// TODO Auto-generated method stub
		String hql = "from ProfessionalClass where collegeId = ?";
		@SuppressWarnings("unchecked")
		List<ProfessionalClass> list = (List<ProfessionalClass>) this.getHibernateTemplate().find(hql, collegeId);
		return list;
	}

	@Override
	public void delete(int collegeId) {
		// TODO Auto-generated method stub
		String hql = "delete from ProfessionalClass where college.collegeId = ?";
		this.getHibernateTemplate().find(hql,collegeId);
	}


}
