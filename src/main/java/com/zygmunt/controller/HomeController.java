package com.zygmunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Place description here.
 *
 * @author Y08L@nykredit.dk
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){

        return "test";
    }

}
