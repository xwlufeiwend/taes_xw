package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.College;
import com.tae.service.CollegeService;

import net.sf.json.JSONObject;
/**
 * 学院action
 * @author Administrator
 *
 */
public class CollegeAction extends ActionSupport implements ModelDriven<College>{
	private static final long serialVersionUID = 1L;
	private College college;
	@Override
	public College getModel() {
		// TODO Auto-generated method stub
		if (college == null) {
			college = new College();
		}
		return college;
	}
	//注入service
	private CollegeService collegeService;
	public void setCollegeService(CollegeService collegeService) {
		this.collegeService = collegeService;
	}
	/**
	 * 显示所有学院
	 */
	//json传值
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
	 * 显示所有学院信息
	 * @return
	 */
	public String showCollege(){
		int first = rows * (page - 1);
		System.err.println("第一次："+college.getCollegeName());
		
		show = collegeService.show(first,rows,sort,order,college.getCollegeName());
		return SUCCESS;
	}
	/**
	 * 学院添加
	 * @return
	 */
	public String college_add(){
		int a = collegeService.add(college);
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out ;
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
		
		return NONE;
	}
	private JSONObject editData = null;
	public JSONObject getEditData() {
		return editData;
	}
	public void setEditData(JSONObject editData) {
		this.editData = editData;
	}
	/**
	 * 查找到要修改的信息
	 * @return
	 */
	public String edit(){
		System.err.println("edit="+college.getCollegeId());
		editData = collegeService.findById(college.getCollegeId());
		return SUCCESS;
		
	}
	
	/**
	 * 修改学院信息
	 * @return
	 */
	public String update(){
		//int u = 1;
		int u =collegeService.update(college);
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(u);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.err.println("u="+u);
		return NONE;
	}
	//接收ids
	private String ids = null;
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	/**
	 * 删除学院信息
	 * @return
	 */
	public String delete(){
		System.out.println("delete="+ids);
		int d = collegeService.delete(ids);
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(d);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return NONE;
	}
	
}
