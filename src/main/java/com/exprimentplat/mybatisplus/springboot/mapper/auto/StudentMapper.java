package com.exprimentplat.mybatisplus.springboot.mapper.auto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Component(value = "studentMapper")
@Mapper
public interface StudentMapper {
    Integer count();
    Integer xiaowainum();
}
