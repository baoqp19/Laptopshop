package vn.laptopshop.laptopshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.laptopshop.laptopshop.domain.Cart;
import vn.laptopshop.laptopshop.domain.CartDetail;
import vn.laptopshop.laptopshop.domain.Product;
import vn.laptopshop.laptopshop.domain.User;
import vn.laptopshop.laptopshop.repository.CartDetailRepository;
import vn.laptopshop.laptopshop.repository.CartRepository;
import vn.laptopshop.laptopshop.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final UserService userService;
    private final CartRepository cartRepository;
    private final CartDetailRepository cartDetailRepository;

    public ProductService(
            ProductRepository productRepository,
            UserService userService,
            CartRepository cartRepository,
            CartDetailRepository cartDetailRepository

    ) {

        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
        this.userService = userService;
        this.cartDetailRepository = cartDetailRepository;
    }

    public Product createProduct(Product pr) {
        return this.productRepository.save(pr);
    }

    public List<Product> fetchProducts() {
        return this.productRepository.findAll();
    }

    public Optional<Product> fetchProductById(long id) {
        return this.productRepository.findById(id);
    }

    public void deleteProduct(long id) {
        this.productRepository.deleteById(id);
    }

    public void handleAddProductToCart(String email, long productId) {

        User user = this.userService.getUserByEmail(email);
        if (user != null) {
            // check user đã có Cart chưa ? nếu chưa -> tạo mới
            Cart cart = this.cartRepository.findByUser(user);

            if (cart == null) {
                // tạo mới cart
                Cart otherCart = new Cart();
                otherCart.setUser(user);
                otherCart.setSum(1);

                cart = this.cartRepository.save(otherCart);
            }

            // save cart_detail
            // tìm product by id

            Optional<Product> productOptional = this.productRepository.findById(productId);
            
            if (productOptional.isPresent()) {
                Product realProduct = productOptional.get();

                CartDetail cartDetail = new CartDetail();
                cartDetail.setCart(cart);
                cartDetail.setProduct(realProduct);
                cartDetail.setPrice(realProduct.getPrice());
                cartDetail.setQuantity(1);
                this.cartDetailRepository.save(cartDetail);
            }

        }
    }

}
