package org.kmokrzycki.contract;

import java.math.BigDecimal;

/**
 * Created by krzysiek on 03/01/17.
 */
public class Offer {

    private String name;
    private BigDecimal discountedPrice;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
