package tn.esprit_3infogl1.springbootfirst.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Departement;
import tn.esprit_3infogl1.springbootfirst.DAO.Repositories.DepartementRepo;

import java.util.List;

@Service
public class DepartementService implements IDepartementService {
    @Autowired
    private DepartementRepo idr;

    @Override
    public Departement addDepartement(Departement d) {
        return idr.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return idr.save(d);
    }

    @Override
    public void deleteDepartement(Departement d) {
        idr.delete(d);
    }

    @Override
    public void deleteDepartement(Long id) {
        idr.deleteById(id);
    }

    @Override
    public List<Departement> findAllDepartement() {
        return (List<Departement>) idr.findAll();
    }

    @Override
    public Departement findDepartementById(Long id) {

        return idr.findById(id).get();
    }
}
