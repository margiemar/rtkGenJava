package com.march.rtk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class BackgroundController {

    @GetMapping("rate_frs")
    public String rate_frs(){
        return "RateFRS";
    }

    @GetMapping("/aso")
    public String aso(){
        return "catalog_aso";
    }
}
