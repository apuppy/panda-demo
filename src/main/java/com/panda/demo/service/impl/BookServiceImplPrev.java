package com.panda.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.panda.demo.dao.BookDao;
import com.panda.demo.domain.Book;
import com.panda.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplPrev implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        System.out.println(">>> save book === \n ");
        return bookDao.insert(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize) {
        IPage<Book> page = new Page<>(currentPage, pageSize);
        return bookDao.selectPage(page, null);
    }
}
