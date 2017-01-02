package org.kmokrzycki.contract;


import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by krzysiek on 02/01/17.
 */
public class ProductDao {

    private Map<String, Product> products;

    ProductDao(){
        products = new HashMap<String, Product>();

        Product apples = new Product();
        apples.setId("apple");
        apples.setName("Apple");
        apples.setPrice(new BigDecimal(0.6));

        products.put(apples.getName(), apples);

        Product oranges = new Product();
        oranges.setId("orange");
        oranges.setName("Orange");
        oranges.setPrice(new BigDecimal(0.25));

        products.put(oranges.getName(), oranges);

    }

    Collection<Product> getProducts(){
        return(products.values());
    }

    Product getProduct(String id) {
        return (products.get(id));
    }
}
