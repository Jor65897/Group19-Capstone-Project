package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.CarInformation;

@Repository
public interface CarInformationRepository extends JpaRepository<CarInformation, Long> {


}