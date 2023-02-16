package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.mairie.monolitique.entities.DeclarationNaissance;
 
@RepositoryRestResource
public interface DeclarationNaissanceRepository  extends JpaRepository<DeclarationNaissance, Long>{

}
