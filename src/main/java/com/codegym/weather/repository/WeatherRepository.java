package com.codegym.weather.repository;

import com.codegym.weather.model.City;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<City,Long> {
    City findByName(String name);
}
