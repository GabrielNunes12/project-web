package com.training.Project.WebApp1.Model.Pk;

import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Model.Product;

import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class OrderItemPK implements Serializable {
  private static final long serialVersionUID = 1l;
  private Order order;
  private Product product;

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
