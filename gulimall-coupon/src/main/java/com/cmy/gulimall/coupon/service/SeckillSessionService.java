package com.cmy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmy.common.utils.PageUtils;
import com.cmy.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 17:48:35
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

