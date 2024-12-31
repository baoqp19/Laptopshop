package vn.laptopshop.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.laptopshop.laptopshop.domain.Role;
import vn.laptopshop.laptopshop.domain.User;
import vn.laptopshop.laptopshop.domain.dto.RegisterDTO;
import vn.laptopshop.laptopshop.repository.RoleRepository;
import vn.laptopshop.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(
            UserRepository userRepository,
            RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
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

    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

    public User regisrerDTOtoUser(RegisterDTO resgisterDTO) {
        User user = new User();

        user.setFullName(resgisterDTO.getFirstName() + " " + resgisterDTO.getLastName());
        user.setEmail(resgisterDTO.getEmail());
        user.setPassword(resgisterDTO.getPassword());

        return user;
    }

    public User getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

}
