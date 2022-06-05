package ru.abtank.gradle_web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.abtank.gradle_web.entity.Rover;
import ru.abtank.gradle_web.entity.repository.RoverRepository;

import java.util.List;

@Service
@Slf4j
public class RoverService {
    private RoverRepository roverRepository;
    @Autowired
    public void setRoverRepository(RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    public List<Rover> getAllRovers(){
        log.info("getAllRovers");
        return roverRepository.findAll();
    }
}
