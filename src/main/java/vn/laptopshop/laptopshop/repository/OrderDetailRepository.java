package vn.laptopshop.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.laptopshop.laptopshop.domain.OrderDetails;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {
    
}
