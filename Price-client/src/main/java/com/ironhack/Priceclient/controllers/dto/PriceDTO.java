package com.ironhack.Priceclient.controllers.dto;

public class PriceDTO {
    private String productName;
    private double price;

    public PriceDTO() {
    }

    public PriceDTO(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
