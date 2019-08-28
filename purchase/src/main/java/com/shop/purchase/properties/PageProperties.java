package com.shop.purchase.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author summer
 * @date 2019/8/20 15:45
 */
@Component
@PropertySource("classpath:pages.properties")
@ConfigurationProperties(prefix = "page")//这个是指定一个别名,对应上面属性文件里面的名字
public class PageProperties {
    private int pageSize;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
