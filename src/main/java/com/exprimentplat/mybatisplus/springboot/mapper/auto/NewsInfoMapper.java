package com.exprimentplat.mybatisplus.springboot.mapper.auto;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.exprimentplat.mybatisplus.springboot.model.auto.NewsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


//@Component(value = "newsInfoMapper")
@Mapper
public interface NewsInfoMapper extends BaseMapper<NewsInfo> {
    List<NewsInfo> findAllorderby(Map params);
    Integer  findAllmodelpeople();
    Integer  findAllmodelpeople1();
   Integer findAllPass();
   Integer findAllPass1();
    Integer findExcellentpeople();
    Integer findQualifiedpeople();
    Integer findUnqualifiedpeople();
}
