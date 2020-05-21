package com.codegym.weather.service;

import com.codegym.weather.model.City;
import com.codegym.weather.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService{
    @Autowired
    private WeatherRepository weatherRepository;
    @Override
    public City findByCity(String name) {
        return weatherRepository.findByName(name);
    }
}
