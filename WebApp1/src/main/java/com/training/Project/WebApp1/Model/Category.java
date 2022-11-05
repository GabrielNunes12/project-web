package com.training.Project.WebApp1.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
  private static final long serialVersionUID = 1l;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String categoryProduct;
  @OneToMany
  @JoinColumn(name = "product_id")
  private List<Product> productList = new ArrayList<>();

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
  public List<Product> getList() {
    return this.productList;
  }
}
