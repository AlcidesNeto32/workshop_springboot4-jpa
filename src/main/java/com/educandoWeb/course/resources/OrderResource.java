package com.educandoWeb.course.resources;

import com.educandoWeb.course.entities.Order;
import com.educandoWeb.course.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired //This annotation is used for automatic injection.
    private OrderService OrderService;

    @GetMapping //is used for handling http GER requests
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list =  OrderService.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}") //specify the field to request
    public ResponseEntity<Order> findById(@PathVariable Long id){ // Annotation which indicates that a method parameter should be bound to a URI template variable.
        return ResponseEntity.ok().body(OrderService.findById(id));
    }
}
