package com.exprimentplat.mybatisplus.springboot.model.auto;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@Table(name = "t_teacher")
public class Teacher extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "teacher_id")
    @TableGenerator(name = "teacher_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private String personName;
    private String imageUrl;
    private String intro;
    private int courseId;

}
