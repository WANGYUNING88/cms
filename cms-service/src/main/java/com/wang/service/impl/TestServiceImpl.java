package com.wang.service.impl;

import com.wang.dao.mapper.TestMapper;
import com.wang.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    public int count() {
        return testMapper.count();
    }
}
