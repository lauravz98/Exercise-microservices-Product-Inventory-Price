package com.ironhack.Priceclient.controllers.interfaces;

import com.ironhack.Priceclient.controllers.dto.PriceDTO;
import com.ironhack.Priceclient.models.Price;

public interface PriceController {
    Price findBySerialNumber(long serialNumber);
}
