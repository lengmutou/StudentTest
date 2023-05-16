package com.lengmu.controller;

import com.lengmu.dao.ShopDao;
import com.lengmu.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @author  lengmu
 * @version 1.0
 */
@Controller
public class ShopController {
    @Autowired
    ShopDao shopDao;

    @ResponseBody
    @RequestMapping("/test01")
    public Map<String, Object> test01() {
//        List<Shop> shops = shopDao.selectList(null);
        List<Map<String, Object>> maps = shopDao.selectMaps(null);
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("code", "0");
        stringObjectHashMap.put("data", maps);
        System.out.println(maps);
        return stringObjectHashMap;
    }

    @RequestMapping("/test02s")
    public String test01(HttpServletRequest request) {
        List<Shop> shops = shopDao.selectList(null);
        request.setAttribute("shops", shops);
        return "index2";
    }

    @RequestMapping("/test03")
    public String test03() {
        return "login";
    }

}
