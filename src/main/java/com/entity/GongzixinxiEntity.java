package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工资信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
@TableName("gongzixinxi")
public class GongzixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzixinxiEntity() {
		
	}
	
	public GongzixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 基本工资
	 */
					
	private Integer jibengongzi;
	
	/**
	 * 加班工资
	 */
					
	private Integer jiabangongzi;
	
	/**
	 * 福利
	 */
					
	private Integer fuli;
	
	/**
	 * 社保
	 */
					
	private Integer shebao;
	
	/**
	 * 扣费
	 */
					
	private Integer koufei;
	
	/**
	 * 实发工资
	 */
					
	private Integer shifagongzi;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：基本工资
	 */
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
	/**
	 * 设置：加班工资
	 */
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
	/**
	 * 设置：福利
	 */
	public void setFuli(Integer fuli) {
		this.fuli = fuli;
	}
	/**
	 * 获取：福利
	 */
	public Integer getFuli() {
		return fuli;
	}
	/**
	 * 设置：社保
	 */
	public void setShebao(Integer shebao) {
		this.shebao = shebao;
	}
	/**
	 * 获取：社保
	 */
	public Integer getShebao() {
		return shebao;
	}
	/**
	 * 设置：扣费
	 */
	public void setKoufei(Integer koufei) {
		this.koufei = koufei;
	}
	/**
	 * 获取：扣费
	 */
	public Integer getKoufei() {
		return koufei;
	}
	/**
	 * 设置：实发工资
	 */
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}

}
