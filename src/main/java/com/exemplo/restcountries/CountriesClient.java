package com.exemplo.restcountries;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "countriesClient", url = "https://restcountries.com/v3.1")
public interface CountriesClient {

    @GetMapping("/name/{name}")
    String getCountryInfo(@PathVariable("name") String name);
}
