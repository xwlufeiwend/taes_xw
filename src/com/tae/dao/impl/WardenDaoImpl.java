package com.tae.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.tae.dao.WardenDao;
import com.tae.domain.Warden;
import com.tae.util.DBConnection;
import com.tae.util.WardenTree;

public class WardenDaoImpl extends HibernateDaoSupport implements WardenDao{
	private DBConnection db;
	private Connection co = null;
	private Statement st = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	@Override
	public Warden findByNoAndPwd(Warden warden) {
		java.lang.String hql="from Warden where wNo = "+warden.getwNo()+" and wPassword = "+warden.getwPassword()+"";
		@SuppressWarnings("unchecked")
		List<Warden> wardens = (List<Warden>) this.currentSession().createQuery(hql).list();
		if (wardens.size()>0) {
			return wardens.get(0);
		}
		return null;
	}

	@Override
	public Warden show(int wId) {
		// TODO Auto-generated method stub
		Warden warden = this.getHibernateTemplate().get(Warden.class, wId);
		return warden;
	}

	@Override
	public int save(Warden warden) {
		// TODO Auto-generated method stub
		int f = (int) this.getHibernateTemplate().save(warden);
		return f;
	}

	@Override
	public int update(Warden warden) {
		// TODO Auto-generated method stub
		String sql ="";
		
		db = new DBConnection();
		int u = 0;
		try {
			co = db.getConnection();
			if (warden.getwPassword()!=null && !warden.getwPassword().equals("")) {
				//sql = "update warden set wName='"+warden.getwName()+"',tel='"+warden.getTel()+"',wpassword="+warden.getwPassword()+" where wId="+warden.getwId();
				sql = "update warden set wNo=?,wName=?,tel=?,wpassword=?,level=? where wId=?";
				
				ps = co.prepareStatement(sql);
				ps.setString(1, warden.getwNo());
				ps.setString(2, warden.getwName());
				ps.setString(3, warden.getTel());
				ps.setString(4, warden.getwPassword());
				ps.setString(5, warden.getLevel());
				ps.setInt(6, warden.getwId());
				u = ps.executeUpdate();
				System.err.println("sql="+sql);
			}else {
				//sql = "update warden set wName='"+warden.getwName()+"',tel='"+warden.getTel()+"' where wId="+warden.getwId();
				sql = "update warden set wNo=?,wName=?,tel=?,level=? where wId=?";
				
				ps = co.prepareStatement(sql);
				ps.setString(1, warden.getwNo());
				ps.setString(2, warden.getwName());
				ps.setString(3, warden.getTel());
				ps.setString(4, warden.getLevel());
				ps.setInt(5, warden.getwId());
				u = ps.executeUpdate();
				System.err.println("sql="+sql);
			}
			co.close();
			ps.close();
			return u;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	@Override
	public List<WardenTree> getNav(String id) {
		// TODO Auto-generated method stub
		db = new DBConnection();
		String sql = "";
		//String sql = "select * from warden_nav where id = "+id;
		List<WardenTree> list = new ArrayList<>();
		try {
			if (id == null) {
				sql ="select id,text,url,state,tid from warden_nav where tid = ''";
			}else {
				 sql ="select id,text,url,state,tid from warden_nav where tid = "+id;
			}
			co = db.getConnection();
			st = co.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				WardenTree wardenTree = new WardenTree();
				wardenTree.setId(rs.getInt(1));
				wardenTree.setText(rs.getString(2));
				wardenTree.setUrl(rs.getString(3));
				wardenTree.setState(rs.getString(4));
				wardenTree.setTid(rs.getInt(5));
				list.add(wardenTree);
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
	public List<Warden> find(int first, int rows, String sort, String order,String wName) {
		// TODO Auto-generated method stub
		db = new DBConnection();
		List<Warden> list = new ArrayList<>();
		String sql0="";
		String sql ="select wid,wno,wname,tel from warden order by "+sort+" "+order+" limit "+first+","+rows;;
		if (wName != null && !wName.equals("")) {
			sql0 = "where wname like '%"+wName+"%'";
			sql = "select wid,wno,wname,tel from warden "+sql0+" order by "+sort+" "+order+" limit "+first+","+rows;
		}
		
		try {
			co = db.getConnection();
			
			st = co.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Warden warden = new Warden();
				warden.setwId(rs.getInt(1));
				warden.setwNo(rs.getString(2));
				warden.setwName(rs.getString(3));
				warden.setTel(rs.getString(4));
				//warden.setLevel(rs.getString(5));
				list.add(warden);
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
	public int findCount(String wName) {
		// TODO Auto-generated method stub
		String sql0 = "";
		String hql = "select count(*) from Warden ";
		if (wName != null && !wName.equals("")) {
			sql0 = "where wName like '%"+wName+"%'";
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
	public Warden findById(int getwId) {
		// TODO Auto-generated method stub
		Warden warden =this.getHibernateTemplate().get(Warden.class, getwId);
		return warden;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		String sql = "delete from warden where wid in ("+ids+")";
		
		int count = 0;
		db = new DBConnection();
		try {
			co = db.getConnection();
			st = co.createStatement();
			count = st.executeUpdate(sql);
			System.err.println("remove="+sql);
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
