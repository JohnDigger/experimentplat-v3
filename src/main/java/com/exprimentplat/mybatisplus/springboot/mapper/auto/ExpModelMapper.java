package com.exprimentplat.mybatisplus.springboot.mapper.auto;



import com.exprimentplat.mybatisplus.springboot.model.auto.ExpModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Component(value = "expModelMapper")
@Mapper
public interface ExpModelMapper {
    List<ExpModel> findAllexp(Map params);
    Integer count();
}
