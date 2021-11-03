package com.atguigu.service;

import com.atguigu.pojo.Cart;

/**
 * @author zkd
 * @version 1.0
 */
public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
