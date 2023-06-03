package org.sid.dao;

import org.sid.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    public EtudiantRepository etudiantRepository;
  @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }


    public void saveEdutiant(Etudiant etudiant){
        etudiantRepository.save(etudiant);
    }

    public List<Etudiant> etudiantList(){
        return etudiantRepository.findAll();
    }
}
