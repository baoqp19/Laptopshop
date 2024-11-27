package vn.laptopshop.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.laptopshop.laptopshop.domain.User;
import vn.laptopshop.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        User bao = this.userRepository.save(user);
        System.out.println(user);
        return bao;
    }
}
