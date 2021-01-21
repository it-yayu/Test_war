package com.javaboy.test_war.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yayu
 * @title: TestController
 * @description: TODO
 * @date 2021/1/21 10:04
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/war")
    public String test() {
        return "Hello war";
    }
}
