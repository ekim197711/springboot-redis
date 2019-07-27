package com.codeinvestigator.redisdemo.spaceship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;
import java.util.List;

@RedisHash("CoolSpaceship")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spaceship {
    private String id;
    private String model;
    private BigDecimal weight;
    private List<Equipment> equipment;
}
