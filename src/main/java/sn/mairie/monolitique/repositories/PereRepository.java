package sn.mairie.monolitique.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

import sn.mairie.monolitique.entities.Pere;
@RepositoryRestResource
public interface PereRepository extends JpaRepository<Pere, Long> {
List<Pere> findByNom(String name);
	Pere findByNomAndProfession (String name, String profession );
}
