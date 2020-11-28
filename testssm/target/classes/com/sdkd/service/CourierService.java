package com.sdkd.service;

import com.sdkd.pojo.Courier;

import java.util.List;

public interface CourierService {
   Courier select(Courier courier);
    Courier selectByName(Courier courier);
}
