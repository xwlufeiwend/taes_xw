package com.tae.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import com.tae.dao.WardenDao;
import com.tae.domain.Warden;
import com.tae.service.WardenService;
import com.tae.util.WardenTree;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Transactional
public class WardenServiceImpl implements WardenService{
	//×¢Èëdao²ãµÄÀà
	private WardenDao wardenDao;
	
	public void setWardenDao(WardenDao wardenDao) {
		this.wardenDao = wardenDao;
	}



	@Override
	public Warden findByNoAndPwd(Warden warden) {
		Warden existWarden = wardenDao.findByNoAndPwd(warden);
		return existWarden;
	}


	@Override
	public int save(Warden warden) {
		// TODO Auto-generated method stub
		int f = wardenDao.save(warden);
		return f;
	}



	@Override
	public int update(Warden warden) {
		// TODO Auto-generated method stub
		 int u = wardenDao.update(warden);
		 return u;
	}



	@Override
	public JSONArray getNav(String id) {
		// TODO Auto-generated method stub
		List<WardenTree> data = wardenDao.getNav(id);
		JSONArray json = new JSONArray();
         for(WardenTree pLog : data){
             JSONObject jo = new JSONObject();
             jo.put("id", pLog.getId());
             jo.put("text", pLog.getText());
             jo.put("url", pLog.getUrl());
             jo.put("state", pLog.getState());
             jo.put("tid", pLog.getTid());
             json.add(jo);
         }
         System.out.println(json);
         return json;
	}

	@Override
	public JSONObject show(int first, int rows, String sort, String order,String wName) {
		// TODO Auto-generated method stub
		List<Warden> list = wardenDao.find(first,rows,sort,order ,wName);
		JSONArray jsonA = new JSONArray();
		for(Warden warden : list){
			JSONObject jsonB = new JSONObject();
			jsonB.put("wid", warden.getwId());
			jsonB.put("wno", warden.getwNo());
			jsonB.put("wname", warden.getwName());
			jsonB.put("tel",warden.getTel());
			//jsonB.put("level", warden.getLevel());
			jsonA.add(jsonB);
		}
		int count = wardenDao.findCount(wName);
		
		String json = "{"+"\"total\""+":"+count+","+"\"rows\""+":"+jsonA+"}";
		System.err.println(json);
		JSONObject js = new JSONObject();
		js = JSONObject.fromObject(json);
		return js;
	}



	@Override
	public JSONObject findById(int getwId) {
		// TODO Auto-generated method stub
		Warden list = wardenDao.findById(getwId);
		JSONObject jsonO = new JSONObject();
		jsonO = JSONObject.fromObject(list);
		System.err.println("jsonO="+jsonO);
		
		return jsonO;
	}



	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return wardenDao.delete(ids);
	}

}
