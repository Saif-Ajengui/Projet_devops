package com.esprit.examen.services;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.esprit.examen.dto.FactureDto;
import com.esprit.examen.entities.Facture;

public interface IFactureService {
	Set<FactureDto> retrieveAllFactures();

	Set<FactureDto> getFacturesByFournisseur(Long idFournisseur);

	FactureDto addFacture(FactureDto f);

	void cancelFacture(Long id);

	FactureDto retrieveFacture(Long id);
	
	void assignOperateurToFacture(Long idOperateur, Long idFacture);

	float pourcentageRecouvrement(Date startDate, Date endDate);

}
