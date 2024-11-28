package vn.laptopshop.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_detail")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long quantity;

    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // không cần OneToMany bên Product
    // chúng ta chỉ cần biết dòng sản phẩm này ứng với chi tiết đơn hàng nào
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
