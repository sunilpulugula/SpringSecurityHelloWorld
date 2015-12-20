package com.spring.security.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.security.domain.Product;

/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 19/12/15
 */
@Service
public class ProductManager {

    private Map<Integer, Product> products = new HashMap<>();

    {
        products.put(100,new Product(100,"Keypad","System KeyPad",3));
        products.put(101,new Product(101,"Monitor","System Monitor",5));
        products.put(102,new Product(102,"Mouse","System Mouse",3));
    }

    public List<Product> listProducts() {
        return new ArrayList(products.values());
    }

    public Product getProduct(final int id) {
        return products.get(id);
    }

    public void createProduct(final Product product) {
        products.put(product.getId(), product);
    }

    public void deleteProduct(final int id) {
        products.remove(id);
    }
}
