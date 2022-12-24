package com.javaye.clientapi.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:21:59
 * @Describe:
 */
@TableName(value = "info", autoResultMap = true)
public class Info implements Serializable {

    private static final long serialVersionUID = -7643450122150687678L;
    @TableField("name")
    private String name;
    @TableField("age")
    private Integer age;
    @TableField("sex")
    private String sex;
    @TableField(value = "hobby", typeHandler = JacksonTypeHandler.class)
    private List<String> hobby;
    @TableField("conn_number")
    private String conn_number;
    @TableField("email_number")
    private String email_number;
    @TableField("id_card")
    private String id_card;
    @TableField("address")
    private String address;

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", hobby=" + hobby +
                ", conn_number='" + conn_number + '\'' +
                ", email_number='" + email_number + '\'' +
                ", id_card='" + id_card + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public String getConn_number() {
        return conn_number;
    }

    public void setConn_number(String conn_number) {
        this.conn_number = conn_number;
    }

    public String getEmail_number() {
        return email_number;
    }

    public void setEmail_number(String email_number) {
        this.email_number = email_number;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Info(String name, Integer age, String sex, List<String> hobby, String conn_number, String email_number, String id_card, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
        this.conn_number = conn_number;
        this.email_number = email_number;
        this.id_card = id_card;
        this.address = address;
    }

    public Info() {
    }
}
