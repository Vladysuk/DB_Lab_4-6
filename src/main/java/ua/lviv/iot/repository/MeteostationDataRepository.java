package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.MeteostationData;

public interface MeteostationDataRepository extends JpaRepository<MeteostationData, Integer> {
}
