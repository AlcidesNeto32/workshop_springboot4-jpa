package com.educandoWeb.course.resources;

import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired //This annotation is used for automatic injection.
    private UserService userService;

    @GetMapping //is used for handling http GET requests
    public ResponseEntity<List<User>> findAll(){
        List<User> list =  userService.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}") //specify the field to request
    public ResponseEntity<User> findById(@PathVariable Long id){ // Annotation which indicates that a method parameter should be bound to a URI template variable.
        return ResponseEntity.ok().body(userService.findById(id));
    }
}
