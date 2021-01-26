package org.launchcode.anticapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/LaunchCode

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
