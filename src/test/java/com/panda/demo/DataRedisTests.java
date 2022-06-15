package com.panda.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class DataRedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void valueSet() {
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("a", "A");
    }

    @Test
    void valueGet() {
        ValueOperations ops = redisTemplate.opsForValue();
        Object va = ops.get("a");
        System.out.println(va);
    }

    @Test
    void hashSet() {
        HashOperations ops = redisTemplate.opsForHash();
        ops.put("b", "first", "FIRST");
    }

    @Test
    void hashGet() {
        HashOperations ops = redisTemplate.opsForHash();
        Object hashVal = ops.get("b", "first");
        System.out.println(hashVal);
    }

}
