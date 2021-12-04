package cn.xdevops.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringDbDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringDbDemoApplication.class, args);
    }

}
