package com.cmy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmy.common.utils.PageUtils;
import com.cmy.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 17:48:35
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

