package com.assesment.reportgenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/download")
    public String home() {
        return "home";
    }
}
