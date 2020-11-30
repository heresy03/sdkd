package com.cx.mapper;

import com.cx.pojo.CourierSend;
import com.cx.pojo.CourierSendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourierSendMapper {
    int countByExample(CourierSendExample example);

    int deleteByExample(CourierSendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourierSend record);

    int insertSelective(CourierSend record);

    List<CourierSend> selectByExample(CourierSendExample example);

    CourierSend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourierSend record, @Param("example") CourierSendExample example);

    int updateByExample(@Param("record") CourierSend record, @Param("example") CourierSendExample example);

    int updateByPrimaryKeySelective(CourierSend record);

    int updateByPrimaryKey(CourierSend record);
}