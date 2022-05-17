package com.cmy.gulimall.member.dao;

import com.cmy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenmingyu
 * @email chenmingyu@gmail.com
 * @date 2022-05-17 18:03:30
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
