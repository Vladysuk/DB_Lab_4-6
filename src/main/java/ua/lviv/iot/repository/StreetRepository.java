package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.Street;

public interface StreetRepository extends JpaRepository<Street, Integer> {
}
