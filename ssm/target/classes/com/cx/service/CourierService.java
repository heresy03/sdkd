package com.cx.service;

/**
 * 温家饶
 */

import com.cx.pojo.Courier;

public interface CourierService {
   Courier select(Courier courier);
    Courier selectByName(Courier courier);
}
