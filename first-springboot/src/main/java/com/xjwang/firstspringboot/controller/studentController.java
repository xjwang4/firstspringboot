package com.xjwang.firstspringboot.controller;

import com.github.pagehelper.PageHelper;
import com.sun.javafx.collections.MappingChange;
import com.xjwang.firstspringboot.pojo.student;
import com.xjwang.firstspringboot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class studentController {
    @Autowired
    private studentService studentService;
    @GetMapping("/listStudent")
    public List listStudent(String name,Integer start,Integer count){
        Map params = new HashMap();
        params.put("name",name);
        params.put("start",start);
        params.put("count",count);
        PageHelper.startPage(start, count);
        List<student> all = studentService.findAll(params);
        return  all;
    }
    @PostMapping("/addStudent")
    public int addStudent( student student){
           studentService.addStudent(student);
           return 1;
    }
    @PostMapping("/editStudent")
    public int editStudent(@RequestBody student student){
        studentService.editStudent(student);
        return 1;
    }

    @PostMapping("/delateStudent")
    public int deleteStudent(Long id){
        studentService.delateStudent(id);
        return 1;
    }

    @PostMapping("/countStudent")
    public int countStudent(String gender){
        int count = studentService.findTotalSize(gender);
        return count;
    }
}
