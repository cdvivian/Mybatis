package com.cd.mapper;

import com.cd.domain.Order;
import com.cd.domain.User;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface OrderMapper {
    List<Order> findAll();
}
