package com.exemplo.restcountries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{country}/idd")
    public String getCountryIDDInfo(@PathVariable("country") String country) {
        return countryService.getIDDInfo(country);
    }
}
