package com.tae.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_CollegeDao;
import com.tae.domain.College;

public class Warden_CollegeDaoImpl extends HibernateDaoSupport implements Warden_CollegeDao {

	@Override
	public List<College> findByCollegeName(String collegeName) {
		String hql = "from College where collegeName like ?";
		@SuppressWarnings("unchecked")
		List<College> colleges = (List<College>) this.getHibernateTemplate().find(hql, "%"+collegeName+"%");
		return colleges;
	}

	@Override
	public int findCount() {
		String hql = "select count(*) from College";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<College> findByPage(int begin, int pageSize , String order) {
		//DetachedCriteria产生查询条件的工具类
		//使用方法forClass()方法来创建DetachedCriteria类的实例，addOrder()方法来为查询结果添加排序asc升序排列,参数为排序参照字段。
		DetachedCriteria criteria = DetachedCriteria.forClass(College.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		//通过模板和DetachedCriteria类来实现分页查询排序。
		List<College> list = (List<College>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(College college) {
		this.getHibernateTemplate().save(college);
		
	}

	@Override
	public College findById(Integer collegeId) {
		return this.getHibernateTemplate().get(College.class, collegeId);
	}

	@Override
	public void delete(College college) {
		this.getHibernateTemplate().delete(college);
		
	}

	@Override
	public void updateCollege(College college) {
		this.getHibernateTemplate().update(college);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<College> find() {
		// TODO Auto-generated method stub
		String hql = "from College";
		return (List<College>) this.getHibernateTemplate().find(hql);
	}

	

}
