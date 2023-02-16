package sn.mairie.monolitique;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.mairie.monolitique.entities.Pere;
import sn.mairie.monolitique.repositories.PereRepository;

@SpringBootApplication
public class MairieMvcApplication implements CommandLineRunner {

	@Autowired
	private PereRepository pereRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MairieMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Pere pere1=pereRepository.save(new Pere(null, "FADAM", "Mor", "1234567", "Lutteur", "pikine", new Date (), "Wandifa"));
//		Pere pere2=pereRepository.save(new Pere(null, "Ndiaye", "BAye", "1234567", "Lutteur", "pikine", new Date (), "Wandifa"));

//		pereRepository.findAll().forEach(p->{
//			System.out.println(p.toString());
//		});
		
//		pereRepository.findByNom("FADAM").forEach(p->{
//			System.out.println(p.toString());
//		
//		});
		
//		pereRepository.findByNom("FADAM").getLieuNaissance();
//		System.out.println(p.getCIN() );

	}
	
	


}
