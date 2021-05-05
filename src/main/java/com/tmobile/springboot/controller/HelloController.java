package com.tmobile.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = "/{number}")
    public String sum(@PathVariable("number") Integer number) {
        Integer sum = number + 10;
        return "{" +
                "\"sum\"" + ": " + sum.toString() +
                "}";
    }

    @RequestMapping(path = "/{number1}/{number2}")
    public String sumOfTwoNumber(@PathVariable("number1") Integer number1, @PathVariable("number2") Integer number2) {
        Integer sum = number1 + number2;
        return "{" +
                "\"sum\"" + ": " + sum.toString() +
                "}";
    }
}
