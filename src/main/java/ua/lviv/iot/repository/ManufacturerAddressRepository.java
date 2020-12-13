package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.domain.ManufacturerAddress;

public interface ManufacturerAddressRepository extends JpaRepository<ManufacturerAddress, Integer> {
}
