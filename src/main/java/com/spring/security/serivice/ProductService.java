package com.spring.security.serivice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.domain.Product;
import com.spring.security.manager.ProductManager;

/**
 * @author <a href="mailto:psunil1278@gmail.com">Sunil Kumar</a>
 * @since 19/12/15
 */
@Service
public class ProductService {

    @Autowired
    private ProductManager productManager;

    public List<Product> listProducts() {
        return productManager.listProducts();
    }

    public Product getProduct(final int id) {
        return productManager.getProduct(id);
    }

    public void createProduct(final Product product) {
        productManager.createProduct(product);
    }

    public void deleteProduct(final int id) {
        productManager.deleteProduct(id);
    }
}
