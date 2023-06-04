package com.plateforme.utilisateur.authentication;


import com.plateforme.utilisateur.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  @NotEmpty(message = "Email should not be null or empty")
  @Email
  private String email;
  private String password;
  private Role role;
}
