package gdsc.backend.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Hospital {
    @Id
    private Long id;

    @OneToMany
    private List<MedicalDepartment> medicalDepartments;

    private String name;
}
