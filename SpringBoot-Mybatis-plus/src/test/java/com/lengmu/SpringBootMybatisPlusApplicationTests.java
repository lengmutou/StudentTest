package com.lengmu;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lengmu.dao.HouseinfoDao;
import com.lengmu.dao.ShopDao;
import com.lengmu.entity.Houseinfo;
import com.lengmu.entity.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiPredicate;

@SpringBootTest
class SpringBootMybatisPlusApplicationTests {
    @Autowired
    ShopDao shopDao;
    @Autowired
    HouseinfoDao houseinfoDao;

    @Test
    void contextLoads() {
//        for (int i = 0; i < 10; i++) {
//            shopDao.insert(new Shop(){{
//                setPrice(50.0);
//                setProductName("龙蛋");
//            }});
//        }
//        Shop shop = shopDao.selectById(18);
//        Shop shop1 = shopDao.selectById(18);
//        shop.setProductName("心");
//        shopDao.updateById(shop);
//        shop1.setProductName("稿子");
//        shopDao.updateById(shop1);
//        List<Shop> shops = shopDao.selectList(null);
//        shops.forEach(System.out::println);
//        System.out.println(shops);
//        Page<Shop> page = new Page<>(1,5);
//        shopDao.selectPage(page, null);
//        page.getRecords().forEach(System.out::println);
//        System.out.println(page.getTotal());
//        shopDao.deleteById(19);
//        List<Houseinfo> houseinfos = houseinfoDao.selectList(null);
//        houseinfos.forEach(System.out::println);
//        UpdateWrapper<Houseinfo> updateWrapper = new UpdateWrapper<Houseinfo>();
//
//        //查询条件 like
//        QueryWrapper<Houseinfo> like = new QueryWrapper<Houseinfo>();
//        LambdaQueryWrapper<Houseinfo> like2 = new QueryWrapper<Houseinfo>().lambda().like(Houseinfo::getHname, "小区");
//        //查询条件 alleq
//        QueryWrapper<Houseinfo> like3 = new QueryWrapper<Houseinfo>().allEq(new HashMap<String, String>(){{
//            put("harea","洪山区");
//            put("hname","保利花园");
//            put("hqk","还未出租");
//        }});
//        //isnull
//        QueryWrapper<Houseinfo> like4 = new QueryWrapper<Houseinfo>().allEq(true,new HashMap<String, String>(){{
//            put("hfd",null);
//        }},true);
//        QueryWrapper<Houseinfo> like5 = new QueryWrapper<Houseinfo>().allEq((s, o) -> {
//            return !s.equals("harea");
//        }, new HashMap<String, String>(){{
//            put("harea","洪山区");
//            put("hname","保利花园");
//            put("hqk","还未出租");
//        }}, true);
//        // houseinfoDao.insert();
        QueryWrapper<Houseinfo> like6 = new QueryWrapper<Houseinfo>().ne("hqk", "还未出租");
        List<Houseinfo> houseinfos = houseinfoDao.selectAll(like6);
        houseinfos.forEach(System.out::println);
    }
}
