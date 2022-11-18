package com.example.yatra;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class holiday {
    @GetMapping("/myholiday")
    public String getData(){
        return "Please book your hhhh holiday ticket, Choose Your Fav Airlines Idigo";
    }
}
