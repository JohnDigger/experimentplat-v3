package com.john.exprimentplat.model.auto;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_effect")
@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = true)
public class Effect extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "effect_id")
    @TableGenerator(name = "effect_id", initialValue = 0, allocationSize = 1,table = "seq_table")
    private int id;
    private String effectName;
    private String effectImgurl;
    private String effectPerson;
    @Column(columnDefinition = "text")
    private String effectContent;
    private int dicNum;
    private Date dicDatetime;
    private int courseId;
}
