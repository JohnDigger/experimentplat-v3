package com.exprimentplat.mybatisplus.springboot.mapper.auto;


import com.exprimentplat.mybatisplus.springboot.model.auto.Effect;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(value = "effectMapper")
public interface EffectMapper {
    Effect findeffectById(Map param);
}
