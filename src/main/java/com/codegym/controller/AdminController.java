package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/products")
    public ModelAndView getProducts(){
        ModelAndView modelAndView = new ModelAndView("admin/product");
        return modelAndView;
    }

}