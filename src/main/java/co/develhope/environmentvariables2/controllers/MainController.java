package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class MainController {
    @Value("${server.port}")
    int localPort;
    @RequestMapping
    public String getWelcome(){
        if(localPort == 5000){return "hello from prod";
        } else if(localPort == 4000){return "hello from test";
        } else return  "welcome";}
}
