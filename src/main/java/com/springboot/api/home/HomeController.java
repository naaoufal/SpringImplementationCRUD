package com.springboot.api.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String getData () {
        return "This is my First Page";
    }

    @GetMapping(value = "/{name}")
    public String getName (@PathVariable String name) {
        return String.format("This is my name : " + name);
    }
}
