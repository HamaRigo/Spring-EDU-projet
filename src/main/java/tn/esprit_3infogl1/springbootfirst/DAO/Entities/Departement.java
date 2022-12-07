package tn.esprit_3infogl1.springbootfirst.DAO.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDepartment;

    private String nomDepartement;

    @OneToMany (mappedBy = "de")
    List<Etudiant> etudiants;

}
