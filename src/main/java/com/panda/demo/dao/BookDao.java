package com.panda.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.panda.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}