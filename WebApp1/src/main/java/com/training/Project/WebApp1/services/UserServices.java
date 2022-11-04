package com.training.Project.WebApp1.services;

import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }
  public User findById(Integer id) {
    Optional<User> objectUser = userRepository.findById(id);
    return objectUser.get();
  }
}
