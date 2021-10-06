package com.company;

import java.time.LocalDate;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private final LocalDate dateCreated;

    abstract double calcDividend();

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.dateCreated = LocalDate.now();
        if (price > 0){
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("Price cannot be a negative value");
        }

    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.dateCreated = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    //
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }




}

