package com.microservice.beerorder.services;

import com.microservice.beerorder.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(String beerId);
}
