package ro.zerotohero.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.zerotohero.model.Departament;

@Repository
public class DepartamentDao {
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Transactional
    public Departament findAll() {
        Session session = sessionFactory.getCurrentSession();
        Departament departament = (Departament) session.createQuery("from Departament")
                .list();
        return departament;
    }
}
