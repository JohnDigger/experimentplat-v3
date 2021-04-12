package com.john.exprimentplat.model.auto;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Data
@Table(name = "t_course_info")
public class CourseInfo{
    @Id //自动获取id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "courseinfo_id")
    @TableGenerator(name = "courseinfo_id", initialValue = 0, allocationSize = 1, table = "seq_table")
    private int id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "teacher_id")
    private int teacherId;

    @Column(name = "course_imgurl")
    private String courseImgurl;

    @Column(name = "course_intruduce")
    private String courseIntruduce;
}
