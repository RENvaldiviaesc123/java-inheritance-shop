package org.lessons.java.javashoptwo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    //ATTRIBUTI
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;

    //COSTRUTTORI


    public Product() {
        this.code = generateCode();
    }

    public Product(String name, String brand, BigDecimal price, BigDecimal vat) {
        this.code = generateCode();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }


    //GETTERS AND SETTERS


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }


    //METODI
        //Metodo per calcolare il prezzo più iva
         public BigDecimal pricePlusVat () {
            BigDecimal vatOnPrice = price.multiply(vat);
            BigDecimal finalPrice = price.add(vatOnPrice);
            return finalPrice.setScale(2, RoundingMode.HALF_EVEN);
         }

         private int generateCode (){
             Random random = new Random();
             return random.nextInt(1,10000);
         }

         //
}
