package com.qise.service.impl;

import com.qise.dao.DataDictionaryMapper;
import com.qise.domain.DataDictionary;
import com.qise.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author jql
 * @date 2020/5/3 - 13:00
 */
@Service
@Transactional
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Autowired
    public DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<DataDictionary> getDataDictionaryList(String typeCode) throws Exception {
        List<DataDictionary> dictionaryList =  dataDictionaryMapper.selectByTypeCode(typeCode);
        if (dictionaryList==null){
            return null;
        }
        return dictionaryList;
    }

    @Override
    public String findStatusByStatusId(Map map) {
        return dataDictionaryMapper.findStatusByStatusId(map);
    }

    @Override
    public String findFlatFormByflatformId(Map map) {
        return dataDictionaryMapper.findFlatFormByflatformId(map);
    }

    @Override
    public Integer findflatformValueIdByflatformName(Map map) {
        return dataDictionaryMapper.findflatformValueIdByflatformName(map);
    }

    @Override
    public Integer findStatusValueIdByStatusName(Map map) {
        return dataDictionaryMapper.findStatusValueIdByStatusName(map);
    }
}
