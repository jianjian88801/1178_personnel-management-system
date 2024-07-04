package com.entity.model;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public class BumenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门主管
	 */
	
	private String bumenzhuguan;
		
	/**
	 * 部门人数
	 */
	
	private Integer bumenrenshu;
		
	/**
	 * 部门职责
	 */
	
	private String bumenzhize;
				
	
	/**
	 * 设置：部门主管
	 */
	 
	public void setBumenzhuguan(String bumenzhuguan) {
		this.bumenzhuguan = bumenzhuguan;
	}
	
	/**
	 * 获取：部门主管
	 */
	public String getBumenzhuguan() {
		return bumenzhuguan;
	}
				
	
	/**
	 * 设置：部门人数
	 */
	 
	public void setBumenrenshu(Integer bumenrenshu) {
		this.bumenrenshu = bumenrenshu;
	}
	
	/**
	 * 获取：部门人数
	 */
	public Integer getBumenrenshu() {
		return bumenrenshu;
	}
				
	
	/**
	 * 设置：部门职责
	 */
	 
	public void setBumenzhize(String bumenzhize) {
		this.bumenzhize = bumenzhize;
	}
	
	/**
	 * 获取：部门职责
	 */
	public String getBumenzhize() {
		return bumenzhize;
	}
			
}
