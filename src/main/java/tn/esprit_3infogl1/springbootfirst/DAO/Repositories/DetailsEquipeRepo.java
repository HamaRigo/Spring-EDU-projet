package tn.esprit_3infogl1.springbootfirst.DAO.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.DetailsEquipe;

@Repository
public interface DetailsEquipeRepo extends CrudRepository<DetailsEquipe,Long> {
}
