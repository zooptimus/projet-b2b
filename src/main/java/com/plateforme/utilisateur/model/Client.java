package com.plateforme.utilisateur.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@DiscriminatorValue("CLIENT")
@SuperBuilder
public class Client extends Utilisateur{
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroCarteCredit;
    private String dateExpirationCarteCredit;
}
