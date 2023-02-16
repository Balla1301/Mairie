package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Entity
@Table(name="Jugements")
public class Jugement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private Date date;
	private String lieu;
	
	@OneToOne(mappedBy = "jugement")
	private DeclarationNaissance declarationNaissance;
	
	@OneToOne(mappedBy = "jugement")
	private DeclarationMariage declarationMariage;
}
