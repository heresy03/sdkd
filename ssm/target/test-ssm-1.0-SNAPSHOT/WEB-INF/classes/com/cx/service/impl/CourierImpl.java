package com.cx.service.impl;


import com.cx.mapper.CourierMapper;
import com.cx.pojo.Courier;
import com.cx.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourierImpl implements CourierService {

    @Autowired
    CourierMapper courierMapper;

    public Courier select(Courier courier) {
       return null;
    }


    public Courier selectByName(Courier courier) {
        return null;
    }
}
