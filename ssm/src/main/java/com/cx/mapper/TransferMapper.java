package com.cx.mapper;

import com.cx.pojo.Transfer;
import com.cx.pojo.TransferExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransferMapper {
    int countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExample(TransferExample example);

    Transfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
}