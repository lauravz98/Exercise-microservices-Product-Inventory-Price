package com.ironhack.Inventoryclient.controller.interfaces;

import com.ironhack.Inventoryclient.models.Inventory;

public interface InventoryController {
    Inventory findBySerialNumber(long serialNumber);
}
