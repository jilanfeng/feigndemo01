# feigndemo01
This is a easy example which used feign and consul
通过URL输入某姓名，如http://localhost:8080/hello/l23,成功调用返回json对象
通过thread.sleep,使得线程延时，此时会在页面显示失败，并打印日志。
consumer可能启动失败，说是Tomcat 启动失败，需要添加：
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <artifactId>tomcat-embed-el</artifactId>
            <groupId>org.apache.tomcat.embed</groupId>
        </exclusion>
        <exclusion>
            <artifactId>tomcat-embed-websocket</artifactId>
            <groupId>org.apache.tomcat.embed</groupId>
        </exclusion>
    </exclusions>
</dependency>
如果不行，就把这些注释，再运行，反复注释，我就成功了，玄！

