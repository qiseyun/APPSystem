package com.qise.service;

import com.qise.domain.AppInfo;
import java.util.List;

/**
 * @author jql
 * @date 2020/5/2 - 16:08
 */
public interface AppInfoService {

    public List<AppInfo> findAll();

    public List<AppInfo> findByName(String softwareName);

}
