package com.panda.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.panda.demo.config.DemoServerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties(DemoServerConfig.class)
@Slf4j
public class DemoApplication {

	// 自定义bean属性
	/*
	@Bean
	@ConfigurationProperties(prefix = "demo-data-source")
	public DruidDataSource datasource() {
		DruidDataSource ds = new DruidDataSource();
		//!important 重点在这里，可以自定义bean属性了！
		ds.setDriverClassName("com.mysql.jdbc.DemoDriver");
		return ds;
	}
	*/

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		DemoServerConfig bean = ctx.getBean(DemoServerConfig.class);
		System.out.println(">>> demo-server-config bean " + bean);

		// DruidDataSource ds = ctx.getBean(DruidDataSource.class);
		// System.out.println(">>> druid-data-source bean " + ds);
		// System.out.println(">>> druid-data-source bean's driver class name " + ds.getDriverClassName());
	}

}
