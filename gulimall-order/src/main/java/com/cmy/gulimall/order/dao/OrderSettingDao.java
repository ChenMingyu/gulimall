package com.cmy.gulimall.order.dao;

import com.cmy.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 19:22:13
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
