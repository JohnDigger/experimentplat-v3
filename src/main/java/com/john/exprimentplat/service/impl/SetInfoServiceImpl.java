package com.john.exprimentplat.service.impl;


import com.john.exprimentplat.mapper.auto.SetInfoMapper;
import com.john.exprimentplat.model.auto.SetInfo;
import com.john.exprimentplat.service.ISetInfoService;
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
