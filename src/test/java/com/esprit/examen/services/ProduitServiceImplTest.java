package com.esprit.examen.services;

import java.util.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ProduitServiceImplTest {
	@Mock
	ProduitRepository produitRepository;
	@InjectMocks
	ProduitServiceImpl produitServiceImpl;

	 @Test
	public void addProduit() {
		Date date = new Date();
		Produit p = new Produit("aa","aa",12,date,date);
		Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(p));
		 produitServiceImpl.addProduit(p);
	}
	 @Test
	 public void retrieveAllProduits() {
		 produitServiceImpl.retrieveAllProduits();
		 
		}
}
