package com.maquebax.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.maquebax.spring.data.repo")
@EntityScan("com.maquebax.spring.data.model")
@SpringBootApplication
public class SpringDataMssqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMssqlApplication.class, args);
    }

}
