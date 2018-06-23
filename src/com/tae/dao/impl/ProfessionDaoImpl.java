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

import com.tae.dao.ProfessionDao;
import com.tae.domain.Profession;
import com.tae.util.DBConnection;

public class ProfessionDaoImpl extends HibernateDaoSupport implements ProfessionDao {
	private DBConnection db;
	private Connection co = null;
	private Statement st = null;
	private PreparedStatement ps = null;
	//private ResultSet rs = null;
	@Override
	public List<Profession> show(int first, int rows, String sort, String order,String pName) {
		// TODO Auto-generated method stub
		//String sql = "select * from Profession order by "+sort+" "+order+" limit " + first+","+rows;
		DetachedCriteria criteria = null;
		if (order.toLowerCase().equals("asc")) {
			criteria = DetachedCriteria.forClass(Profession.class).addOrder(Order.asc(sort));
		}else {
			criteria = DetachedCriteria.forClass(Profession.class).addOrder(Order.desc(sort));
		}
		if(pName !=null && !"".equals(pName))
		{
		criteria.add(Restrictions.like("pName", pName, MatchMode.ANYWHERE));
		}
		//DetachedCriteria criteria = DetachedCriteria.forClass(Profession.class).addOrder(Order.asc(sort));
		@SuppressWarnings("unchecked")
		List<Profession> list = (List<Profession>) this.getHibernateTemplate().findByCriteria(criteria, first, rows);
		//List<Profession> list = (List<Profession>) this.getHibernateTemplate().find(sql);
			
		
			//list = session.createQuery(sql).setFirstResult(first).setMaxResults(rows).list();
			//list = (List<Profession>) this.getHibernateTemplate().find(sql);
			
			
			return list;
	}
	
	@Override
	public int findCount(String pName) {
		// TODO Auto-generated method stub
			String hql = "select count(*) from Profession";
			if (pName !=null && !pName.equals("")) {
				String sql = " where pName like '%"+pName+"%'";
				hql+=sql;
			}
			@SuppressWarnings("unchecked")
			List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);
			if (list.size()>0) {
				return list.get(0).intValue();
			}
	
		return 0;
	}
	@Override
	public int save(Profession profession,String collegeId) {
		// TODO Auto-generated method stub
		//return (int) this.getHibernateTemplate().save(profession);
		db = new DBConnection();
		String sql = "insert into profession(pNo,pName,collegeId) values('"+profession.getpNo()+"','"+profession.getpName()+"','"+collegeId+"')";
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
	public Profession findById(Integer getpId) {
		// TODO Auto-generated method stub
		Profession profession = this.getHibernateTemplate().get(Profession.class, getpId);
		return profession;
	}
	@Override
	public int update(Profession profession,String collegeId) {
		// TODO Auto-generated method stub
		String sql ="";
		
		db = new DBConnection();
		int u = 0;
		try {
			co = db.getConnection();
			
				//sql = "update warden set wName='"+warden.getwName()+"',tel='"+warden.getTel()+"' where wId="+warden.getwId();
				sql = "update profession set pNo=?,pName=?,collegeId=? where pId=?";
				
				ps = co.prepareStatement(sql);
				ps.setString(1, profession.getpNo());
				ps.setString(2, profession.getpName());
				ps.setString(3, collegeId);
				ps.setInt(4, profession.getpId());
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
		String sql = "delete from Profession where pId in ("+ids+")";
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
	public List<Profession> findAll() {
		// TODO Auto-generated method stub
		String hql = "from Profession";
		@SuppressWarnings("unchecked")
		List<Profession> list = (List<Profession>) this.getHibernateTemplate().find(hql);
		return list;
	}
	
}
