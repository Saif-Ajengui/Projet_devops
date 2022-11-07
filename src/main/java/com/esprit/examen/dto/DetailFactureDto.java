package com.esprit.examen.dto;

import java.util.Date;
import java.util.Set;

import com.esprit.examen.entities.DetailFacture;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetailFactureDto {
	private Long idDetailFacture;
	private Integer qteCommandee;
	private float prixTotalDetail;
	private Integer pourcentageRemise;
	private float montantRemise;
	
	public DetailFactureDto fromEntity(DetailFacture detailFacture) {
		if (detailFacture == null) {
			return null;
		}
		return DetailFactureDto.builder()
				.idDetailFacture(detailFacture.getIdDetailFacture())
				.qteCommandee(detailFacture.getQteCommandee())
				.prixTotalDetail(detailFacture.getPrixTotalDetail())
				.pourcentageRemise(detailFacture.getPourcentageRemise())
				.montantRemise(detailFacture.getMontantRemise())
				.build();
	}

	public DetailFacture toEntity(DetailFactureDto detailFactureDto) {
		if (detailFactureDto == null) {
			return null;
		}
		DetailFacture detailFacture = new DetailFacture();
		
		detailFacture.setIdDetailFacture(detailFactureDto.getIdDetailFacture());
		detailFacture.setQteCommandee(detailFactureDto.getQteCommandee());
		detailFacture.setPrixTotalDetail(detailFactureDto.getPrixTotalDetail());
		detailFacture.setPourcentageRemise(detailFactureDto.getPourcentageRemise());
		detailFacture.setMontantRemise(detailFactureDto.getMontantRemise());
		return detailFacture;

	}
}
