package com.lengmu.controller;

import com.lengmu.dao.ShopDao;
import com.lengmu.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 * @author  lengmu
 * @version 1.0
 */
@Controller
public class ShopController {
    @Autowired
    ShopDao shopDao;
    @RequestMapping("/test01")
    public String test01(){
        shopDao.insert(new Shop(){{
            setPrice(50.0);
            setProductName("龙蛋");
        }});
        List<Shop> shops = shopDao.selectList(null);
        System.out.println(shops);
        return "index";
    }

}
