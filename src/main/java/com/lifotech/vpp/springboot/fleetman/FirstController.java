package com.lifotech.vpp.springboot.fleetman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class FirstController {

    @RequestMapping("home.html")
    public ModelAndView firstPage() {
        Date datAndTime = new Date();
        return new ModelAndView("welcome","dateAndTime",datAndTime);
    }
}
