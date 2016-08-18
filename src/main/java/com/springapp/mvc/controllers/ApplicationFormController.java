package com.springapp.mvc.controllers;

import com.springapp.mvc.model.ContentWrapper;
import com.springapp.mvc.model.Questions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rhy704 on 8/15/16.
 */
@Controller
@RequestMapping("/")
public class ApplicationFormController {

    @RequestMapping()
    public String getApplicationForm(Model model) {
        ContentWrapper wrapper = new ContentWrapper();
            wrapper.add(new Questions());
            wrapper.add(new Questions());
            model.addAttribute("wrapper", wrapper);
        return "application";
    }

}
