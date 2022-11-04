package com.training.Project.WebApp1.Controllers;

import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/v1/users")
public class UserController {

  @Autowired
  private UserServices userServices;
  @GetMapping(value = "/findAll")
  public ResponseEntity<List<User>> findAll() {
    List<User> listUser = userServices.findAll();
    return ResponseEntity.ok().body(listUser);
  }

  //Request with a ID parameter to return only that record from database.
  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Integer id) {
    User user = userServices.findById(id);
    return ResponseEntity.ok().body(user);
  }
}
