package com.exprimentplat.mybatisplus.springboot.service.impl;


import com.exprimentplat.mybatisplus.springboot.mapper.auto.EffectMapper;
import com.exprimentplat.mybatisplus.springboot.model.auto.Effect;
import com.exprimentplat.mybatisplus.springboot.service.IEffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EffectService implements IEffectService {

    @Autowired
    EffectMapper effectMapper;
    @Override
    public Effect findById(Map param) {
        Effect effect = new Effect();
        effect = effectMapper.findeffectById(param);
        return effect;
    }
}
