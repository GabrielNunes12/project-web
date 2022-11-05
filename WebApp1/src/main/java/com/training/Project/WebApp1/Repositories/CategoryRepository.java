package com.training.Project.WebApp1.Repositories;

import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
