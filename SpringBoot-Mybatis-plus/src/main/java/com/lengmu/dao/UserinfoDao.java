package com.lengmu.dao;

import com.lengmu.entity.Userinfo;

public interface UserinfoDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}