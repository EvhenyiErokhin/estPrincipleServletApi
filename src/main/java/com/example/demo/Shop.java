package com.example.demo;

public abstract class Shop {
    private String shopId;
    private String city;
    private String street;
    private String name;
    private int employees;
    private boolean shopSite;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public boolean isShopSite() {
        return shopSite;
    }

    public void setShopSite(boolean shopSite) {
        this.shopSite = shopSite;
    }

    public Shop(String shopId, String city, String street, String name, int employees, boolean shopSite) {
        this.shopId = shopId;
        this.city = city;
        this.street = street;
        this.name = name;
        this.employees = employees;
        this.shopSite = shopSite;

    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                ", shopSite=" + shopSite +
                '}';
    }
}
