package vn.laptopshop.laptopshop.service.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import vn.laptopshop.laptopshop.domain.dto.RegisterDTO;

public class RegisterValidator implements ConstraintValidator<RegisterChecked, RegisterDTO> {

    @Override
    public boolean isValid(RegisterDTO user, ConstraintValidatorContext context) {
        boolean valid = true;

        // Check if password fields match
        if (!user.getPassword().equals(user.getConfirmPassWord())) {
            context.buildConstraintViolationWithTemplate("Passwords xác nhận phải đúng")
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        // Additional validations can be added here

        return valid;
    }
}
