package com.panda.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author: lihongde
 * @date: 2022/11/21 10:43
 **/
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/jsonString", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String jsonString() {
        return "{'foo':'bar'}";
    }

    @RequestMapping(value = "/503", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> status503() {
        log.info("503 test request received");
        return new ResponseEntity<>("Service Unavailable", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
