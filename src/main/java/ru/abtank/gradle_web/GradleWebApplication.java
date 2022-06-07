package ru.abtank.gradle_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import ru.abtank.gradle_web.config.ProjectConfiguration;
@EnableDiscoveryClient
@SpringBootApplication
@Import(ProjectConfiguration.class)
public class GradleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleWebApplication.class, args);
    }

}
