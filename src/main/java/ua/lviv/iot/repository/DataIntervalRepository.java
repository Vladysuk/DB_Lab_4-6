package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.DataInterval;

public interface DataIntervalRepository extends JpaRepository<DataInterval, Integer> {
}

