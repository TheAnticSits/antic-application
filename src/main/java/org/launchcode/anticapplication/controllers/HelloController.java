package org.launchcode.anticapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
/*
    //handles requests at /hello
    //static response
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello Antic";
    }*/

    //handles requests at /goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye Antic";
    }

    //Dynamic Response
    //Handles request of the form /hello?name=Launchcode
    //lives at http://localhost:8080/hello?name=Antic

    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

}
