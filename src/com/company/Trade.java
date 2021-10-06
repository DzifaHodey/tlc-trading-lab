package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;


    abstract double calcDividend();

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;

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
        if (price > 0){
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("Price cannot be a negative value");
        }
    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }



    //
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }




}

