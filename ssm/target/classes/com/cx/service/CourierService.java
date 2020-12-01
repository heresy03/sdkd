package com.cx.service;

import com.cx.pojo.Courier;

/**
 * 温家饶
 */

public interface CourierService {
   Courier select(Courier courier);
    Courier selectByName(Courier courier);
    int addCourier(Courier courier);
}
