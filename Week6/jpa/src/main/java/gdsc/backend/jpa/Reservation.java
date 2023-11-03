package gdsc.backend.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import javax.print.Doc;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation {
    @Id
    private Long id;

    private Date time;

    private Long doctorId;
    private Long patientId;

    @OneToMany
    private List<Doctor> doctors;

    @OneToMany
    private List<Patient> patients;
}
