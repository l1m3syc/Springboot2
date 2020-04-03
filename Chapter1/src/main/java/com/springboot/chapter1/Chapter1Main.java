package com.springboot.chapter1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
//启用Spring boot 自动装配
@EnableAutoConfiguration

public class Chapter1Main {
    @RequestMapping("/test*")
    @ResponseBody
    public Map<String, String> test(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key","value");
        return map;
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Chapter1Main.class, args);
    }
}
