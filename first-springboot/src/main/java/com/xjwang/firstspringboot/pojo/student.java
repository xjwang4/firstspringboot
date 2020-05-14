package com.xjwang.firstspringboot.pojo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

@Alias("student")
public class student {
    private Long id;
    private String name;
    private Long age;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    public student(){
        super();
    }
    public student(Long id, String name,Long age,String gender,Date birthday){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Long getid() {
        return id;
    }
    public void setid(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}



