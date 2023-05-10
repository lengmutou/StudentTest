package com.lengmu.entity;

import java.io.Serializable;
import java.util.Date;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * shop
 * @author 
 */
@Data
public class Shop implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer sid;

    private String productName;

    private Double price;
    @TableField(fill = FieldFill.INSERT,value = "gmt_create")
    private Date gmtCreate;
    @TableField(fill = FieldFill.INSERT_UPDATE,value = "gmt_modified")
    private Date gmtModified;
    @Version
    private int version;
    @TableLogic
    private int deleted;
    private static final long serialVersionUID = 1L;
}