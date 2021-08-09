package com.labs.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller

public class GeneralController {
    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/capitalize")
    public String getCapitalize(Model model,@RequestParam String word ){
        model.addAttribute("word",word.toUpperCase());
        return "capitalize.html";
    }
    @GetMapping("/")
    public String getHome(){
        return "home.html";
    }
}

