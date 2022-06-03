package com.panda.demo.domain;

import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String published_time;
}
