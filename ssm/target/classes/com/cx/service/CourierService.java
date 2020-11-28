package com.cx.service;


import com.cx.pojo.Courier;

public interface CourierService {
   Courier select(Courier courier);
    Courier selectByName(Courier courier);
}
