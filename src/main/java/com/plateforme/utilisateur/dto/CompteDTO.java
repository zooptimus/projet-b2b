package com.plateforme.utilisateur.dto;

import com.plateforme.utilisateur.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompteDTO {
    private String email;

    private Role role;
}
