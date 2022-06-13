package com.panda.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    String home() {
        log.info("welcome to homepage");
        return "Hello World!";
    }

    @GetMapping("/ping")
    String webTest() {
        return "pong...";
    }
}
