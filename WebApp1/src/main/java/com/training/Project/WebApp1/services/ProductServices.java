package com.training.Project.WebApp1.services;

import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Product;
import com.training.Project.WebApp1.Repositories.CategoryRepository;
import com.training.Project.WebApp1.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }
  public Product findById(Integer id) {
    Optional<Product> objectUser = productRepository.findById(id);
    return objectUser.get();
  }
}
