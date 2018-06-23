package com.tae.dao.impl;

import java.io.PrintStream;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.Warden_CoursesDao;
import com.tae.domain.Courses;
/**
 * 课程dao实现类
 * @author Administrator
 *
 */
public class Warden_CoursesDaoImpl extends HibernateDaoSupport implements Warden_CoursesDao {

	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Courses";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Courses> findByPage(int begin, int pageSize, String order) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(Courses.class).addOrder(Order.asc(order));
		@SuppressWarnings("unchecked")
		List<Courses> list = (List<Courses>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(Courses courses) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(courses);
	}

	@Override
	public void update(Courses courses) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(courses);
	}

	@Override
	public void delete(Courses courses) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(courses);
	}

	@Override
	public Courses findById(int coursesId) {
		// TODO Auto-generated method stub
		Courses courses = this.getHibernateTemplate().get(Courses.class, coursesId);
		return courses;
	}

	@Override
	public List<Courses> findByName(String coursesName) {
		// TODO Auto-generated method stub
		System.err.println("dao中的"+coursesName);
		String hql="from Courses where coursesName like '%"+coursesName+"%'";
		
		@SuppressWarnings("unchecked")
		List<Courses> list = (List<Courses>) this.getHibernateTemplate().find(hql);
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Courses> find() {
		// TODO Auto-generated method stub
		String hql = "from Courses";
		return (List<Courses>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public int findCount(int teacherId) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Courses where teacherId = ?";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, teacherId);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Courses> findCoursesByPage(int begin, int pageSize, String order, int teacherId) {
		// TODO Auto-generated method stub
		String hql = "from Courses where teacherId = "+teacherId;
		Query<?> query = this.getSessionFactory().getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Courses> list = (List<Courses>) query.setFirstResult(begin).setMaxResults(pageSize).list();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Courses> findCourses(int teacherId) {
		// TODO Auto-generated method stub
		String hql =  "from Courses where teacherId = ?";
		return (List<Courses>) this.getHibernateTemplate().find(hql, teacherId);
	}

}
