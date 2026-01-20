package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
}
