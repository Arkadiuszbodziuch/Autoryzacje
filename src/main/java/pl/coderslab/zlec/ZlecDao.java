package pl.coderslab.zlec;


import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import pl.coderslab.car.Car;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ZlecDao {

    @PersistenceContext
    EntityManager entityManager;

    public void update(Zlec entity) {
        entityManager.merge(entity);
    }

    public Zlec findById(long id) {
        return entityManager.find(Zlec.class, id);
    }


}
