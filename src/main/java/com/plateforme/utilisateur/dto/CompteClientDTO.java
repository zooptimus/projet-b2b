package com.plateforme.utilisateur.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompteClientDTO extends CompteDTO{

    private String nom;
    private String prenom;
    private String adresse;

    private String numeroCarteCredit;
    private String dateExpiration;
}
