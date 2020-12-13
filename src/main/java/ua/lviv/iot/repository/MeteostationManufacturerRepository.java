package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.MeteostationManufacturer;

public interface MeteostationManufacturerRepository extends JpaRepository<MeteostationManufacturer, Integer> {
}
