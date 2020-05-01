package com.qise.service.impl;

import com.qise.dao.DevUserMapper;
import com.qise.domain.DevUser;
import com.qise.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author jql
 * @date 2020/4/20 - 15:26
 */
@Service
@Transactional
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserMapper devUserMapper;

//    /**
//     * @param dev_userId
//     * @Description: 查找到DevUser
//     * @param: [devUserId]
//     */
//    @Override
//    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
//    public DevUser findDevUserById(Long dev_userId) {
//        DevUser dev_user = devUserMapper.selectByPrimaryKey(dev_userId);
//        if (dev_user == null) {
//            return null;
//        }
//        return dev_user;
//    }


    /**
     * 开发者登录的方法
     * @param devCode
     * @param devPassword
     * @return 返回user
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)     //注解实现事务配置
    public DevUser login(String devCode, String devPassword) {
        DevUser user=devUserMapper.selectByDevCodeAndPwd(devCode,devPassword);
        if (user==null){
            return null;
        }
        return user;
    }
}
