package org.launchcode.anticapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //handles requests at /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello Antic";
    }

    //handles requests at /goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye Antic";
    }
}
