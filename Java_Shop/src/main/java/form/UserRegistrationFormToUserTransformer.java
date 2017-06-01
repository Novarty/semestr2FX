package form;

import model.User;
import model.enums.UserRole;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRegistrationFormToUserTransformer {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static User transform(UserRegistrationForm form) {
        if (form == null) {
            return null;
        }
        User user = new User();
        user.setEmail(form.getEmail());
        user.setName(form.getName());
        user.setRole(UserRole.ROLE_BUYER);
        user.setIs_confirm(false);
        user.setPassword(encoder.encode(form.getPassword()));
        return user;
    }
}