package com.training.Project.WebApp1.Config;

import com.training.Project.WebApp1.Enum.OrderStatus;
import com.training.Project.WebApp1.Model.Category;
import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Model.User;
import com.training.Project.WebApp1.Repositories.CategoryRepository;
import com.training.Project.WebApp1.Repositories.OrderRepository;
import com.training.Project.WebApp1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  //dependency injection
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  //seeding
  @Override
  public void run(String... args) throws Exception {
    User user1 = new User(null, "John", "jhon@gmail.com", "99999999", "123445");
    User user2 = new User(null, "Barbara", "barbara@gmail.com", "888888888", "1234222");
    Order order = new Order(null, Instant.parse("2022-01-01T09:09:00Z"), OrderStatus.SHIPPED, user1);
    Order order2 = new Order(null, Instant.parse("2020-07-02T11:09:00Z"), OrderStatus.CANCELED, user2);
    Order order3 = new Order(null, Instant.parse("2021-04-10T21:19:00Z"), OrderStatus.WAITING_PAYMENT, user1);
    Category category = new Category(null, "Computers");
    Category category2 = new Category(null, "Books");
    Category category3 = new Category(null, "Geek");
    categoryRepository.saveAll(Arrays.asList(category, category2, category3));
    userRepository.saveAll(Arrays.asList(user1, user2));
    orderRepository.saveAll(Arrays.asList(order, order2, order3));
  }
}
