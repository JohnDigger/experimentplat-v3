package com.exprimentplat.mybatisplus.springboot.service.impl;


import com.exprimentplat.mybatisplus.springboot.mapper.auto.CourseInfoMapper;
import com.exprimentplat.mybatisplus.springboot.model.auto.CourseInfo;
import com.exprimentplat.mybatisplus.springboot.service.ICourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInfoServiceImpl implements ICourseInfoService {
    @Autowired(required = false)
    CourseInfoMapper courseInfoMapper;
    @Override
    public List<CourseInfo> findAll() {
        List<CourseInfo> courseInfos = courseInfoMapper.findAll();
        return courseInfos;
    }
}
