package com.tae.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tae.dao.CollegeDao;
import com.tae.domain.College;
import com.tae.service.CollegeService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 学院service实现类
 * @author Administrator
 *
 */
@Transactional
public class CollegeServiceImpl implements CollegeService {
	
	//注入
	private CollegeDao collegeDao;
	public void setCollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}

	@Override
	public JSONObject show(int first, int rows, String sort, String order ,String collegeName) {
		// TODO Auto-generated method stub
		List<College> list = collegeDao.show(first,rows,sort,order,collegeName);
		int count = collegeDao.findCount(collegeName);
		JSONArray jsonA = new JSONArray();
		for(College college : list){
			JSONObject jsonO = new JSONObject();
			jsonO.put("collegeId", college.getCollegeId());
			jsonO.put("collegeNo", college.getCollegeNo());
			jsonO.put("collegeName", college.getCollegeName());
			jsonA.add(jsonO);
		}
		String json = "{"+"\"total\""+":"+count+","+"\"rows\""+":"+jsonA+"}";
		System.err.println(json);
		JSONObject js = new JSONObject();
		js = JSONObject.fromObject(json);
		return js;
	}

	@Override
	public int add(College college) {
		// TODO Auto-generated method stub
		
		return collegeDao.save(college);
	}

	@Override
	public int update(College college) {
		// TODO Auto-generated method stub
	 	int u = collegeDao.update(college);
	 	return u;
	}

	@Override
	public JSONObject findById(Integer collegeId) {
		// TODO Auto-generated method stub
		College college = collegeDao.findById(collegeId);
		JSONObject jsonObject = new JSONObject();
		jsonObject = JSONObject.fromObject(college);
		return jsonObject;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		int d = collegeDao.delete(ids);
		return d;
	}

}
