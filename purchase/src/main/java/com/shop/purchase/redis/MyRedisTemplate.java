package com.shop.purchase.redis;

/**
 * @author summer
 * @date 2019/8/22 11:04
 */


import com.shop.purchase.domain.Users;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Redis工具类
 */
@Repository
public class MyRedisTemplate {

    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;

    public void testString() {
        redisTemplate.opsForValue().set("b", "ityouknow你好");
        // redisTemplate.opsForValue().set("bb", "ityouknow你好",10, TimeUnit.SECONDS);
        Users u2=new Users();
        u2.setAddressid(100);
        u2.setId(222);
        redisTemplate.opsForValue().set("objuser",u2);//对象

        Object v = redisTemplate.opsForValue().get("b");
        Users u=(Users)redisTemplate.opsForValue().get("objuser");
        System.out.println(v + "===--"+u.getAddressid());
    }
}
