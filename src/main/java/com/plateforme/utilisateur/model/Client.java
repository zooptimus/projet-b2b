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
@DiscriminatorValue("CLIENT")
public class Client extends Utilisateur{
    private String nom;

    private String prenom;

    private String adresse;
}
