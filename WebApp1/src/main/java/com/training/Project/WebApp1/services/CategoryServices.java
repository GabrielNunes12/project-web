package com.training.Project.WebApp1.services;

import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Repositories.CategoryRepository;
import com.training.Project.WebApp1.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }
  public Category findById(Integer id) {
    Optional<Category> objectUser = categoryRepository.findById(id);
    return objectUser.get();
  }
}
