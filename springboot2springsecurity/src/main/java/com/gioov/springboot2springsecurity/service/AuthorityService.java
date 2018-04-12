package com.gioov.springboot2springsecurity.service;

import com.gioov.springboot2springsecurity.mapper.entity.AuthorityEntity;

import java.util.List;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018/4/7 20:04
 */
public interface AuthorityService {

    List<AuthorityEntity> listByRoleId(Long roleId);

}
