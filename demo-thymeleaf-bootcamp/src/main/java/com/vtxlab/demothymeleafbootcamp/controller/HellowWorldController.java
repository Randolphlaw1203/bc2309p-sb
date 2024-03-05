package com.vtxlab.demothymeleafbootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/api/v1")
public class HellowWorldController {

  @GetMapping(value = "/greeting")
  public String hello(Model model) {
    model.addAttribute("message", "Hello World!");
    return "helloworld";
  }


}


