package com.panda.demo.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.panda.demo.domain.Book;
import com.panda.demo.service.IBookService;
import com.panda.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        return new R(true, bookService.list(qw));
    }

    @PostMapping
    public R save(@RequestBody Book book) throws Exception {
        if (book.getName().equals("warn")) {
            throw new Exception("warning");
        }
        Boolean flag = bookService.save(book);
        return new R(flag, flag ? "添加成功" : "添加失败");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.delete(id));
    }

    @GetMapping("/{id}")
    public R getBook(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, Book book) {
        System.out.println("currentPage = " + currentPage + ", pageSize = " + pageSize + ", book = " + book);
        return new R(true, bookService.getPage(currentPage, pageSize, book));
    }

}
