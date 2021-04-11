package com.john.exprimentplat.model.auto;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = false)
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_student")
public class Student extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "student_id")
    @TableGenerator(name = "student_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    @Column(name = "id")
    private int id;
    //登陆账号
    @Column(name = "stu_uname")
    private String stuUname;
    //密码
    @Column(name = "stu_password")
    private String stuPassword;
    //学生姓名昵称
    @Column(name = "stu_name")
    private String stuName;
    //学号
    @Column(name = "stu_xuehao")
    private String stuXuehao;
    //手机
    @Column(name = "stu_mobile")
    private String stuMobile;
    //账号状态
    @Column(name = "stu_checkstate")
    private boolean stuCheckstate;
    //是否本校
    @Column(name = "stu_isinschool")
    private boolean stuIsinschool;
    //所属班级id
    @Column(name = "class_id",columnDefinition = "int default 0")
    private int classId;
}
