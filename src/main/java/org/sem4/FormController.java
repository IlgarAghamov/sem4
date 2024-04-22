package org.sem4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public ModelAndView submitForm(@RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
