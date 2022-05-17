package com.cmy.gulimall.ware.dao;

import com.cmy.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 19:26:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
