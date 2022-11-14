package com.training.Project.WebApp1.Model;

import com.training.Project.WebApp1.Model.Pk.OrderItemPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
  private static final long serialVersionUID = 1l;
  @EmbeddedId
  private final OrderItemPK id = new OrderItemPK();
  private Integer quantity;
  private Double price;

  public OrderItem() {
  }

  public OrderItemPK getId() {
    return id;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Order getOrder () {
    return id.getOrder();
  }

  public void setOrder (Order order) {
    id.setOrder(order);
  }

  public Product getProduct() {
    return id.getProduct();
  }

  public void setProduct(Product product) {
    id.setProduct(product);
  }

  public OrderItem(Order order, Product product, Integer quantity, Double price) {
    id.setOrder(order);
    id.setProduct(product);
    this.quantity = quantity;
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof OrderItem orderItem)) return false;
    return Objects.equals(getId(), orderItem.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
