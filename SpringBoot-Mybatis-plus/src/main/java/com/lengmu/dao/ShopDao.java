package com.lengmu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lengmu.entity.Shop;

import java.util.List;

public interface ShopDao extends BaseMapper<Shop> {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    List<Shop> selectAll();
}