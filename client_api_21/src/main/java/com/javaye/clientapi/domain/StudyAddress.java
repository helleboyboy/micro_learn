package com.javaye.clientapi.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:22:07
 * @Describe:
 */
@TableName("study_address")
public class StudyAddress implements Serializable {

    private static final long serialVersionUID = 3324657763966043220L;
    @TableField("name")
    private String name;
    @TableField("school")
    private String school;
    @TableField("class_name")
    private String class_name;

    @Override
    public String toString() {
        return "StudyAddress{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", class_name='" + class_name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public StudyAddress(String name, String school, String class_name) {
        this.name = name;
        this.school = school;
        this.class_name = class_name;
    }

    public StudyAddress() {
    }
}
