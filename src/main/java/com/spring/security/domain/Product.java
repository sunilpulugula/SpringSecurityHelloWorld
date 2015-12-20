package com.spring.security.domain;

/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 19/12/15
 */
public class Product {

    private int id;
    private String name;
    private String desc;
    private int warranty;

    public Product() {
    }

    public Product(final int id, final String name, final String desc, final int warranty) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.warranty = warranty;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(final String desc) {
        this.desc = desc;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(final int warranty) {
        this.warranty = warranty;
    }
}
