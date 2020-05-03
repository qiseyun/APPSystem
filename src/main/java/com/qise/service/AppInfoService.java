package com.qise.service;

import com.qise.domain.AppInfo;
import com.qise.entaty.QueryPageBean;

import java.util.List;
import java.util.Map;

/**
 * @author jql
 * @date 2020/5/2 - 16:08
 */
public interface AppInfoService {

    public List<AppInfo> findAll();

    public List<AppInfo> findByName(String softwareName);

    /**
     * 查询所有软件的信息
     * @param queryPageBean
     * @return
     */
    List<AppInfo> findAppInfo(QueryPageBean queryPageBean);

    List<AppInfo> findAlltwo();

    //新增软件
    void addAppInfo(Map map);

}
