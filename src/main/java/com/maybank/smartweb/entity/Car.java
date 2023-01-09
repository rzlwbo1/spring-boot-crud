package com.maybank.smartweb.entity;

public class Car {

    private Long id;
    private String pabrikan;
    private String type;
    private Double price;
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPabrikan() {
        return pabrikan;
    }

    public void setPabrikan(String pabrikan) {
        this.pabrikan = pabrikan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", pabrikan='" + pabrikan + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
