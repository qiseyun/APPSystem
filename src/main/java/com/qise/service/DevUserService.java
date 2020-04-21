package com.qise.service;

import com.qise.domain.DevUser;

import java.util.List;

/**
 * @author jql
 * @date 2020/4/20 - 15:25
 */
public interface DevUserService {

    /**
     * 开发者登录
     * @param devCode
     * @param devPassword
     * @return
     */
    public DevUser login(String devCode, String devPassword) ;


}
