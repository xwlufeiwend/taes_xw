package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Profession;
import com.tae.service.ProfessionService;
/**
 * 专业的action
 * @author Administrator
 *
 */

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class ProfessionAction extends ActionSupport implements ModelDriven<Profession>{
	private static final long serialVersionUID = 1L;
	HttpServletResponse response = ServletActionContext.getResponse();
	PrintWriter out;
	private Profession profession;
	@Override
	public Profession getModel() {
		// TODO Auto-generated method stub
		if (profession == null) {
			profession = new Profession();
		}
		return profession;
	}
	
	//注入
	private ProfessionService professionService;
	public void setProfessionService(ProfessionService professionService) {
		this.professionService = professionService;
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
	 * 显示所有专业信息
	 * @return
	 */
	public String show(){
		int first = rows*(page - 1);
		System.err.println("pname="+profession.getpName());
		//show = professionService.show(first,rows,sort,order,profession.getpName(),profession.getCollege().getCollegeName());
		show = professionService.show(first,rows,sort,order,profession.getpName());
		
		return SUCCESS;
	}
	private String collegeId = null;
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	/**
	 * 添加专业信息
	 * @return
	 */
	public String profession_add(){
		System.err.println();
		System.err.println("collegeId="+collegeId);
		//System.err.println("collegeId="+profession.getCollege().getCollegeId());
		int a = professionService.save(profession,collegeId);
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
		//profession.getCollege();
		//System.err.println("学院="+profession.getCollege());
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
		editData = professionService.getProfession(profession.getpId());
		return SUCCESS;
	}
	/**
	 * 上传要修改的数据
	 * @return
	 */
	public String update(){
		int u = professionService.update(profession,collegeId);
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
	 * 删除专业信息
	 * @return
	 */
	public String delete(){
		int d = professionService.delete(ids);
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
	private JSONArray cName = null;
	public JSONArray getcName() {
		return cName;
	}
	public void setcName(JSONArray cName) {
		this.cName = cName;
	}
	/**
	 * 获取学院名称赋值给下拉框
	 * @return
	 */
	public String getCollegeName(){
		cName = professionService.getCollegeName();
		return SUCCESS;
	}
	
	

}
