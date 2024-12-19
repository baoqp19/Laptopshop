package vn.laptopshop.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.laptopshop.laptopshop.domain.Product;
import vn.laptopshop.laptopshop.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product pr) {
        return this.productRepository.save(pr);
    }

    public List<Product> fetchProducts() {
        return this.productRepository.findAll();
    }
}
