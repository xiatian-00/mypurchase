package com.shop.purchase.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 实行分页的通用类
 */
@Component
@ConfigurationProperties(prefix = "pg")
public class MyProperties {
    private int pagesize;//每页的条数

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
