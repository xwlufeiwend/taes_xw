package com.tae.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Score;
import com.tae.service.ScoreService;

import net.sf.json.JSONArray;

public class ScoreAction extends ActionSupport implements ModelDriven<Score> {
	private static final long serialVersionUID = 1L;
	private Score score;
	@Override
	public Score getModel() {
		// TODO Auto-generated method stub
		if (score != null) {
			score = new Score();
		}
		return score;
	}
	//×¢Èë
	private ScoreService scoreService;
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	/**
	 * 
	 * @return
	 */
	public String getData(){
		 HttpServletRequest request = ServletActionContext.getRequest();    
	     HttpServletResponse response = ServletActionContext.getResponse();    
	        try {    
	            request.setCharacterEncoding("utf-8");    
	            response.setCharacterEncoding("utf-8");   
	        } catch (UnsupportedEncodingException e) {    
	            e.printStackTrace();    
	        }  
	        //System.out.println("»¶Ó­Ê¹ÓÃechartsAction");  
	        List<Score> list = scoreService.findByCount();  
	        String jsonArray = JSONArray.fromObject(list).toString();  
	        PrintWriter out;  
	        try {  
	            response.setContentType("aplication/json;charset=UTF-8");  
	            out = response.getWriter();  
	            out.println(jsonArray);  
	            out.flush();  
	            out.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        return null;  
	}

}
