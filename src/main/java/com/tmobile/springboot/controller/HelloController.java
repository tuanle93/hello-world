package com.tmobile.springboot.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = "/{number}")
    public String sum(@PathVariable("number") String number) throws JSONException {
        JSONObject jo = new JSONObject();
        jo.put("sum", Integer.parseInt(number) + 10);
        return "welcome";
    }
}
