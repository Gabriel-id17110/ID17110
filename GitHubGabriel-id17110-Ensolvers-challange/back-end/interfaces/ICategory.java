package com.exercise.ensolvers.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.exercise.ensolvers.model.Category;
import java.util.Optional;

public interface ICategory extends CrudRepository<Category, Integer> {

    public Optional<Category>findByNameCategory(String nameCategory);
}
