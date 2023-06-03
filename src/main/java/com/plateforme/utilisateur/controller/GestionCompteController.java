package com.plateforme.utilisateur.controller;

import com.plateforme.utilisateur.dto.CompteClientDTO;
import com.plateforme.utilisateur.model.Client;
import com.plateforme.utilisateur.service.gestion.GestionCompteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/management")
@RequiredArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class GestionCompteController {

    private GestionCompteService compteService;
    @PutMapping("/compte")
    public ResponseEntity<Client> updateRegisterUser(@RequestBody CompteClientDTO clientDTO) {
        return ResponseEntity.ok((Client) compteService.updateCompte(clientDTO));
    }
}
