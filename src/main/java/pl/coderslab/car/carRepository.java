package pl.coderslab.car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface carRepository extends JpaRepository <Car, Long> {
}
