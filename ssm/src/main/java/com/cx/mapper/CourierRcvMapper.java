package com.cx.mapper;

import com.cx.pojo.CourierRcv;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourierRcvMapper {
    int countByExample(CourierRcvExample example);

    int deleteByExample(CourierRcvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourierRcv record);

    int insertSelective(CourierRcv record);

    List<CourierRcv> selectByExample(CourierRcvExample example);

    CourierRcv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourierRcv record, @Param("example") CourierRcvExample example);

    int updateByExample(@Param("record") CourierRcv record, @Param("example") CourierRcvExample example);

    int updateByPrimaryKeySelective(CourierRcv record);

    int updateByPrimaryKey(CourierRcv record);
}