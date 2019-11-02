package com.waysoft.work.mapper;

import com.waysoft.work.pojo.Order;

import java.util.List;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);

    List<Order> findAll();
}