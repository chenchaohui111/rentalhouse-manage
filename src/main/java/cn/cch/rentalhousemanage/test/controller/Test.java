package cn.cch.rentalhousemanage.test.controller;

import cn.cch.rentalhousemanage.test.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping("/hello")
    public Result hello() {
        Result result = new Result();
        result.success("Hello SpringBoot");
        return result;
    }

    @RequestMapping("/hhh")
    public String hhh(){
        return "hhh";
    }

}



