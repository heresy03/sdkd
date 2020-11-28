package com.cx.controller;


import com.cx.pojo.Courier;
import com.cx.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// 遇到向数据模型中添加数据的类型为EmployeeDetail类型时，则会将这个数据也想session中保存一次
//@SessionAttributes(types={EmployeeDetail.class})
@RequestMapping("/01")
public class CourierController {
    @Autowired
    CourierService courierService;

    @RequestMapping("/02")
    public String req01(Model model, Courier courier){
        System.out.println(courier);
        Courier courier1 =  courierService.selectByName(courier);
        return "/test";
    }
}
