package com.shop.purchase.httpclient;

import org.apache.http.client.config.RequestConfig;

/**
 * @author summer
 * @date 2019/8/27 9:17
 * 设置返回请求参数的config对象
 */
public class MyRequsetConfig {
    private static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(15000).setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000).build();
    public  static RequestConfig getRequestConfig(){
        return requestConfig;
    }
}
