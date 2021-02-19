package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ITestDao testDao;

    @Autowired
    private ITestDao1 testDao1;

    @RequestMapping("/test1")
    public List<Map<String,String>> test1(){
        return testDao.getAll();
    }

    @RequestMapping("/test2")
    public List<Map<String,String>> test2(){
        return testDao1.getAll1();
    }
}
