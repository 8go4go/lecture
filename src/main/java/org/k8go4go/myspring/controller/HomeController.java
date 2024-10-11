package org.k8go4go.myspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        System.out.println("this is home");
        return "home";
    }
}
