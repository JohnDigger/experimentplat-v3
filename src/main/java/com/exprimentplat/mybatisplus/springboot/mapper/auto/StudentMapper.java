package com.exprimentplat.mybatisplus.springboot.mapper.auto;

import org.springframework.stereotype.Component;

@Component(value = "studentMapper")
public interface StudentMapper {
    Integer count();
    Integer xiaowainum();
}
