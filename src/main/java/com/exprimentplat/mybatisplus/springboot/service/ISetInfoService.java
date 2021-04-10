package com.exprimentplat.mybatisplus.springboot.service;



import com.exprimentplat.mybatisplus.springboot.model.auto.SetInfo;

import java.util.Map;

public interface ISetInfoService {
//    void add(SetInfo setInfo);

    SetInfo findById(Map param);
}
