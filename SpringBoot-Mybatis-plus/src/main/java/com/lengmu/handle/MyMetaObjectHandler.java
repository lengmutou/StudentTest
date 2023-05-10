package com.lengmu.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/*
 * @author  lengmu
 * @version 1.0
 */
@Slf4j //日志
@Component//以组件的形式把这个处理器注册到IOC容器中
public class MyMetaObjectHandler implements MetaObjectHandler {

    //插入时启动  第三个参数 LocalDateTime 一定要和 createTime成员变量的值的类型一致，不然是null 如果是date就都设置date
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.setFieldValByName("gmtCreate", new Date(), metaObject);
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }

    //更新时候启动
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }
}

