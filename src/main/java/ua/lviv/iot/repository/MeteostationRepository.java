package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.Meteostation;

public interface MeteostationRepository extends JpaRepository<Meteostation, Integer> {
}
