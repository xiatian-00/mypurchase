package com.shop.purchase.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author summer
 * @date 2019/8/20 10:58
 */
@Component
@PropertySource("classpath:my2.properties")
@ConfigurationProperties(prefix = "my2")//这个是指定一个别名,对应上面属性文件里面的名字
public class MyProperties2 {
    private int age;
    private String name;
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
