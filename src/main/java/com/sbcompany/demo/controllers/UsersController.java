package com.sbcompany.demo.controllers;

import com.sbcompany.demo.models.User;
import com.sbcompany.demo.repositories.UserRepository;
import com.sbcompany.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

//    @GetMapping("/randomUser")
//    public User getRandomUserName() {
//        List<User> users = List.of(
//                User.builder().firstname("Sanja").lastname("Vadic").build(),
//                User.builder().firstname("Bojan").lastname("Jelicic").build(),
//                User.builder().firstname("Pero").lastname("Peric").build()
//        );
//        return users.get(new Random().nextInt(users.size()));
//    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

//    @GetMapping("/user/{id}")
//    public User getUserById(@PathVariable int id) {
//        List<User> users = List.of(
//                User.builder().firstname("Sanja").lastname("Vadic").build(),
//                User.builder().firstname("Bojan").lastname("Jelicic").build(),
//                User.builder().firstname("Pero").lastname("Peric").build()
//        );
//        return users.get(id);
//    }
//
//    @GetMapping("/users/find/{firstname}")
//    public List<User> getUserByFirstName(@PathVariable String firstname) {
//        List<User> users = new ArrayList<>();
//        userRepository.findAllByFirstname(firstname).forEach(users::add);
//        return users;
//    }
//
//    @GetMapping("/users/find/lastname/{lastname}")
//    public List<User> getUserByLastName(@PathVariable String lastname) {
//        List<User> users = new ArrayList<>();
//        userRepository.findAllByLastname(lastname).forEach(users::add);
//        return users;
//    }
//
//    @GetMapping("/users/find/startsWith/{prefix}")
//    public List<User> getUserByFirstNameStartsWith(@PathVariable String prefix) {
//        List<User> users = new ArrayList<>();
//        userRepository.findAllByFirstnameStartingWith(prefix).forEach(users::add);
//        return users;
//    }
//
//    @GetMapping("/user")
//    public User getUserByIdFromQueryString(@RequestParam("userId") int id) {
//        List<User> users = List.of(
//                User.builder().firstname("Sanja").lastname("Vadic").build(),
//                User.builder().firstname("Bojan").lastname("Jelicic").build(),
//                User.builder().firstname("Pero").lastname("Peric").build()
//        );
//        return users.get(id);
//    }
//
//
//    @PostMapping("/newUser")
//    public void saveNewUser(@RequestBody User user, @RequestHeader("User-Agent") String userAgent) {
//        System.out.println(userAgent);
//        System.out.println(user);
//        userRepository.save(user);
//    }
}
