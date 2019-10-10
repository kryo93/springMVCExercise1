package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController
{
    @RequestMapping(value = "/add")

public ModelAndView add(@RequestParam("t1") String a)
{
    ModelAndView mv = new ModelAndView();
//    int c = a+b;
    mv.setViewName("display");
    mv.addObject("result", a);

    return mv;
}
}
