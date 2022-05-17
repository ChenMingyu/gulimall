package com.cmy.gulimall.order.dao;

import com.cmy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 19:22:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
