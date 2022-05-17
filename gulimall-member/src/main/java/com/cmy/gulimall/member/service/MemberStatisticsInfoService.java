package com.cmy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmy.common.utils.PageUtils;
import com.cmy.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 18:03:30
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

