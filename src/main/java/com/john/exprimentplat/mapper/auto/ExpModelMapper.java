package com.john.exprimentplat.mapper.auto;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.john.exprimentplat.model.auto.ExpModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Component(value = "expModelMapper")
@Mapper
public interface ExpModelMapper extends BaseMapper<ExpModel> {
    List<ExpModel> findAllexp(Map params);
    Integer count();
}
