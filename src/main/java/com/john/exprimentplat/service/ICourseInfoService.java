package com.john.exprimentplat.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.john.exprimentplat.model.auto.CourseInfo;

import java.util.List;

public interface ICourseInfoService extends IService<CourseInfo> {
    List<CourseInfo> findAll();
    List<CourseInfo> findAllByCourseCode(String courseCode);

}
