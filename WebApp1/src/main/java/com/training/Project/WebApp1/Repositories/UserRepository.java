package com.training.Project.WebApp1.Repositories;

import com.training.Project.WebApp1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
