package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.MeteostationService;

public interface MeteostationServiceRepository extends JpaRepository<MeteostationService, Integer> {
}
