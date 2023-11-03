package gdsc.backend.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {
    @Id
    private Long id;

    private String name;

    @ManyToOne
    private Reservation reservation;
}
