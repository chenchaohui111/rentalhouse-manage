package cn.cch.rentalhousemanage.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Test1 {

    @RequestMapping("/name")
    public String name(){
        return "cch";
    }

    @RequestMapping("/age")
    public String age(){
        return "22";
    }

}
