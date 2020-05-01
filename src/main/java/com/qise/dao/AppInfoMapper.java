package com.qise.dao;

import com.qise.domain.AppInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author jql
 * @date 2020/4/25 - 10:15
 */
@Repository
public interface AppInfoMapper {

    /**
     * 软件名称的模糊查询
     * @return
     */
    @Select("")
    public void find();
}
