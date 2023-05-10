package com.lengmu.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * houseinfo
 * @author 
 */
@Data
@TableName(value = "houseinfo",resultMap = "HouseInfo")
public class Houseinfo implements Serializable {
    @TableId(type = IdType.AUTO,value = "hid")
    private Integer hid;

    private Userinfo userinfo;

    private String harea;

    private String hname;

    private String hfx;

    private String hmj;

    private String hzx;

    private String hlc;

    private String hzj;

    private String hfd;

    private String hfdtel;

    private String hqk;

    private static final long serialVersionUID = 1L;
}