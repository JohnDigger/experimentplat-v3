package com.john.exprimentplat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.john.exprimentplat.mapper.auto.ExpModelMapper;
import com.john.exprimentplat.model.auto.ExpModel;
import com.john.exprimentplat.service.IExpModelService;
import org.springframework.stereotype.Service;

@Service
public class ExpModelServiceImpl extends ServiceImpl<ExpModelMapper, ExpModel> implements IExpModelService {

}
