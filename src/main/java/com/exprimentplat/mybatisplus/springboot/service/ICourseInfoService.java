package com.exprimentplat.mybatisplus.springboot.service;



import com.exprimentplat.mybatisplus.springboot.model.auto.CourseInfo;

import java.util.List;

public interface ICourseInfoService {
    List<CourseInfo> findAll();
}
