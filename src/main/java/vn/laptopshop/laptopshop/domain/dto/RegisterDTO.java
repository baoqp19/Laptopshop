package vn.laptopshop.laptopshop.domain.dto;

import lombok.Getter;
import lombok.Setter;
import vn.laptopshop.laptopshop.service.validator.RegisterChecked;

@Getter
@Setter
@RegisterChecked
public class RegisterDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassWord;

}
