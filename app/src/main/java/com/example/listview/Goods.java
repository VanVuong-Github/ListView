package com.example.listview;

public class Goods {
    private String name;
    private String shopName;
    private int image;

    public Goods(String name, String shopName, int image) {
        this.name = name;
        this.shopName = shopName;
        this.image = image;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", shopName='" + shopName + '\'' +
                ", image=" + image +
                '}';
    }
}
