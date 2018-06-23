package com.tae.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.CollegeDao;
import com.tae.domain.College;
import com.tae.util.DBConnection;
/**
 * 学院dao实现
 * @author Administrator
 *
 */
public class CollegeDaoImpl extends HibernateDaoSupport implements CollegeDao{
	private DBConnection db;
	private Connection co = null;
	private Statement st =null;
	private PreparedStatement ps =null;
	private ResultSet rs =null;
	@Override
	public List<College> show(int first, int rows, String sort, String order ,String collegeName) {
		// TODO Auto-generated method stub
		//DetachedCriteria criteria = DetachedCriteria.forClass(College.class).addOrder()
		db = new DBConnection();
		List<College> list = new ArrayList<>();
		String sql0="";
		try {
			String sql ="select * from college order by "+sort+" "+order+" limit "+first+","+rows;;
			if (collegeName != null && !collegeName.equals("")) {
				sql0 = "where collegeName like '%"+collegeName+"%'";
				sql = "select * from college "+sql0+" order by "+sort+" "+order+" limit "+first+","+rows;
			}
			co = db.getConnection();
			st = co.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				College college = new College();
				college.setCollegeId(rs.getInt(1));
				college.setCollegeNo(rs.getString(2));
				college.setCollegeName(rs.getString(3));
				//warden.setLevel(rs.getString(5));
				list.add(college);
				
			}
			co.close();
			st.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public int findCount(String collegeName) {
		// TODO Auto-generated method stub
		String sql0 = "";
		String hql = "select count(*) from College ";
		if (collegeName != null && !collegeName.equals("")) {
			sql0 = "where collegeName like '%"+collegeName+"%'";
			hql +=sql0;
		}
		@SuppressWarnings("unchecked")
		List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
		if (list.size()>0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	@Override
	public int save(College college) {
		// TODO Auto-generated method stub
	    int a = (int) this.getHibernateTemplate().save(college);
		return a;
	}

	@Override
	public int update(College college) {
		// TODO Auto-generated method stub
		String sql ="";
		
		db = new DBConnection();
		int u = 0;
		try {
			co = db.getConnection();
			
				//sql = "update warden set wName='"+warden.getwName()+"',tel='"+warden.getTel()+"' where wId="+warden.getwId();
				sql = "update college set collegeNo=?,collegeName=? where collegeId=?";
				
				ps = co.prepareStatement(sql);
				ps.setString(1, college.getCollegeNo());
				ps.setString(2, college.getCollegeName());
				ps.setInt(3, college.getCollegeId());
				u = ps.executeUpdate();
				System.err.println("sql="+sql);
				co.close();
				ps.close();
				//rs.close();
				return u;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;

	}

	@Override
	public College findById(Integer collegeId) {
		// TODO Auto-generated method stub
		College college = this.getHibernateTemplate().get(College.class, collegeId);
		return college;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		String sql = "delete from college where collegeId in ("+ids+")";
		
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

	@Override
	public Object findCollegeName(Integer getpId) {
		// TODO Auto-generated method stub
		String sql = "SELECT collegeName from college as c where c.collegeId =(SELECT collegeId from profession WHERE pId= "+getpId+");";
		db = new DBConnection();
		Object collegeName = null;
		try {
			co = db.getConnection();
			st = co.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				collegeName = rs.getObject(1);
			}
			System.err.println(collegeName);
			co.close();
			st.close();
			rs.close();
			return collegeName;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<College> findAll() {
		// TODO Auto-generated method stub
		String hql = "from College";
		@SuppressWarnings("unchecked")
		List<College> list = (List<College>) this.getHibernateTemplate().find(hql);
		return list;
	}
	
}
