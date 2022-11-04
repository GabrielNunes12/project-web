package com.training.Project.WebApp1.services;

import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.Repositories.OrderRepository;
import com.training.Project.WebApp1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
  @Autowired
  private OrderRepository orderRepository;

  public List<Order> findAll() {
    return orderRepository.findAll();
  }
  public Order findById(Integer id) {
    Optional<Order> objectUser = orderRepository.findById(id);
    return objectUser.get();
  }
}
