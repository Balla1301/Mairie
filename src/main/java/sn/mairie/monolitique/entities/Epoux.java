package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Entity
public class Epoux {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom ;
	private String prenom;
	private String cin;
	private String profession;
	private String adresse;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String lieuNaissance;
	@OneToMany(mappedBy = "epoux")
	private Collection<DeclarationMariage> declarationMariages;
	
	

}
