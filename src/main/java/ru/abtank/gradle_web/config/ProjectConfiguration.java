package ru.abtank.gradle_web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.abtank.gradle_web.entity.Rover;
import ru.abtank.gradle_web.entity.repository.RoverRepository;

@Configuration
@Slf4j
public class ProjectConfiguration {

    @Bean
    public CommandLineRunner getLoadService(RoverRepository roverRepository) {
        return args -> {
            log.info("Start load data");
            for (int i = 1; i <= 1000; i++) {
                log.info("Data={}", roverRepository.save(new Rover("Name-"+i,"Model-"+i*3)));
            }
            log.info("Data was loaded count={}", roverRepository.findAll().size());
        };
    }
}
