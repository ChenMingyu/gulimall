package com.cmy.gulimall.coupon.dao;

import com.cmy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 17:48:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
