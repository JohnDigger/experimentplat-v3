package com.john.exprimentplat.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.john.exprimentplat.api.CommonResult;
import com.john.exprimentplat.model.auto.CourseInfo;
import com.john.exprimentplat.model.auto.EasyPOI.CourseAndModelImport;
import com.john.exprimentplat.model.auto.ExpModel;
import com.john.exprimentplat.service.ICourseInfoService;
import com.john.exprimentplat.service.IExpModelService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/expmodel")
@Api(tags = "ExpmodelController",description = "实验模块")
public class ExpmodelController {
    protected static final Logger logger = LoggerFactory.getLogger(ExpmodelController.class);
    @Autowired
    ICourseInfoService iCourseInfoService;
    @Autowired
    IExpModelService iexpModelService;
    /**
     * Excel导入题目
     *
     *
     * @param multipartFile
     * @return
     * @throws Exception
     */
    @PostMapping("/ExcelInputExpModel")
    public CommonResult<String> upload(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        logger.debug("开始导入-----");
        //easyPOI工具
        ImportParams params = new ImportParams();
        //设置Excel中表头占用行数1
        params.setHeadRows(1);
        //设置Excel中大标题占用行数,此模板未使用标题
        // params.setTitleRows(0);
        //获得Excel中的所有数据,存放在列表
        List<CourseAndModelImport> result = ExcelImportUtil.importExcel(multipartFile.getInputStream(),
                CourseAndModelImport.class, params);
        //遍历行


        for (CourseAndModelImport oneQ : result) {

            List<CourseInfo> courseList = iCourseInfoService.findAllByCourseCode(oneQ.getCourseCode());

            int courseId = 0;
            if (courseList.size() > 0) {
                logger.debug("此课程已经存在");
                courseId = courseList.get(0).getId();
            } else {
                logger.debug("新建课程");
                CourseInfo courseInfo = new CourseInfo();
                courseInfo.setCourseName(oneQ.getCourseName());
                courseInfo.setCourseCode(oneQ.getCourseCode());
                courseInfo.setCourseIntruduce("由Excel导入,尚未填写介绍");
                courseInfo.setTeacherId(0);
                iCourseInfoService.update();
                courseId = courseInfo.getId();
            }
            ExpModel expModel = new ExpModel();
            expModel.setCourseId(courseId);
            expModel.setMName(oneQ.getMName());
            expModel.setMManager(oneQ.getMManager());
            expModel.setMType(oneQ.getMType());
            expModel.setClasshour(Integer.parseInt(oneQ.getClassHour()));
            expModel.setIntroduce(oneQ.getIntroduce());
            expModel.setPurpose(oneQ.getPurpose());
            expModel.setPrinciple(oneQ.getPrinciple());
            expModel.setMContent(oneQ.getMContent());
            expModel.setMEdataIntro(oneQ.getMDataIntro());
            expModel.setMStep(oneQ.getMType());
            expModel.setMInurl(oneQ.getMInurl());
            expModel.setImageurl("none");
            expModel.setNeedKaohe(false);
            expModel.setReportType(true);
            //保存到数据库
            iexpModelService.update();
        }
        logger.debug("导入成功-------" + result);
        return CommonResult.success("redirect:/expmodel/list");
    }
}
