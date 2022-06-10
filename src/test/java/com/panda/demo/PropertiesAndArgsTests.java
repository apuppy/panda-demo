package com.panda.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

// properties可以为当前测试用例添加临时的属性配置
// @SpringBootTest(properties = {"test.prop=testValueChanged"})
// args也可以起到同样的作用
// @SpringBootTest(args = {"--test.prop=testValueChangedAgain"})
@SpringBootTest(properties = {"test.prop=testValueChanged"}, args = {"--test.prop=testValueChangedAgain"})
public class PropertiesAndArgsTests {

    @Value("${test.prop}")
    private String testProp;

    @Test
    void testProperties() {
        System.out.println(testProp);
    }
}
