package org.kmokrzycki.contract;

import java.math.BigDecimal;

/**
 * Created by krzysiek on 02/01/17.
 */
public class Product {

    private String name;
    private String id;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
