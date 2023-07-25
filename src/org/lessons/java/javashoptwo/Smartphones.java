package org.lessons.java.javashoptwo;

import java.math.BigDecimal;

public class Smartphones extends Product {
    //ATRIBUTTI
    private int memory;
    private String imeiCode;

    //COSTRUTTORI


    public Smartphones(String name, String brand, BigDecimal price, BigDecimal vat, int memory, String imeiCode) {
        super(name, brand, price, vat);
        this.memory = memory;
        this.imeiCode = imeiCode;
    }

    //GETTERS AND SETTERS
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    //METODI
}
