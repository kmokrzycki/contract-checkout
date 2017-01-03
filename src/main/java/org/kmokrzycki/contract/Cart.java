package org.kmokrzycki.contract;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by krzysiek on 02/01/17.
 */
public class Cart {

    private ProductList productList;

    Cart(ProductList list) {
        productList = list;
    }

    String getTotal() {

        ProductDao doa = new ProductDao();
        OfferDao offerDao = new OfferDao();

        Map<String, Integer> inBasket = new LinkedHashMap<>();

        for (int i = 0; i < this.productList.product.size(); i++) {
            if (inBasket.get(productList.product.get(i)) != null) {
                inBasket.put(productList.product.get(i), inBasket.get(productList.product.get(i)) + 1);
            } else {
                inBasket.put(productList.product.get(i), 1);
            }
        }

        BigDecimal total = new BigDecimal(0);


        for (Map.Entry<String, Integer> entry : inBasket.entrySet()) {
            Product product = doa.getProduct(entry.getKey());

            Offer offer = offerDao.getOffer(entry.getKey());
            int inBasketCount = entry.getValue();
            if (offer != null && inBasketCount >= offer.getCount()) {

                    Integer promoUnits = Integer.valueOf(entry.getValue() / offer.getCount());
                    BigDecimal promoValue = BigDecimal.valueOf(promoUnits).multiply(offer.getDiscountedPrice());
                    total = total.add(promoValue);

                if (inBasketCount%offer.getCount() != 0) {
                    BigDecimal nonPromoValue = product.getPrice().multiply(BigDecimal.valueOf(inBasketCount%offer.getCount()));
                    total = total.add(nonPromoValue);
                }

                } else {
                    total = total.add(product.getPrice().multiply(BigDecimal.valueOf(entry.getValue())));
                }
        }
        return (total.toString());

    }
}
