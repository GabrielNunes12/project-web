package com.training.Project.WebApp1.Repositories;

import com.training.Project.WebApp1.Model.OrderItem;
import com.training.Project.WebApp1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
