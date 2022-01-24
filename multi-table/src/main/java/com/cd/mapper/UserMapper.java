package com.cd.mapper;

import com.cd.domain.User;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface UserMapper {
    List<User> findAll();
    List<User> findAllUserAndRole();
}
