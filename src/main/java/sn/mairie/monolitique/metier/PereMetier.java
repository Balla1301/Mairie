package sn.mairie.monolitique.metier;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectDeletedException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.repositories.PereRepository;

/**  
 * @author BALLA
 * @version 1.0
 * @brief La classe qui implemente les signatures des methodes dans l'interface IPereMetier 
 *
 */
@Service
public class PereMetier implements IPereMetier {
	
	@Autowired
	private PereRepository pereRepository;

	/**
	 *@param p l'objet pere a ajouter dans las base de donnee
	 *@return Le pere qui est ajoute
	 */
	@Override
	public Pere savePere(Pere p) {
		// TODO Auto-generated method stub
		return pereRepository.save(p);
	}

	/**
	 *@return La liste des pere ans las base de donnee
	 */
	@Override
	public List<Pere> listPeres() {
		// TODO Auto-generated method stub
		return pereRepository.findAll();
	}

	/**
	 *@param id l'identifiant de l'objet pere a supprimer dans las base de donnee
	 *@exception ObjectDeletedException l'exeption lance si le pere n'existe pas dans la base de Donnee
	 */
	@Override
	public void deletePereById(Long id) throws ObjectDeletedException {
		// TODO Auto-generated method stub
		
		if(pereRepository.findById(id).isEmpty())
			throw new ObjectDeletedException("Objet inexistant",pereRepository.findById(id).get() , "Pere");
		pereRepository.deleteById(id);
		
	}

	/**
	 *@param p l'objet pere qui contient les informations d'un objet a remplacer pour un pere existant dans la base de donnee
	 *@param id l'identifiant pere que l'on veur mettre a jour 
	 *@exception ObjectNotFoundException l'exeption lance si le pere avec l'identifiant n'existe pas
	 *@return Le pere qui est modifie
	 */
	@Override
	public Pere editPere(Pere p, Long id) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		Pere pp=pereRepository.findById(id).get();
		if(pp != null) {
			if(p.getNom()!=null)
				pp.setNom(p.getNom());
			if(p.getPrenom()!=null)
				pp.setPrenom(p.getPrenom());
			if(p.getAdresse()!=null)
				pp.setAdresse(p.getAdresse());
			if(p.getCin()!=null)
				pp.setCin(p.getCin());
			if(p.getDateNaissance()!=null)
				pp.setDateNaissance(p.getDateNaissance());
			if(p.getLieuNaissance()!=null)
				pp.setLieuNaissance(p.getLieuNaissance());
			if(p.getProfession()!=null)
				pp.setProfession(p.getProfession());
			pereRepository.deleteById(id);;
			return pereRepository.save(pp);
		}
		throw new ObjectNotFoundException(pp, "Pere");
	}
	
	//hdjjf

	/**
	 *@param id l'identifiant pere que l'on veur rechercher 
	 *@exception ObjectNotFoundException l'exception lance si le pere avec l'identifiant n'existe pas
	 *@return Le pere identifie
	 */
	@Override
	public Pere recherchePere(Long id) throws ObjectNotFoundException{
		Pere pp=pereRepository.findById(id).get();
		if(pp != null)
		return pp;
		throw new ObjectNotFoundException(pp, "Pere");
	}

}
