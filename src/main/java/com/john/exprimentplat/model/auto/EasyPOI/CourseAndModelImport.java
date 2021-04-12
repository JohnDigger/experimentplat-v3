package com.john.exprimentplat.model.auto.EasyPOI;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CourseAndModelImport extends Model {

    @Excel(name = "课程名称")
    private String courseName;

    @Excel(name = "课程代码")
    private String courseCode;

    @Excel(name = "实验名称")
    private String mName;

    @Excel(name = "实验负责人姓名")
    private String mManager;

    @Excel(name = "实验类型")
    private String mType;

    @Excel(name = "课时")
    private String classHour;

    @Excel(name = "实验介绍")
    private String introduce;

    @Excel(name = "实验目的")
    private String purpose;

    @Excel(name = "实验原理")
    private String principle;

    @Excel(name = "实验内容")
    private String mContent;

    @Excel(name = "实验资料描述")
    private String mDataIntro;

    @Excel(name = "实验步骤")
    private String mStep;

    @Excel(name = "实验平台链接")
    private String mInurl;
}
