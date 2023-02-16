package sn.mairie.monolitique.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.metier.IPereMetier;


/**
 * @author BALLA
 * @version 1.0
 * @since 2018
 * @class PereController
 * La classe qui represente le controller pour l'entite pere cote web 
*/


@RestController
public class PereController {


	//Injection de dependances dans IPeremetier mais pas dans pereRespository
	@Autowired
	private IPereMetier pereMetier;

	/**
	 * Ajoute un nouveau pere dans la base de donnée avec l'url /peres en POST
	 * @param pere les donnees d'un objet pere a ajouter
	 * @return le pere qui a ete ajoute
	 */
	/*
	 *Ceci me concerne 
	 */
	@RequestMapping(value = "/peres", method = RequestMethod.POST)
	public Pere savePere(@RequestBody @Valid Pere pere) {
		return pereMetier.savePere(pere);
	}
	
	/**
	 * Renvoi la liste des peres de la base de donnée avec l'url /peres en GET
	 * @return la liste des peres
	 */
	@RequestMapping(value = "/peres", method = RequestMethod.GET)
	public List<Pere> listPeres() {
		return pereMetier.listPeres();
	}
	
	/**
	 *@param id l'identifiant de l'objet pere a supprimer dans las base de donnee avec l'url /pere/{id} en DELETE
	 */
	@RequestMapping(value = "/pere/{id}", method = RequestMethod.DELETE)
	public void deletePere(@PathVariable("id") Long id) {
		pereMetier.deletePereById(id);
	}

	
	/**
	 * Modifie un peres de la base de donnée avec l'url /peres/{id} en PUT
	 * @param id L'identifiant du pere qu'on veut modifier
	 * @param p les nouvelles donnes qu'on veut utiliser pour modifier un pere existant
	 * @return le pere modifie
	 */
	@RequestMapping(value = "/pere/{id}", method =RequestMethod.PUT)
	public Pere editPere(@RequestBody Pere p, @PathVariable("id") Long id) {
		return pereMetier.editPere(p, id);
	}

	/**
	 * Renvoi un pere de la base de donnée avec l'url /peres/{id} en GET
	 * @param id L'identifiant du pere qu'on veut retrouver
	 * @return le pere retrouve
	 */
	@RequestMapping(value = "/pere/{id}", method =RequestMethod.GET)
	public Pere recherchePere(@PathVariable("id") Long id) {
		return pereMetier.recherchePere(id);
	}

}
