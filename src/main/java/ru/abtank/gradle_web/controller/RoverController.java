package ru.abtank.gradle_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.abtank.gradle_web.entity.Rover;
import ru.abtank.gradle_web.entity.repository.RoverRepository;
import ru.abtank.gradle_web.service.RoverService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping(value = "/rovers")
@RestController
public class RoverController {
    private RoverService roverService;
    @Autowired
    public void setRoverService(RoverService roverService) {
        this.roverService = roverService;
    }

    @GetMapping
    public List<Rover> getAll(){
        return roverService.getAllRovers();
    }
}
