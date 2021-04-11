package com.john.exprimentplat.service.impl;


import com.john.exprimentplat.mapper.auto.CourseInfoMapper;
import com.john.exprimentplat.model.auto.CourseInfo;
import com.john.exprimentplat.service.ICourseInfoService;
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
