package gdsc.backend.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class MedicalDepartment {
    @Id
    private Long id;

    @ManyToOne
    private Hospital hospital;

    @OneToMany
    private List<Doctor> doctors;

    private String name;
}
