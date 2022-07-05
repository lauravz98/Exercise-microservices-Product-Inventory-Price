package com.ironhack.Clientedgeservice.controller.impl;

import com.ironhack.Clientedgeservice.client.InventoryServiceClient;
import com.ironhack.Clientedgeservice.client.PriceServiceClient;
import com.ironhack.Clientedgeservice.controller.interfaces.ClientController;
import com.ironhack.Clientedgeservice.dto.ProductDTO;
import com.ironhack.Clientedgeservice.model.Inventory;
import com.ironhack.Clientedgeservice.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControllerImpl implements ClientController {
    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @Autowired
    private PriceServiceClient priceServiceClient;

    @GetMapping("/products/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO findProductById(@PathVariable long serialNumber) {
        Inventory inventory = inventoryServiceClient.findBySerialNumber(serialNumber);
        Price price = priceServiceClient.findBySerialNumber(serialNumber);

        ProductDTO productDTO = new ProductDTO(serialNumber, inventory.getQuantity(), price.getProductName(), price.getPrice());
        return productDTO;
    }
}
