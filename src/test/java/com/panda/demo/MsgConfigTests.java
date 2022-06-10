package com.panda.demo;

import com.panda.demo.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(MsgConfig.class)
public class MsgConfigTests {

    @Autowired
    private String msgConfig;

    @Test
    void testMsgConfiguration() {
        System.out.println(msgConfig);
    }

}
