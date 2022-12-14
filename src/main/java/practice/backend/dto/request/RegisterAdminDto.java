package practice.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.backend.model.roleType.Gender;
import practice.backend.model.roleType.UserType;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterAdminDto {

    @NotEmpty(message = "User name must not be empty.")
    private String username;

    @NotEmpty(message = "Email must not be empty.")
    private String email;

    @NotEmpty(message = "Gender must not be empty.")
    private Gender gender;

    @NotEmpty(message = "Password must not be empty.")
    private String password;

    @NotEmpty(message = "Please provide a user type.")
    private UserType roleType;
}
