package com.ironhack.Clientedgeservice.controller.interfaces;

import com.ironhack.Clientedgeservice.dto.ProductDTO;

public interface ClientController {

    ProductDTO findProductById(long serialNumber);
}
