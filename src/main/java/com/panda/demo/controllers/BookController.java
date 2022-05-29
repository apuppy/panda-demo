package com.panda.demo.controllers;

import com.panda.demo.domain.Book;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save..." + book);
        return "{'module':'save'}";
    }

    @GetMapping
    public String getBooks() {
        System.out.println("book list...");
        return "{'module':'list'}";
    }

    @GetMapping("/{id}")
    public String getBook(@PathVariable Integer id) {
        System.out.println("book item..." + id);
        return "{'module':'item'}";
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book update..." + book);
        return "{'module':'put'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("book delete..." + id);
        return "{'module':'delete'}";
    }
}
