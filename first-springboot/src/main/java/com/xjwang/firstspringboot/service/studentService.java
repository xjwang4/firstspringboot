package com.xjwang.firstspringboot.service;

import com.xjwang.firstspringboot.pojo.student;
import com.xjwang.firstspringboot.mapper.studentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class  studentService {
    private static final Logger log = LoggerFactory.getLogger(studentService.class);
@Resource
private studentMapper studentMapper;

    public List<student> findAll(Map params)
        {
        return studentMapper.findAll(params);
        }
    public int addStudent(student student ){
       return studentMapper.addStudent(student);
    }

    public int editStudent(student student ){
        return studentMapper.editStudent(student);
    }

    public int delateStudent(Long id ){
        return studentMapper.delateStudent(id);
    }

    public int findTotalSize(String gender){
        return studentMapper.findTotalSize(gender);
    }
}