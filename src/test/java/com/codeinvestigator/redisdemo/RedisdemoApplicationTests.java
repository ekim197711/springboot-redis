package com.codeinvestigator.redisdemo;

import com.codeinvestigator.redisdemo.spaceship.Equipment;
import com.codeinvestigator.redisdemo.spaceship.Spaceship;
import com.codeinvestigator.redisdemo.spaceship.SpaceshipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class RedisdemoApplicationTests {

    @Autowired
    SpaceshipRepository spaceshipRepository;

    @Test
    public void createSpaceships() {
        spaceshipRepository.deleteAll();

        Equipment gravityBeam = new Equipment("gravity beam", new BigDecimal(123));
        Equipment laser = new Equipment("laser", new BigDecimal(222));
        Equipment microwave = new Equipment("microwave", new BigDecimal(155523));
        List<Equipment> equipmentList = List.of(gravityBeam, laser, microwave);

        spaceshipRepository.save(new Spaceship(null, "Falcon", new BigDecimal(2000), equipmentList ));
        spaceshipRepository.save(new Spaceship(null, "Hawk", new BigDecimal(2400),equipmentList) );
        spaceshipRepository.save(new Spaceship(null, "Orb", new BigDecimal(6000), equipmentList));
        spaceshipRepository.save(new Spaceship(null, "Flying sourcer", new BigDecimal(600000), equipmentList));

        Iterable<Spaceship> all = spaceshipRepository.findAll();

        all.forEach(s -> System.out.println("This is a spaceship: " + s));

    }

}
