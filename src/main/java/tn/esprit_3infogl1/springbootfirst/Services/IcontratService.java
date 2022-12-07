package tn.esprit_3infogl1.springbootfirst.Services;

import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat c);
    Contrat updateContrat(Contrat c);
    void deleteContrat(Contrat c);
    void deleteContrat (Long id );
    List<Contrat> findAllContrat();
    Contrat findContratById (Long id);
    List<Contrat> searchContratByArchive (boolean arch);

}
