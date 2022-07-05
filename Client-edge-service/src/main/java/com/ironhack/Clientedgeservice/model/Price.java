package com.ironhack.Clientedgeservice.model;

public class Price {
    private long serialNumber;
    private String productName;
    private double price;

    public Price() {
    }

    public Price(long serialNumber, String productName, double price) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
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
