package com.panda.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.panda.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    BookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setAuthor("Christoper");
        book.setName("How google works");
        book.setPublished_time("2022-06-03 15:00:03");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(5);
        book.setAuthor("Tim Steve");
        book.setName("How google works");
        book.setPublished_time("2022-06-03 15:00:03");
        System.out.println(bookService.update(book));
    }

    @Test
    void testDelete() {
        System.out.println(bookService.delete(4));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testPage() {
        IPage<Book> page = bookService.getPage(2, 3);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

}
