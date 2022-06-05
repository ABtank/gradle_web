package ru.abtank.gradle_web.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.abtank.gradle_web.entity.Rover;

public interface RoverRepository extends JpaRepository< Rover,Long> {
}
