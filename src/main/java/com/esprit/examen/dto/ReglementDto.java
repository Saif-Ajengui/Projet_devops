package com.esprit.examen.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.esprit.examen.entities.Reglement;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReglementDto {
	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;
	@Temporal(TemporalType.DATE)
	private Date dateReglement;
	
	public ReglementDto fromEntity(Reglement reglement) {
		if (reglement == null) {
			return null;
		}
		return ReglementDto.builder()
				.idReglement(reglement.getIdReglement())
				.montantPaye(reglement.getMontantPaye())
				.montantRestant(reglement.getMontantRestant())
				.payee(reglement.getPayee())
				.dateReglement(reglement.getDateReglement())
				
				.build();
	}

	public Reglement toEntity(ReglementDto reglementDto) {
		if (reglementDto == null) {
			return null;
		}
		Reglement reglement = new Reglement();
		
		reglement.setIdReglement(reglementDto.getIdReglement());
		reglement.setMontantPaye(reglementDto.getMontantPaye());
		reglement.setMontantRestant(reglementDto.getMontantRestant());
		reglement.setPayee(reglementDto.getPayee());
		reglement.setDateReglement(reglementDto.getDateReglement());
		
		return reglement;

	}
}
