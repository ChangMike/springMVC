package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = {"/hello"}, method = {RequestMethod.GET})
    public String index(Model model) {
        model.addAttribute("msg", "Hello World,2020!");
        return "myhello.jsp";
    }
}
