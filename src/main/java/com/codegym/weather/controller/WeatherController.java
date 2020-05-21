package com.codegym.weather.controller;

import com.codegym.weather.model.City;
import com.codegym.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ModelAndView view(){
        ModelAndView modelAndView = new ModelAndView("weather");
        modelAndView.addObject("city",new City());
        return modelAndView;
    }

    @PostMapping("/weather")
    public ModelAndView getWeather(@RequestParam("cityName") Optional<String> cityName){
        ModelAndView modelAndView = new ModelAndView("weather");
        City city = null;
        if (cityName.isPresent()){
            city = weatherService.findByCity(cityName.get());
        }
        modelAndView.addObject("city",city);
        return modelAndView;
    }
}
