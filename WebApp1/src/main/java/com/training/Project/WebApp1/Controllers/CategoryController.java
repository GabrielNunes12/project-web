package com.training.Project.WebApp1.Controllers;

import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.services.CategoryServices;
import com.training.Project.WebApp1.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/categories")
public class CategoryController {

  @Autowired
  private CategoryServices categoryServices;
  @GetMapping(value = "/findAll")
  public ResponseEntity<List<Category>> findAll() {
    List<Category> listUser = categoryServices.findAll();
    return ResponseEntity.ok().body(listUser);
  }

  //Request with an ID parameter to return only that record from database.
  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findById(@PathVariable Integer id) {
    Category category = categoryServices.findById(id);
    return ResponseEntity.ok().body(category);
  }
}
