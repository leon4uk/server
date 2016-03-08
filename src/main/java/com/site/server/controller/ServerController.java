package com.site.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/site")
public class ServerController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)

    @ResponseBody
    public String getName(ModelMap model){
     return "Hello";
    }
}
