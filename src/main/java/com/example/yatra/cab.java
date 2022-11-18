package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cab {
    @GetMapping("/mycab")
    public String getData(){
        return "Please book your ola uber and taxi";
    }
}
