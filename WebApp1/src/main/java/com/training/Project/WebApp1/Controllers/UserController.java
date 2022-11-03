package com.training.Project.WebApp1.Controllers;

import com.training.Project.WebApp1.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/user")
public class UserController {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User user = new User(1, "Mary", "maryme@gmail.com", "999999999", "12345");
    return ResponseEntity.ok().body(user);
  }
}
