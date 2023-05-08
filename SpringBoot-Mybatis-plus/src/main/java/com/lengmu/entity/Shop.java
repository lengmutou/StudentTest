package com.lengmu.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * shop
 * @author 
 */
@Data
public class Shop implements Serializable {
    private Integer sid;

    private String productName;

    private Double price;

    private Integer stock;

    private static final long serialVersionUID = 1L;
}