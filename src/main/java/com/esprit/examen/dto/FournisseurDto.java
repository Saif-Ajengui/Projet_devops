package com.esprit.examen.dto;

import java.util.Date;
import java.util.Set;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.esprit.examen.entities.CategorieFournisseur;
import com.esprit.examen.entities.Fournisseur;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDto {
	private Long idFournisseur;
	private String code;
	private String libelle;
	@Enumerated(EnumType.STRING)
	private CategorieFournisseur  categorieFournisseur;
	
	public FournisseurDto fromEntity(Fournisseur fournisseur) {
		if (fournisseur == null) {
			return null;
		}
		return FournisseurDto.builder()
				.idFournisseur(fournisseur.getIdFournisseur())
				.code(fournisseur.getCode())
				.libelle(fournisseur.getLibelle())
				.categorieFournisseur(fournisseur.getCategorieFournisseur())
			
				.build();
	}

	public Fournisseur toEntity(FournisseurDto fournisseurDto) {
		if (fournisseurDto == null) {
			return null;
		}
		Fournisseur fournisseur = new Fournisseur();
		
		fournisseur.setIdFournisseur(fournisseurDto.getIdFournisseur());
		fournisseur.setCode(fournisseurDto.getCode());
		fournisseur.setLibelle(fournisseurDto.getLibelle());
		fournisseur.setCategorieFournisseur(fournisseurDto.getCategorieFournisseur());

		return fournisseur;

	}

}
