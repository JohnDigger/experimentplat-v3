package com.exprimentplat.mybatisplus.springboot.mapper.auto;


import com.exprimentplat.mybatisplus.springboot.model.auto.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component(value = "courseInfoMapper")
@Mapper
public interface CourseInfoMapper {
    List<CourseInfo> findAll();
}
