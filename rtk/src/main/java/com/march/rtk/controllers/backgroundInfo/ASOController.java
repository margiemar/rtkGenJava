package com.march.rtk.controllers.backgroundInfo;

import com.march.rtk.models.ASO;
import com.march.rtk.services.ASOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aso")
public class ASOController {

    private final ASOService asoService;

    @Autowired
    public ASOController(ASOService asoService) {
        this.asoService = asoService;
    }

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("aso", asoService.findAll());
        return "backgroundInfo/aso/index";
    }

    @GetMapping("/new")
    public String newASO(@ModelAttribute("aso") ASO aso) {
        return "backgroundInfo/catalogASO/new";
    }


    @GetMapping("/test")
    public String test(){
        System.out.println(asoService.testGet());
        return "backgroundInfo/aso/index";
    }
}
