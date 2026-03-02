package com.demo.stock.model;

public class Dorm {
    private Integer id;
    private String name;
    private String description;
    private String address;
    private String district;
    private String province;
    private Integer price;
    private String imageUrl;

    public Dorm(
            Integer id,
            String name,
            String description,
            String address,
            String district,
            String province,
            Integer price,
            String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.district = district;
        this.province = province;
        this.price = price;
        this.imageUrl = imageUrl;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    public Integer getPrice() {
        return price;
    }

    public String getimageUrl() {
        return imageUrl;
    }
}
