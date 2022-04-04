# 准备

## 运行环境
- java
- maven（版本需要大于3.3）

## 示例应用
### 创建POM.xml文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>myproject</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.6</version>
    </parent>

    <!-- Additional lines to be added here... -->

</project>
```

### 示例代码
- 代码路径：`src/main/java/MyApplication.java`
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
```

### 运行代码
```shell
mvn spring-boot:run
```

### 查看依赖树
```shell
mvn dependency:tree
```

### 创建可运行的jar包
- 在pom.xml里添加`spring-boot-maven-plugin`
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
- 打包
```shell
mvn package
# 运行完成后会在target目录里生成*-SNAPSHOT.jar
```

- 运行
```shell
java -jar target/*-SNAPSHOT.jar
```
