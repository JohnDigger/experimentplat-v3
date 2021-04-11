package com.john.exprimentplat.mapper.auto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Component("teacherMapper")
@Mapper
public interface TeacherMapper {
    Integer count();
}
