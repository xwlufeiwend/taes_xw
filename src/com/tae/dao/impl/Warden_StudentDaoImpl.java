package com.tae.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_StuedntDao;
import com.tae.domain.Student;
/**
 * 学生管理的dao实现
 * @author Administrator
 *
 */
public class Warden_StudentDaoImpl extends HibernateDaoSupport implements Warden_StuedntDao {

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Student";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Student> findByPage(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(student);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByStudentNo(String i) {
		// TODO Auto-generated method stub
		String hql = "from Student where studentNo = ?";
		return (List<Student>) this.getHibernateTemplate().find(hql, i);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		//String hql = "from Student where stduentId = ?";
		return this.getHibernateTemplate().get(Student.class, id);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(student);
	}

}
