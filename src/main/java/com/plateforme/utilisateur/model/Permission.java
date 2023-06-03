package com.plateforme.utilisateur.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),
    FOURNISSEUR_READ("fournisseur:read"),
    FOURNISSEUR_UPDATE("fournisseur:update"),
    FOURNISSEUR_CREATE("fournisseur:create"),
    FOURNISSEUR_DELETE("fournisseur:delete")

    ;

    @Getter
    private final String permission;
}
