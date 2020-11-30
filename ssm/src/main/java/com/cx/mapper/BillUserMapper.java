package com.cx.mapper;

import com.cx.pojo.BillUser;
import com.cx.pojo.BillUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillUserMapper {
    int countByExample(BillUserExample example);

    int deleteByExample(BillUserExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillUser record);

    int insertSelective(BillUser record);

    List<BillUser> selectByExample(BillUserExample example);

    BillUser selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillUser record, @Param("example") BillUserExample example);

    int updateByExample(@Param("record") BillUser record, @Param("example") BillUserExample example);

    int updateByPrimaryKeySelective(BillUser record);

    int updateByPrimaryKey(BillUser record);
}