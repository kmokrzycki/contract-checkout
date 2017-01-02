package org.kmokrzycki.contract;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by krzysiek on 02/01/17.
 */
@XmlRootElement(name = "")
public class ProductList {
    @XmlElement(name = "products")
    public List<String> product;
}
