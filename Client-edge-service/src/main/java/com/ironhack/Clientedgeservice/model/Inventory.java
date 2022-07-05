package com.ironhack.Clientedgeservice.model;

public class Inventory {

    private long serialNumber;
    private int quantity;

    public Inventory() {
    }

    public Inventory(long serialNumber, int quantity) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
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
}
