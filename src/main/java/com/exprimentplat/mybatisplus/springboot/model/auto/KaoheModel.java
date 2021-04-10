package com.exprimentplat.mybatisplus.springboot.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "t_kaohemodel")
public class KaoheModel extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "t_kaohemodel")
    @TableGenerator(name = "t_kaohemodel", initialValue = 0, allocationSize = 1, table = "seq_table")
    private int id;
    //模块id
    @Column(nullable = false)
    private int mId;
    //考核模块序号
    @Column(nullable = false)
    private int mOrder;
    //总成绩中该模块的分值权重
    @Column(nullable = false)
    private float mScale;
    //模块测试占比
    @Column(nullable = false)
    private float mTestBaifenbi;
    //模块报告占比
    @Column(nullable = false)
    private float mReportBaifenbi;

    @Column(nullable = false)
    private float testBaifenbi;

    @Column(nullable = false)
    private float kaoheBaifenbi;

    @Column(nullable = false)
    private int arrangeId;

    @Column(name = "kaohe_starttime",nullable = true)
    private Date kaoheStarttime;

    @Column(name = "kaohe_endtime",nullable = true)
    private Date kaoheEndtime;
}
