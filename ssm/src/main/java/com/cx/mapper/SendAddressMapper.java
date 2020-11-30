package com.cx.mapper;

import com.cx.pojo.SendAddress;
import com.cx.pojo.SendAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SendAddressMapper {
    int countByExample(SendAddressExample example);

    int deleteByExample(SendAddressExample example);

    int deleteByPrimaryKey(Integer sendId);

    int insert(SendAddress record);

    int insertSelective(SendAddress record);

    List<SendAddress> selectByExample(SendAddressExample example);

    SendAddress selectByPrimaryKey(Integer sendId);

    int updateByExampleSelective(@Param("record") SendAddress record, @Param("example") SendAddressExample example);

    int updateByExample(@Param("record") SendAddress record, @Param("example") SendAddressExample example);

    int updateByPrimaryKeySelective(SendAddress record);

    int updateByPrimaryKey(SendAddress record);
}