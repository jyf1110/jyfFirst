package com.waysoft.work.service.impl;

import com.waysoft.work.mapper.OrderMapper;
import com.waysoft.work.pojo.Order;
import com.waysoft.work.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public void insert(Order object) {

    }

    @Override
    public void update(Order object) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Order findById(Integer id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }

//    @Override
//    public List<Order> findAll() {
//        return orderMapper.findAll();
//    }
}
