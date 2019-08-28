package com.shop.purchase.domain;

/**
  *@author summer
  *@date 2019-8-28 12:44
  */ 
public class Users {
    private Integer id;

    private String name;

    private Integer sex;

    private String image;

    private Integer addressid;

    private String love;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
}