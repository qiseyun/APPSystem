package com.qise.service.impl;

import com.qise.dao.AppCategoryMapper;
import com.qise.domain.AppCategory;
import com.qise.service.AppCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jql
 * @date 2020/5/3 - 12:54
 */
@Service
@Transactional
public class AppCategoryServiceImpl implements AppCategoryService {

    @Autowired
    public AppCategoryMapper appCategoryMapper;

    @Override
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId) throws Exception {
        List<AppCategory> categoryList = appCategoryMapper.selectByParentId(parentId);
        if (categoryList == null) {
            return null;
        }
        return categoryList;
    }

    /**
     * 查询所有一级分类
     * @return
     */
    @Override
    public List<String> findCategoryLevel1() {
        return appCategoryMapper.findCategoryLevel1();
    }

    /**
     * 通过一级分类名去查对应二级分类选项的更新操作
     * @param categoryLevel1
     * @return
     */
    @Override
    public List<String> findCategoryLevel2(String categoryLevel1) {
        return appCategoryMapper.findCategoryLevel2(categoryLevel1);
    }

    /**
     * 通过二级分类名去查对应三级分类选项的更新操作
     * @param categoryLevel2
     * @return
     */
    @Override
    public List<String> findCategoryLevel3(String categoryLevel2) {
        return appCategoryMapper.findCategoryLevel3(categoryLevel2);
    }
}
