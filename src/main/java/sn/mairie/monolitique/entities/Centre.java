package sn.mairie.monolitique.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Entity
@Table(name ="Centres")
public class Centre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String libele;
	private String collectiviteLocale;
	private String departement;
	private String region;
	
	@OneToMany(mappedBy = "centre")
	private Collection<DeclarationNaissance> declarationNaissances;
	
	@OneToMany(mappedBy = "centre")
	private Collection<DeclarationMariage> declarationMariages;
	

}
