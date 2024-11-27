package vn.laptopshop.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.laptopshop.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // User save(User user);
}
