package pl.coderslab.car;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository <Car, Long> {

Car findByRegistrationNumber (String registraionNumber);

Car findAllByEnabled (int enabled);


}
