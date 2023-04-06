package com.bl.SpringHello.controller;

import com.bl.SpringHello.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class demoController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String message(){
        return "Hello from BridgeLabz";
    }


}

