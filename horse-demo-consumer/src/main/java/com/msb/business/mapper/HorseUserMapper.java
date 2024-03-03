package com.msb.business.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.business.model.entity.HorseUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * (HorseUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-21 14:57:36
 */
@Mapper
public interface HorseUserMapper extends BaseMapper<HorseUser> {

}

