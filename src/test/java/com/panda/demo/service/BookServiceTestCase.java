package com.panda.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.panda.demo.domain.Book;
import com.panda.demo.domain.TestBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
public class BookServiceTestCase {

    @Autowired
    IBookService bookService;

    @Autowired
    TestBook testBook;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setAuthor("Christoper");
        book.setName("How google works");
        book.setPublished_time("2022-06-14 15:00:03");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(5);
        book.setAuthor("Tim Steve");
        book.setName("How google works");
        book.setPublished_time("2022-06-03 15:00:03");
        System.out.println(bookService.updateById(book));
    }

    @Test
    void testDelete() {
        System.out.println(bookService.removeById(4));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testPage() {
        IPage page = new Page<Book>(2, 3);
        bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testDynamicParams() {
        System.out.println("dynamic params: " + testBook);
        Book book = new Book();
        book.setName(testBook.getName().substring(0, 20));
        book.setAuthor(testBook.getAuthor().substring(0, 20));
        bookService.save(book);
    }

}
