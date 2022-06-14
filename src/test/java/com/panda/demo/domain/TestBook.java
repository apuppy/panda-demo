package com.panda.demo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "test-case.book")
public class TestBook {
    private String name;
    private String author;
}
