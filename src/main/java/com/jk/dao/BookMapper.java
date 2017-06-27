package com.jk.dao;

import com.jk.entity.Book;
import java.math.BigDecimal;

public interface BookMapper {
    int deleteByPrimaryKey(BigDecimal bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(BigDecimal bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}