package org.kmokrzycki.contract;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by krzysiek on 02/01/17.
 */
public class Cart {

    private ProductList productList;

    Cart(ProductList list) {
        productList = list;
    }

    String getTotal(){
        BigDecimal total = new BigDecimal(0);

        ProductDao doa = new ProductDao();

        for(int i = 0; i < this.productList.product.size(); i++) {
            Product product = doa.getProduct(productList.product.get(i));
            total = total.add(product.getPrice());
        }

        return(total.toString());
    }

}
