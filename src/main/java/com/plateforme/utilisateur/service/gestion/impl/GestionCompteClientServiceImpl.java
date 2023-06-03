package com.plateforme.utilisateur.service.gestion.impl;

import com.plateforme.utilisateur.dao.UserRepository;
import com.plateforme.utilisateur.dto.CompteClientDTO;
import com.plateforme.utilisateur.model.Client;
import com.plateforme.utilisateur.service.gestion.GestionCompteService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class GestionCompteClientServiceImpl implements GestionCompteService<Client, CompteClientDTO> {

    private final UserRepository repository;
    @Override
    public Client updateCompte(CompteClientDTO compteDTO) {
        var client = Client.builder()
                .nom(compteDTO.getNom())
                .prenom(compteDTO.getPrenom())
                .adresse(compteDTO.getAdresse())
                .numeroCarteCredit(compteDTO.getNumeroCarteCredit())
                .dateExpirationCarteCredit(compteDTO.getDateExpiration())
                .build();

        repository.save(client);
        return client;
    }

    @Override
    public void deleteCompte(String email) {
        var client = repository.findByEmail(email).orElseThrow();
        repository.delete(client);
    }
}
