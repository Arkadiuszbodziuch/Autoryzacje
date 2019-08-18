package pl.coderslab.cfm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CfmRepository extends JpaRepository<Cfm, Long> {

    List<Cfm> findByUserId(Long id);

   // List<Cfm> findFirstByTitleStartingWithOrderByCreated(String text);
}
