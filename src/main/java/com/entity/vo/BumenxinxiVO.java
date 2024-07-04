package com.entity.vo;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public class BumenxinxiVO  implements Serializable {
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
