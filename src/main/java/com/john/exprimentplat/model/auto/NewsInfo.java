package com.john.exprimentplat.model.auto;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
//开起chain=true后可以使用链式的set
//User user=new User().setAge(31).setName("pollyduan");//返回对象
@Entity
@Table(name = "t_newsinfo")
public class NewsInfo extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "newsinfo_id")
    @TableGenerator(name = "newsinfo_id",initialValue = 0,allocationSize = 1,table = "seq_table")
    private int id;

    private String newsName;

    private String newsPerson;
    @Column(columnDefinition = "text")
    private String content;

    private int dicNum;

    private Date dicDatetime;

}
