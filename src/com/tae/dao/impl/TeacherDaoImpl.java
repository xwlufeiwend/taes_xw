package com.tae.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.TeacherDao;
import com.tae.domain.Teacher;
import com.tae.util.DBConnection;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {
	private DBConnection db;
	private Connection co = null;
	private Statement st = null;
	private PreparedStatement ps = null;
	//private ResultSet rs = null;
	@Override
	public Teacher findNoAndPwd(Teacher teacher) {
		// TODO Auto-generated method stub
		String hql = "from Teacher where teacherNo = " + teacher.getTeacherNo() + "and password = "
				+ teacher.getPassword();
		@SuppressWarnings("unchecked")
		List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Teacher findInfo(int teacherId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Teacher.class, teacherId);
	}

	@Override
	public void updatePassword(Teacher teacher) {
		// TODO Auto-generated method stub

		this.getHibernateTemplate().update(teacher);

	}

	@Override
	public Teacher findById(int teacherId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Teacher.class, teacherId);
	}

	@Override
	public List<Teacher> show(int first, int rows, String sort, String order, String teacherName) {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = null;
		if (order.toLowerCase().equals("asc")) {
			criteria = DetachedCriteria.forClass(Teacher.class).addOrder(Order.asc(sort));
		}else {
			criteria = DetachedCriteria.forClass(Teacher.class).addOrder(Order.desc(sort));
		}
		if(teacherName !=null && !"".equals(teacherName))
		{
		criteria.add(Restrictions.like("teacherName", teacherName, MatchMode.ANYWHERE));
		}
		
		@SuppressWarnings("unchecked")
		List<Teacher> list = (List<Teacher>) this.getHibernateTemplate().findByCriteria(criteria, first, rows);
		return list;
		
	}

	@Override
	public int findCount(String teacherName) {
		// TODO Auto-generated method stub
		//try {
			String hql = "select count(*) from Teacher";
			if (teacherName !=null && !teacherName.equals("")) {
				String sql = " where pName like '%"+teacherName+"%'";
				hql+=sql;
			}
			@SuppressWarnings("unchecked")
			List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
			if (list.size()>0) {
				return list.get(0).intValue();
			}
		//} catch (Exception e) {
			// TODO: handle exception
		//	e.printStackTrace();
		//}
		
		return 0;
	}

	@Override
	public int save(Teacher teacher, String pId) {
		// TODO Auto-generated method stub
		db = new DBConnection();
		String sql = "insert into Teacher(teacherNo,teacherName,pId) values('"+teacher.getTeacherNo()+"','"+teacher.getTeacherName()+"','"+pId+"')";
		try {
			co = db.getConnection();
			st = co.createStatement();
			int count = st.executeUpdate(sql);
			co.close();
			st.close();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Teacher teacher, String pId) {
		// TODO Auto-generated method stub
		String sql ="";
		
		db = new DBConnection();
		int u = 0;
		try {
			co = db.getConnection();
				sql = "update teacher set teacherNo=?,teacherName=?,pId=? where teacherId=?";
				
				ps = co.prepareStatement(sql);
				ps.setString(1,teacher.getTeacherNo());
				ps.setString(2, teacher.getTeacherName());
				ps.setString(3, pId);
				ps.setInt(4, teacher.getTeacherId());
				u = ps.executeUpdate();
				//System.err.println("sql="+sql);
				co.close();
				ps.close();
				return u;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		String sql = "delete from Teacher where teacherId in ("+ids+")";
		int count = 0;
		db = new DBConnection();
		try {
			co = db.getConnection();
			st = co.createStatement();
			count = st.executeUpdate(sql);
			//System.err.println("remove="+sql);
			//count = ps.executeUpdate();
			co.close();
			st.close();
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
