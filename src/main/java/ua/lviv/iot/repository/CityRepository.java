package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.City;

public interface CityRepository extends JpaRepository<City, Integer> {
}
