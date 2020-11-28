package com.sdkd.service.impl;

import com.sdkd.mapper.AdminMapper;
import com.sdkd.mapper.CourierMapper;
import com.sdkd.pojo.Courier;
import com.sdkd.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CourierImpl implements CourierService {

    @Autowired
    AdminMapper adminMapper;

    public Courier select(Courier courier) {
       return null;
    }


    public Courier selectByName(Courier courier) {
        return null;
    }
}
