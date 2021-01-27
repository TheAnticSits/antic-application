package org.launchcode.anticapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//@RequestMapping("hello")
public class HelloController {
/*
    //handles requests at /hello
    //static response
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello Antic";
    }*/

    //handles requests at /hello/goodbye
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye Antic";
    }

    //Dynamic Response
    //Handles request of the form /hello?name=Launchcode
    //lives at http://localhost:8080/hello?name=Antic

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

/*    //lives at /hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }*/

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

}
