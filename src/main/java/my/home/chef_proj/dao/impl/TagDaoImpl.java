package my.home.chef_proj.dao.impl;

import my.home.chef_proj.dao.TagDao;
import my.home.chef_proj.entity.Menu;
import my.home.chef_proj.entity.Tag;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TagDaoImpl implements TagDao {
    @PersistenceContext
    private final EntityManager em;


    public TagDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Tag> findAll() {
        Query query = em.createQuery("SELECT t from Tag t");
        List<Tag> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public Tag findById(Long id) {
        List resultList = em.createQuery("SELECT t from Tag t where t.id =" + id).getResultList();
        if (!resultList.isEmpty()) {
            return (Tag) resultList.get(0);
        }
        return null;
    }

    @Override
    public List<Tag> findByName(String name) {
        Query query = em.createQuery("SELECT t from Tag t where t.name like '%" + name + "%'");

        return query.getResultList();
    }

}
