# configuration

## temporary configuration
```shell
java -jar target/demo-0.0.1-SNAPSHOT.jar --server.port=80
```

## config file priority(from high to low)
- config/application.yml (相对jar包)
- application.yml (相对jar包)
- config/application.yml （classpath）
- application.yml （classpath）

## 手动指定配置名
```shell
# 配置项
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.config.name=${config-file-name}
# 配置位置
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.config.location=classpath:/animals.yml
```

## 多环境、多配置文件
### 主配置文件
```yml
spring:
  profiles:
    active: dev
```

### 启用的配置文件(如application-dev.yml)
```yml
server:
  port: 8080

logging:
  level:
    root: info
# ......
```

## 配置组
```yml
spring:
  profiles:
    active: dev
    group:
      "dev": devDB, devRedis
      "test": testDB, testRedis
```