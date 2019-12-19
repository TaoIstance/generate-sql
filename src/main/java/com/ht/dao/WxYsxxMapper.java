package com.ht.dao;

import com.ht.model.WxYsxx;
import java.math.BigDecimal;

public interface WxYsxxMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(WxYsxx record);

    int insertSelective(WxYsxx record);

    WxYsxx selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(WxYsxx record);

    int updateByPrimaryKey(WxYsxx record);
}