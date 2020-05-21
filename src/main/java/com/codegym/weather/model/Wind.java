package com.codegym.weather.model;

import javax.persistence.*;

@Entity
@Table
public class Wind {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double speed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
