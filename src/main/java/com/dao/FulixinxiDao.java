package com.dao;

import com.entity.FulixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FulixinxiVO;
import com.entity.view.FulixinxiView;


/**
 * 福利信息
 * 
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public interface FulixinxiDao extends BaseMapper<FulixinxiEntity> {
	
	List<FulixinxiVO> selectListVO(@Param("ew") Wrapper<FulixinxiEntity> wrapper);
	
	FulixinxiVO selectVO(@Param("ew") Wrapper<FulixinxiEntity> wrapper);
	
	List<FulixinxiView> selectListView(@Param("ew") Wrapper<FulixinxiEntity> wrapper);

	List<FulixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FulixinxiEntity> wrapper);
	
	FulixinxiView selectView(@Param("ew") Wrapper<FulixinxiEntity> wrapper);
	
}
