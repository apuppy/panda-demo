package com.panda.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "demo-server")
public class DemoServerConfig {
    private String ipAddress;
    private Integer port;
    private Long timeout;
}
