package tn.esprit_3infogl1.springbootfirst.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Departement;

@Repository
public interface DepartementRepo extends CrudRepository<Departement,Long> {
}
