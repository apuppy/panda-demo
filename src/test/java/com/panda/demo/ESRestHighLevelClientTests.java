//package com.panda.demo;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.client.indices.GetIndexRequest;
//import org.elasticsearch.client.indices.GetIndexResponse;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.io.IOException;
//
//@SpringBootTest
//public class ESRestHighLevelClientTests {
//
//    RestHighLevelClient esClient;
//
//    @Autowired
//    RestHighLevelClient client;
//
//    @Test
//    public void creatClient() throws IOException {
//        HttpHost host = HttpHost.create("http://localhost:9200");
//        RestClientBuilder restClientBuilder = RestClient.builder(host);
//        esClient = new RestHighLevelClient(restClientBuilder);
//
//        esClient.close();
//    }
//
//    @Test
//    public void createByConfigBean() throws IOException {
//        GetIndexRequest request = new GetIndexRequest("*");
//        GetIndexResponse response = client.indices().get(request, RequestOptions.DEFAULT);
//        String[] indices = response.getIndices();
//        String printIndices = String.join("\n", indices);
//        System.out.println(printIndices);
//        System.out.println(client);
//    }
//
//}
