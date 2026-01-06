package com.educandoWeb.course.config;

import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Bronw","maria@gmail.com","9888888","123567");
        User u2 = new User(null,"José Yellow","jose@gmail.com","9834288","123567");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
