package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.MeteostationLocation;

public interface MeteostationLocationRepository extends JpaRepository<MeteostationLocation, Integer> {
}
