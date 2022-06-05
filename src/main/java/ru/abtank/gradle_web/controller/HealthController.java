package ru.abtank.gradle_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "/isalive")
    public String isAlive(){
        return "<h1>200</h1>";
    }
}
