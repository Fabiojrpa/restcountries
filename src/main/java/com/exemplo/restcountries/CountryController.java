package com.exemplo.restcountries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/brazil/idd")
    public String getCountryIDDInfo() {
        return countryService.getIDDInfo("Brazil");
    }
}
