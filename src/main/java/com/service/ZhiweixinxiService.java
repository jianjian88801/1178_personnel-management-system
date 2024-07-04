package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiweixinxiView;


/**
 * 职位信息
 *
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public interface ZhiweixinxiService extends IService<ZhiweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiweixinxiVO> selectListVO(Wrapper<ZhiweixinxiEntity> wrapper);
   	
   	ZhiweixinxiVO selectVO(@Param("ew") Wrapper<ZhiweixinxiEntity> wrapper);
   	
   	List<ZhiweixinxiView> selectListView(Wrapper<ZhiweixinxiEntity> wrapper);
   	
   	ZhiweixinxiView selectView(@Param("ew") Wrapper<ZhiweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiweixinxiEntity> wrapper);
   	
}

