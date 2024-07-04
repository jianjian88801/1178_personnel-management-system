package com.dao;

import com.entity.RenwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuxinxiVO;
import com.entity.view.RenwuxinxiView;


/**
 * 任务信息
 * 
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public interface RenwuxinxiDao extends BaseMapper<RenwuxinxiEntity> {
	
	List<RenwuxinxiVO> selectListVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiVO selectVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	List<RenwuxinxiView> selectListView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);

	List<RenwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiView selectView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
}
