package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.WindDirection;

public interface WindDirectionRepository extends JpaRepository<WindDirection, Integer> {
}
