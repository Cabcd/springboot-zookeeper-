package com.spring.service.impl;

import com.spring.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestSereviceImpl implements TestService{
    @Override
    public String t1() {
        return "123";
    }


}
