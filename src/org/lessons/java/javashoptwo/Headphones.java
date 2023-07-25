package org.lessons.java.javashoptwo;

import java.math.BigDecimal;

public class Headphones extends Product {
    //ATRIBUTTI
        private String color;
        private boolean wire;

    //COSTRUTTORI

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean wire) {
        super(name, brand, price, vat);
        this.color = color;
        this.wire = wire;
    }


    //GETTERS AND SETTERS

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWire() {
        return wire;
    }

    public void setWire(boolean wire) {
        this.wire = wire;
    }


    //METODI
}
