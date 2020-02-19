package com.wang.portal.controller.admin;

import com.wang.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public void test(){
        int count = testService.count();
        System.out.println(count);
    }

}
