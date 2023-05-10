package com.lengmu;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lengmu.dao.HouseinfoDao;
import com.lengmu.dao.ShopDao;
import com.lengmu.entity.Houseinfo;
import com.lengmu.entity.Shop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
        List<Houseinfo> houseinfos = houseinfoDao.selectList(null);
        houseinfos.forEach(System.out::println);
    }
}
