package com.john.exprimentplat.mapper.auto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Component(value = "kaoheModelMapper")
@Mapper
public interface KaoheModelMapper {
    Integer count();
}
