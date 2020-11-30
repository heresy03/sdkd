package com.cx.mapper;

import com.cx.pojo.Courier;
import com.cx.pojo.CourierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourierMapper {
    int countByExample(CourierExample example);

    int deleteByExample(CourierExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Courier record);

    int insertSelective(Courier record);

    List<Courier> selectByExample(CourierExample example);

    Courier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByExample(@Param("record") Courier record, @Param("example") CourierExample example);

    int updateByPrimaryKeySelective(Courier record);

    int updateByPrimaryKey(Courier record);
}