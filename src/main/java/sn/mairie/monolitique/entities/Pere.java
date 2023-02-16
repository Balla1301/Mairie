package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "Peres")
@Data 
@NoArgsConstructor @AllArgsConstructor @ToString
public class Pere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "nom", length = 30)
	private String nom ;
	private String prenom;
	
//	@NotNull
//	@Size(max=16, message = "La taille doit etre egale a 16 caracteres")
	private String cin;
	private String profession;
	private String adresse;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String lieuNaissance;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pere")
	private Collection<DeclarationNaissance> declarationNaissances;


}
