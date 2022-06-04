package com.panda.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.panda.demo.domain.Book;

public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean modify(Book book);
    boolean delete(Integer id);
}
