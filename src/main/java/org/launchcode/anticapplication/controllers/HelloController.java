package org.launchcode.anticapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="helloapplication")
public class HelloController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "helloapplication/hello";
        //have to feed this a name
    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("/hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "helloapplication/hello";
        //must at name to path variable
    }

    @GetMapping("form")
    public String helloForm(){
        return "helloapplication/form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("Jim");
        names.add("Pam");
        names.add("Michael");
        names.add("Dwight");
        names.add("Oscar");
        names.add("Kevin");
        names.add("Stanley");
        names.add("Angela");
        model.addAttribute("names", names);
        return "helloapplication/hello-list";
    }

}
