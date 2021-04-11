package com.john.exprimentplat.mapper.auto;


import com.john.exprimentplat.model.auto.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component(value = "courseInfoMapper")
@Mapper
public interface CourseInfoMapper {
    List<CourseInfo> findAll();
}
