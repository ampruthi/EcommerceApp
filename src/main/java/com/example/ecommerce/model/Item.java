package com.example.ecommerce.model;

import com.example.ecommerce.model.ItemCategory;
import com.example.ecommerce.model.Seller;

import javax.persistence.*;

@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand")
    @ManyToOne
    private Brand brand;
    @Column(name = "price")
    private Long price;
    @Column(name = "color")
    private String color;
    @Column(name = "size")
    private Long size;
    @Column(name = "sku")
    private String skuId;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "seller")
    @ManyToOne
    private Seller seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
