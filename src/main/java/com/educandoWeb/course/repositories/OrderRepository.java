package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long>{
}
