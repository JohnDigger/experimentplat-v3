package com.exprimentplat.mybatisplus.springboot.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "t_exp_model")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ExpModel extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "exp_model_id")
    @TableGenerator(name = "exp_model_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    @Column(name = "m_id")
    //模块id
    private int mId;

    @Column(nullable = false)
    private int courseId;
    //模块名称
    @Column(length = 80,nullable = false)
    private String mName;
    //实验负责人
    @Column(length = 30,nullable = false)
    private String mManager;
    //    //所属课程id
//    private int course_id;
    //实验类型
    @Column(length = 16,nullable = false)
    private String mType;
    //课时
    private int classhour;
    //实验简介图片地址
    @Column(length = 150,nullable = false)
    private String imageurl;
    //实验介绍
    @Column(columnDefinition = "text")
    private String introduce;
    //实验目的
    @Column(length = 900)
    private String purpose;

    @Column(columnDefinition = "text")
    //实验原理
    private String principle;
    //实验内容
    @Column(columnDefinition = "text")
    private String mContent;
    //实验资料介绍
    @Column(columnDefinition = "text")
    private String mEdataIntro;
    //实验资料地址
    @Column(columnDefinition = "text")
    private String mEdataurl;
    //实验步骤
    @Column(columnDefinition = "longtext")
    private String mStep;
    //进入实验平台链接
    @Column(length = 300,nullable = false)
    private String mInurl;
    //是否需要考核
    @Column(nullable = false,columnDefinition = "bit default 0")
    private boolean needKaohe;
    //模块报告类型
    @Column(nullable = false,columnDefinition = "bit default 0")
    private boolean reportType;
}
