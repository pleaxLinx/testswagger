package org.kgc.testswagger.controller;

import io.swagger.annotations.Api;
import org.kgc.testswagger.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(description = "UserContro" +
        "ller类")
public class SwaggerController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
    @PostMapping("/user")
    public User getUser(){
        return new User();
    }
    @GetMapping("/xpl")
    public String getXpl(){
        return "Xpl;";
    }

}
