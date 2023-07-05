package com.lengmu.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

public class JedisPool {
    private static redis.clients.jedis.JedisPool jedisPool;
    static {
        //连接池配置
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大连接数
        jedisPoolConfig.setMaxTotal(8);
        //最大空闲数
        jedisPoolConfig.setMaxIdle(8);
        //最小空闲数
        jedisPoolConfig.setMinIdle(0);
        //设置最大等待时间
        jedisPoolConfig.setMaxWait(Duration.ofMillis(200));
        jedisPool = new redis.clients.jedis.JedisPool(jedisPoolConfig,"localhost",6379,1000,null);
    }
    public static Jedis getConnect(){
        return jedisPool.getResource();
    }
}
