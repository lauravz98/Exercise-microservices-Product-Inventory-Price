package com.ironhack.Clientedgeservice.dto;

public class ProductDTO {
    private long serialNumber;
    private int quantity;
    private String productName;
    private double price;

    public ProductDTO() {
    }

    public ProductDTO(long serialNumber, int quantity, String productName, double price) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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