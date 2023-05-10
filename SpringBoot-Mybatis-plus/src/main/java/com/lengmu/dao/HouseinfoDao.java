package com.lengmu.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.lengmu.entity.Houseinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseinfoDao  extends BaseMapper<Houseinfo> {
    List<Houseinfo> selectAll(@Param(Constants.WRAPPER) Wrapper wrapper);
    int insert();
}