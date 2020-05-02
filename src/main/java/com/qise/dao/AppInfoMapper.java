package com.qise.dao;

import com.qise.domain.AppInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jql
 * @date 2020/5/2 - 16:07
 */
public interface AppInfoMapper {

    @Select("select softwareName, APKName,softwareSize,flatformId, \n" +
            "categoryLevel1,categoryLevel2,categoryLevel3, \n" +
            "STATUS,downloads,versionId \n" +
            "from app_info;")
    public List<AppInfo> findAll();

    @Select("select * from app_info where softwareName like '%${value}%' ")
    public List<AppInfo> findByName(String softwareName);

}
