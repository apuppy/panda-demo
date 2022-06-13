package com.panda.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTests {

    @Test
    void testRandomPort() {

    }

    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/ping");
        ResultActions resultActions = mvc.perform(builder);

        StatusResultMatchers statusMatcher = MockMvcResultMatchers.status();
        ResultMatcher ok = statusMatcher.isOk();

        resultActions.andExpect(ok);
    }

    @Test
    void testResponseBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/ping");
        ResultActions resultActions = mvc.perform(builder);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher responseString = content.string("pong...");
        // ResultMatcher responseString = content.string("pong......");

        resultActions.andExpect(responseString);
    }

    @Test
    void testJsonResponse(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books/2");
        ResultActions resultActions = mvc.perform(builder);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher json = content.json("{\"flag\":true,\"data\":{\"id\":2,\"name\":\"Journey to the west\",\"author\":\"Wu Cheng'en\",\"published_time\":null},\"msg\":null}");

        resultActions.andExpect(json);
    }


    @Test
    void testContentType(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books/1");
        ResultActions resultActions = mvc.perform(builder);

        HeaderResultMatchers headerResultMatchers = MockMvcResultMatchers.header();
        ResultMatcher resultMatcher = headerResultMatchers.string("Content-Type", "application/json");

        resultActions.andExpect(resultMatcher);
    }

}
