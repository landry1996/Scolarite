package org.sid.scolarite;

import org.sid.dao.EtudiantService;
import org.sid.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.Date;

@SpringBootApplication
public class ScolariteApplication implements CommandLineRunner {

   private final EtudiantService etudiantService;

    public ScolariteApplication(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }



    public static void main(String[] args) {
        SpringApplication.run(ScolariteApplication.class, args);
        /*EtudiantRepository etudiantRepository = context.getBean(EtudiantRepository.class);
        etudiantRepository.save(new Etudiant(null,"Landry","landry@gmail.com", new Date(),50));
        etudiantRepository.save(new Etudiant(null,"Placide","placide@gmail.com", new Date(),55));
        etudiantRepository.save(new Etudiant(null,"Joel","joel@gmail.com", new Date(),60));


        etudiantRepository.findAll().forEach(et->{
            System.out.println(et.toString());
        });*/

    }

    @Override
    public void run(String... args) throws Exception {

    }

      /*  @Override
    public void run(String... args) throws Exception{
    etudiantService.saveEdutiant(new Etudiant(null,"Landry","landry@gmail.com", new Date(),50));
        etudiantService.saveEdutiant(new Etudiant(null,"Placide","placide@gmail.com", new Date(),55));
        etudiantService.saveEdutiant(new Etudiant(null,"Joel","joel@gmail.com", new Date(),60));

        etudiantService.etudiantList().forEach(et->{
            System.out.println(et.toString());
        });
    }*/
}
