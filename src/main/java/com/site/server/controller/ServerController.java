package com.site.server.controller;

import com.site.server.entity.Server;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/site")
public class ServerController {


    @RequestMapping(value = "/get", method = RequestMethod.GET)

    @ResponseBody
    public Server getName(ModelMap model){
     return createMockServer();
    }

    private Server createMockServer() {
        Server server = new Server();
        server.setId(1);
        server.setDate(new Date());
        server.setTitle("Первый Title");
        return server;
    }
}
