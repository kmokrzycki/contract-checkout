package org.kmokrzycki.contract;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by krzysiek on 03/01/17.
 */
public class OfferDao {

    private Map<String, Offer> offers;

    OfferDao(){
        offers = new HashMap<String, Offer>();

        Offer apples = new Offer();
        apples.setName("Apple");
        apples.setDiscountedPrice(new BigDecimal(0.6));
        apples.setCount(2);

        offers.put(apples.getName(), apples);

        Offer oranges = new Offer();
        oranges.setName("Orange");
        oranges.setDiscountedPrice(new BigDecimal(0.5));
        oranges.setCount(3);

        offers.put(oranges.getName(), oranges);

    }

    Offer getOffer(String name) {
        return (offers.get(name));
    }
}
