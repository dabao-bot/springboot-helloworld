package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :小吴
 * @description ：
 * @create :2021-04-09 09:32:00
 */
@RestController
public class helloworld {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello World !");
        return "Hello World !";
    }
}
