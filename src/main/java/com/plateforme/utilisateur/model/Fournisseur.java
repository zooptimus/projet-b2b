package com.plateforme.utilisateur.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@DiscriminatorValue("FOURNISSEUR")
public class Fournisseur extends Utilisateur{

    private String raisonSociale;
    private String adresse;
    private String siret;
}
