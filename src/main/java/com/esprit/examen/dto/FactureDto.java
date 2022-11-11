package com.esprit.examen.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.esprit.examen.entities.DetailFacture;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Fournisseur;
import com.esprit.examen.entities.Reglement;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder

@Data
public class FactureDto {

	private Long idFacture;
	private float montantRemise;
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModificationFacture;
	private Boolean archivee;
	//@JsonIgnore
	private Set<DetailFactureDto> detailsFacture;
	//@JsonIgnore
	private FournisseurDto fournisseur;
//	@JsonIgnore
	private Set<ReglementDto> reglements;

	public static FactureDto fromEntity(Facture facture) {
		if (facture == null) {
			return null;
		}
		return FactureDto.builder()
				.idFacture(facture.getIdFacture())
				.montantRemise(facture.getMontantRemise())
				.montantFacture(facture.getMontantFacture())
				.dateCreationFacture(facture.getDateCreationFacture())
				.dateDerniereModificationFacture(facture.getDateDerniereModificationFacture())
				.archivee(facture.getArchivee())
				.build();
	}
	

	
	
	public static Facture toEntity(FactureDto factureDto) {
		if (factureDto == null) {
			return null;
		}
		Facture facture = new Facture();
		facture.setIdFacture(factureDto.getIdFacture());
		facture.setMontantRemise(factureDto.getMontantRemise());
		facture.setMontantFacture(factureDto.getMontantFacture());
		facture.setDateCreationFacture(factureDto.getDateCreationFacture());
		facture.setDateDerniereModificationFacture(factureDto.getDateDerniereModificationFacture());
		facture.setArchivee(factureDto.getArchivee());
		
		return facture;

	}

	public FactureDto(Long idFacture, float montantRemise, float montantFacture, Date dateCreationFacture,
			Date dateDerniereModificationFacture, Boolean archivee) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.dateDerniereModificationFacture = dateDerniereModificationFacture;
		this.archivee = archivee;
	}

	public FactureDto(float montantRemise, float montantFacture, Date dateCreationFacture,
			Date dateDerniereModificationFacture, Boolean archivee) {
		super();
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.dateDerniereModificationFacture = dateDerniereModificationFacture;
		this.archivee = archivee;
	}
	
}
