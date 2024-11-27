package vn.laptopshop.laptopshop.service;

import java.util.List;

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

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUserByEmail(String email) {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteUser(long id){
        this.userRepository.deleteById(id);
    }

}
