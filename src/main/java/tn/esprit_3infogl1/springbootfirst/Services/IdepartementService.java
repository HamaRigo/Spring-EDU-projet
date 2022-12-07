package tn.esprit_3infogl1.springbootfirst.Services;

import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Departement;

import java.util.List;

public interface IDepartementService {
    Departement addDepartement(Departement d);
    Departement updateDepartement(Departement d);
    void deleteDepartement(Departement d);
    void deleteDepartement (Long id );
    List<Departement> findAllDepartement();
    Departement findDepartementById (Long id);
}
