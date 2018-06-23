package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Warden;
import com.tae.service.WardenService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WardenAction extends ActionSupport implements ModelDriven<Warden> {

	private static final long serialVersionUID = 1L;
	// 布置模型驱动
	private Warden warden;

	@Override
	public Warden getModel() {
		if (warden == null) {
			warden = new Warden();
		}
		return warden;
	}

	// 注入业务层的wardenService
	private WardenService wardenService;

	public void setWardenService(WardenService wardenService) {
		this.wardenService = wardenService;
	}

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 */
	public String login() {
		
		return "login";
	}
	/**
	 * 管理员登录
	 * @return
	 */
	//设置验证码
	private String vcode;
	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public String wlogin(){
		Warden existLogin = wardenService.findByNoAndPwd(warden);
		String checkcode = (String) ActionContext.getContext().getSession().get("checkcode");
		if (existLogin == null) {
			this.addActionError("账号或密码错误，请重新登录！");
			return "login";
		}
		else if ( !checkcode.equalsIgnoreCase(vcode)) {
			this.addActionError("验证码错误！");
			return "login";
		}
		else {
			//this.addActionMessage("登录成功，跳转到首页！");
			ActionContext.getContext().getSession().put("warden", existLogin);
			ActionContext.getContext().getSession().put("level", existLogin.getLevel());
			return "index";
		}
		
	}
	/**
	 * 退出登录
	 * @return
	 */
	public String exit(){
		//ActionContext.getContext().getSession().clear();
		return "login";
	}
	/**
	 * 显示管理员信息
	 * @return
	 */
	public String info(){
		/*warden = (Warden) ActionContext.getContext().getSession().get("warden");
		warden = wardenService.show(warden.getwId());*/
		return "info";
	}
	/**
	 * 接收ajax传来的参数，添加到数据库
	 * @return
	 */
	public String add(){
		/*System.err.println("第五次："+warden.getwNo());
		System.err.println("第五次："+warden.getwName());
		System.err.println("第五次："+warden.getTel());
		System.err.println("第五次："+warden.getwPassword());*/
		int f = wardenService.save(warden);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(f);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("第五次："+f);
		return NONE;
	}
	/**
	 * 保存添加的管理员信息
	 * @return
	 */
	public String addto(){
		wardenService.save(warden);
		this.addActionMessage("添加成功！");
		return "addto";
	}
	/**
	 * 编辑管理员信息
	 * @return
	 */
	//把要编辑的json数据传给前端
	private JSONObject editData = null;
	public JSONObject getEditData() {
		return editData;
	}
	public void setEditData(JSONObject editData) {
		this.editData = editData;
	}

	public String edit(){
		System.err.println("edit="+warden.getwId());
		editData = wardenService.findById(warden.getwId());
		return SUCCESS;
		
	}
	
	
	
	/**
	 * 修改管理员信息
	 * @return
	 */
	public String update(){
		//warden = (Warden) ActionContext.getContext().getSession().get("warden");
		int u = 0;
		u = wardenService.update(warden);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(u);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("u="+u);
		return NONE;
	}
	/**
	 * 保存修改后的信息
	 * @return
	 */
	public String updateto(){
		wardenService.update(warden);
		this.addActionMessage("修改成功！");
		return "updateto";
	}
	
	/**
	 * 获取导航信息
	 * @return
	 */
	//导航的json数据
	private JSONArray tree = null;
	public JSONArray getTree() {
		return tree;
	}
	public void setTree(JSONArray tree) {
		this.tree = tree;
	}
	//树的节点id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNav(){
		tree = wardenService.getNav(id);
		System.err.println("id="+id);
		return SUCCESS;
	}
	/**
	 * 管理管理员信息
	 * @return
	 */
	//后台接收数据 当前页 每页显示数 排序字段 顺序
	//private PageBean pb = new PageBean();
	private int rows;
	private int page;
	private String sort;
	private String order;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
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
	//前台接收json结果
	private JSONObject mwa = null;
	public JSONObject getMwa() {
		return mwa;
	}
	public void setMwa(JSONObject mwa) {
		this.mwa = mwa;
	}
	public String mWarden(){
		int first = rows * (page - 1);
		/*System.err.println("第一次："+rows);
		System.err.println("第er次："+page);
		System.err.println("第san次："+sort);
		System.err.println("第si次："+order);
		System.err.println("第五次："+warden.getwName());*/
		mwa = wardenService.show(first,rows,sort,order ,warden.getwName());
		return SUCCESS;
	}
	/**
	 * 删除管理员信息
	 * @return
	 */
	//接收ids
	private String ids=null;
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String delete(){
		int count = wardenService.delete(ids);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out;
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			out = response.getWriter();
			out.print(count);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
}
