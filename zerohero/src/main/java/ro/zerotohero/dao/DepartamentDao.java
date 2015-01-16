package ro.zerotohero.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.zerotohero.model.Departament;

import java.util.List;

@Repository
public class DepartamentDao {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Departament> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Departament> departament =  session.createQuery(" from Departament").list();
        return departament;
    }

    @Transactional
    public Departament findById(int departamentId) {
        Session session = sessionFactory.getCurrentSession();
        Departament departament = (Departament) session.createQuery("from Departament where departamentId = :id").setParameter("id",
                departamentId).uniqueResult();
        return departament;
    }
}
