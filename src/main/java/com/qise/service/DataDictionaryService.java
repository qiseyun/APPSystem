package com.qise.service;

import com.qise.domain.DataDictionary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author jql
 * @date 2020/5/3 - 12:59
 */
public interface DataDictionaryService {

    /**
     * @Description: 获取数据字典信息（根据typeCode类型编码）
     * @param: [typeCode]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Dictionary>
     * @Date: 2019/07/19 16:48
     */
    List<DataDictionary> getDataDictionaryList(String typeCode) throws Exception;

    /**
     * 通过statusId来查软件状态
     * @param map
     * @return
     */
    String findStatusByStatusId(Map map);

    /**
     * 通过flatformId查询所属平台
     * @param map
     */
    String  findFlatFormByflatformId(Map map);

    /**
     * 通过所属平台字符串去查所属平台的valueId
     * @param map
     */
    Integer findflatformValueIdByflatformName(Map map);

    /**
     * 通过状态字符串去查状态的valueId
     * @param map
     */
    Integer findStatusValueIdByStatusName(Map map);
}
