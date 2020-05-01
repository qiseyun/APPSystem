package com.qise.dao;

import com.qise.domain.DevUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author jql
 * @date 2020/4/20 - 15:21
 */
@Repository
public interface DevUserMapper {

    /**
     * 开发者入口
     * 查询所有
     * @return
     */
    @Select("SELECT devCode,devPassword FROM dev_user")
    public DevUser selectByDevCodeAndPwd(String devCode, String devPassword);




}
