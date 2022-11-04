package com.training.Project.WebApp1.Controllers;

import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.services.OrderServices;
import com.training.Project.WebApp1.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/orders")
public class OrderController {

  @Autowired
  private OrderServices orderServices;
  @GetMapping(value = "/findAll")
  public ResponseEntity<List<Order>> findAll() {
    List<Order> listUser = orderServices.findAll();
    return ResponseEntity.ok().body(listUser);
  }

  //Request with a ID parameter to return only that record from database.
  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Integer id) {
    Order order = orderServices.findById(id);
    return ResponseEntity.ok().body(order);
  }
}
