package com.plateforme.utilisateur.service.gestion;

import com.plateforme.utilisateur.dto.CompteDTO;
import com.plateforme.utilisateur.model.Utilisateur;

public interface GestionCompteService<T extends Utilisateur, V extends CompteDTO> {
    T updateCompte(V compte);

    void deleteCompte(String email);

}
