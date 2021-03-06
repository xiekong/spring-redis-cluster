# Redis哨兵模式
   
## 引入maven依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
    <version>2.1.4.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-pool2</artifactId>
</dependency>
```
## Spring Boot配置
```
spring:
  redis:
    # 哨兵模式根据名称自动选择master
    sentinel:
      master: mymaster
      nodes: 192.168.3.10:26379, 192.168.3.11:26379, 192.168.3.12:26379
    password: xiekong
    #连接超时时间(毫秒)
    timeout: 10000
    lettuce:
      pool:
        #最大连接数(默认8)
        max-active: 20
        #最大阻塞等待时间(负数表示没限制，默认-1)
        max-wait: -1
        #最大空闲(默认8)
        max-idle: 8
        #最小空闲(默认0)
        min-idle: 0
```
