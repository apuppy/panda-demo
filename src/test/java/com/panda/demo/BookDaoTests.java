package com.panda.demo;

import com.panda.demo.dao.BookDao;
import com.panda.demo.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTests {

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
        // System.out.println(bookDao);
    }

    @Test
    void testGetBy() {
        // System.out.println(bookDao);
    }
}
