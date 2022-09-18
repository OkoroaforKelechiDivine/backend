package practice.backend.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import practice.backend.model.roleType.Gender;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBloggerDto {

    @NotEmpty(message = "User name should not be empty")
    private String username;

    @NotEmpty(message = "Email must not be empty")
    private String email;

    @NotEmpty(message = "Gender must not be empty")
    private Gender gender;

    @NotEmpty(message = "Password should not be empty.")
    private String password;
}