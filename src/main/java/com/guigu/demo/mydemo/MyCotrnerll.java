package com.guigu.demo.mydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCotrnerll {
    @RequestMapping("user_xsr")
    public String getuser(){

        System.out.println("1");
        return "李四";
    }
}
