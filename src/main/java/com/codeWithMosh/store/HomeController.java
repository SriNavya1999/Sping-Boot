package com.codeWithMosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.page-size}")
    private String pageSize;

    @RequestMapping("/")
    public String index(){
        System.out.println("appName :" + appName);
        System.out.println("pageSize :" + pageSize);
        return "index.html";
    }
}
