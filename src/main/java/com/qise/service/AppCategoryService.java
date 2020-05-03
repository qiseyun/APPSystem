package com.qise.service;

import com.qise.domain.AppCategory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jql
 * @date 2020/5/3 - 12:53
 */
public interface AppCategoryService {

    /**
     * @Description: 根据父类的id获取类别信息
     * @param: [parentId]
     * @return: java.util.List<com.qise.domain.AppCattegory>
     * @Date: 2019/07/19 16:56
     */
    List<AppCategory> getAppCategoryListByParentId(Integer parentId) throws Exception;

    List<String> findCategoryLevel1();

    List<String> findCategoryLevel2(String categoryLevel1);

    List<String> findCategoryLevel3(String categoryLevel2);

}
