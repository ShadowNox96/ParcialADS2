package org.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller for the home page.
 */
@Controller
public class GreetingController {
    static final String PATH_HOME = "/";

    static final String VIEW_HOME = "thymeleaf/home";

    @RequestMapping("/bye")
    public String bye(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
            Model model) {
        model.addAttribute("name", name);
        return "bye";
    }
}
