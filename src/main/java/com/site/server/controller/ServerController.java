package com.site.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/site")
public class ServerController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getName(){
     return "Hello";
    }
}
