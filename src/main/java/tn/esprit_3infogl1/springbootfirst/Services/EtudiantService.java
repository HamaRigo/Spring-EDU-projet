package tn.esprit_3infogl1.springbootfirst.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Etudiant;
import tn.esprit_3infogl1.springbootfirst.DAO.Repositories.EtudiantRepo;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{
    @Autowired
    private EtudiantRepo ietr;

    @Override
    public Etudiant addEtudiant(Etudiant d) {
        return ietr.save(d);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant d) {
        return ietr.save(d);
    }

    @Override
    public void deleteEtudiant(Etudiant d) {
        ietr.delete(d);
    }

    @Override
    public void deleteEtudiant(Long id) {
        ietr.deleteById(id);
    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return (List<Etudiant>) ietr.findAll();
    }

    @Override
    public Etudiant findEtudiantById(Long id) {
        return ietr.findById(id).get();
    }
}
