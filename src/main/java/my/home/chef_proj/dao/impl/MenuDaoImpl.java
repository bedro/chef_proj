package my.home.chef_proj.dao.impl;

import my.home.chef_proj.dao.MenuDao;
import my.home.chef_proj.entity.Menu;
import my.home.chef_proj.entity.Tag;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MenuDaoImpl implements MenuDao {
    @PersistenceContext
    private final EntityManager em;

    public MenuDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Menu> findAll() {
        Query query = em.createQuery("SELECT m from Menu m");
        List<Menu> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public List<Menu> save(Menu menu) {
        return null;
    }

    @Transactional
    @Override
    public List<Menu> saveAll(List<Menu> menus) {
        menus.forEach(menu -> {
            em.persist(menu);
        });
        em.flush();
        return menus;
    }

    @Override
    public Menu findById(Long id) {
        List resultList = em.createQuery("SELECT m from Menu m where m.id =" + id).getResultList();
        if (resultList.isEmpty()) {
            return (Menu) resultList.get(0);
        }
        return null;
    }

    @Override
    public List<Menu> findByName(String name) {
        Query query = em.createQuery("SELECT m from Menu m where m.name like '%" + name + "%'");
        return query.getResultList();
    }
}
