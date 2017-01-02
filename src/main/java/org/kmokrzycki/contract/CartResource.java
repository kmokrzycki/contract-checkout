package org.kmokrzycki.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by krzysiek on 02/01/17.
 */

@Path("/cart")
public class CartResource {

    ProductDao productsDao = new ProductDao();


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getCartSummary(ProductList list) {
        System.out.println(list.toString());
        Cart cart = new Cart(list);
        return cart.getTotal();
    }
}
