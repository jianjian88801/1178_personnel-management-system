package com.entity.view;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 部门信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
@TableName("bumenxinxi")
public class BumenxinxiView  extends BumenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BumenxinxiView(){
	}
 
 	public BumenxinxiView(BumenxinxiEntity bumenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, bumenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
