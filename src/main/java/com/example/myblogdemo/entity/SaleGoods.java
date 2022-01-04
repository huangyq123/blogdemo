package com.example.myblogdemo.entity;

public class SaleGoods {
    private Integer id;
    private String goodsname;
    private float weight;
    private int type;
    private Boolean onscale;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getOnscale() {
        return onscale;
    }

    public void setOnscale(Boolean onscale) {
        this.onscale = onscale;
    }

    @Override
    public String toString() {
        return "SaleGoods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                ", onscale=" + onscale +
                '}';
    }
}
