package com.ironhack.Inventoryclient.controller.impl;

import com.ironhack.Inventoryclient.controller.interfaces.InventoryController;
import com.ironhack.Inventoryclient.models.Inventory;
import com.ironhack.Inventoryclient.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
@RestController
public class InventoryControllerImpl implements InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/inventories/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public Inventory findBySerialNumber(@PathVariable long serialNumber) {
        Optional<Inventory> optionalInventory = inventoryRepository.findById(serialNumber);
        if(!optionalInventory.isPresent()){
            throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
        }
        return optionalInventory.get();
    }
}
