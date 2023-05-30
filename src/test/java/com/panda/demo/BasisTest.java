package com.panda.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lihongde
 * @date: 2022/11/21 10:26
 **/
public class BasisTest {

    @Test
    public void mapDefault() {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("apple", 1);
        mapping.put("google", 2);
        System.out.println(mapping.getOrDefault("IBM", 5));;
        System.out.println(mapping.get("microsoft"));;
    }

}
