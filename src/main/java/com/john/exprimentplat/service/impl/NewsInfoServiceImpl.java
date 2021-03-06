package com.john.exprimentplat.service.impl;


import com.john.exprimentplat.mapper.auto.NewsInfoMapper;
import com.john.exprimentplat.service.INewsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsInfoServiceImpl implements INewsInfoService {
    @Autowired(required = false)
    NewsInfoMapper newsInfoMapper;
    @Override
    public Integer findAllmodelpeople() {
        return newsInfoMapper.findAllmodelpeople()+newsInfoMapper.findAllmodelpeople1();
    }

    @Override
    public Integer findAllpasspeople() {
        return newsInfoMapper.findAllmodelpeople1();
    }

    @Override
    public Integer findAllPass() {
        return newsInfoMapper.findAllPass()+newsInfoMapper.findAllPass1();
    }

    @Override
    public Integer findExcellentpeople() {
        return newsInfoMapper.findExcellentpeople();
    }

    @Override
    public Integer findQualifiedpeople() {
        return newsInfoMapper.findQualifiedpeople();
    }

    @Override
    public Integer findUnqualifiedpeople() {
        return newsInfoMapper.findUnqualifiedpeople();
    }


}
