package com.cx.mapper;

import com.cx.pojo.CourierWork;
import com.cx.pojo.CourierWorkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourierWorkMapper {
    int countByExample(CourierWorkExample example);

    int deleteByExample(CourierWorkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourierWork record);

    int insertSelective(CourierWork record);

    List<CourierWork> selectByExample(CourierWorkExample example);

    CourierWork selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourierWork record, @Param("example") CourierWorkExample example);

    int updateByExample(@Param("record") CourierWork record, @Param("example") CourierWorkExample example);

    int updateByPrimaryKeySelective(CourierWork record);

    int updateByPrimaryKey(CourierWork record);
}