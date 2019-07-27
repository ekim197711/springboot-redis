package com.codeinvestigator.redisdemo.spaceship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {
    private String name;
    private BigDecimal price;
}
