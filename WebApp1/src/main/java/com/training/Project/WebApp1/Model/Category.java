package com.training.Project.WebApp1.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
  private static final long serialVersionUID = 1l;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String categoryProduct;
  @Transient
  private Set<Product> products = new HashSet<>();

  public Category() {
  }

  public Category(Integer id, String categoryProduct) {
    this.id = id;
    this.categoryProduct = categoryProduct;
  }

  public Integer getId() {
    return id;
  }

  public String getCategoryProduct() {
    return categoryProduct;
  }

  public void setCategoryProduct(String categoryProduct) {
    this.categoryProduct = categoryProduct;
  }
  public Set<Product> getProducts() {
    return this.products;
  }
}
