package com.xjwang.firstspringboot.mapper;

import com.xjwang.firstspringboot.pojo.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface studentMapper {
    student findById(Long id);

    List<student> findAll(Map params);

    int addStudent(student student );

    int editStudent(student student );

    int delateStudent(Long id);

    int findTotalSize(String gender);
}
