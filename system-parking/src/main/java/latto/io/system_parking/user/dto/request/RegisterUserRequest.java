package latto.io.system_parking.user.dto.request;

import jakarta.validation.constraints.NotBlank;

public record RegisterUserRequest(
                                  @NotBlank(message = "Name is required") String name,
                                  @NotBlank(message = "E-mail is required") String email,
                                  @NotBlank(message = "Password is required") String password) {
}
