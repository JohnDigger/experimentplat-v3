package com.john.exprimentplat.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.john.exprimentplat.mapper.auto.CourseInfoMapper;
import com.john.exprimentplat.model.auto.CourseInfo;
import com.john.exprimentplat.service.ICourseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInfoServiceImpl extends ServiceImpl<CourseInfoMapper,CourseInfo> implements ICourseInfoService {
    @Autowired(required = false)
    CourseInfoMapper courseInfoMapper;
    @Override
    public List<CourseInfo> findAll() {
        List<CourseInfo> courseInfos = courseInfoMapper.findAll();
        return courseInfos;
    }

    @Override
    public List<CourseInfo> findAllByCourseCode(String courseCode) {
        return courseInfoMapper.findAllByCourseCode(courseCode);
    }


}
