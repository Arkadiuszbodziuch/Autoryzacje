package pl.coderslab.zlec;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZlecRepostiory extends JpaRepository<Zlec, Long> {

    Zlec findByNumberDMS (String numerDms);

    Long findByStatus (Long status);


}
