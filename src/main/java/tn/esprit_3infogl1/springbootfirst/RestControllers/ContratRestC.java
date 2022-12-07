package tn.esprit_3infogl1.springbootfirst.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit_3infogl1.springbootfirst.DAO.Entities.Contrat;
import tn.esprit_3infogl1.springbootfirst.Services.IContratService;

import java.util.List;

@RestController
@RequestMapping("contratRC") //pour personnaliser l'URL, route l'accès à la ressource
public class ContratRestC {
    @Autowired // ou @Inject
    private IContratService ics;

    @PostMapping("addC")
    Contrat addContrat(@RequestBody Contrat c){
        return ics.addContrat(c);
    }

    @PutMapping("updateC")
    Contrat updateContrat(@RequestBody Contrat c) {return ics.updateContrat(c);}

    @DeleteMapping ("deleteC")
    void deleteContrat(@RequestBody Contrat c) {ics.deleteContrat(c);}

    @DeleteMapping("deleteCId/{id}")
    void deleteContrat (@PathVariable Long id ) {ics.deleteContrat(id);}

    @GetMapping("findAllC")
    List<Contrat> findAllContrat() { return ics.findAllContrat(); }

    @GetMapping("findbyIDC")
    Contrat findContratById (@RequestParam Long id) {return ics.findContratById(id);} //sans ordre

    @GetMapping("findByArch/{arch}")
    List<Contrat> findByArchive(@PathVariable boolean arch) { return ics.searchContratByArchive(arch); }
}