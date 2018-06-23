package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Teacher;
import com.tae.service.TeacherService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 教师action
 * @author Administrator
 *
 */
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>{
	private static final long serialVersionUID = 1L;
	HttpServletResponse response = ServletActionContext.getResponse();
	PrintWriter out;
	private Teacher teacher;
	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		if (teacher == null) {
			teacher = new Teacher();
		}
		return teacher;
	}
	private TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	//传到前台的json
		private JSONObject show = null;
		public JSONObject getShow() {
			return show;
		}
		public void setShow(JSONObject show) {
			this.show = show;
		}
		//接收page rows sort order
		private int page;
		private int rows;
		private String sort;
		private String order;
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public int getRows() {
			return rows;
		}
		public void setRows(int rows) {
			this.rows = rows;
		}
		public String getSort() {
			return sort;
		}
		public void setSort(String sort) {
			this.sort = sort;
		}
		public String getOrder() {
			return order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
		/**
		 * 显示所有教师信息
		 * @return
		 */
		public String show(){
			int first = rows*(page - 1);
			System.err.println("pname="+teacher.getTeacherName());
			//show = teacherService.show(first,rows,sort,order,teacher.getTeacherName(),teacher.getCollege().getCollegeName());
			show = teacherService.show(first,rows,sort,order,teacher.getTeacherName());
			
			return SUCCESS;
		}
		private String pId = null;
		public String getpId() {
			return pId;
		}
		public void setpId(String pId) {
			this.pId = pId;
		}
		/**
		 * 添加教师信息
		 * @return
		 */
		public String add(){
			System.err.println();
			System.err.println("pId="+pId);
			//System.err.println("collegeId="+teacher.getCollege().getCollegeId());
			int a = teacherService.save(teacher,pId);
			response.setCharacterEncoding("utf-8");
			try {
				out = response.getWriter();
				out.print(a);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//teacher.getCollege();
			//System.err.println("学院="+teacher.getCollege());
			return SUCCESS;
		}
		//editData传到前端的指定修改的数据
		private JSONObject editData = null;
		public JSONObject getEditData() {
			return editData;
		}
		public void setEditData(JSONObject editData) {
			this.editData = editData;
		}
		/**
		 * 传回指定要修改的数据
		 * @return
		 */
		public String edit(){
			editData = teacherService.getteacher(teacher.getTeacherId());
			return SUCCESS;
		}
		/**
		 * 上传要修改的数据
		 * @return
		 */
		public String update(){
			int u = teacherService.update(teacher,pId);
			response.setCharacterEncoding("utf-8");
			try {
				out = response.getWriter();
				out.print(u);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return SUCCESS;
		}
		//接收ids
		private String ids;
		public String getIds() {
			return ids;
		}
		public void setIds(String ids) {
			this.ids = ids;
		}
		/**
		 * 删除教师信息
		 * @return
		 */
		public String delete(){
			int d = teacherService.delete(ids);
			response.setCharacterEncoding("utf-8");
			try {
				out = response.getWriter();
				out.print(d);
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return SUCCESS;
		}
		
		//获取学院名称的json
		private JSONArray pName = null;
		public JSONArray getpName() {
			return pName;
		}
		public void setpName(JSONArray pName) {
			this.pName = pName;
		}
		/**
		 * 获取学院名称赋值给下拉框
		 * @return
		 */
		public String getCollegeName(){
			pName = teacherService.getProfessionName();
			return SUCCESS;
		}
		
}
