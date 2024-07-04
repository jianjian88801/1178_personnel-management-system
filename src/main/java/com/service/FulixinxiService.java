package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FulixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FulixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FulixinxiView;


/**
 * 福利信息
 *
 * @author 
 * @email 
 * @date 2021-05-17 00:00:35
 */
public interface FulixinxiService extends IService<FulixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FulixinxiVO> selectListVO(Wrapper<FulixinxiEntity> wrapper);
   	
   	FulixinxiVO selectVO(@Param("ew") Wrapper<FulixinxiEntity> wrapper);
   	
   	List<FulixinxiView> selectListView(Wrapper<FulixinxiEntity> wrapper);
   	
   	FulixinxiView selectView(@Param("ew") Wrapper<FulixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FulixinxiEntity> wrapper);
   	
}

