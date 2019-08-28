package com.shop.purchase.common;


import org.springframework.http.HttpStatus;

/**
 * 异常处理的通用类
 */
public class RestFulResponseBody {
    String message;
    HttpStatus httpStatus;
    Object []data;

    public RestFulResponseBody() {
    }

    public RestFulResponseBody(String message, HttpStatus httpStatus, Object[] ...data) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.data = data;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
