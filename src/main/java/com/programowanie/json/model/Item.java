package com.programowanie.json.model;

public class Item {

    private String name;
    private String cena;
    private String shop;

    public Item() {

    }

    public Item(String name, String cena, String shop) {
        this.name = name;
        this.cena = cena;
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
