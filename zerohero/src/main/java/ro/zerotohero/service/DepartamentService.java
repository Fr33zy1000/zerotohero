package ro.zerotohero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.zerotohero.dao.DepartamentDao;
import ro.zerotohero.model.Departament;


import java.util.List;

@Service
@Transactional
public class DepartamentService {

    @Autowired
    private DepartamentDao departamentDao;

    @Transactional
    public List<Departament> findAll() {
        return departamentDao.findAll();
    }

}
