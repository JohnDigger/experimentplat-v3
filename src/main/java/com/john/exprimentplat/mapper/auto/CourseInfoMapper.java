package com.john.exprimentplat.mapper.auto;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.john.exprimentplat.model.auto.CourseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component(value = "courseInfoMapper")
@Mapper
public interface CourseInfoMapper extends BaseMapper<CourseInfo> {
    List<CourseInfo> findAll();
    List<CourseInfo> findAllByCourseCode(String courseCode);

}
