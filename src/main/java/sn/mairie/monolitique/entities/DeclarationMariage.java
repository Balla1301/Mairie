package sn.mairie.monolitique.entities;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor @AllArgsConstructor @Data @ToString
@Entity
@Table(name="DeclarationMariages")
public class DeclarationMariage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeclarationMariage;
	private Date date;
	private String declaration;
	
	@ManyToOne
	@JoinColumn(name="idEpoux")
	private Epoux epoux;
	
	@ManyToOne
	@JoinColumn(name="idEpouse")
	private Epouse epouse;
	
	@ManyToMany
	@JoinTable( name = "T_Temoins_DeclarationMariage",
            joinColumns = @JoinColumn( name = "idDeclarationMariage" ),
            inverseJoinColumns = @JoinColumn( name = "idTemoin" ) )
	private Collection <Temoin> temoins;
	
	@ManyToOne
	@JoinColumn(name="idCentre")
	private Centre centre;
	
	@ManyToOne
	@JoinColumn(name="idRegistre")
	private Registre registre; 
	
	@OneToOne
	@JoinColumn(name="idJugement")
	private Jugement jugement;
	
	
	@ManyToMany
    @JoinTable( name = "T_Mention_DeclarationMariage",
                joinColumns = @JoinColumn( name = "idDeclarationMariage" ),
                inverseJoinColumns = @JoinColumn( name = "idMention" ) )
	private Collection<Mention> mention;
	
	private String reference;
	private double dote;
	private String regime;
	private String coutume;
	private Date dateModification;
	
	

}
