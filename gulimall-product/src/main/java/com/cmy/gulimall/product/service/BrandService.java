package com.cmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmy.common.utils.PageUtils;
import com.cmy.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 12:57:40
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

