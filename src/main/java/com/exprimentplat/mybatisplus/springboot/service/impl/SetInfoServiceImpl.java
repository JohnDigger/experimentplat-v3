package com.exprimentplat.mybatisplus.springboot.service.impl;


import com.exprimentplat.mybatisplus.springboot.mapper.auto.SetInfoMapper;
import com.exprimentplat.mybatisplus.springboot.model.auto.SetInfo;
import com.exprimentplat.mybatisplus.springboot.service.ISetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SetInfoServiceImpl implements ISetInfoService {
    @Autowired(required = false)
    SetInfoMapper setInfoMapper;
//    @Override
//    public void add(SetInfo setInfo) {
//
//    }

    @Override
    public SetInfo findById(Map param) {
        SetInfo setInfo = setInfoMapper.findById(param);
        return setInfo;
    }
}
