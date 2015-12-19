package com.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.security.domain.Product;
import com.spring.security.serivice.ProductService;

/**
 * @author <a href="mailto:sunil.pulugula@wavemaker.com">Sunil Kumar</a>
 * @since 19/12/15
 */

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Product> listProducts() {
        return productService.listProducts();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id) {
        return productService.getProduct(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
    }
}
