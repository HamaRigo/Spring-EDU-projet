package tn.esprit_3infogl1.springbootfirst.Services;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Equipe;

import java.util.List;

public interface IEquipeService {
   Equipe addEquipe(Equipe d);
    Equipe updateEquipe(Equipe d);
    void deleteEquipe(Equipe d);
    void deleteEquipe (Long id );
    List<Equipe> findAllEquipe();
    Equipe findEquipeById (Long id);
}