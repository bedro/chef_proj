package my.home.chef_proj.dao;

import my.home.chef_proj.entity.Tag;

import java.util.List;

public interface TagDao {
    List<Tag> findAll();

    Tag findById(Long id);

    List<Tag> findByName(String name);
}
