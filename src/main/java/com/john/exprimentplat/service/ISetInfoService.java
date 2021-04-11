package com.john.exprimentplat.service;



import com.john.exprimentplat.model.auto.SetInfo;

import java.util.Map;

public interface ISetInfoService {
//    void add(SetInfo setInfo);

    SetInfo findById(Map param);
}
