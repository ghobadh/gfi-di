package ca.gforcesoftware.gfidi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Gavin! Say Hello is run.";
    }
}
