package com.eazybytes.eazySchool.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eazySchoolController {

    @RequestMapping("/home")
    public String displayHomePage(Model model){
        model.addAttribute("username","Tara");
        return "home_thymeleaf.html";
    }
}