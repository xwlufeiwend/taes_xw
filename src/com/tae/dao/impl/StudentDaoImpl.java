package com.tae.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.StudentDao;
import com.tae.domain.Courses;
import com.tae.domain.Examination;
import com.tae.domain.Score;
import com.tae.domain.Student;
/**
 * 学生dao 实现类
 * @author Administrator
 *
 */
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Override
	public Student findByNoAndPwd(Student student) {
		// TODO Auto-generated method stub
		String hql = "from Student where studentNo = "+student.getStudentNo()+"and password = "+student.getPassword();
		@SuppressWarnings("unchecked")
		List<Student> exit = (List<Student>) this.getHibernateTemplate().find(hql);
		if (exit.size() > 0) {
			return exit.get(0);
		}
		return null;
	}

	@Override
	public Student findInfo(int student) {
		// TODO Auto-generated method stub
		System.out.println("传来的学生"+student);
		Student student2 = this.getHibernateTemplate().get(Student.class, student);
		return student2;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(student);
	}

	@Override
	public int findCoursesCount(int studentId) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Score where studentId = ?";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, studentId);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Courses> findCourses(int studentId) {
		// TODO Auto-generated method stub
		//String hql2 = "from Courses where courses =any(select coursesId from Score where studentId = ? )";
		List<Courses> lCourses = new ArrayList<>();
		/*Courses courses = new Courses();
		String hq = "from Score where studentId = ?";

		@SuppressWarnings("unchecked")
		List<Score> lScores = (List<Score>) this.getHibernateTemplate().find(hq, studentId);
		for(int i=0;i<lScores.size();i++){
			courses = this.getHibernateTemplate().get(Courses.class, lScores.get(i).getCourses().getCoursesId());
			lCourses.add(courses);
		}*/
		return lCourses;
		
	}

	@Override
	public int findCollegeId(int studentId) {
		// TODO Auto-generated method stub
		/*Student student = this.getHibernateTemplate().get(Student.class, studentId);
		return student.getCollege().getCollegeId();*/
		return 0;
	}

	@Override
	public List<Examination> findExam(int collegeId) {
		// TODO Auto-generated method stub
		String hql = "from Examination where collegeId = ?";
		@SuppressWarnings("unchecked")
		List<Examination> list = (List<Examination>) this.getHibernateTemplate().find(hql, collegeId);
		return list;
	}

	@Override
	public int findScoreCount(int studentId) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Score where studentId = ?";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, studentId);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId) {
		// TODO Auto-generated method stub
		String hql = "from Score where studentId = ? order by ? asc";
		@SuppressWarnings("unchecked")
		Query<Score> query = (Query<Score>) this.getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter(0, studentId);
		query.setParameter(1, order);
		List<Score> list = query.setFirstResult(begin).setMaxResults(pageSize).list();
		return list;
	}

	@Override
	public List<Score> findScoreByPage(int begin, int pageSize, String order, int studentId, int coursesId) {
		// TODO Auto-generated method stub
		String hql = "from Score where studentId = ? and coursesId = ? order by ? asc";
		@SuppressWarnings("unchecked")
		Query<Score> query = this.getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter(0, studentId);
		query.setParameter(1, coursesId);
		query.setParameter(2, order);
		List<Score> list =query.setFirstResult(begin).setMaxResults(pageSize).list();
		return list;
	}

	@Override
	public int findCoursesCount(int studentId, int coursesId) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from Score where studentId = ? and coursesId = ?";
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql, studentId ,coursesId);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

}
