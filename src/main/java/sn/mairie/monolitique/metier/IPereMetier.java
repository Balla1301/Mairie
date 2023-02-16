package sn.mairie.monolitique.metier;

import java.util.List;
import java.util.Optional;

import sn.mairie.monolitique.entities.Pere;


/**
 * @author BALLA
 * @version 1.0
 * @brief L'inetrface ou on a defini les signatures des methodes pour l'entite pere
 *
 */
public interface IPereMetier {
	/**
	 *@param p l'objet pere a ajouter dans las base de donnee
	 *@return Le pere qui est ajoute
	 */
	public Pere savePere(Pere p);
	
	/**
	 *@return La liste des pere ans las base de donnee
	 */
	public List<Pere> listPeres();
	
	/**
	 *@param id l'identifiant de l'objet pere a supprimer dans las base de donnee
	 */
	public void deletePereById(Long id);
	
	/**
	 *@param p l'objet pere qui contient les informations d'un objet a remplacer pour un pere existant dans la base de donnee
	 *@param id l'identifiant pere que l'on veur mettre a jour 
	 *@return Le pere qui est modifie
	 */
	public Pere editPere(Pere p, Long id);
	
	//pour moi Mame
	
	/**
	 *@param id l'identifiant pere que l'on veur rechercher 
	 *@return Le pere identifie
	 */
	public Pere recherchePere(Long id);

}
