package my.home.chef_proj.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, unique = true)
    private Long id;

    private String name;

    private double calories;
    private double protein;
    private double fat;
    private double carbs;
    private double weight;
    private String description;
    private String descriptionShort;

    private int cookingTime;

    @ManyToMany
    private Set<Recipe> parentsRecipe = new HashSet<>();

    @ManyToMany(mappedBy = "parentsRecipe")
    private Set<Recipe> childRecipe = new HashSet<>();
}
