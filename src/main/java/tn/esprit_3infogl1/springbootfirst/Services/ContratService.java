package tn.esprit_3infogl1.springbootfirst.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Contrat;
import tn.esprit_3infogl1.springbootfirst.DAO.Repositories.ContratRepo;


import java.util.List;

@Service
public class ContratService implements IContratService {
    @Autowired //@Inject
    private ContratRepo icr;

    @Override
    public Contrat addContrat(Contrat c) {
        return icr.save(c); //save ajout if id null or non existant in DB
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return icr.save(c); // save updates if id exists in DB
    }

    @Override
    public void deleteContrat(Contrat c) {
        icr.delete(c);
    }

    @Override
    public void deleteContrat(Long id) {
        icr.deleteById(id);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return (List<Contrat>) icr.findAll();
    }

    @Override
    public Contrat findContratById(Long id) {
        return icr.findById(id).get(); // pour eviter d'avoir un nullpointer exception
    }

    @Override
    public List<Contrat> searchContratByArchive(boolean arch) {
        return icr.getByArchive(arch);
    }
}
