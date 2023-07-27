package com.march.rtk.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="aso")
public class ASO {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomenclature_num")
    private long nomenclatureNum;

    @Column(name="product_name")
    private String productName;

    @Column(name="price")
    private BigDecimal price;

    public ASO(long nomenclatureNum, String productName, String price) {
        this.nomenclatureNum = nomenclatureNum;
        this.productName = productName;
        this.price = new BigDecimal(price);
    }

    public ASO(int id, long nomenclature_name, String product_name, BigDecimal price) {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNomenclatureNum() {
        return nomenclatureNum;
    }

    public void setNomenclatureNum(long nomenclatureNum) {
        this.nomenclatureNum = nomenclatureNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ASO{" +
                "id=" + id +
                ", nomenclatureNum=" + nomenclatureNum +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
