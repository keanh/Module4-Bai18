package com.codegym.weather.service;

import com.codegym.weather.model.City;

public interface WeatherService {
    City findByCity(String name);
}
