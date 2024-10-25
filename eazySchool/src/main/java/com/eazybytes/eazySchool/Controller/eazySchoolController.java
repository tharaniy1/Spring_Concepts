package com.eazybytes.eazySchool.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eazySchoolController {

    //mapping multiple paths inside controller
    //@RequestMapping(value = {"","/","home"})
    @RequestMapping("home")
    public String displayHomePage(){
        return "home.html";
    }
}
