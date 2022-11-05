package com.training.Project.WebApp1.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.training.Project.WebApp1.Enum.OrderStatus;
import com.training.Project.WebApp1.Model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
  private static final long serialVersionUID = 1l;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
  private Instant moment;
  private Integer orderStatus;
  @ManyToOne
  @JoinColumn(name = "client_id")
  private User client;

  public Order() {
  }

  public Order(Integer id, Instant moment, OrderStatus orderStatus, User user) {
    this.id = id;
    this.moment = moment;
    setOrderStatus(orderStatus);
    this.client = user;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Instant getMoment() {
    return moment;
  }

  public void setMoment(Instant moment) {
    this.moment = moment;
  }

  public OrderStatus getOrderStatus() {
    return OrderStatus.valueOf(orderStatus);
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus.getCode();
  }

  public double total() {
    return 0.00;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order order)) return false;
    return Objects.equals(getId(), order.getId()) && Objects.equals(getMoment(), order.getMoment()) && getOrderStatus() == order.getOrderStatus() && Objects.equals(client, order.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getMoment(), getOrderStatus(), client);
  }
}
