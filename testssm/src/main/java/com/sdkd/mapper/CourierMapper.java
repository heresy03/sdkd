package com.sdkd.mapper;

import org.apache.ibatis.annotations.Mapper;


import com.sdkd.pojo.Courier;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;


import java.util.List;

public interface CourierMapper  {

    public Courier select(Courier courier);



}
