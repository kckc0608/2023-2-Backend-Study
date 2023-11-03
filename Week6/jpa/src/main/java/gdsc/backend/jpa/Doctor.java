package gdsc.backend.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Doctor {
    @Id
    private Long id;

    private String name;
    private Long medicalDepartmentId;

    @ManyToOne
    private MedicalDepartment medicalDepartment;

    @ManyToOne
    private Reservation reservation;
}
