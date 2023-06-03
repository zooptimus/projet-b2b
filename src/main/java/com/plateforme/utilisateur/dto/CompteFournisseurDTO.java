package com.plateforme.utilisateur.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompteFournisseurDTO extends  CompteDTO{

    private String raisonSociale;
    private String adresse;
    private String siret;
}
