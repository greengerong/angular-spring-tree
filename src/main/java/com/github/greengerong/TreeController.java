package com.github.greengerong;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TreeController {

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("app")
                .addObject("trees", TreeBuilder.create());
    }
}
