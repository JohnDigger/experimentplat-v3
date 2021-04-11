package com.john.exprimentplat.mapper.auto;


import com.john.exprimentplat.model.auto.Effect;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component(value = "effectMapper")
@Mapper
public interface EffectMapper {
    Effect findeffectById(Map param);
}
