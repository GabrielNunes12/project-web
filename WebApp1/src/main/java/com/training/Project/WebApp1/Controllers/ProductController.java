package com.training.Project.WebApp1.Controllers;

import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Product;
import com.training.Project.WebApp1.services.CategoryServices;
import com.training.Project.WebApp1.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/product")
public class ProductController {

  @Autowired
  private ProductServices productServices;
  @GetMapping(value = "/findAll")
  public ResponseEntity<List<Product>> findAll() {
    List<Product> listProduct = productServices.findAll();
    return ResponseEntity.ok().body(listProduct);
  }

  //Request with an ID parameter to return only that record from database.
  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Integer id) {
    Product product = productServices.findById(id);
    return ResponseEntity.ok().body(product);
  }
}
