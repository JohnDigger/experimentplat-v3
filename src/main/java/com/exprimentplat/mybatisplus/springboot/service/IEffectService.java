package com.exprimentplat.mybatisplus.springboot.service;


import com.exprimentplat.mybatisplus.springboot.model.auto.Effect;

import java.util.Map;

public interface IEffectService {
    Effect findById(Map param);
}
