package com.cmy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmy.common.utils.PageUtils;
import com.cmy.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 12:57:40
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

