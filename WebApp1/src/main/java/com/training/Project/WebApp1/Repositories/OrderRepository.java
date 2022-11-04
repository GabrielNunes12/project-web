package com.training.Project.WebApp1.Repositories;

import com.training.Project.WebApp1.Model.Order;
import com.training.Project.WebApp1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
