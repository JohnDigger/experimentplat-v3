package com.john.exprimentplat.service.impl;


import com.john.exprimentplat.mapper.auto.EffectMapper;
import com.john.exprimentplat.model.auto.Effect;
import com.john.exprimentplat.service.IEffectService;
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
