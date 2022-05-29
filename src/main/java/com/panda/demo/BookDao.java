package com.panda.demo;

import com.panda.demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {

    @Select("select * from book where id = #{id}")
    public Book getBook(Integer id);

}