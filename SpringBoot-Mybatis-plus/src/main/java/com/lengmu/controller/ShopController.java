package com.lengmu.controller;

import com.lengmu.dao.ShopDao;
import com.lengmu.entity.Shop;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
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
    @RequestMapping("/echarts")
    public String echarts(HttpServletRequest request) {
        return "echarts";
    }
    @RequestMapping("/fileUpLoad")
    public String fileUpLoad(HttpServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();

        return "echarts";
    }

    @RequestMapping("/test03")
    public String test03() {
        return "login";
    }

    @RequestMapping("/test04/{path}")
    public String test04(Model model, @MatrixVariable(pathVar = "path", value = "str", required = false) String str, @MatrixVariable(pathVar = "path", value = "strArr", required = false) String[] strArr) {
        model.addAttribute("data", new HashMap<String, Object>() {{
            System.out.println("str: " + str);
            System.out.println("strArr: " + Arrays.toString(strArr));
            put("str", str);
            put("strArr", strArr);
        }});
        return "matrix";
    }

}
