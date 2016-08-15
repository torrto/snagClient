package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rhy704 on 8/15/16.
 */
@Controller
@RequestMapping("/")
public class ApplicationFormController {

    @RequestMapping()
    public String getApplicationForm() {
        return "application";
    }

}
