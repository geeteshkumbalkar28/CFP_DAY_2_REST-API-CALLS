package com.bl.SpringHello.controller;

import com.bl.SpringHello.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class demoController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }
    @RequestMapping(value="/hello/query",method = RequestMethod.GET)
    public String message1(@RequestParam String name){
        return name;
    }
    @RequestMapping(value="/hello/param/{name}",method = RequestMethod.GET)
    public String message2(@PathVariable String name){
        return name;
    }

}

