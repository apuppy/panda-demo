package com.panda.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Data
@ConfigurationProperties(prefix = "demo-server")
@Validated
public class DemoServerConfig {

    private String ipAddress;

    @Max(value = 8888, message = "最大值不能超过8888")
    @Min(value = 200, message = "最小值不能小于200")
    private Integer port;

    private Long timeout;

    @DurationUnit(ChronoUnit.MILLIS)
    private Duration serverTimeout;

    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}
