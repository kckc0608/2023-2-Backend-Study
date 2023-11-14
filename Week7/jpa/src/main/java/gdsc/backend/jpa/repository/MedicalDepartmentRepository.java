package gdsc.backend.jpa.repository;

import gdsc.backend.jpa.domain.MedicalDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalDepartmentRepository extends JpaRepository<MedicalDepartment, Long> {
}
