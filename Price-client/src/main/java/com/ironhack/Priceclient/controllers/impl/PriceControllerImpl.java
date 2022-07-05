package com.ironhack.Priceclient.controllers.impl;

import com.ironhack.Priceclient.controllers.dto.PriceDTO;
import com.ironhack.Priceclient.controllers.interfaces.PriceController;
import com.ironhack.Priceclient.models.Price;
import com.ironhack.Priceclient.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
@RestController
public class PriceControllerImpl implements PriceController {
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("/prices/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public Price findBySerialNumber(@PathVariable long serialNumber) {
        Optional<Price> optionalPrice = priceRepository.findById(serialNumber);
        if(!optionalPrice.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return optionalPrice.get();
    }
}
