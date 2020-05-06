package com.qise.dao;

import com.qise.domain.DataDictionary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author jql
 * @date 2020/4/25 - 10:16
 */
public interface DataDictionaryMapper {

    /**
     * 通过statusId来查软件状态
     * @param map
     * @return
     */
    @Select("select valueName from data_dictionary where typeCode=#{typeCode} and valueId=#{statusId}")
    String findStatusByStatusId(Map map);

    /**
     * 通过flatformId查询所属平台
     * @param map
     */
    @Select("select valueName from data_dictionary where typeCode=#{typeCode} and valueId=#{flatformId}")
    String  findFlatFormByflatformId(Map map);

    /**
     * 通过所属平台字符串去查所属平台的valueId
     * @param map
     */
    @Select("select valueId from data_dictionary where typeCode=#{typeCode} and valueName=#{valueName}")
    Integer findflatformValueIdByflatformName(Map map);

    /**
     * 通过状态字符串去查状态的valueId
     * @param map
     */
    @Select("select valueId from data_dictionary where typeCode=#{typeCode} and valueName=#{valueName}")
    Integer findStatusValueIdByStatusName(Map map);
}
