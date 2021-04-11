package com.john.exprimentplat.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
//开起chain=true后可以使用链式的set
//User user=new User().setAge(31).setName("pollyduan");//返回对象
@Entity
@Table(name = "t_setinfo")
public class SetInfo extends Model {
    @Id //自动获取id
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "setinfo_id")
//    @TableGenerator(name = "setinfo_id", initialValue = 0, allocationSize = 1, table = "seq_table")
    private int id;
    @Column(columnDefinition = "text")
    private String setPlatintro;
    @Column(columnDefinition = "text")
    private String setAboutus;
    @Column(columnDefinition = "text")
    private String setPlatstep;
    @Column(columnDefinition = "varchar")
    private String setRotateimg;

}
