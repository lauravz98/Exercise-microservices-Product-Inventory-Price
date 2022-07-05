package com.ironhack.Clientedgeservice.client;

import com.ironhack.Clientedgeservice.model.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient("inventory-service")
public interface InventoryServiceClient {

    @GetMapping("/inventories/{serialNumber}")
    public Inventory findBySerialNumber(@PathVariable long serialNumber);
}
