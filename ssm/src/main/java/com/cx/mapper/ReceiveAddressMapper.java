package com.cx.mapper;

import com.cx.pojo.ReceiveAddress;
import com.cx.pojo.ReceiveAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReceiveAddressMapper {
    int countByExample(ReceiveAddressExample example);

    int deleteByExample(ReceiveAddressExample example);

    int deleteByPrimaryKey(Integer rcvId);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    List<ReceiveAddress> selectByExample(ReceiveAddressExample example);

    ReceiveAddress selectByPrimaryKey(Integer rcvId);

    int updateByExampleSelective(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByExample(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
}