package com.cx.service.impl;

/**
 * 温家饶
 */

import com.cx.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourierImpl implements CourierService {

    @Autowired
    CourierMapper courierMapper;

    public Courier select(Courier courier) {
        courier.setCourierName("");
       return courierMapper.select(courier);
    }


    public Courier selectByName(Courier courier) {
        return courierMapper.select(courier);
    }
}
