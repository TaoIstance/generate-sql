package com.ht.dao;

import com.ht.model.CareService;

public interface CareServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CareService record);

    int insertSelective(CareService record);

    CareService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CareService record);

    int updateByPrimaryKey(CareService record);
}