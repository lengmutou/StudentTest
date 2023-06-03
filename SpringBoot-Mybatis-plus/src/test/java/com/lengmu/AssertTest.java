package com.lengmu;

import com.lengmu.dao.ShopDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * @author  lengmu
 * @version 1.0
 */
@SpringBootTest
@DisplayName("我是AssertTest模块")
public class AssertTest {
    @Autowired
    ShopDao shopDao;

    @Test
    @DisplayName("我是AssertTest - test01")
    public void test01() {
        Assertions.assertEquals(5,1+3,"结果错误！！");
    }
}
