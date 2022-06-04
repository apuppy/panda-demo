package com.panda.demo.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.panda.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setAuthor("Christoper");
        book.setName("How google works");
        book.setPublished_time("2022-06-03 15:00:03");
        System.out.println(bookDao.insert(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(5);
        book.setAuthor("Tim Steve");
        book.setName("How google works");
        book.setPublished_time("2022-06-03 15:00:03");
        System.out.println(bookDao.updateById(book));
    }

    @Test
    void testDelete() {
        System.out.println(bookDao.deleteById(4));
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testPage() {
        IPage<Book> page = new Page<>(2, 3);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetByCondition() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("author", "wu");
        bookDao.selectList(qw);
    }

    @Test
    void testGetByConditionPro() {
        String name = "west";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name.isEmpty() == false, Book::getName, name);
        bookDao.selectList(lqw);
    }
}
