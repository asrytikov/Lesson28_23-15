package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean(name="alex")
    Person person(){
        var p = new Person();
        p.setName("Alex");
        return p;
    }

    @Bean(value = "masha")
    Person person2(){
        var p = new Person();
        p.setName("Masha");
        return p;
    }

    @Bean("igor")
    Person person3(){
        var p = new Person();
        p.setName("Igor");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer count(){
        return 10;
    }
}
