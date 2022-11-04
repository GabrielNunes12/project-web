package com.training.Project.WebApp1.Config;

import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  //dependency injection
  @Autowired
  private UserRepository userRepository;

  //seeding
  @Override
  public void run(String... args) throws Exception {
    User user1 = new User(null, "John", "jhon@gmail.com", "99999999", "123445");
    User user2 = new User(null, "Barbara", "barbara@gmail.com", "888888888", "1234222");
    userRepository.saveAll(Arrays.asList(user1, user2));
  }
}
