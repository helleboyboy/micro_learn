package com.javaye.clientapi.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:21:56
 * @Describe:
 */
@TableName(value = "register", autoResultMap = true)
public class Register implements Serializable {

    private static final long serialVersionUID = 8618851483584133552L;
    @TableField("id")
    private Integer id;
    @TableField("name")
   private String name;
    @TableField("sex")
   private Integer sex;

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

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

    public Register(Integer id, String name, Integer sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Register() {
    }
}
