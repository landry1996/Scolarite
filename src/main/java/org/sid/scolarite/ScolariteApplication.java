package org.sid.scolarite;

import org.sid.scolarite.dao.EtudiantRepository;
import org.sid.scolarite.entities.Etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ScolariteApplication implements CommandLineRunner {
private final EtudiantRepository etudiantRepository;

    public ScolariteApplication(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ScolariteApplication.class, args);
     /*   EtudiantRepository etudiantRepository = context.getBean(EtudiantRepository.class);
        etudiantRepository.save(new Etudiant(null,"Landry","landry@gmail.com", new Date(),50));
        etudiantRepository.save(new Etudiant(null,"Placide","placide@gmail.com", new Date(),55));
        etudiantRepository.save(new Etudiant(null,"Joel","joel@gmail.com", new Date(),60));


        etudiantRepository.findAll().forEach(et->{
            System.out.println(et.toString());
        });*/

    }

       @Override
    public void run(String... args) throws Exception{
           List<Etudiant> etudiants = Arrays.asList(
                   new  Etudiant(null,"len","emai",new Date(),50),
                   new Etudiant(null,"Placide","placide@gmail.com", new Date(),55),
                   new Etudiant(null,"Joel","joel@gmail.com", new Date(),60)
           );
   etudiants.forEach(etudiant -> {
       System.out.println(etudiant);
   });
    }
}
