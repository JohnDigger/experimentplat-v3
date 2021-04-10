package com.exprimentplat.mybatisplus.springboot.mapper.auto;



import com.exprimentplat.mybatisplus.springboot.model.auto.ExpModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(value = "expModelMapper")
public interface ExpModelMapper {
    List<ExpModel> findAllexp(Map params);
    Integer count();
}
