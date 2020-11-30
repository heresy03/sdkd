package com.cx.controller;
/**
 * 温家饶
 */

import com.cx.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("01")
public class CourierController {
    @Autowired
    CourierService courierService;

    @RequestMapping("02")
    public String req01(Model model, Courier courier){
        courier.setCourierName("温家饶");
        System.out.println(courier);

        Courier courier1 =  courierService.selectByName(courier);
        System.out.println(courier1);
        return "/test";
    }
}