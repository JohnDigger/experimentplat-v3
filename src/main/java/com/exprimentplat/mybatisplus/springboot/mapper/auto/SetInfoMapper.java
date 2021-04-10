package com.exprimentplat.mybatisplus.springboot.mapper.auto;


import com.exprimentplat.mybatisplus.springboot.model.auto.SetInfo;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component("setInfoMapper")
public interface SetInfoMapper {
    public SetInfo findById(Map param);
//    void add(SetInfo setInfo);

}
