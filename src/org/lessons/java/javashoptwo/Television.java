package org.lessons.java.javashoptwo;

import java.math.BigDecimal;

public class Television extends Product {
    //ATRIBUTTI
    private BigDecimal dimensions;
    private boolean smart;
    //COSTRUTTORI

    public Television(String name, String brand, BigDecimal price, BigDecimal vat, BigDecimal dimensions, boolean smart) {
        super(name, brand, price, vat);
        this.dimensions = dimensions;
        this.smart = smart;
    }


    //GETTERS AND SETTERS

    public BigDecimal getDimensions() {
        return dimensions;
    }

    public void setDimensions(BigDecimal dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    //METODI
}
