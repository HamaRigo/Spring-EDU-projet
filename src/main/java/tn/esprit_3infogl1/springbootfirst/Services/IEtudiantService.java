package tn.esprit_3infogl1.springbootfirst.Services;

import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant d);
    Etudiant updateEtudiant(Etudiant d);
    void deleteEtudiant(Etudiant d);
    void deleteEtudiant (Long id );
    List<Etudiant> findAllEtudiant();
    Etudiant findEtudiantById (Long id);
}
