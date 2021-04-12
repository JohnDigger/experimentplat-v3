package com.john.exprimentplat.controller;


import com.john.exprimentplat.api.CommonResult;
import com.john.exprimentplat.mapper.auto.*;
import com.john.exprimentplat.model.auto.*;
import com.john.exprimentplat.service.ICourseInfoService;
import com.john.exprimentplat.service.IEffectService;
import com.john.exprimentplat.service.impl.NewsInfoServiceImpl;
import com.john.exprimentplat.service.impl.SetInfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RestController
@RequestMapping(value = "/newsinfo")
@Api(tags = "NewsInfoController", description = "首页内容管理")
public class NewsInfoController {
    protected static final Logger logger = LoggerFactory.getLogger(NewsInfoController.class);
    @Autowired(required = false)
    NewsInfoMapper newsInfoMapper;
    @Autowired(required = false)
    ExpModelMapper expModelMapper;
    @Autowired
    SetInfoServiceImpl setInfoService;
    @Autowired
    IEffectService effectService;
    @Autowired
    private ICourseInfoService courseInfoService;
    @Autowired(required = false)
    private KaoheModelMapper kaoheModelMapper;
    @Autowired(required = false)
    private StudentMapper studentMapper;
    @Autowired(required = false)
    private TeacherMapper teacherMapper;
    @Autowired
    NewsInfoServiceImpl newsInfoService;

    @Value("${web.count-path}")
    private String count;
    @ApiOperation("首页内容的api")
    @GetMapping(value = "/newslist")
    @ResponseBody
    public CommonResult<Map<String,Object>> newslist(@RequestParam(defaultValue = "0",required = true,value = "pageNum")Integer pageNum){
        Map<String,Integer> map = new HashMap<>();
        map.put("pageNum",pageNum);
        //查询所有公告信息
        List<NewsInfo> newsInfos = newsInfoMapper.findAllorderby(map);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("announcement",newsInfos);
        //查询所有实验列表
        List<ExpModel> expModels = expModelMapper.findAllexp(map);
        map1.put("experimentList",expModels);
        //轮播展示
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("id",1);
        SetInfo setInfo = setInfoService.findById(map2);
        map1.put("setInfo",setInfo);
        log.debug(String.valueOf(setInfo));
        String ids = setInfo.getSetRotateimg();

        //数据库中存储为拼接（例：1,2,3,4），拆分后，查询图片存储路径并存入model
        String[] sid = ids.split(",");

        log.debug("轮播数量:" + sid.length);
        //拼接轮播图，并加到前端页面去
        List<Effect> effects = new ArrayList<>();
        Map<String,Integer> map3 = new HashMap<>();
        for (int i = 0; i < sid.length; i++) {
            try {
                map3.put("id",Integer.parseInt(sid[i]));
                Effect effect = effectService.findById(map3);
                if (effect != null){
                    effects.add(effect);
                }
            } catch (Exception e) {


            }
        }
        log.debug(">>"+effects);
        map1.put("effects",effects);


        //课程展示
        List<CourseInfo> courseInfos = courseInfoService.findAll();
        map1.put("courseInfo",courseInfos);
        //平台统计
        //查询实验模块总数
        int modenum = (int) expModelMapper.count();
        //查询考核模块数量
        int kaohenum = (int) kaoheModelMapper.count();
        //查询平台总用户数
        int studentnum = (int) studentMapper.count();
        int teachernum = (int) teacherMapper.count();
        //校外人数
        int xiaowainum = (int) studentMapper.xiaowainum();
        //查询参与考核人数
        int studentmodel = (int)newsInfoService.findAllmodelpeople();
        //查询通过考核人数
        int passpeople = newsInfoService.findAllPass();
        //实验成绩统计
        //往期参与考核的全部学生
        int allpasspeople = (int)newsInfoService.findAllpasspeople();
        //往期参与考核的优秀学生（85分以上）
        int excellent = newsInfoService.findExcellentpeople();
        //往期参与考核的中等学生（60分-85分）
        int qualified = newsInfoService.findQualifiedpeople();
        //往期参与考核的学生（60分以下）
        int unqualified = newsInfoService.findUnqualifiedpeople();
        map1.put("modenum",modenum);
        map1.put("kaohenum",kaohenum);
        map1.put("xiaowainum",xiaowainum);
        map1.put("usernum",studentnum+teachernum);
        map1.put("studentmodel",studentmodel);
        map1.put("passpeople",passpeople);
        map1.put("allpasspeople",allpasspeople);
        map1.put("excellentstu",excellent);
        map1.put("qualifiedstu",qualified);
        map1.put("unqualifiedstu",unqualified);
        //访问量
        // 获取访问量信息
        String txtFilePath = count;
        Long count = Get_Visit_Count(txtFilePath);
        return CommonResult.success(map1);
    }



    public static Long Get_Visit_Count(String txtFilePath) {
        try {
            File file = new File(txtFilePath);
            if (!file.exists()) {
                file.createNewFile();
                //写入相应的文件
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txtFilePath), "UTF-8"));
                Long count = Long.valueOf("0");
                out.write(String.valueOf(count));
                //清楚缓存
                out.flush();
                //关闭流
                out.close();
            }
            //读取文件(字符流)
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(txtFilePath), "UTF-8"));
            //循环读取数据
            String str = null;
            StringBuffer content = new StringBuffer();
            while ((str = in.readLine()) != null) {
                content.append(str);
            }
            //关闭流
            in.close();
            //logger.debug(content);
            // 解析获取的数据
            Long count = Long.valueOf(content.toString());
            count++; // 访问量加1
            //写入相应的文件
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(txtFilePath), "UTF-8"));
            out.write(String.valueOf(count));
            //清楚缓存
            out.flush();
            //关闭流
            out.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

}
