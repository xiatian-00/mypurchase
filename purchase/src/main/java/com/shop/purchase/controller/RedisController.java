package com.shop.purchase.controller;


        import com.shop.purchase.common.MyRedisTemplate;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import javax.annotation.Resource;

/**
 * @author summer
 * @date 2019/8/22 11:07
 */
@RestController
public class RedisController {
    @Resource(name = "myRedisTemplate")
    MyRedisTemplate myRedisTemplate;

    @RequestMapping("/testRedisTemplate")
    public void testRedisTemplate() {
        myRedisTemplate.testString();
    }
}
