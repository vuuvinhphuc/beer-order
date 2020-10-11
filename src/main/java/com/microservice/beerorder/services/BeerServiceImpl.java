package com.microservice.beerorder.services;

import com.microservice.beerorder.web.model.BeerDto;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(String beerId) {
        return null;
    }
}