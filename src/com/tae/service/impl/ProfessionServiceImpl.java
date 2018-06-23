package com.tae.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tae.dao.CollegeDao;
import com.tae.dao.ProfessionDao;
import com.tae.domain.College;
import com.tae.domain.Profession;
import com.tae.service.ProfessionService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import com.tae.util.JsonFilter;
import com.tae.util.ObjectJsonValueProcessor;
/**
 * 专业service实现类
 * @author Administrator
 *
 */
@Transactional
public class ProfessionServiceImpl implements ProfessionService {
	private ProfessionDao professionDao;
	public void setProfessionDao(ProfessionDao professionDao) {
		this.professionDao = professionDao;
	}
	private CollegeDao collegeDao;
	public void setCollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}


	@Override
	public JSONObject show(int first, int rows, String sort, String order,String pName) {
		// TODO Auto-generated method stub
		List<Profession> list = professionDao.show(first,rows,sort,order,pName);
		int count = professionDao.findCount(pName);
		JSONArray jsonA = new JSONArray();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(College.class,   
			       new ObjectJsonValueProcessor(new String[]{"collegeName"},College.class));
		jsonA = JSONArray.fromObject(list, jsonConfig);
		String json = "{"+"\"total\""+":"+count+","+"\"rows\""+":"+jsonA+"}";
		System.err.println("show="+json);
		JSONObject js = new JSONObject();
		js = JSONObject.fromObject(json);
		return js;
	}


	@Override
	public int save(Profession profession ,String collegeId) {
		// TODO Auto-generated method stub
		return professionDao.save(profession,collegeId);
	}


	@Override
	public JSONObject getProfession(Integer getpId) {
		// TODO Auto-generated method stub
		Profession profession = professionDao.findById(getpId);
		JsonConfig config = JsonFilter.getFilter(new String[]{"professions"});//String数组中存储的是要过滤的属性
		
		JSONObject jsonO = new JSONObject();
		jsonO = JSONObject.fromObject(profession,config);
		return jsonO;
	}


	@Override
	public int update(Profession profession,String collegeId) {
		// TODO Auto-generated method stub
		int u = professionDao.update(profession,collegeId);
		return u;
	}


	@Override
	public int delete(String  ids) {
		// TODO Auto-generated method stub
		int d = professionDao.delete(ids);
		return d;
	}


	@Override
	public JSONArray getCollegeName() {
		// TODO Auto-generated method stub
		List<College> list = collegeDao.findAll();
		JSONArray jsonArray = new JSONArray();
		JsonConfig config = JsonFilter.getFilter(new String[]{"professions"});//String数组中存储的是要过滤的属性
		jsonArray=JSONArray.fromObject(list,config);
		System.err.println("getCollegeName="+jsonArray);
		return jsonArray;
	}



	
	
}
