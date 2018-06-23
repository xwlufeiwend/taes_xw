package com.tae.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.tae.dao.ProfessionDao;
import com.tae.dao.TeacherDao;
import com.tae.domain.Profession;
import com.tae.domain.Teacher;
import com.tae.service.TeacherService;
import com.tae.util.JsonFilter;
import com.tae.util.ObjectJsonValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
/**
 * 教师service接口实现
 * @author Administrator
 *
 */
@Transactional
public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao;
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	private ProfessionDao professionDao;
	public void setProfessionDao(ProfessionDao professionDao) {
		this.professionDao = professionDao;
	}

	@Override
	public JSONObject show(int first, int rows, String sort, String order, String teacherName) {
		// TODO Auto-generated method stub
		List<Teacher> list = teacherDao.show(first,rows,sort,order,teacherName);
		int count = teacherDao.findCount(teacherName);
		JSONArray jsonA = new JSONArray();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Profession.class,   
			       new ObjectJsonValueProcessor(new String[]{"pName"},Profession.class));
		jsonA = JSONArray.fromObject(list, jsonConfig);
		String json = "{"+"\"total\""+":"+count+","+"\"rows\""+":"+jsonA+"}";
		System.err.println("show="+json);
		JSONObject js = new JSONObject();
		js = JSONObject.fromObject(json);
		return js;
	}

	@Override
	public int save(Teacher teacher, String pId) {
		// TODO Auto-generated method stub
		return teacherDao.save(teacher,pId);
	}

	@Override
	public JSONObject getteacher(Integer teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDao.findById(teacherId);
		JsonConfig config = JsonFilter.getFilter(new String[]{"couresesTeachers"});//String数组中存储的是要过滤的属性
		
		JSONObject jsonO = new JSONObject();
		jsonO = JSONObject.fromObject(teacher,config);
		return jsonO;
	}

	@Override
	public int update(Teacher teacher, String pId) {
		// TODO Auto-generated method stub
		int u = teacherDao.update(teacher,pId);
		return u;
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		int d = teacherDao.delete(ids);
		return d;
	}

	@Override
	public JSONArray getProfessionName() {
		// TODO Auto-generated method stub
		List<Profession> list = professionDao.findAll();
		JSONArray jsonArray = new JSONArray();
		JsonConfig config = JsonFilter.getFilter(new String[]{"courses","teachers","professionalClasses"});//String数组中存储的是要过滤的属性
		jsonArray=JSONArray.fromObject(list,config);
		System.err.println("getProfessionName="+jsonArray);
		return jsonArray;
	}

}
