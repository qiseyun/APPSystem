package com.qise.service.impl;

import com.qise.dao.AppInfoMapper;
import com.qise.domain.AppInfo;
import com.qise.entaty.QueryPageBean;
import com.qise.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author jql
 * @date 2020/5/2 - 16:09
 */
@Service
@Transactional
public class AppInfoServiceImpl implements AppInfoService{

    @Autowired
    private AppInfoMapper appInfoMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<AppInfo> findAll() {
        return appInfoMapper.findAll();
    }

    @Override
    public List<AppInfo> findByName(String softwareName) {
        return appInfoMapper.findByName(softwareName);
    }

    /**
     * 查询所有软件详细信息
     * @param queryPageBean
     * @return
     */
    @Override
    public List<AppInfo> findAppInfo(QueryPageBean queryPageBean) {

        return null;
    }

    /**
     * 查询所有软件基本信息
     * @return
     */
    @Override
    public List<AppInfo> findAlltwo() {
        return appInfoMapper.findAlltwo();
    }

    /**
     * 添加软件
     * @param map
     */
    @Override
    public void addAppInfo(Map map) {

    }
}
