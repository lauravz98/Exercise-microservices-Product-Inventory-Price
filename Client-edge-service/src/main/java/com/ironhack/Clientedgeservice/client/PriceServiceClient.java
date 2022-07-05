package com.ironhack.Clientedgeservice.client;

import com.ironhack.Clientedgeservice.model.Price;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient("price-service")
public interface PriceServiceClient {

    @GetMapping("/prices/{serialNumber}")
    public Price findBySerialNumber(@PathVariable long serialNumber);
}
