package com.tae.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_TeacherDao;
import com.tae.domain.Teacher;
/**
 * 教师管理dao层实现类
 * @author Administrator
 *
 */
public class Warden_TeacherDaoImpl extends HibernateDaoSupport implements Warden_TeacherDao {

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Teacher";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Teacher> findAll(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Teacher.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public int findByCollegeNameCount(String collegeName) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Teacher where collegeId = (select collegeId from College where collegeName = ?)";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, collegeName);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	/*@Override
	public List<Teacher> findByCollegeName(int begin, int pageSize, String order , String collegeName) {
		// TODO Auto-generated method stub
		//DetachedCriteria criteria = DetachedCriteria.forClass(Teacher.class).addOrder(Order.asc(order));
		//@SuppressWarnings("unchecked")
		//List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		
		 * 在分页查询某学院的教师信息时
		 * 怎么去分页
		 
		String hql="from Teacher where collegeId = (select collegeId from College where collegeName = ?)";
		@SuppressWarnings("unchecked")
		Query<Teacher> query = this.getHibernateTemplate().getSessionFactory().openSession().createQuery(hql);
		query.setParameter(0, collegeName);
		List<Teacher> teachers = query.setFirstResult(begin)  
                .setMaxResults(pageSize)  
                .list();
		
		return teachers;
	}*/

	@Override
	public List<Teacher> findByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		String hql = "from Teacher where collegeId = (select collegeId from College where collegeName = ?)";
		@SuppressWarnings("unchecked")
		List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().find(hql, collegeName);
		return list;
	}

	@Override
	public void save(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(teacher);
	}

	@Override
	public Teacher findById(int teacherId) {
		// TODO Auto-generated method stub
		//通过模板的get方法及序列化id查询教师信息
		Teacher teacher = this.getHibernateTemplate().get(Teacher.class, teacherId);
		return teacher;
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(teacher);
	}

	@Override
	public List<Teacher> find() {
		// TODO Auto-generated method stub
		String hql = "from Teacher";
		@SuppressWarnings("unchecked")
		List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().find(hql);
		return list;
	}

}
